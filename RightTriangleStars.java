package com.company;

/**
 * Created by Saikumar-Kabaaliraaa on 01-Jul-17.
 */
import java.util.Scanner;
public class RightTriangleStars {
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n value: ");
        new RightTriangleStars().printRightTriangleWithStars(input.nextInt());
    }
    public void printRightTriangleWithStars(int no_of_stars){
        for(int i=0;i<no_of_stars;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
