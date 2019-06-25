package pl.mzacharuk;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        //how long the second world war last
        LocalDate startDate = LocalDate.parse("1939-09-01");
        LocalDate endDate = LocalDate.parse("1945-05-08");
        long howManyDaysLast = ChronoUnit.DAYS.between(endDate , startDate);
        System.out.println(Math.abs(howManyDaysLast));

        //nth day of the year
        int year = 2016;
        int day = 68;
        LocalDate nthDay = LocalDate.of(year,1,1).plusDays(day);
        System.out.println(day+" day of the year "+year+" was "+nthDay.getDayOfWeek()+" "+nthDay.getMonth());

        //how many leap-years you live
        LocalDate birthDay = LocalDate.parse("1993-07-27");
        LocalDate now = LocalDate.now();
        int yearOfBorn = birthDay.getYear();
        int currentYear = now.getYear();
        int howOld = currentYear-yearOfBorn;
        int howManyLeapDays = 0;

        for(int i=0; i<=howOld; i++){
            System.out.println(birthDay.plusYears(i).getYear());
            if((birthDay.plusYears(i).getYear()%4==0 && birthDay.plusYears(i).getYear()%100!=0)
                || birthDay.plusYears(i).getYear()%400==0){
                howManyLeapDays++;
            }
        }
        System.out.println("I live "+howManyLeapDays+" leap-days so far.");
    }
}
