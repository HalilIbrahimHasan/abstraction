package abstraction2;

public class CalculatorRunner {


    public static void main(String[] args) {

        Calculator calculator = new Profit();
        //Polymorphism, Inheritance, Abstraction
        int num = 21;
        int num2 =12;
        Calculator calculator1 = new Loss();

//        System.out.println(calculator.addition(num,num2));
//        System.out.println(calculator.multiplication(num,num2));
//
//        System.out.println(calculator1.addition(num,num2));

        System.out.println(calculator1.division(num,num2));
        System.out.println(calculator1.subtraction(num,num2));






    }

}
