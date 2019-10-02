package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] x = {1,2,2,1,4,3,3};
        Histogram histo = new Histogram(x);
        Map<Integer,Integer> histogr = histo.getHistogram();

        
        for(Map.Entry<Integer, Integer> entry : histogr.entrySet()){
            System.out.println(entry.getKey() + " > " + entry.getValue());
        }
    
    }
}