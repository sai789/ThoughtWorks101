package com.company;

/**
 * Created by Saikumar-Kabaaliraaa on 01-Jul-17.
 */
import java.util.Scanner;
public class VerticalLineStars {
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n value: ");
        new VerticalLineStars().printVerticalLineWithStars(input.nextInt());
    }
    public void printVerticalLineWithStars(int no_of_stars){
        for(int i=0;i<no_of_stars;i++)
            System.out.println("*");
        System.out.println();
    }
}
