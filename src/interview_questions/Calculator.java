package interview_questions;

import java.util.Scanner;

 class Calculator {

     void add(int num1, int num2) {

        System.out.println(num1 + num2);
    }
    void subtract(int num1, int num2){

        System.out.println(num1 - num2);
    }

}
 class Executor extends Calculator{

     public static void main(String[] args) {

         Calculator calculator = new Calculator();

         calculator.add(5,6);

         calculator.subtract(3,-1);
     }


}


