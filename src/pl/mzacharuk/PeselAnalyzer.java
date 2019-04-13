package pl.mzacharuk;

import java.util.ArrayList;
import java.util.Scanner;

public class PeselAnalyzer {

    public static ArrayList<String> getInfoFromPesel() {
        boolean isValid = false;
        ArrayList<String> infoFromPesel = new ArrayList<String>();
        System.out.println("Podaj PESEL");
        Scanner scanner = new Scanner(System.in);
        infoFromPesel.add(scanner.nextLine());

        String dateOfBirth = "";
        try{
            dateOfBirth = infoFromPesel.get(0).substring(0, 6);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Niepoprawny pesel. Spróbuj ponownie.");
            System.exit(0);
        }


        infoFromPesel.add(getDateOfBirth(dateOfBirth));

        int genderNumber = infoFromPesel.get(0).charAt(9);
        String gender;
        if (genderNumber % 2 == 0) {
            gender = "kobieta";
        } else {
            gender = "mezczyzna";
        }
        infoFromPesel.add(gender);

        if (infoFromPesel.get(0).length() == 11) {

            int firstNumber = Integer.parseInt(infoFromPesel.get(0).substring(0, 1));
            int secondNumber = Integer.parseInt(infoFromPesel.get(0).substring(1, 2));
            int thirdNumber = Integer.parseInt(infoFromPesel.get(0).substring(2, 3));
            int fourthNumber = Integer.parseInt(infoFromPesel.get(0).substring(3, 4));
            int fifthNumber = Integer.parseInt(infoFromPesel.get(0).substring(4, 5));
            int sixthNumber = Integer.parseInt(infoFromPesel.get(0).substring(5, 6));
            int seventhNumber = Integer.parseInt(infoFromPesel.get(0).substring(6, 7));
            int eighthNumber = Integer.parseInt(infoFromPesel.get(0).substring(7, 8));
            int ninethNumber = Integer.parseInt(infoFromPesel.get(0).substring(8, 9));
            int tenthNumber = Integer.parseInt(infoFromPesel.get(0).substring(9, 10));
            int eleventhNumber = Integer
                    .parseInt(infoFromPesel.get(0).substring(10, 11));

            int check = 1 * firstNumber + 3 * secondNumber + 7 * thirdNumber
                    + 9 * fourthNumber + 1 * fifthNumber + 3 * sixthNumber + 7
                    * seventhNumber + 9 * eighthNumber + 1 * ninethNumber + 3
                    * tenthNumber;
            int lastNumber = check % 10;
            int controlNumber = 10 - lastNumber;

            if (controlNumber == eleventhNumber) {
                System.out.println("Ok pesel");
                isValid = true;
            }else{
                isValid = false;
                System.out.println("Podales bledny numer PESEL");
            }
        } else {
            System.out.println("Podałeś błędny numer Pesel");
            isValid = false;
        }
        if(isValid){
            return infoFromPesel;
        }else{
            infoFromPesel.clear();
            return infoFromPesel;
        }
    }

    private static String getDateOfBirth(String dateFromPesel) {
        String yearOfBirth = dateFromPesel.substring(0, 2);
        String monthOfBirth = dateFromPesel.substring(2, 4);
        String dayOfBirth = dateFromPesel.substring(4, 6);
        int monthOfBirthNumber = Integer.parseInt(monthOfBirth);

        if (monthOfBirthNumber >= 01 && monthOfBirthNumber <= 12) {
            yearOfBirth = 19 + yearOfBirth;
        } else if (monthOfBirthNumber >= 21 && monthOfBirthNumber <= 32) {
            yearOfBirth = 20 + yearOfBirth;
            monthOfBirthNumber = monthOfBirthNumber - 20;
        } else if (monthOfBirthNumber >= 41 && monthOfBirthNumber <= 52) {
            yearOfBirth = 21 + yearOfBirth;
            monthOfBirthNumber = monthOfBirthNumber - 40;
        } else if (monthOfBirthNumber >= 61 && monthOfBirthNumber <= 72) {
            yearOfBirth = 22 + yearOfBirth;
            monthOfBirthNumber = monthOfBirthNumber - 60;
        } else {
            yearOfBirth = 18 + yearOfBirth;
            monthOfBirthNumber = monthOfBirthNumber - 80;
        }

        dateFromPesel = "";
        dateFromPesel = dateFromPesel.concat(yearOfBirth + "-").concat(monthOfBirthNumber + "-").concat(dayOfBirth);
        return dateFromPesel;
    }

}
