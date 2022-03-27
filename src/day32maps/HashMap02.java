package day32maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap02 {

    /*
    Create a HashMap and give key value pairs as following;
		Math = 8
		Java = 9
		SDLC = 9
		Api  = 7
     */

    public static void main(String[] args) {
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("Math", 8);
        hm1.put("Java", 9);
        hm1.put("SDLC", 9);
        hm1.put("API", 7);

        Set<String> set = hm1.keySet();//returns Set

        for(String w: set){
            System.out.println(w);
        }
        Collection<Integer> values = hm1.values();//returns Collection

        for(Integer w : values){
            System.out.println(w);
        }

        System.out.println(hm1.entrySet());

        Set<Map.Entry<String, Integer>> setForm = hm1.entrySet();

        for(Map.Entry<String, Integer> w: setForm){

            //I just need to see java result
//            if(w.getKey().equalsIgnoreCase("java")){
//                System.out.println("Java result is: "+w.getValue());
//            }
            if(w.getValue() > 8){
                System.out.println(w.getKey());
            }


        }

        //when we use maps, we can just print them on the console as a map
        //when we use maps, we can use keySet()    to have only keys of the map
        //when we use maps, we can get all values using values()
        //when we want to get a specific value from map, we use get()
        //when we want to have all key value entries, we use entrySet()

        System.out.println("All keys: "+hm1.keySet());// returns Set
        System.out.println("All values: "+hm1.values());// Collection
        System.out.println("All keys and values"+hm1.entrySet());// Set<Map.Enrty<K,V>
        System.out.println("One value of the map: "+hm1.get("Math"));//String

        int value = hm1.replace("SDLC", 10);
        System.out.println("Older value: "+value);


        System.out.println(hm1);//{Java=9, API=7, Math=8, SDLC=10}

        //This method will take the key and value and it will check 2 conditions. If 2 conditions are true
        //Then it will replace the value, otherwise, it will not make changes
        boolean isTrue = hm1.replace("API",7,10 );
        System.out.println(isTrue);

        System.out.println(hm1);


        //How to remove element from MAP

        int value2 = hm1.remove("SDLC");

        System.out.println("value: "+value2);

        System.out.println(hm1);//{Java=9, API=10, Math=8}

        //How to remove element based on key value pair

        boolean isRight = hm1.remove("Math", 8);
        System.out.println(isRight);//true
    }

    /*
    Create a MAP that will have following keys and values
    Math = 9
    English = 8
    Biology = 7
    History = 6
    French = 7
    Then print all lessons and their scores that are more than 7
     */



}
