package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final int[] x;

    Histogram(int[] x) {
        this.x = x;
    }

    public int[] getData() {
        return x;
    }

    public Map getHistogram(){
        Map<T,Integer> histogram = new HashMap();
        
         for(int key: x){
            Integer index = new Integer(key);
            if(!histogram.containsKey(index))
                histogram.put((T) index, new Integer(1));
            else
                histogram.put((T) index, histogram.get(index)+1);
        }
        return histogram;
    }
    
}