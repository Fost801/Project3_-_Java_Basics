package org.example.projectTasks;

public class Task10 {
    public static void main(String[] args) {

        String [] names= {"Lana","Mat Lana","Maggy","Noodles","James", "Maggy", "Andrii","Lana"};

        for (int i = 0; i < names.length; i++){
            for (int j=i+1; j< names.length;j++){
                if (names[i].equals(names[j])&& i!=j){
                    System.out.println(names[i]);
                }
            }

            }
        }

    }

