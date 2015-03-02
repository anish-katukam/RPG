public class Starter
{
    public static void main (String Args[]){
        JFrame frame = new JFrame();
        frame.setSize(1920,1080);
        frame.setTitle("Swords and Sorcery");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
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
