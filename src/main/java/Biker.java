public class Biker extends Thread{

    private String name;
    private int time;

    public Biker(String name) {
        this.name = name;
        if(this.time > 370){
            this.time = 370;
        }else if(this.time<250){
            this.time = 250;
        }
    }

    @Override
    public String toString() {
        return  "name: " + name +
                ", time: " + time ;
    }

    public void run() {
        toString();
    }

    public int getTime() {
        return time;
    }

    public void start() {

    }
}
