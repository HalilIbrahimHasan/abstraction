package day32maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapInterviewQuestion {

    public static void main(String[] args) {
        /*
            How to count the number of occurrences of the words in a sentence
            For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
                          Java=3, is=1, easy=1, Type=1, ... , learn=2, ...
                          get rid of punctuation
                          split the words into array
     */
        String sentence = "Java is easy. Type codes to learn Java. To earn money learn Java.";
        sentence = sentence.replaceAll("\\p{Punct}","");//we can get rid of some chars using regex
        System.out.println(sentence);

        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));//[Java, is, easy, Type, codes, to, learn, Java, To, earn, money, learn, Java]

        Map<String, Integer> result = new HashMap<>();//empty

        for(String w: words){////[Java, is, easy, Type, codes, to, learn, Java, To, earn, money, learn, Java]
            //      1
            Integer numOfOccurences = result.get(w);//null, null, null
            //Java
            if(numOfOccurences == null){
                result.put(w, 1);
            }else{
                result.put(w, numOfOccurences + 1);
            }





        }


        System.out.println(result);


    }
}
