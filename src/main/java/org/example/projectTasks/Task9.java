package org.example.projectTasks;

public class Task9 {
    public static void main(String[] args) {

        int[] numbers = {1042, 15, 10005,88, 2, 2001, 99, 37, -11, 0, 65, 665, 44, 455};
        int max = numbers[0];
        int secondmax = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }else if (numbers[i] > secondmax && numbers[i] < max) {
                secondmax = numbers[i];
            }
        }
        System.out.println(secondmax);
       }

    }
