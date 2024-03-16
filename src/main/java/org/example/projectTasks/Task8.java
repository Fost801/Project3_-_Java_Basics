package org.example.projectTasks;

public class Task8 {
    public static void main(String[] args) {
        int[] numbers = {42, 15, 88, 2, 99, 37, -11, 0, 65, 100};
        int max=numbers[0];
        int min=numbers[0];
        for (int j=0; j<numbers.length; j++){
            if(numbers[j]>max){
                max=numbers[j];
            } else if (numbers[j]<min) {
                min=numbers[j];}
        }
        System.out.println(max);
        System.out.println(min);
    }
}
