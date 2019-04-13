package pl.mzacharuk;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DigitToWords {

    public static void digitToWords() {
        Map<Integer, String> hundredsMap = new HashMap();
        hundredsMap.put(1, "sto ");
        hundredsMap.put(2, "dwieście ");
        hundredsMap.put(3, "trzysta ");
        hundredsMap.put(4, "czterysta ");
        hundredsMap.put(5, "pięćset ");
        hundredsMap.put(6, "sześćset ");
        hundredsMap.put(7, "siedmset ");
        hundredsMap.put(8, "osiemset ");
        hundredsMap.put(9, "dziewięćset ");

        Map<Integer, String> tensMap = new HashMap();
        tensMap.put(0, "");
        tensMap.put(1, "dziesięć ");
        tensMap.put(2, "dwadzieścia ");
        tensMap.put(3, "trzydzieści ");
        tensMap.put(4, "czerdzieści ");
        tensMap.put(5, "pięćdziesiąt ");
        tensMap.put(6, "sześćdziesiąt ");
        tensMap.put(7, "siedemdziesiąt ");
        tensMap.put(8, "osiemdziesiąt ");
        tensMap.put(9, "dziewięćdziesiąt ");

        Map<Integer, String> onesMap = new HashMap();
        onesMap.put(0, "");
        onesMap.put(1, "jeden");
        onesMap.put(2, "dwa");
        onesMap.put(3, "trzy");
        onesMap.put(4, "cztery");
        onesMap.put(5, "pięć");
        onesMap.put(6, "sześć");
        onesMap.put(7, "siedem");
        onesMap.put(8, "osiem");
        onesMap.put(9, "dziewięć");

        System.out.println("Please type three integer digits");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        if (!(number.length() <= 4)) {
            System.out.println("You can only enter three integer digits and minus sign. Please try again.");
            System.exit(0);
        }

        String sign = "";
        boolean isNegativeNumber = false;
        int hundreds = 0;
        int tens = 0;
        int ones = 0;

        try {
            if(number.length()>3 && number.charAt(0) == '-'){
                sign = String.valueOf(number.charAt(0));
                hundreds = Integer.parseInt(String.valueOf(number.charAt(1)));
                tens = Integer.parseInt(String.valueOf(number.charAt(2)));
                ones = Integer.parseInt(String.valueOf(number.charAt(3)));
                isNegativeNumber = true;
            }else if(number.length()==3){
                hundreds = Integer.parseInt(String.valueOf(number.charAt(0)));
                tens = Integer.parseInt(String.valueOf(number.charAt(1)));
                ones = Integer.parseInt(String.valueOf(number.charAt(2)));
            }else{
                System.out.println("Wrong numbers. Try again");
            }
        } catch (
                NumberFormatException a) {
            System.out.println("You put wrong numbers. Try again");
            System.exit(0);
        }
        /*
        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(ones);
        */

        String finalOutput = "";

        try {
            if (hundredsMap.containsKey(hundreds)) {
                System.out.println(hundredsMap.get(hundreds));
                finalOutput += hundredsMap.get(hundreds);
            } else {
                System.out.println("Wrong first number. First digit should be in range (1-9)");
                System.exit(0);
            }
            if (tensMap.containsKey(tens)) {
                System.out.println(tensMap.get(tens));
                finalOutput += tensMap.get(tens);
            } else {
                System.out.println("Wrong second number");
            }
            if (onesMap.containsKey(ones)) {
                System.out.println(onesMap.get(ones));
                finalOutput += onesMap.get(ones);
            } else {
                System.out.println("Wrong third number");
            }
        } catch (
                NumberFormatException e) {
            e.printStackTrace();
        }

        if(isNegativeNumber){
            System.out.println("minus "+finalOutput);
        }else{
            System.out.println(finalOutput);
        }

    }
}