package com.emilioaraos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxNumber=0;
        int minNumber=0;
        boolean first = true;


        while(true){
            System.out.println("Enter Number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();

                if (first){
                    first = false;
                    minNumber = number;
                    maxNumber = number;
                }

                if(number > maxNumber){
                    maxNumber = number;
                }
                if(number < minNumber){
                    minNumber = number;
                }

            }else{
                System.out.println("maxNumber is: " + maxNumber);
                System.out.println("maxNumber is: " + minNumber);
                break;
            }
            scanner.nextLine(); //handle end of line enter key

        }




        scanner.close();


    }
}
