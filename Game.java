import java.util.Scanner;
import javax.swing.*; // For message pop-up box
import java.util.*;
public class Game
{
    JFrame frameVar; // Frame variable to create pop-up box
    GameStaticFunctions GSM = new GameStaticFunctions();
    public Game()
    {
        GSM.splashScreenIntro();
        // Give directions
        GSM.directionsIntro();
        // Print out available languages
        int playAgain = 0;
        while (playAgain < 1)
        {
            playGame();
            Scanner playAgainInput = new Scanner(System.in);
            int playAgainInputInt;
            System.out.println("Play again? >> \n\t 1 -- Yes\n\t 2 -- No");
            playAgainInputInt = playAgainInput.nextInt();
            if (playAgainInputInt == 1) 
            {
                System.out.println("\n Great!");
                System.out.println("\tSelect which language you would like to practice by entering");
                System.out.println("\tthe corresponding number from the languages menu below. >> \n");
            }
            else 
            {
                playAgain +=1;
                System.out.println("Goodbye!");
            }
        }
    }
    
    public void playGame() 
    {
        Scanner gameLang = new Scanner(System.in);
        Scanner timesPlay = new Scanner(System.in);
        int gameLangVar;
        int timesToPlay;
        availableLanguages();
        // Player inputs game
        gameLangVar = gameLang.nextInt();
        System.out.println("Enter the number of rounds would you like to play. (5 is recommended) >> ");
        timesToPlay = timesPlay.nextInt();
        System.out.println(timesToPlay + " cards coming up!\n\n");
        try 
        {
            // thread to sleep for x milliseconds
            Thread.sleep(300);
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        switch (gameLangVar) 
        { 
            case 1:
                for (int i = 0; i < timesToPlay; i++)
                {
                    randomNumberStringEnglish();
                }
                break;
            case 2:
                for (int i = 0; i < timesToPlay; i++)
                {
                    randomNumberStringSpanish();
                }
                break;
            case 3:
                for (int i = 0; i < timesToPlay; i++) 
                {
                    randomNumberStringTurkish();
                }
                break;
            case 4:
                for (int i = 0; i < timesToPlay; i++) 
                {
                    randomNumberStringPersian();
                }
                break;
            default: System.out.println("Your language input: " + gameLangVar + " is not an option!");
            //default: JOptionPane.showMessageDialog(frameVar, "That's not an option!");
        }
    }
    
    public int randomNumberStringSpanish() 
    {
        Random rand = new Random();
        SpanishNumbers Spanish = new SpanishNumbers();
        Scanner inputNumber = new Scanner(System.in);
        int randInt = rand.nextInt(1000); 
        String cardBox = ":::::";
        String cardBoxS = ":";
        for (int i = 0; i < Spanish.spanishNumbersAll.get(randInt-1).length(); i++) 
        {
            cardBox += cardBoxS;
        }
        System.out.println(cardBox + ":::::");
        System.out.println(":    "+ Spanish.spanishNumbersAll.get(randInt - 1) + "    :");
        System.out.println(cardBox + ":::::");
        int userInputNumber = inputNumber.nextInt();
        if (userInputNumber == randInt) 
        {
           System.out.println("Correct!"+ "\n");
        }
        else 
        {
            System.out.println("Correct answer: " + randInt + "\n");
        }
        return randInt;
    }
    public int randomNumberStringEnglish()
    {
        Random rand = new Random();
        EnglishNumbers English = new EnglishNumbers();
        Scanner inputNumber = new Scanner(System.in);
        int randInt = rand.nextInt(1000);
        String cardBox = ":::::";
        String cardBoxS = ":";
        for (int i = 0; i < English.englishNumbersALL2.get(randInt-1).length(); i++) 
        {
            cardBox += cardBoxS;
        }
        System.out.println(cardBox + ":::::");
        System.out.println(":    "+ English.englishNumbersALL2.get(randInt - 1) + "    :");
        System.out.println(cardBox + ":::::");
        int userInputNumber = inputNumber.nextInt();
        if (userInputNumber == randInt) 
        {
            System.out.println("Correct!"+ "\n");
        }
        else 
        {
            System.out.println("Correct answer: " + randInt + "\n");
        }
        return randInt;
    }
    public int randomNumberStringTurkish() 
    {
        Random rand = new Random();
        TurkishNumbers Turkish = new TurkishNumbers();
        Scanner inputNumber = new Scanner(System.in);
        int randInt = rand.nextInt(1000);
        String cardBox = ":::::";
        String cardBoxS = ":";
        for (int i = 0; i < Turkish.turkishNumbersAll.get(randInt-1).length(); i++) 
        {
            cardBox += cardBoxS;
        }
        System.out.println(cardBox + ":::::");
        System.out.println(":    "+ Turkish.turkishNumbersAll.get(randInt - 1) + "    :");
        System.out.println(cardBox + ":::::");
        int userInputNumber = inputNumber.nextInt();
        if (userInputNumber == randInt) 
        {
            System.out.println("Correct!"+ "\n");
        }
        else 
        {
            System.out.println("Correct answer: " + randInt + "\n");
        }
        return randInt;
    }
    public int randomNumberStringPersian() 
    {
        Random rand = new Random();
        PersianNumbers Persian = new PersianNumbers();
        Scanner inputNumber = new Scanner(System.in);
        int randInt = rand.nextInt(1000); 
        String cardBox = ":::::";
        String cardBoxS = ":";
        for (int i = 0; i < Persian.persianNumbersALL.get(randInt-1).length(); i++) 
        {
            cardBox += cardBoxS;
        }
        System.out.println(cardBox + ":::::");
        System.out.println("\t" + Persian.persianNumbersALL.get(randInt - 1) + "\t:");
        System.out.println(cardBox + ":::::");
        int userInputNumber = inputNumber.nextInt();
        if (userInputNumber == randInt) 
        {
            System.out.println("Correct!" + "\n");
        }
        else 
        {
            System.out.println("Correct answer: " + randInt + "\n");
        }
        return randInt;
    }
    
    public void availableLanguages() 
    {
        System.out.println("\t 1 -- English");
        System.out.println("\t 2 -- Spanish / Español");
        System.out.println("\t 3 -- Turkish / Türkçe");
        System.out.println("\t 4 -- Persian (Farsi) / فارسی");
    }
}
