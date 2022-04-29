package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        boolean first = true;

        while (true){
            System.out.print("Enter number : ");
            boolean isIntValue = scanner.hasNextInt();

            if(isIntValue){
                int number = scanner.nextInt();

                if(first){
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }
            }else {
                break;
            }

            scanner.nextLine();
        }
        System.out.println("Max Value : " + max + "  Min Value : " + min);
        scanner.close();
    }
}
