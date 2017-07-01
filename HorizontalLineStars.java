package com.company;

/**
 * Created by Saikumar-Kabaaliraaa on 01-Jul-17.
 */
import java.util.Scanner;
public class HorizontalLineStars {
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n value: ");
        new HorizontalLineStars().printHorizontalLineWithStars(input.nextInt());
    }
    public void printHorizontalLineWithStars(int no_of_stars){
        for(int i=0;i<no_of_stars;i++)
            System.out.print("*");
        System.out.println();
    }
}
