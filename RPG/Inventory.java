/*
 * Add method to open and modify inventory
 * Add method to add an item
 * Add method to check if there's an item in the inventory
 * 
 */
public class Inventory
{
    TextIO t = new TextIO();
    Item[] backpack = new Item[24];
    public void modifyInventory(){
        int index = 0;
        System.out.println("Simply type the number of the item you would like to examine.");
        while (index < backpack.length){
            System.out.print((index + 1) + backpack[index].name);
        }
    }

    public void addItem(Item i){
        for (int a = 0; a <= backpack.length; a++){
            if (backpack[a] == null){
                backpack[a] = i;
            }
            else{
                t.say("Your backpack's full. You should be on Hoarders.");
            }
        }

    }
}
