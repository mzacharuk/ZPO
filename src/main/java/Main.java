import com.google.common.base.Splitter;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String stringToSplit = "Ala ma kota";

        ArrayList<String> myList = stringSplitter(stringToSplit, 4);
        for(String s: myList){
            System.out.println(s);
        }
        System.out.println("===================");
        Iterable<String> splitted = Splitter.fixedLength(4).split(stringToSplit);
        for(String s : splitted){
            System.out.println(s);
        }



    }

    public static ArrayList<String> stringSplitter(@NonNull String s, int length) throws IllegalArgumentException{
        if(length <=0 || s==null){
            throw new IllegalArgumentException();
        }
        String myString;
        ArrayList<String> list = new ArrayList<String>();
        int counter = 0;

        while(counter<s.length()){
            if((counter+length)>=s.length()){
                myString = s.substring(counter, s.length());
            }else {
                myString = s.substring(counter, counter + length);
            }
            list.add(myString);
            counter+=length;
        }
        return list;
    }
}