/*
 * Add method to open and modify inventory
 * Add method to add an item
 * Add method to check if there's an item in the inventory
 * 
 */
public class Inventory
{
    static TextIO t = new TextIO();
    static Item[] backpack = new Item[25];
    public static void modifyInventory(){
        int index = 0;
        int response = 0;
        while (index < backpack.length){
            System.out.print((index + 1) + backpack[index].name);
        }
        while (response != 42){
            response = t.getInt("Simply type the number of the item you would like to examine. To exit, type 42.");
            modulateItem(backpack[response-1],response);
        }
    }

    public void addItem(Item i){
        int nullcount = 0;
        for (int a = 0; a < backpack.length; a++){
            if (backpack[a] == null){
                backpack[a] = i;
            }
            else {
                nullcount++;
            }
            if (nullcount == 25){
                t.say("Your backpack is full. Remove an item or something. ");
            };
        }

    }

    public static void modulateItem(Item i, int index){
        String response;
        t.say("To go back, type exit.");
        t.say("To remove this item, type remove.");
        t.blank(1);
        t.say(i.name);
        t.blank(1);
        t.say(i.desc);
        response = t.getString("");
        if (i instanceof Armor){
            t.say("Health: " + i.getHealth());
            t.say("Armor: " + i.getDefense());
        }
        if (i instanceof Potion){
            t.say("Health Granted: " + i.getHealth());
            t.say("Energy Granted: " + i.getEnergy());;
            t.say("Bloodlust Granted: " + i.getBloodlust());
        }
        if (i instanceof Ring){
            t.say("Health Granted: " + i.getHealth());
            t.say("Energy Granted: " + i.getEnergy());
            t.say("Attack Granted: " + i.getAttack());
            t.say("Bloodlust Granted: " + i.getBloodlust());
            t.say("Defense Granted: " + i.getDefense());
        }
        if (i instanceof Hat){
            t.say("Health Granted: " + i.getHealth());
            t.say("Energy Granted: " + i.getEnergy());
            t.say("Attack Granted: " + i.getAttack());
            t.say("Bloodlust Granted: " + i.getBloodlust());
            t.say("Defense Granted: " + i.getDefense());
        }
        if (i instanceof Weapon){
            t.say("Attack: " + i.getAttack());
        }
        if (response == "exit"){
            modifyInventory();
        }
        if (response == "remove"){
            backpack[index] = null;
        }
    }

}
