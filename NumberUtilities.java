

import java.lang.Math;
public class NumberUtilities {

    public static String getRange(int stop) {
        String range= "";
        for (int i = 0; i < stop; i++) {
            range = range + i;      
}        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for(int i = start; i < stop; i++) {
            range = range + i;}
            return range;
    } 


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i= i + step) {
            range = range + i;
        } return range;
    }

    public static String getEvenNumbers(int start, int stop) {
        String range = "";
        
        for (int i =start; i < stop; i++) {
            if(i % 2 == 0) {
                range = range + i;
            } 
        } return range;
    } 


    public static String getOddNumbers(int start, int stop) {
       String range = "";
       for (int i= start; i < stop; i++) {
           if(i % 2 != 0) {
               range = range + i;
        } 
} return range;
}

    public static String getExponentiations(int start, int stop, int exponent) {
        String range = "";
        for (int i = start; i <= stop; i++) {
            range = range + (int)Math.pow(i,exponent);
    } return range;
}
}
