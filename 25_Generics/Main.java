import java.util.*;

public class Main{
    public static void main(String[] args){
        List io = new ArrayList();
        io.add("io - String 1");
        io.add(new Planet("Mercury", 0.06));

        for (Object o : io){
            Planet p = (Planet) o;
            p.print();
        }

        List<Planet> lp = new ArrayList();
        lp.add (new Planet("Mercury", 0.06));
        lp.add(new Planet("Venus", 0.82));

        for (Planet p : lp){
            p.print();
        }
    }
}