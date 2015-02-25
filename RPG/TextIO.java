import java.util.*;
import java.io.*;
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
        for (int i = 1; i <47; i++){
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
            blank(2);
            System.out.println(buffer + "      #######                                                  ##                                           ##             ####### ");
            System.out.println(buffer + "    /       ###                                                 ##                                           ##          /       ###");
            System.out.println(buffer + "   /         ##                                                 ##                                           ##         /         ##");
            System.out.println(buffer + "   ##        # ##                                               ##                                           ##         ##        #");
            System.out.println(buffer + "    ###        ##                                               ##                                           ##          ###   ");
            System.out.println(buffer + "   ## ###       ##    ###    ####      /###   ###  /###     ### ##    /###          /###   ###  /###     ### ##         ## ###           /###   ###  /###     /###      /##  ###  /###   ##   ####");
            System.out.println(buffer + "    ### ###      ##    ###     ###  / / ###  / ###/ #### / ######### / #### /      / ###  / ###/ #### / #########        ### ###        / ###  / ###/ #### / / ###  /  / ###  ###/ #### / ##    ###  / ");
            System.out.println(buffer + "      ### ###    ##     ###     ###/ /   ###/   ##   ###/ ##   #### ##  ###/      /   ###/   ##   ###/ ##   ####           ### ###     /   ###/   ##   ###/ /   ###/  /   ###  ##   ###/  ##     ###/");
            System.out.println(buffer + "        ### /##  ##      ##      ## ##    ##    ##        ##    ## ####          ##    ##    ##    ##  ##    ##              ### /##  ##    ##    ##       ##        ##    ### ##         ##      ##");
            System.out.println(buffer + "          #/ /## ##      ##      ## ##    ##    ##        ##    ##   ###         ##    ##    ##    ##  ##    ##                #/ /## ##    ##    ##       ##        ########  ##         ##      ##");
            System.out.println(buffer + "           #/ ## ##      ##      ## ##    ##    ##        ##    ##     ###       ##    ##    ##    ##  ##    ##                 #/ ## ##    ##    ##       ##        #######   ##         ##      ##");
            System.out.println(buffer + "            # /  ##      ##      ## ##    ##    ##        ##    ##       ###     ##    ##    ##    ##  ##    ##                  # /  ##    ##    ##       ##        ##        ##         ##      ##");
            System.out.println(buffer + "  /##        /   ##      /#      /  ##    ##    ##        ##    /#  /###  ##     ##    /#    ##    ##  ##    /#        /##        /   ##    ##    ##       ###     / ####    / ##         ##      ##");
            System.out.println(buffer + " /  ########/     ######/ ######/    ######     ###        ####/   / #### /       ####/ ##   ###   ###  ####/         /  ########/     ######     ###       ######/   ######/  ###         #########");
            System.out.println(buffer + "/     #####        #####   #####      ####       ###        ###       ###/         ###   ##   ###   ###  ###         /     #####        ####       ###       #####     #####    ###          #### ###");
            System.out.println(buffer + "|                                                                                                                    |                                                                             ###");
            System.out.println(buffer + " \\)                                                                                                                   \\)                                                                    #####   ###");
            System.out.println(buffer + "                                                                                                                                                                                          /#######  /#");
            System.out.println(buffer + "                                                                                                                                                                                         /      ###/");
            blank(2);
            System.out.println(buffer + "                                                                                                                                                           /---\\                             ------\\ ");
            System.out.println(buffer + "                                                                                                                                                          O =()()()============================()()()()||");
            System.out.println(buffer + "                                                                                                                                                           \\---/                             ------/");
            delay(100);
        }
        delay(200);
        blank(17);
        dramatic(6000,"                                                                  “Which of us has not felt that the character we are watching in the screen is more real than the person standing beside us?”");
    }

    /*
     * Chapter One's Logo & Quote
     */
    public void chapterOneLogo(){
        blank(7);
        say("                                                                                    # ###      /                                                                  # ###");
        say("                                                                                  /  /###  / #/                                                                 /  /###");
        say("                                                                                 /  /  ###/  ##                                  #                             /  /  ###");
        say("                                                                                /  ##   ##   ##                                 ##                            /  ##   ###");
        say("                                                                               /  ###        ##                                 ##                           /  ###    ###");
        say("                                                                              ##   ##        ##  /##      /###       /###     ######## /##  ###  /###       ##   ##     ## ###  /###     /##");
        say("                                                                              ##   ##        ## / ###    / ###  /   / ###  / ######## / ###  ###/ #### /    ##   ##     ##  ###/ #### / / ###");
        say("                                                                              ##   ##        ##/   ###  /   ###/   /   ###/     ##   /   ###  ##   ###/     ##   ##     ##   ##   ###/ /   ###");
        say("                                                                              ##   ##        ##     ## ##    ##   ##    ##      ##  ##    ### ##            ##   ##     ##   ##    ## ##    ###");
        say("                                                                              ##   ##        ##     ## ##    ##   ##    ##      ##  ########  ##            ##   ##     ##   ##    ## ########");
        say("                                                                               ##  ##        ##     ## ##    ##   ##    ##      ##  #######   ##             ##  ##     ##   ##    ## #######");
        say("                                                                                ## #      /  ##     ## ##    ##   ##    ##      ##  ##        ##              ## #      /    ##    ## ##");
        say("                                                                                 ###     /   ##     ## ##    /#   ##    ##      ##  ####    / ##               ###     /     ##    ## ####    /");
        say("                                                                                  ######/    ##     ##  ####/ ##  #######       ##   ######/  ###               ######/      ###   ### ######/");
        say("                                                                                   ###       ##    ##   ###   ## ######         ##   #####    ###                ###         ###   ### #####");
        say("                                                                                                   /             ##");
        say("                                                                                                  /              ##");
        say("                                                                                                 /               ##");
        say("                                                                                                /                 ##");
        blank(5);
        dramatic(5000,"                                                                                                                        “Come without a map. Draw your own.”");
    }

    /*
     * Chapter Two's Logo & Quote
     */
    public void chapterTwoLogo(){
        blank(7);
        say("                                                                                    # ###      /                                                              /###           /                             ");
        say("                                                                                  /  /###  / #/                                                              /  ############/");
        say("                                                                                 /  /  ###/  ##                                  #                          /     #########");
        say("                                                                                /  ##   ##   ##                                 ##                          #     /  #     ##");
        say("                                                                               /  ###        ##                                 ##                           ##  /  ##     ##");
        say("                                                                              ##   ##        ##  /##      /###       /###     ######## /##  ###  /###           /  ###      ##    ###    ####      /###");
        say("                                                                              ##   ##        ## / ###    / ###  /   / ###  / ######## / ###  ###/ #### /       ##   ##       ##    ###     ###  / / ###  /");
        say("                                                                              ##   ##        ##/   ###  /   ###/   /   ###/     ##   /   ###  ##   ###/        ##   ##       ##     ###     ###/ /   ###/");
        say("                                                                              ##   ##        ##     ## ##    ##   ##    ##      ##  ##    ### ##               ##   ##       ##      ##      ## ##    ##");
        say("                                                                              ##   ##        ##     ## ##    ##   ##    ##      ##  ########  ##               ##   ##       ##      ##      ## ##    ##");
        say("                                                                               ##  ##        ##     ## ##    ##   ##    ##      ##  #######   ##                ##  ##       ##      ##      ## ##    ##");
        say("                                                                                ## #      /  ##     ## ##    ##   ##    ##      ##  ##        ##                 ## #      / ##      ##      ## ##    ##");
        say("                                                                                 ###     /   ##     ## ##    /#   ##    ##      ##  ####    / ##                  ###     /  ##      /#      /  ##    ##");
        say("                                                                                  ######/    ##     ##  ####/ ##  #######       ##   ######/  ###                  ######/    ######/ ######/    ######");
        say("                                                                                    ###       ##    ##   ###   ## ######         ##   #####    ###                   ###       #####   #####      ####");
        say("                                                                                                    /             ##");
        say("                                                                                                   /              ##");
        say("                                                                                                  /               ##");
        say("                                                                                                 /                 ##");
        blank(5);
        dramatic(5000,"                                                                                                              “Seeking what is true is not seeking what is desirable.”");

    }

    public void chapterThreeLogo(){
        blank(7);
        say("                                                                                    # ###      /                                                              /###           /  /");
        say("                                                                                  /  /###  / #/                                                              /  ############/ #/");
        say("                                                                                 /  /  ###/  ##                                  #                          /     #########   ##");
        say("                                                                                /  ##   ##   ##                                 ##                          #     /  #        ##");
        say("                                                                               /  ###        ##                                 ##                           ##  /  ##        ##");
        say("                                                                              ##   ##        ##  /##      /###       /###     ######## /##  ###  /###           /  ###        ##  /## ###  /###     /##       /##");
        say("                                                                              ##   ##        ## / ###    / ###  /   / ###  / ######## / ###  ###/ #### /       ##   ##        ## / ### ###/ #### / / ###     / ###");
        say("                                                                              ##   ##        ##/   ###  /   ###/   /   ###/     ##   /   ###  ##   ###/        ##   ##        ##/   ### ##   ###/ /   ###   /   ###");
        say("                                                                              ##   ##        ##     ## ##    ##   ##    ##      ##  ##    ### ##               ##   ##        ##     ## ##       ##    ### ##    ### ");
        say("                                                                              ##   ##        ##     ## ##    ##   ##    ##      ##  ########  ##               ##   ##        ##     ## ##       ########  ########");
        say("                                                                               ##  ##        ##     ## ##    ##   ##    ##      ##  #######   ##                ##  ##        ##     ## ##       #######   #######");
        say("                                                                                ## #      /  ##     ## ##    ##   ##    ##      ##  ##        ##                 ## #      /  ##     ## ##       ##        ##");
        say("                                                                                 ###     /   ##     ## ##    /#   ##    ##      ##  ####    / ##                  ###     /   ##     ## ##       ####    / ####    / ");
        say("                                                                                  ######/    ##     ##  ####/ ##  #######       ##   ######/  ###                  ######/    ##     ## ###       ######/   ######/");
        say("                                                                                    ###       ##    ##   ###   ## ######         ##   #####    ###                   ###       ##    ##  ###       #####     #####");
        say("                                                                                                    /             ##                                                                 /");
        say("                                                                                                   /              ##                                                                /");
        say("                                                                                                  /               ##                                                               / ");
        say("                                                                                                 /                 ##                                                             /");
        blank(5);
        dramatic(5000,"                                                                                                              “Seeking what is true is not seeking what is desirable.”");
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
        for(char c : dialogue.toCharArray()){
            System.out.print(c);
            delay(40);
        }
        delay(time);
        clear();
    }

    /*
     * A simpler way, rather than typing out System.out.println() every time.
     */
    public void say(Object dialogue){
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

    public int getInt(String question){
        Scanner scanner = new Scanner(System.in);
        say(question);
        return (scanner.nextInt());
    }

    public String getString(String question){
        Scanner scanner = new Scanner(System.in);
        say(question);
        String response = scanner.nextLine();
        if (response == "bp"){
            Inventory.modify();
        }
        return response;
    }
}
