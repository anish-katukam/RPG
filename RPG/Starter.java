public class Starter
{
    public static void main (String Args[]){
        GameLogic g = new GameLogic(); //instantiates new gamelogic
        g.exposition(); 
        g.intro();
        g.chapterone(); //calling the scripted events
        //g.chaptertwo();
        //g.chapterthree();
        //g.outro(true);
        return;
    }
}
