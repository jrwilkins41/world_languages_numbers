import java.util.ArrayList;
// Best option for printing unicode characters needed for many languages
// Source: http://hints.macworld.com/article.php?story=20050208053951714
import java.io.PrintStream;
import java.util.*;
/**
 * John Russell Wilkins
 * CPT 236 - Alimagham
 */
public class TurkishNumbers
{
    // Initialize Random class 
    Random rand = new Random();
    // Create Array lists with numbers for combinations
    List<String> turkishNumbersOnes = new ArrayList<String>();
    List<String> turkishNumbersTens = new ArrayList<String>();
    List<String> turkishNumbersAll = new ArrayList<String>();
    /**
     * Constructor for objects of class TurkishNumbers
     */
    public TurkishNumbers()
    {
        //Reference: 
        // https://www.languagesandnumbers.com/how-to-count-in-turkish/en/tur/
        // Create ArrayList of 1 - 9
        for (int i = 1; i < 10; i++) 
        { 
            switch (i) {
              case 1: turkishNumbersOnes.add("bir");
              break;
              case 2: turkishNumbersOnes.add("iki");
              break;
              case 3: turkishNumbersOnes.add("üç");
              break;
              case 4: turkishNumbersOnes.add("dört");
              break; 
              case 5: turkishNumbersOnes.add("beş");
              break;
              case 6: turkishNumbersOnes.add("altı");
              break;
              case 7: turkishNumbersOnes.add("yedi");
              break;
              case 8: turkishNumbersOnes.add("sekiz");
              break; 
              case 9: turkishNumbersOnes.add("dokuz");
              break; 
            }
        }
        // Create ArrayList for 10 - 90 by 10
        for (int i = 1; i < 10; i++) 
        { 
            switch (i) {
              case 1: turkishNumbersTens.add("on");
              break;
              case 2: turkishNumbersTens.add("yirmi");
              break;
              case 3: turkishNumbersTens.add("otuz");
              break;
              case 4: turkishNumbersTens.add("kırk");
              break; 
              case 5: turkishNumbersTens.add("elli");
              break;
              case 6: turkishNumbersTens.add("altmış");
              break;
              case 7: turkishNumbersTens.add("yetmiş");
              break;
              case 8: turkishNumbersTens.add("seksen");
              break; 
              case 9: turkishNumbersTens.add("doksan");
              break; 
            }
        }
        // Put together full Turkish Numbers ArrayList
        for (int i = 0; i < 9; i++) 
        {
            turkishNumbersAll.add(turkishNumbersOnes.get(i));
        }
        for (int i = 0; i < 9; i++) 
        {
            turkishNumbersAll.add(turkishNumbersTens.get(i));
            for (int x = 0; x < 9; x++)
            {
                turkishNumbersAll.add(turkishNumbersTens.get(i) + ' ' + turkishNumbersOnes.get(x));
            }
        }
        turkishNumbersAll.add("yüz");
        for (int i = 0; i < 9; i++) 
        {
            turkishNumbersAll.add("yüz " + turkishNumbersOnes.get(i));
        }
        for (int i = 0; i < 9; i++) 
        {
            turkishNumbersAll.add("yüz " + turkishNumbersTens.get(i));
            for (int x = 0; x < 9; x++)
            {
                turkishNumbersAll.add("yüz " + turkishNumbersTens.get(i) + ' ' + turkishNumbersOnes.get(x));
            }
        }
        // Add numbers 200 - 999 to ArrayList
        
        for (int y = 1; y < 9; y++) 
        {
            // 200 - 900 by 100s
            turkishNumbersAll.add(turkishNumbersOnes.get(y) + " yüz ");
            // 201 - 209, 301-309, etc. 
            for (int a = 0; a < 9; a ++) 
            {
                turkishNumbersAll.add(turkishNumbersOnes.get(y) + " yüz "
                + turkishNumbersAll.get(a));
            }
            for (int x = 0; x < 9; x ++) 
            {
                //210 - 990 by 10s
                turkishNumbersAll.add(turkishNumbersOnes.get(y) + " yüz " 
                + turkishNumbersTens.get(x));
                for (int i = 0; i < 9; i++) 
                {
                    turkishNumbersAll.add(turkishNumbersOnes.get(y) + " yüz " 
                    + turkishNumbersTens.get(x) 
                    + " " + turkishNumbersOnes.get(i));
                }
            }
        }
        // Printing/troubleshooting
        /*
        System.out.println(turkishNumbersAll);
        System.out.println(turkishNumbersAll.size());
        System.out.println(turkishNumbersAll.get(797) + ", "
            + turkishNumbersAll.get(798) + ", "
            + turkishNumbersAll.get(799) + ", ");
        */
    }
}
