//import java.net.*;
//import java.io.*;
//import java.util.*;
//
//public class URLReader {
//    public static Set readUrlAndGetData(int bikerNumbers) throws Exception {
//
//        URL oracle = new URL("http://szgrabowski.kis.p.lodz.pl/zpo18/nazwiska.txt");
//        List<String> setOfBikers = new ArrayList<>();
//        Set setOfRandBikersInRace = new HashSet();
//        BufferedReader in = new BufferedReader(
//                new InputStreamReader(oracle.openStream()));
//
//        String inputLine;
//        while ((inputLine = in.readLine()) != null)
//            setOfBikers.add(inputLine);
//        in.close();
//
//        Collections.shuffle(setOfBikers,new Random());
//
//        int i=0;
//        while ((setOfRandBikersInRace.size() <= bikerNumbers)) {
//            setOfRandBikersInRace.add(setOfBikers.get(i));
//            i++;
//        }
//        System.out.println(setOfRandBikersInRace);
//        return setOfRandBikersInRace;
//    }
//}