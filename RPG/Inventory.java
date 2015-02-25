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
        int index = 0;
        int response = 0;
        while (index < backpack.length){
            if (backpack[index] != null){
                System.out.println((index + 1) + " " + backpack[index].getName());
            }
            index++;
        }
        response = t.getInt("Simply type the number of the item you would like to examine. To exit, type 42.");
        while (response != 42 && response < backpack.length && response >= 0) {
            modulateItem(response);
            response = t.getInt("Simply type the number of the item you would like to examine. To exit, type 42.");
        }
    }

    public static void addItem(Item i){
        int nullcount = 0;
        for (int a = 0; a < backpack.length; a++){
            if (backpack[a] == null){
                backpack[a] = i;
                break;
            }
            else {
                nullcount++;
            }
        }
        if (nullcount == 25){
            t.say("Your backpack is full. Remove an item or something. ");
        }

    }

    public static void modulateItem(int index){
        Item i = backpack[index - 1];
        t.say(i);
        i.explicate(t);
        String response = t.getString("Type rm if you want to remove this item.");
        if (response.equals("rm")){
            backpack[index] = null;
        }
    }

}
