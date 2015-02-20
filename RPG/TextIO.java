/*
 * TextIO is a consolidation of methods (primarily ease-of-use) for delaying, clearing, or displaying logos.
 */
public class TextIO
{
    /*
     * Opening logo. Proud of this. 56
     * -Anish
     */
    public void openingLogo(){
        String buffer = " ";
        for (int i = 1; i <50; i++){
            buffer = buffer + " ";
            blank(13);
            System.out.println(buffer + "           /)");
            System.out.println(buffer + "         //");
            System.out.println(buffer + ".-------| |--------------------------------------------.__");
            System.out.println(buffer + "|WMWMWMW| |>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:>");
            System.out.println(buffer + "`-------| |--------------------------------------------'^^");
            System.out.println(buffer + "         \\");
            System.out.println(buffer + "          \\)");
            System.out.println(buffer + "                                         _____                        __     ___    _____                                ");
            System.out.println(buffer + "                                        / ___/      ______  _________/ /____( _ )  / ___/____  _____________  _______  __");
            System.out.println(buffer + "                                        \\__ \\ | /| / / __ \\/ ___/ __  / ___/ __ \\/|\\__ \\/ __ \\/ ___/ ___/ _ \\/ ___/ / / /");
            System.out.println(buffer + "                                       ___/ / |/ |/ / /_/ / /  / /_/ (__  ) /_/  <___/ / /_/ / /  / /__/  __/ /  / /_/ / ");
            System.out.println(buffer + "                                     /____/|__/|__/\\____/_/   \\__,_/____/\\____/\\/____/\\____/_/   \\___/\\___/_/   \\__, /  ");
            System.out.println(buffer + "                                                                                                                /____/   ");
            blank(2);
            System.out.println(buffer + "                                                                                                             /---\\                             ------\\ ");
            System.out.println(buffer + "                                                                                                          O =()()()============================()()()()||");
            System.out.println(buffer + "                                                                                                             \\---/                             ------/");
            delay(100);
            clear();
        }
        delay(200);
        blank(15);
        System.out.println("                                                Designed and Coded by Anish Katukam and Sid Mani.");
    }

    /*
     * delay sleeps the thread for a passed-in time. Exceptions are caught but not dealt with.
     * -Anish
     */
    public void delay(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException exp) {
        }
    }

    /*
     * For ease of use when writing the story, made clear command. Seems this only works RELIABLY on BlueJ.
     * -Anish
     */
    public final static void clear()
    {
        System.out.print ('\f');
    }

    /*
     * Dramatic is used for when a line has to be outputted and then cleared. Saves lines in the grand scheme
     * of things, regardless of how frivolous it seems now.
     * -Anish
     */
    public void dramatic(int time, String dialogue){
        System.out.println(dialogue);
        delay(time);
        clear();
    }

    /*
     * Mainly used for logos, blank() offers a simple way of entering spaces.
     */   
    public void blank(int lines){
        for (int i = 0; i<=lines; i++){
            System.out.println();
        }
    }
}
