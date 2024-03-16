package org.example.projectTasks;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int [] fibSeries=new int[10];
        for (int i=0; i<10; i++){
            fibSeries[i]=i;
            if(fibSeries[i]>1){
                fibSeries[i]=fibSeries[i-1] + fibSeries[i-2];
            }
            }
        System.out.println(Arrays.toString(fibSeries));
        int firstNum=0;
        System.out.print(firstNum+" ");
        int secondNum=1;
        for (int i=0; i<9; i++){
            int nextnum = firstNum+secondNum;
            secondNum=firstNum;
            firstNum=nextnum;
            System.out.print(nextnum+" ");
            }

        }
    }

