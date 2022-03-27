package day32maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap03 {

     /*
    Create a MAP that will have following keys and values
    Math = 9
    English = 8
    Biology = 7
    History = 6
    French = 7
    Then print all lessons and their scores that are more than 7
     */

    public static void main(String[] args) {
        //1. way

        HashMap<String , Integer> hm1 = new HashMap<>();
        hm1.put("Math", 9);
        hm1.put("English", 8);
        hm1.put("Biology", 7);
        hm1.put("History", 6);
        hm1.put("French", 7);

        Set<String> myKeys = hm1.keySet();
        System.out.println(myKeys.size());

        Collection<Integer> myValues = hm1.values();
        System.out.println(myValues.size());

        for(Integer w: myValues ){


            if(w > 7){
                System.out.println("Value is: "+w);

            }


        }

        //2. way

        Set<Map.Entry<String, Integer>> setForm = hm1.entrySet();

        for(Map.Entry<String, Integer> w: setForm){
            if(w.getValue() > 7){
                System.out.println("Value: "+ w.getValue());
                System.out.println("Key for the lesson: "+ w.getKey());
            }
        }



    }
}
