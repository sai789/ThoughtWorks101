package com.company;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 * Created by Saikumar-Kabaaliraaa on 01-Jul-17.
 */
public class PrimeFactors {
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n value: ");
        List<Integer> primeFactors = new PrimeFactors().generate(input.nextInt());
        System.out.println(primeFactors);
    }
    public List<Integer> generate(int N){
        List<Integer> primeFactors = new ArrayList<Integer>();
        for(int i=2;i<=N/2;i++){
            System.out.println("sai "+i);
            if(N%i==0 && isPrime(i))
                primeFactors.add(i);
        }
        return primeFactors;
    }
    public boolean isPrime(int num){
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
