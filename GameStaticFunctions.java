
/**
 * Write a description of class GameFunctions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameStaticFunctions
{
    /**
     * Constructor for objects of class GameFunctions
     */
    public GameStaticFunctions()
    {
    }
    // Flashcards design
    // Gives user directions to play
    public void directionsIntro() 
    {
        System.out.println("Practice numbers in various World Languages with this application.");
        System.out.println("Directions: You will be given a random number (1 - 999) in written form.");
        System.out.println("Just type in the correct number (using digits) in the input line, and");
        System.out.println("the computer will tell you if you are correct!\n");
        System.out.println("\tSelect which language you would like to practice by entering");
        System.out.println("\tthe corresponding number from the languages menu below. >> \n");
    }
    //Intial Splashscreen
    public void splashScreenIntro()
    {
        // This Draws a Tree - taken from Lab 3
        // Declare counters and variables
        int num = 12;
        int initialNum = num;
        String initialStars = "*";
        String stars = "**";
        do 
        {
            // Create whitespace
            String initialWhiteSpace = "";
            String whiteSpace = " ";
            for (int i = 0; i < num; i++) 
            {
                initialWhiteSpace += whiteSpace;
            }
            // Create stars
            if (num == 6) 
            {
                System.out.println("\t\t" + initialWhiteSpace + initialStars + "\t World Language Number Flashcards!");
            }
            else if (num == 7) 
            {
                System.out.println("\t\t" + initialWhiteSpace + initialStars + "\t Final Project - CPT 236 - Alimagham");
            }
            else if (num == 8) 
            {
                System.out.println("\t\t" + initialWhiteSpace + initialStars + "\t John Russell Wilkins");
            }
            else 
            {
                System.out.println("\t\t" + initialWhiteSpace + initialStars);
            }
            try {
                // thread to sleep for x milliseconds
                Thread.sleep(150);
            } catch (Exception e) {
                System.out.println(e);
            }
            initialStars += stars;
            num -=1;
        }
        while (num > 0);
        // Base
        String baseWhiteSpaceStart = "";
        String baseStars = ":::::";
        String baseWhiteSpace = " ";
        for (int i = 0; i < (initialNum-2); i++) 
        {
            baseWhiteSpaceStart += baseWhiteSpace;
        }
        System.out.println("\t\t" + baseWhiteSpaceStart + baseStars);
        System.out.println("\t\t" + baseWhiteSpaceStart + baseStars);
        // Brief pause before directions
        try 
        {
            // thread to sleep for x milliseconds
            Thread.sleep(300);
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
