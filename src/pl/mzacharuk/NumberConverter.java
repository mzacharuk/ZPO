package pl.mzacharuk;

import java.util.Scanner;

public class NumberConverter {

    static int number = 0b1101_1000;

    public static void convertNumber(){
        System.out.println("Wybierz system na jaki chcesz przekonwertować liczbę:");
        System.out.println("dziesięć");
        System.out.println("trzy");
        System.out.println("szesnaście");
        Scanner scanner = new Scanner(System.in);
        String systemNumber = scanner.nextLine();

        switch(systemNumber){
            case "dziesięć":
                System.out.println(Integer.toString(number,10));
                break;
            case "trzy":
                System.out.println(Integer.toString(number,3));
                break;
            case "szesnaście":
                System.out.println(Integer.toString(number,16));
                break;
            default:
                System.out.println("Podałeś złą podstawę liczby.");

        }
    }

}
