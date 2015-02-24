/*
 * Add a system to calculate health, health regen, and resistances.
   */
public class Armor extends Item
{
    String name;
    int resistance;
    int hregen;
    
    public int getResistance(){
        return resistance;
    }
}
