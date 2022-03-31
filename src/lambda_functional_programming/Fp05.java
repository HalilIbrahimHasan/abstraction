package lambda_functional_programming;

import java.util.stream.IntStream;

public class Fp05 {

    public static void main(String[] args) {

        System.out.println(getSumFromSevenToHundred( ));
        System.out.println( getSumFromSevenToHundred02( ));
        System.out.println(getMultiplicationFromTwoToEleven());
        System.out.println(calculateFactorial(5));
    }

    //1)Create a method to find the sum of integers from 7 to 100
    //1.way
    public static int getSumFromSevenToHundred( ){
        //This IntStream does the same actions as for loop does in structured programming
       return IntStream.range(7,101).reduce(0, Math::addExact);
    }

    //1.way
    public static int getSumFromSevenToHundred02( ){
        //This IntStream does the same actions as for loop does in structured programming
        return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
    }

    //2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    public static int getMultiplicationFromTwoToEleven(){
        return IntStream.rangeClosed(2,11).reduce(1,Math::multiplyExact);
    }


    //3)Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static Object calculateFactorial(int x){
        return  x >= 0?  IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact): "Do not use negative numbers";
    }




}
