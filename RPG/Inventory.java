/*
 * Add method to open and modify inventory
 * Add method to add an item
 * Add method to check if there's an item in the inventory
 * 
   */
public class Inventory
{
    TextIO t = new TextIO();
    Armor[] armorPack = new Armor[5];
    Potion[] potionPack = new Potion[5];
    Weapon[] weaponPack = new Weapon[5];
    Hat[] hatPack = new Hat[5];
    Ring[] ringPack = new Ring[5];
    
    public void modifyInventory(){
        t.clear();
        System.out.println("Backpack:");
        t.blank(1);
        System.out.println("Armors:");
        for (Armor a : armorPack){
            System.out.println(a.name);
            System.out.println(a.resistance);
            System.out.println(a.hregen);
        }
        t.blank(1);
        System.out.println("Potions:");
        for (Potion p : potionPack){
            System.out.println(p.name);
        }
        t.blank(1);
        System.out.println("Weapons:");
        for (Weapon w : weaponPack){
            System.out.println(w.name);
            System.out.println(w.damage);
        }
        t.blank(1);
        System.out.println("Hats:");
        for (Hat h : hatPack){
            System.out.println(h.name);
        }
        t.blank(1);
        System.out.println("Rings:");
        for (Ring r : ringPack){
            System.out.println(r.name);
        }
    }
    public void addItem(Item add){
    }
}
