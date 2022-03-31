package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Fp04 {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");

        printInUpperCase01(l);
        System.out.println();
//        printInUpperCase02(l);
        printTheElementsOrderedBasedOnLength(l);
        System.out.println();
        printTheElementsOrderedBasedOnLength02(l);
        System.out.println();
        printDistinctElementsSortedByLastChar(l);
        System.out.println();
        printAllElementsByTheirLengthAndFirstInitialChars(l);
        System.out.println();
//        removeTheElementsWhoseLengthGreaterThanFive(l);
//        removeElementsLengthInBetween8And10OrEndsWithO(l);
        System.out.println(checkTheLengthsToBeLessThanTwelve(l));
        System.out.println(checkNotToStartWithX(l));
        System.out.println(checkAtLeastAnyMatch(l));
    }

    //1) Create a method to print all list elements in uppercase in the same line with a space
    //1.way
    public static void printInUpperCase01(List<String> list){

        list.stream().map(String::toUpperCase).forEach(Utils::printInSameLineWithSpace);

    }
    //1) Create a method to print all list elements in uppercase in the same line with a space
//    //2.way
//    public static void printInUpperCase02(List<String> list){
//        list.replaceAll(String::toUpperCase);
//        System.out.println(list);
//    }

    //3) Create a method to print the elements after ordering according to their lengths
    public static void printTheElementsOrderedBasedOnLength(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printInSameLineWithSpace);
    }

    //4) Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printTheElementsOrderedBasedOnLength02(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printInSameLineWithSpace);
    }

    //4) Create a method to sort the distinct elements by using their last characters
    public static void printDistinctElementsSortedByLastChar(List<String> list){
        list.stream().distinct().sorted(Comparator.comparing(Utils ::getLastChar)).forEach(Utils::printInSameLineWithSpace);
    }

    //5) Create a method to sort the elements according to their lengths then according to their first character
    public static void printAllElementsByTheirLengthAndFirstInitialChars(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(0))).forEach(Utils::printInSameLineWithSpace);
    }
    //6) Remove the elements if the length of the element is greater than 5
//    public static void removeTheElementsWhoseLengthGreaterThanFive(List<String> list){
//        list.removeIf(t -> t.length() > 5);
//        System.out.println(list);
//    }

    //8) Remove the elements if the length is between 8 and 10 or ending with 'o'
//    public static void removeElementsLengthInBetween8And10OrEndsWithO(List<String> list){
//        Predicate<String > checkCondition = t -> (t.length() > 7 && t.length() < 11) || t.endsWith("o");
//        list.removeIf(t -> checkCondition.test(t));
//        System.out.println(list);
//    }

    //9) Create a method to check if the lengths of all elements are less than 12
    public static boolean checkTheLengthsToBeLessThanTwelve(List<String> list){
       return list.stream().allMatch(t -> t.length() < 11);
       //This method will check all the values with no exception
    }

    //10) Create a method to check if the initial of any element is not ‘X’
    public static boolean checkNotToStartWithX(List<String> list){
       return list.stream().noneMatch(t -> t.startsWith("X"));
    }

    //11) Create a method to check if at least one of the elements ending with “r”
    //At least one matching
    public static boolean checkAtLeastAnyMatch(List<String> list){
        return list.stream().anyMatch(t -> t.endsWith("r"));
    }









}
