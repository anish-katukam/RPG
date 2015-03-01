public abstract class Item
{
    protected String name;
    protected String desc;
    protected int attack;
    protected int defense;
    protected int health;
    protected int energy;
    protected int bloodlust;

    public Item (){ 
    }

    public String getName(){
        return name;
    }

    public String getDescription(){ // get description
        return desc;
    }

    public abstract void explicate(TextIO t); //overloaded in each item to let it describe itself

    public int getAttack(){
        return 0;
    }

    public int getDefense(){
        return 0;
    }

    public int getHealth(){
        return 0;
    }

    public int getEnergy(){
        return 0;
    }

    public int getBloodlust(){
        return 0;
    }

    public String toString(){
        return name + "\n" + desc;
    }
}
