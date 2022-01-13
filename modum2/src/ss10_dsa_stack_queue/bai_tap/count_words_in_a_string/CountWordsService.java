package ss10_dsa_stack_queue.bai_tap.count_words_in_a_string;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CountWordsService {
    Map<String,String> data = new TreeMap<String,String>();

    public void add(String key,String value){
        data.put(key,value);
    }
    public void print(){
//        System.out.println("key: "+Arrays.toString(data.keySet().toArray())+"value: "+Arrays.toString(data.values().toArray()));
        System.out.println(Arrays.toString(data.entrySet().toArray()));
    }
    public String getValueToLowerCase(String key){
        return (this.data.get(key).toLowerCase());
    }
    public boolean checkForExistence (String key){
      return  this.data.containsKey(key);
    }
    public String remove(String key){
        return this.data.remove(key);
    }
//    public int amount(){
//        return data.size();
//    }
    public void overLoad(String key,String value){
        add(key, value);
    }


}
