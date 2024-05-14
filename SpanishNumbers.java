// import java.util.ArrayList;
import java.io.PrintStream;
import java.util.*;
/* 
 * John Russell Wilkins
 * CPT 236 - Final Proj
 * Spanish Number generator
 * Spanish Numbers to ArrayList
 */

// import java.util.Random;
public class SpanishNumbers
{
    // Initialize Random class 
    Random rand = new Random();
    // Create Array lists with numbers for combinations
    List<String> spanishNumbersOnes = new ArrayList<String>();
    List<String> spanishNumbersTeens = new ArrayList<String>();
    List<String> spanishNumbersTwenties = new ArrayList<String>();
    List<String> spanishNumbersThirtyToNinety = new ArrayList<String>();
    List<String> spanishNumbersHundreds = new ArrayList<String>();
    List<String> spanishNumbersAll = new ArrayList<String>();
    
    public SpanishNumbers() 
    {
        // If I add '0' then all numbers will be aligned with their array list
        // maybe add '0' before all other additions to Spanish Numbers All 
        // And do the same for other languages, and not include it in any calculations
        
        // Create ArrayList of 1 - 9
        for (int i = 1; i < 10; i++) 
        { 
            switch (i) {
              case 1: spanishNumbersOnes.add("uno");
              break;
              case 2: spanishNumbersOnes.add("dos");
              break;
              case 3: spanishNumbersOnes.add("tres");
              break;
              case 4: spanishNumbersOnes.add("cuatro");
              break; 
              case 5: spanishNumbersOnes.add("cinco");
              break;
              case 6: spanishNumbersOnes.add("seis");
              break;
              case 7: spanishNumbersOnes.add("siete");
              break;
              case 8: spanishNumbersOnes.add("ocho");
              break; 
              case 9: spanishNumbersOnes.add("nueve");
              break; 
            }
        }                       
        
        // Create ArrayList of 10 - 19
        for (int i = 10; i < 20; i++) 
        { 
            switch (i) {
              case 10: spanishNumbersTeens.add("diez");
              break;
              case 11: spanishNumbersTeens.add("once");
              break;
              case 12: spanishNumbersTeens.add("doce");
              break;
              case 13: spanishNumbersTeens.add("trece");
              break; 
              case 14: spanishNumbersTeens.add("catorce");
              break;
              case 15: spanishNumbersTeens.add("quince");
              break;
              case 16: spanishNumbersTeens.add("dieciséis");
              break;
              case 17: spanishNumbersTeens.add("diecisiete");
              break; 
              case 18: spanishNumbersTeens.add("dieciocho");
              break; 
              case 19: spanishNumbersTeens.add("diecinueve");
              break;
            }
        }
        
        // Create ArrayList for 20 - 29
        for (int i = 20; i < 30; i++) 
        { 
            switch (i) {
              case 20: spanishNumbersTwenties.add("veinte");
              break;
              case 21: spanishNumbersTwenties.add("veintiuno");
              break;
              case 22: spanishNumbersTwenties.add("veintidós");
              break;
              case 23: spanishNumbersTwenties.add("veintitrés");
              break; 
              case 24: spanishNumbersTwenties.add("veinticuatro");
              break;
              case 25: spanishNumbersTwenties.add("veinticinco");
              break;
              case 26: spanishNumbersTwenties.add("veintiséis");
              break;
              case 27: spanishNumbersTwenties.add("veintisiete");
              break; 
              case 28: spanishNumbersTwenties.add("veintiocho");
              break; 
              case 29: spanishNumbersTwenties.add("veintinueve");
              break;
            } 
        } 
        
        // Create an ArrayList for 30 - 90 by 10
        for (int i = 30; i < 100; i+=10) 
        { 
            switch (i) {
              case 30: spanishNumbersThirtyToNinety.add("treinta");
              break;
              case 40: spanishNumbersThirtyToNinety.add("cuarenta");
              break;
              case 50: spanishNumbersThirtyToNinety.add("cincuenta");
              break;
              case 60: spanishNumbersThirtyToNinety.add("sesenta");
              break; 
              case 70: spanishNumbersThirtyToNinety.add("setenta");
              break;
              case 80: spanishNumbersThirtyToNinety.add("ochenta");
              break;
              case 90: spanishNumbersThirtyToNinety.add("noventa");
              break;
            } 
        }
        
        
        // Create an ArryaList for 100 (but not 'cien') - 900
        for (int i = 0; i < 9; i++) 
        { 
            switch (i) {
              case 0: spanishNumbersHundreds.add("ciento");
              break;
              case 1: spanishNumbersHundreds.add("doscientos");
              break;
              case 2: spanishNumbersHundreds.add("trescientos");
              break;
              case 3: spanishNumbersHundreds.add("cuatrocientos");
              break; 
              case 4: spanishNumbersHundreds.add("quinientos");
              break;
              case 5: spanishNumbersHundreds.add("seiscientos");
              break;
              case 6: spanishNumbersHundreds.add("setecientos");
              break;
              case 7: spanishNumbersHundreds.add("ochocientos");
              break;
              case 8: spanishNumbersHundreds.add("novecientos");
              break;
            } 
        }
        
        //Combine numbers 1 - 99
        for (int i = 0; i < 9; i++) 
        {
            spanishNumbersAll.add(spanishNumbersOnes.get(i));
        }
        for (int i = 0; i < 10; i++) 
        {
            spanishNumbersAll.add(spanishNumbersTeens.get(i));
        }
        for (int i = 0; i < 10; i++) 
        {
            spanishNumbersAll.add(spanishNumbersTwenties.get(i));
        }
        for (int i = 0; i < 7; i++) 
        {
            spanishNumbersAll.add(spanishNumbersThirtyToNinety.get(i));
            for (int x = 0; x < 9; x++) 
            {
            spanishNumbersAll.add(spanishNumbersThirtyToNinety.get(i) + " y " + spanishNumbersOnes.get(x));
            }
        }
        // Add "Cien" - 100, outlier
        spanishNumbersAll.add("cien");
        // Add 101 - 199 to list
        for (int y = 0; y < 1; y++) 
        {
            for (int i = 0; i < 9; i++) 
            {
                spanishNumbersAll.add(spanishNumbersHundreds.get(y) + " " + spanishNumbersOnes.get(i));
            }
            for (int i = 0; i < 10; i++) 
            {
                spanishNumbersAll.add(spanishNumbersHundreds.get(y) + " " + spanishNumbersTeens.get(i));
            }
            for (int i = 0; i < 10; i++) 
            {
            spanishNumbersAll.add(spanishNumbersHundreds.get(y) + " " + spanishNumbersTwenties.get(i));
            }
            for (int i = 0; i < 7; i++) 
            {
                spanishNumbersAll.add(spanishNumbersHundreds.get(y) + " " + spanishNumbersThirtyToNinety.get(i));
                for (int x = 0; x < 9; x++) 
                {
                    spanishNumbersAll.add(spanishNumbersHundreds.get(y) + " " + spanishNumbersThirtyToNinety.get(i) + " y " + spanishNumbersOnes.get(x));
                }
            }
        }
        // Add numbers 200 - 999 to ArrayList
        for (int y = 1; y < 9; y++) 
        {
            spanishNumbersAll.add(spanishNumbersHundreds.get(y));
            for (int i = 0; i < 9; i++) 
            {
                spanishNumbersAll.add(spanishNumbersHundreds.get(y) + " " + spanishNumbersOnes.get(i));
            }
            for (int i = 0; i < 10; i++) 
            {
                spanishNumbersAll.add(spanishNumbersHundreds.get(y) + " " + spanishNumbersTeens.get(i));
            }
            for (int i = 0; i < 10; i++) 
            {
                spanishNumbersAll.add(spanishNumbersHundreds.get(y) + " " + spanishNumbersTwenties.get(i));
            }
            for (int i = 0; i < 7; i++) 
            {
                spanishNumbersAll.add(spanishNumbersHundreds.get(y) + " " + spanishNumbersThirtyToNinety.get(i));
                for (int x = 0; x < 9; x++) 
                {
                    spanishNumbersAll.add(spanishNumbersHundreds.get(y) + " " + spanishNumbersThirtyToNinety.get(i) + " y " + spanishNumbersOnes.get(x));
                }
            }
        }
        /* Trouble shooting printing
        System.out.println(spanishNumbersOnes);
        System.out.println(spanishNumbersTeens);
        System.out.println(spanishNumbersTwenties);
        System.out.println(spanishNumbersThirtyToNinety);
        System.out.println(spanishNumbersHundreds);
        System.out.println(spanishNumbersAll);
        System.out.println(spanishNumbersAll.size());
        */
        //System.out.println(spanishNumbersAll.get(123).length());
    }
    public void randomPrintOut() 
    {
        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(1000);
        System.out.println(rand_int1+1);
        System.out.println(spanishNumbersAll.get(rand_int1));
    }
    public String getNumberString(int n) 
    {
        String numberString = spanishNumbersAll.get(n-1);
        return numberString;
    }
}
