package org.example.projectTasks;

public class Task2 {
    public static void main(String[] args) {
        int [] ages={10,15,60,45,23,33};
        int i=0;
        int sum=0;
        while(i<ages.length){
           sum+=ages[i];
           i++;
        }
        System.out.println(sum);
    }
}
