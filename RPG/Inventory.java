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
            System.out.println(a.getName());
            System.out.println(a.getDefense());
            System.out.println(a.getHRegen());
        }
        t.blank(1);
        System.out.println("Potions:");
        for (Potion p : potionPack){
            System.out.println(p.getName());
            System.out.println(p.getEnergy());
            System.out.println(p.getHealth());
            System.out.println(p.getBloodlust());
        }
        t.blank(1);
        System.out.println("Weapons:");
        for (Weapon w : weaponPack){
            System.out.println(w.getName());
            System.out.println(w.getAttack());
        }
        t.blank(1);
        System.out.println("Hats:");
        for (Hat h : hatPack){
            System.out.println(h.getName());
            System.out.println(h.getAttack());
            System.out.println(h.getDefense());
            System.out.println(h.getHRegen());
            System.out.println(h.getERegen());
        }
        t.blank(1);
        System.out.println("Rings:");
        for (Ring r : ringPack){
            System.out.println(r.getName());
            System.out.println(r.getAttack());
            System.out.println(r.getDefense());
            System.out.println(r.getHRegen());
            System.out.println(r.getERegene());
        }
    }

    public void addItem(Item add){
    }
}
