package com.company;

/**
 * Created by Saikumar-Kabaaliraaa on 01-Jul-17.
 */
public class FizzBuzzClass {
    public static void main(String a[]){
        new FizzBuzzClass().FizzBuzz();
    }
    public void FizzBuzz(){
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if(i%5==0)
                System.out.println("Buzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else System.out.println(i);
        }
    }
}
