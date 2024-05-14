// import java.util.ArrayList;
// Sources:
// https://omniglot.com/language/numbers/persian.htm
import java.io.PrintStream;
import java.util.*;
public class PersianNumbers
{
    // Initialize Random class 
    Random rand = new Random();
    // Create Array lists with numbers for combinations
    List<String> persianNumbersALL = new ArrayList<String>();
    List<String> persianNumbersOnes = new ArrayList<String>();
    List<String> persianNumbersTeens = new ArrayList<String>();
    List<String> persianNumbersByTens = new ArrayList<String>();
    List<String> persianNumbersHundreds = new ArrayList<String>();
    /**
     * Constructor for objects of class PersianNumbers
     */
    public PersianNumbers()
    {
        // Create ArrayList of 1 - 9
        for (int i = 1; i < 10; i++) 
        { 
            switch (i) {
              case 1: persianNumbersOnes.add("یک");
              break;
              case 2: persianNumbersOnes.add("دو");
              break;
              case 3: persianNumbersOnes.add("سه");
              break;
              case 4: persianNumbersOnes.add("چهار");
              break; 
              case 5: persianNumbersOnes.add("پنج");
              break;
              case 6: persianNumbersOnes.add("شش");
              break;
              case 7: persianNumbersOnes.add("هفت");
              break;
              case 8: persianNumbersOnes.add("هشت");
              break; 
              case 9: persianNumbersOnes.add("نه");
              break; 
            }
        }  
        // Create ArrayList of 10 - 19
        for (int i = 0; i < 10; i++) 
        { 
            switch (i) {
              // ten
              case 0: persianNumbersTeens.add("ده");
              break;
              // eleven
              case 1: persianNumbersTeens.add("یازده");
              break;
              // twelve
              case 2: persianNumbersTeens.add("دوازده");
              break;
              // thirteen
              case 3: persianNumbersTeens.add("سیزده");
              break; 
              // fourteen
              case 4: persianNumbersTeens.add("چهارده");
              break;
              // fifteen
              case 5: persianNumbersTeens.add("پانزده");
              break;
              //sixteen
              case 6: persianNumbersTeens.add("شانزده");
              break;
              // seventeen
              case 7: persianNumbersTeens.add("هفده");
              break; 
              // eighteen
              case 8: persianNumbersTeens.add("هجده");
              break; 
              // nineteen
              case 9: persianNumbersTeens.add("نوزده");
              break;
            }
        } 
        // Create array list for 20 - 90 by 10s
        for (int i = 1; i < 9; i++) 
        {
            switch (i) {
              // twenty
              case 1: persianNumbersByTens.add("بیست");
              break;
              // thirty
              case 2: persianNumbersByTens.add("سی");
              break;
              // fourty
              case 3: persianNumbersByTens.add("چهل");
              break; 
              // fifty
              case 4: persianNumbersByTens.add("پنجاه");
              break;
              // sixty
              case 5: persianNumbersByTens.add("شصت");
              break;
              // seventy
              case 6: persianNumbersByTens.add("هفتاد");
              break;
              // eighty
              case 7: persianNumbersByTens.add("هشتاد");
              break; 
              // ninety
              case 8: persianNumbersByTens.add("نود");
              break; 
            }
        }
        // Create array list for 100 - 900 by 100
        for (int i = 0; i < 10; i++) 
        { 
            switch (i) {
              // 100
              case 1: persianNumbersHundreds.add("صد");
              break;
              // 200
              case 2: persianNumbersHundreds.add("دویست");
              break;
              // 300
              case 3: persianNumbersHundreds.add("سيصد");
              break; 
              // 400
              case 4: persianNumbersHundreds.add("چَهارصد");
              break;
              // 500
              case 5: persianNumbersHundreds.add("پانصد");
              break;
              // 600
              case 6: persianNumbersHundreds.add("ششصد");
              break;
              // 700
              case 7: persianNumbersHundreds.add("هفتصد");
              break; 
              // 800
              case 8: persianNumbersHundreds.add("هشتصد");
              break; 
              // 900
              case 9: persianNumbersHundreds.add("نهصد");
              break;
            }
        }
        // Add 1- 9 to main list
        for (int i = 0; i < 9; i++) 
        {
            persianNumbersALL.add(persianNumbersOnes.get(i));
        }
        // Add 10 - 19 to main list
        for (int i = 0; i < 10; i++)
        {
            persianNumbersALL.add(persianNumbersTeens.get(i));
        }
        // Add 20 - 99 to Main List
        for (int i = 0; i < 8; i++)
        {
            persianNumbersALL.add(persianNumbersByTens.get(i));
            for (int x = 0; x < 9; x++) 
            {
                persianNumbersALL.add(persianNumbersByTens.get(i) + " و "
                + persianNumbersOnes.get(x));
            }
        }
        // Add 100 - 999 to main list
        for (int y = 0; y < 9; y++) 
        {
            persianNumbersALL.add(persianNumbersHundreds.get(y));
            // Add 101 - 109, 201 - 209 etc. to main list
            for (int i = 0; i < 9; i++) 
            {
                persianNumbersALL.add(persianNumbersHundreds.get(y) + " و "
                + persianNumbersOnes.get(i));
            }
            // Add 111 - 119, 211 - 219, etc. to main list
            for (int i = 0; i < 10; i++)
            {
                persianNumbersALL.add(persianNumbersHundreds.get(y) + " و "
                + persianNumbersTeens.get(i));
            }
            // Add 220 - 299, 320 - 399 etc to main list
            for (int i = 0; i < 8; i++)
            {
                persianNumbersALL.add(persianNumbersHundreds.get(y) + " و "
                + persianNumbersByTens.get(i));
                for (int x = 0; x < 9; x++) 
                {
                    persianNumbersALL.add(persianNumbersHundreds.get(y) + " و "
                    + persianNumbersByTens.get(i) + " و "
                    + persianNumbersOnes.get(x));
                }
            }
        }
     
        // Testing 
        // System.out.println(persianNumbersALL);
        //System.out.println("33 :" + persianNumbersALL.get(32));
        //System.out.println("24 :" + persianNumbersALL.get(23));
        // More testing 
        /*
        for (int i = 0; i < persianNumbersALL.size(); i++) 
        {
            System.out.println( (i+1) + " : " + persianNumbersALL.get(i));
        }
        // video check: https://www.youtube.com/watch?v=Y-ld8tjlCIA
        System.out.println(persianNumbersALL.get(130) + " 131? ");
        System.out.println(persianNumbersALL.size());
        */
    }
    
}
