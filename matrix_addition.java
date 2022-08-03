/* Read two 2x2 matrices and perform addition of matrices into third matrix and print it */

import java.util.Scanner;

class matrix_addition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int array1 [][]= new int[2][2];
        int array2 [][]= new int[2][2];
        
        System.out.println("enter a fist matrices elments ");

        for(int i=0 ; i<2 ;i++){
            for(int j=0 ; j<2 ; j++){
            array1[i][j] = sc.nextInt();
             }
             System.out.println();
        }
        System.out.println("enter a secound matrices elments ");

        for(int i=0 ; i<2 ;i++){
            for(int j=0 ; j<2 ; j++){
            array2[i][j] = sc.nextInt();
             }
             System.out.println("");
        }

        int sumarray [][] = new int [2][2];

       

        for(int i=0; i<2 ; i++){
            for(int j=0 ; j<2 ;j++){
                sumarray [i][j]=array1[i][j]+array2[i][j];
            }
        }

            System.out.println("sum of matrix");

        for(int i=0; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
                System.out.println(sumarray[i][j]+"");
            }
        }
        
        
    }  
}