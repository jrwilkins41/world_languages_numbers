import java.util.ArrayList;
// Best option for printing unicode characters needed for many languages
// Source: http://hints.macworld.com/article.php?story=20050208053951714
import java.io.PrintStream;
import java.util.*;
// import java.util.Random;
/**
 * English Numbers for Trouble Shooting
 */
public class EnglishNumbers
{
    // instance variables - replace the example below with your own
    Random rand = new Random();
    List<String> englishNumbersOnes = new ArrayList<String>();
    List<String> englishNumbersTeens = new ArrayList<String>();
    List<String> englishNumbersTwentyToNinety = new ArrayList<String>();
    List<String> englishNumbersHundreds = new ArrayList<String>();
    List<String> englishNumbersALL = new ArrayList<String>();
    List<String> englishNumbersALL2 = new ArrayList<String>();
    /**
     * Constructor for objects of class EnglishNumbers
     */
    public EnglishNumbers()
    {
            for (int i = 1; i < 10; i++) 
            { 
                switch (i) {
                  case 1: englishNumbersOnes.add("one");
                  break;
                  case 2: englishNumbersOnes.add("two");
                  break;
                  case 3: englishNumbersOnes.add("three");
                  break;
                  case 4: englishNumbersOnes.add("four");
                  break; 
                  case 5: englishNumbersOnes.add("five");
                  break;
                  case 6: englishNumbersOnes.add("six");
                  break;
                  case 7: englishNumbersOnes.add("seven");
                  break;
                  case 8: englishNumbersOnes.add("eight");
                  break; 
                  case 9: englishNumbersOnes.add("nine");
                  break; 
                }
            }
            
            for (int i = 10; i < 20; i++) 
            { 
                switch (i) {
                  case 10: englishNumbersTeens.add("ten");
                  break;
                  case 11: englishNumbersTeens.add("eleven");
                  break;
                  case 12: englishNumbersTeens.add("twelve");
                  break;
                  case 13: englishNumbersTeens.add("thirteen");
                  break; 
                  case 14: englishNumbersTeens.add("fourteen");
                  break;
                  case 15: englishNumbersTeens.add("fifteen");
                  break;
                  case 16: englishNumbersTeens.add("sixteen");
                  break;
                  case 17: englishNumbersTeens.add("seventeen");
                  break; 
                  case 18: englishNumbersTeens.add("eighteen");
                  break; 
                  case 19: englishNumbersTeens.add("nineteen");
                  break;
                    }
            }
            for (int i = 2; i < 10; i++) 
            { 
                switch (i) {
                  case 1: break;
                  case 2: englishNumbersTwentyToNinety.add("twenty");
                  break;
                  case 3: englishNumbersTwentyToNinety.add("thirty");
                  break;
                  case 4: englishNumbersTwentyToNinety.add("forty");
                  break; 
                  case 5: englishNumbersTwentyToNinety.add("fifty");
                  break;
                  case 6: englishNumbersTwentyToNinety.add("sixty");
                  break;
                  case 7: englishNumbersTwentyToNinety.add("seventy");
                  break;
                  case 8: englishNumbersTwentyToNinety.add("eighty");
                  break; 
                  case 9: englishNumbersTwentyToNinety.add("ninety");
                  break; 
                }
            }
            for (int i = 100; i < 1000; i += 100) 
            { 
                switch (i) {
                  case 100: englishNumbersHundreds.add("one hundred");
                  break;
                  case 200: englishNumbersHundreds.add("two hundred");
                  break;
                  case 300: englishNumbersHundreds.add("three hundred");
                  break;
                  case 400: englishNumbersHundreds.add("four hundred");
                  break; 
                  case 500: englishNumbersHundreds.add("five hundred");
                  break;
                  case 600: englishNumbersHundreds.add("six hundred");
                  break;
                  case 700: englishNumbersHundreds.add("seven hundred");
                  break;
                  case 800: englishNumbersHundreds.add("eight hundred");
                  break; 
                  case 900: englishNumbersHundreds.add("nine hundred");
                  break; 
                }
            }
            //System.out.println(englishNumbersOnes);
            //System.out.println(englishNumbersTeens);
            //System.out.println(englishNumbersTwentyToNinety);
            //System.out.println(englishNumbersHundreds);
            
            for (int i = 0; i < 100; i++) 
            {
                if (i < 9) 
                {
                    englishNumbersALL.add(englishNumbersOnes.get(i));
                }
                else if (i < 19)
                {
                    englishNumbersALL.add(englishNumbersTeens.get(i - 9));
                }
                else if (i < 99)
                {

                    if (i == 19) 
                    {
                        englishNumbersALL.add("twenty");
                    }
                    else if (i < 29) 
                    {
                        englishNumbersALL.add("twenty-"+englishNumbersOnes.get(i-20));
                    }
                    else if (i == 29) 
                    {
                        englishNumbersALL.add("thirty");
                    }
                    else if (i < 39) 
                    {
                        englishNumbersALL.add("thirty-"+englishNumbersOnes.get(i-30));
                    }
                    
                } 
            }   
            //System.out.println(englishNumbersALL);
            
            for (int i = 0; i < 9; i++) 
            {
                englishNumbersALL2.add(englishNumbersOnes.get(i));
            }
            for (int i = 0; i < 10; i++) 
            {
                englishNumbersALL2.add(englishNumbersTeens.get(i));
            }
            for (int i = 0; i < 8; i++) 
            {
                englishNumbersALL2.add(englishNumbersTwentyToNinety.get(i));
                for (int x = 0; x < 9; x++) 
                {
                englishNumbersALL2.add(englishNumbersTwentyToNinety.get(i) + "-" + englishNumbersOnes.get(x));
                }
            }
            for (int y = 0; y < 9; y++) 
            {
                englishNumbersALL2.add(englishNumbersHundreds.get(y));
                for (int i = 0; i < 9; i++) 
                {
                    englishNumbersALL2.add(englishNumbersHundreds.get(y) + " " + englishNumbersOnes.get(i));
                }
                for (int i = 0; i < 10; i++) 
                {
                    englishNumbersALL2.add(englishNumbersHundreds.get(y) + " " + englishNumbersTeens.get(i));
                }
                for (int i = 0; i < 8; i++) 
                {
                    englishNumbersALL2.add(englishNumbersHundreds.get(y) + " " + englishNumbersTwentyToNinety.get(i));
                    for (int x = 0; x < 9; x++) 
                    {
                        englishNumbersALL2.add(englishNumbersHundreds.get(y) + " " + englishNumbersTwentyToNinety.get(i) + "-" + englishNumbersOnes.get(x));
                    }
            }
            }
            //System.out.println(englishNumbersALL2);
            for(int i = 0; i < 200; i++) {// englishNumbersALL2.size(); i++) {
            //System.out.println(englishNumbersALL2.get(i));
        }
    }    
    public void randomPrintOut() 
    {
        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(1000);
        System.out.println(rand_int1+1);
        System.out.println(englishNumbersALL2.get(rand_int1));
    }
    public String getNumberString(int n) 
    {
        String numberString = englishNumbersALL2.get(n-1);
        return numberString;
    }
}
