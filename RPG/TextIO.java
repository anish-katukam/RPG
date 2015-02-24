/*
 * TextIO is a consolidation of methods (primarily ease-of-use) for delaying, clearing, or displaying logos.
 */
public class TextIO
{
    /*
     * Opening logo. Proud of this.
     * -Anish
     */
    public void openingLogo(){
        String buffer = " ";
        for (int i = 1; i <50; i++){
            buffer = buffer + " ";
            clear();
            blank(15);
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
        }
        delay(200);
        blank(15);
        dramatic(6000,"                                                                  “Which of us has not felt that the character we are reading in the screen is more real than the person standing beside us?”");
    }

    /*
     * Chapter One's Logo & Quote
     */
    public void chapterOneLogo(){
        blank(7);
        System.out.println("                                                                                    # ###      /                                                                  # ###");
        System.out.println("                                                                                  /  /###  / #/                                                                 /  /###");
        System.out.println("                                                                                 /  /  ###/  ##                                  #                             /  /  ###");
        System.out.println("                                                                                /  ##   ##   ##                                 ##                            /  ##   ###");
        System.out.println("                                                                               /  ###        ##                                 ##                           /  ###    ###");
        System.out.println("                                                                              ##   ##        ##  /##      /###       /###     ######## /##  ###  /###       ##   ##     ## ###  /###     /##");
        System.out.println("                                                                              ##   ##        ## / ###    / ###  /   / ###  / ######## / ###  ###/ #### /    ##   ##     ##  ###/ #### / / ###");
        System.out.println("                                                                              ##   ##        ##/   ###  /   ###/   /   ###/     ##   /   ###  ##   ###/     ##   ##     ##   ##   ###/ /   ###");
        System.out.println("                                                                              ##   ##        ##     ## ##    ##   ##    ##      ##  ##    ### ##            ##   ##     ##   ##    ## ##    ###");
        System.out.println("                                                                              ##   ##        ##     ## ##    ##   ##    ##      ##  ########  ##            ##   ##     ##   ##    ## ########");
        System.out.println("                                                                              ##  ##        ##     ## ##    ##   ##    ##      ##  #######   ##             ##  ##     ##   ##    ## #######");
        System.out.println("                                                                               ## #      /  ##     ## ##    ##   ##    ##      ##  ##        ##              ## #      /    ##    ## ##");
        System.out.println("                                                                                ###     /   ##     ## ##    /#   ##    ##      ##  ####    / ##               ###     /     ##    ## ####    /");
        System.out.println("                                                                                 ######/    ##     ##  ####/ ##  #######       ##   ######/  ###               ######/      ###   ### ######/");
        System.out.println("                                                                                  ###       ##    ##   ###   ## ######         ##   #####    ###                ###         ###   ### #####");
        System.out.println("                                                                                                  /             ##");
        System.out.println("                                                                                                 /              ##");
        System.out.println("                                                                                                /               ##");
        System.out.println("                                                                                               /                 ##");
        blank(5);
        dramatic(5000,"                                                                                                                        “%fdeep_quote%f.”");
    }

    /*
     * delay sleeps the thread for a passed-in time. Exceptions are caught but not dealt with.
     */
    public void delay(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException exp) {
        }
    }

    /*
     * For ease of use when writing the story, made clear command. Seems this only works RELIABLY on BlueJ.
     */
    public final static void clear()
    {
        System.out.print ('\f');
    }

    /*
     * Dramatic is used for when a line has to be outputted and then cleared. Saves lines in the grand scheme
     * of things, regardless of how frivolous it seems now.
     */
    public void dramatic(int time, String dialogue){
        System.out.println(dialogue);
        delay(time);
        clear();
    }

    /*
     * A simpler way, rather than typing out System.out.println() every time.
     */
    public void say(String dialogue){
        System.out.println(dialogue);
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
