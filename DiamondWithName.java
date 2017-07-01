package com.company;

import java.util.Scanner;

/**
 * Created by Saikumar-Kabaaliraaa on 01-Jul-17.
 */
public class DiamondWithName {
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n value: ");
        new DiamondWithName().printDiamondWithNameAndStars(input.nextInt());
    }
    public void printDiamondWithNameAndStars(int no_of_stars){
        for(int i=1;i<=no_of_stars-1;i++){
            for(int j=1;j<=no_of_stars*2-1;j++) {
                if (j < no_of_stars - i + 1 || j > no_of_stars + i - 1)
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Saikumar");
        for(int i=no_of_stars-1;i>=1;i--){
            for(int j=1;j<=no_of_stars*2-1;j++) {
                if (j < no_of_stars - i + 1 || j > no_of_stars + i - 1)
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }

    }
}
