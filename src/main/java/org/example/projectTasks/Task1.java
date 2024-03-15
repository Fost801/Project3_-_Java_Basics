package org.example.projectTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //double [] tempList=new double[7];
       double tempList []= {87.8, -9.7, 66.0, -86.0, -65.0, 98.0, 76.0};
//        Scanner scanner=new Scanner(System.in);
//        for (int i=0; i<7; i++){
//            System.out.println("Please enter the temperature");
//            double temp= scanner.nextDouble();
//            tempList[i]=temp;
//        }
//        System.out.println(Arrays.toString(tempList));
        double min=0;
        double max=0;
        for (int j=0; j<7; j++){
            if(tempList[j]>max){
                max=tempList[j];
            } else if (tempList[j]<min) {
                min=tempList[j];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
