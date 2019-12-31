import java.util.HashMap;
import java.util.List;

public class RandomPool {
    int size;
    HashMap<String, Integer> map1;
    HashMap<Integer, String> map2;

    RandomPool(){
        map1 = new HashMap<>();
        map2 = new HashMap<>();
        size = 0;
    }

    public void insert(String str){
        map1.put(str, ++size);
        map2.put(size, str);
    }

    public void delete(String str){
        int index = map1.get(str);
        map1.remove(str);
        map2.remove(index);
        if(size!=index){
            map2.put(index, map2.get(size));
            map2.remove(size);
            map1.put(map2.get(size), index);
        }
    }

    public String getRandom(){
        return map2.get((int)(Math.random()*size));

    }

}
