package org.example.projectTasks;

public class Task3 {
    public static void main(String[] args) {
        int [][] matrix= {
                {10,55,40,50},
                {22,40,91,65},
                {15,50,33,30},
        };

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                //System.out.print(matrix[i][j]+" ");
                if (matrix[i][j]%2==0){
                    System.out.print(matrix[i][j]+" ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
