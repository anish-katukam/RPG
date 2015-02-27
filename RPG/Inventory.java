/*
 * Add method to open and modify inventory
 * Add method to add an item
 * Add method to check if there's an item in the inventory
 * 
 */
public class Inventory
{
    private static TextIO t = new TextIO();
    private static Item[] backpack = new Item[25];
    public static void modify(){
        t.clear();
        int index = 0;
        int response = 0;
        if (!isEmpty()){
            t.getString("Your inventory is empty. Press enter to continue playing.");
        }
        while (index < backpack.length){
            if (backpack[index] != null){
                System.out.println((index + 1) + " " + backpack[index].getName());
            }
            index++;
        }
        while (response != 42 && response < backpack.length && response >= 0 && backpack[response] != null) {
            t.blank(1);
            modulateItem(t.getInt("Simply type the number of the item you would like to examine. To exit, type 42."));
            modify();
        }
    }

    public static void addItem(Item i){
        for (int a = 0; a < backpack.length; a++){
            if (backpack[a] == null){
                backpack[a] = i;
                break;
            }
        }
        if (isFull()){
            t.say("Your backpack is full. Remove an item or something. ");
        }
    }
    public static Item getPotion()
    {
        int index = 0;
        int response = 0;
        int[] shift = new int[25];
        int shiftIndex = 0;
        t.say("Pick a potion:\n");
        
        while (index < backpack.length){
            if (backpack[index] instanceof Potion){
                System.out.println((shiftIndex + 1) + " " + backpack[index].getName());
                shift[shiftIndex] = index;
                shiftIndex++;
            }
            index++;
        }
        response = t.getInt("Simply type the number of the item you would like to examine. To exit, type 42.");
        return backpack[shift[response]];
    }

    public static void modulateItem(int index){
        Item i = backpack[index - 1];
        i.explicate(t);
        t.blank(1);
        if (t.getString("Type rm if you want to remove this item. Press enter to view your inventory.").equals("rm")){
            for (int a = index-1; a<24;a++){
                backpack[a] = backpack[a+1];
            }
        }
    }

    public static boolean isFull(){
        return (backpack[24] != null);
    }

    public static boolean isEmpty(){
        return (backpack[0] != null);
    }
}
