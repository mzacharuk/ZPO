import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

public class Race implements Runnable {

    private static List<String> setOfBikers = new ArrayList<>();
    private static Set setOfRandBikersInRace = new HashSet();
    private static List<String> setOfGivenNumberOfBiker = new ArrayList<>();
    private List<Biker> bikers = new ArrayList<>();
    static Iterator<String> iterator = setOfRandBikersInRace.iterator();
    int i = 0;

    public Race(int bikerNumbers) throws IOException {

        URL oracle = new URL("http://szgrabowski.kis.p.lodz.pl/zpo18/nazwiska.txt");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            setOfBikers.add(inputLine);
        in.close();

        Collections.shuffle(setOfBikers,new Random());

        int i=0;
        while ((setOfRandBikersInRace.size() <= bikerNumbers)) {
            setOfRandBikersInRace.add(setOfBikers.get(i));
//            setOfGivenNumberOfBiker.add(iterator.next());
            i++;
        }
        System.out.println(setOfRandBikersInRace);
    }

/*
    public static Set readUrlAndGetData(int bikerNumbers) throws Exception {

        URL oracle = new URL("http://szgrabowski.kis.p.lodz.pl/zpo18/nazwiska.txt");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            setOfBikers.add(inputLine);
        in.close();

        Collections.shuffle(setOfBikers,new Random());

        int i=0;
        while ((setOfRandBikersInRace.size() <= bikerNumbers)) {
            setOfRandBikersInRace.add(setOfBikers.get(i));
//            setOfGivenNumberOfBiker.add(iterator.next());
            i++;
        }
        System.out.println(setOfRandBikersInRace);
        return setOfRandBikersInRace;
    }
*/

    @Override
    public void run() {
        Biker biker = new Biker(iterator.next());
//        Biker biker = iterator.next();

        biker.start();
        this.bikers.add(biker);


        Collections.sort(this.bikers, (o1, o2) -> {
            if(o1.getTime()>o2.getTime()){
                return 1;
            }else if(o1.getTime()==o2.getTime()){
                return 0;
            }else{
                return -1;
            }
        });
        if(i==setOfRandBikersInRace.size()){
            printBikers(setOfRandBikersInRace.size());
        }else
            printFirstThreeBikers(setOfRandBikersInRace.size());
        System.out.println("====================================================");
    }

    public void printFirstThreeBikers(int bikerNumber){
        for(int i = 0; i<bikerNumber; i++){
            if(i>=3)
                break;
            System.out.println((i+1)+". "+iterator.next());
        }
    }

    public void printBikers(int bikerNumber){
        for(int i = 0; i<bikerNumber; i++){
            System.out.println((i+1)+". "+iterator.next());
        }
    }
}
