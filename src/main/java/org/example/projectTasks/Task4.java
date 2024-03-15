package org.example.projectTasks;

public class Task4 {
    public static void main(String[] args) {
        int [][] matrix={
                {12,34,56,77},
                {54,86,78,95},
                {34,55,67,13},
                {33,93,64,55}};
        int sumOdd=0;
        int sumEven=0;
        for (int i = 0; i<matrix.length;i++){
            for (int j = 0; j<matrix[i].length;j++){
                if(matrix[i][j]%2==0){
                    sumEven+=matrix[i][j];
                }else{
                    sumOdd+=matrix[i][j];
                }
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }

}
