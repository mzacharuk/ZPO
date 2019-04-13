package pl.mzacharuk;

import static pl.mzacharuk.DigitToWords.digitToWords;
import static pl.mzacharuk.NumberConverter.convertNumber;
import static pl.mzacharuk.PeselAnalyzer.getInfoFromPesel;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lab1 Zad1:");
        convertNumber();
        System.out.println("####");
        System.out.println("\n");

        System.out.println("Lab1 Zad2:");
        System.out.println(getInfoFromPesel());
        System.out.println("####");
        System.out.println("\n");

        System.out.println("Lab1 Zad3:");
        digitToWords();
    }
}
