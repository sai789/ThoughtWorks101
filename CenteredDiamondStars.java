package com.company;

import java.util.Scanner;

/**
 * Created by Saikumar-Kabaaliraaa on 01-Jul-17.
 */
public class CenteredDiamondStars {
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n value: ");
        new CenteredDiamondStars().printCenteredDiamondWithStars(input.nextInt());
    }
    public void printCenteredDiamondWithStars(int no_of_stars){
        for(int i=1;i<=no_of_stars;i++){
            for(int j=1;j<=no_of_stars*2-1;j++) {
                if (j < no_of_stars - i + 1 || j > no_of_stars + i - 1)
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
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
