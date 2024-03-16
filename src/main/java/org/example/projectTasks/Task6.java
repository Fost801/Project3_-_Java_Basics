package org.example.projectTasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter number");
        int number= scan.nextInt();
        boolean primeNum=true;
        if(number==0 || number==1){
            primeNum=false;

        }else if (number==2 || number==3){
            primeNum=true;

        }
        for (int i=4; i<number;i++){
            if (number%i==0){
                primeNum=false;
                break;
            }
        }
        if (primeNum){
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }

    }

    }

