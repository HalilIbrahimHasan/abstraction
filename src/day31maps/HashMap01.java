package day31maps;

import java.util.*;

public class HashMap01 {

    public static void main(String[] args) {

        /*
        Maps use key value pairs structure
        keys should be unique   but values can be duplicate
        In Maps Keys cannot be Null except HashMap
        In HashMaps, you can use Null only once for keys
        but you can have multiple Nulls for values
        HashMap does not create elements in natural order thats' why it is super fast
        HashMap is not thread-safe
        HashMap is not synchronized
        When we use maps, if we give key, it will return always the value
         */
        //       KEY     VALUE
        HashMap<Integer,String > hm1 = new HashMap<>();
        hm1.put(100,"Ali");
        hm1.put(101, "Veli");
        hm1.put(102, "Aliye");
        hm1.put(103, "Veliye");
        hm1.put(null,"Mary");
        hm1.put(null, "Kemal");
        hm1.put(104, null);
        hm1.put(105, null);
        hm1.put(106, "");

        System.out.println(hm1);

        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(87, "X");
        hm2.put(88, "K");
        hm2.put(89, "L");

//        hm1.putAll(hm2);//this will ignore the order of elements when getting new map elements
//        /*
//        When we merge elements of a Map to another, we have to use the same data types
//         */
//
//        System.out.println(hm1);
//
//        hm1.putIfAbsent(102, "Z");//This means if this key does not exist, then create this with new value
//
//        System.out.println(hm1);
//        hm1.putIfAbsent(999, "Z");
//
//        System.out.println(hm1);//if the ey does not exists, then it will create new key value pair
//
//        String value = hm1.get(101);//If the key exists, then it will give the value
//
//        System.out.println(value);
//
//        String value2 = hm1.get(463);//If the key does not exist, then it will give null value
//
//        System.out.println(value2);// This is NULL
//
//        String value3 = hm1.getOrDefault(999, "There is no key like that...");
//        //If you use getOrDefault and you have a valid key, it will return value for the key
//        System.out.println(value3);//Z
//
//        String value4 = hm1.getOrDefault(1000, "There is no key like that...");
//        //If you do not have a valid key, this will return yout custom message "There is no key like that..."
//        System.out.println(value4);//There is no key like that...


        Set<Integer> myKeys = hm1.keySet();//This keySet method returns a Set for all keys
//[null, 100, 101, 102, 103, 87, 999, 104, 88, 105, 89, 106]


        Collection<String > myValues = hm1.values();//this will return collection for all values
        //[Kemal, Ali, Veli, Aliye, Veliye, X, Z, null, K, null, L, ]
//        System.out.println("Keys:       "+myKeys);
//        System.out.println("may values: " +myValues);

        System.out.println(hm1);//{null=Kemal, 100=Ali, 101=Veli, 102=Aliye, 103=Veliye, 104=null, 105=null, 106=}
        //this is the look of MAP

        Collection<String > allMyValues = hm1.values();
        System.out.println(allMyValues);
        //[Kemal, Ali, Veli, Aliye, Veliye, null, null, ]

        Set<Integer> myAllKeys = hm1.keySet();//this will just give us All keys not values
        System.out.println(myAllKeys);


        Set<Map.Entry<Integer, String >> setFormMap = hm1.entrySet();
        //null=Kemal
        //100=Ali
        //101=Veli
        //102=Aliye
        //103=Veliye
        //{, , , , , 104=null, 105=null, 106=}

        System.out.println(setFormMap);

        for(Map.Entry<Integer, String > w: setFormMap){
            System.out.println(w.getKey() +" : "+w.getValue());

        }












//        Set<Map.Entry<Integer, String >> setForm = hm1.entrySet();





//        for( Map.Entry<Integer, String > each: setForm ){
//
//            System.out.println(each);//this gives a whole key value pair
//        }
//        for( Map.Entry<Integer, String > each: setForm ){
//
//            System.out.println("key : " +each.getKey());//this gives key and value separately
//            System.out.println("value: "+each.getValue());
//        }

    }

}
