/*. Read two matrices, first 3x2 and second 2x3, perform multiplication operation and store result in 
third matrix and print it. */

import java.util.Scanner;

class matrixsecound_homwork{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("enter a firt matrix  colunm nad row size");
       System.out.println(" ");
     
       System.out.println("enter a fist a materix colunm");
       int c1 = sc.nextInt();
       System.out.println("enter a fist a materix row");
       int r1 = sc.nextInt();

       System.out.println("enter a secoun a materix colunm");
       System.out.println(" ");

       System.out.println("enter a second a materix colunm");
       int c2 = sc.nextInt();
       System.out.println("enter a secoud a materix row");
       int r2 = sc.nextInt();
       int sum;

       if(c1==r2){

            int array_1[][] = new int [r1][c1];
            int array_2[][] = new int [r2][c2];
            int array_3[][] = new int [r1][c2];

            System.out.println("enter a fist matrices elments ");

            for(int i=0 ; i<r1 ;i++){
                for(int j=0 ; j<c1 ; j++){
                array_1[i][j] = sc.nextInt();
                 }
                
            }
            System.out.println("enter a secound matrices elments ");

            for(int i=0 ; i<r2 ;i++){
                for(int j=0 ; j<c2 ; j++){
                array_2[i][j] = sc.nextInt();
                 }
                
            }

           
                

            for(int i=0; i<r1 ; i++){
                for(int j=0 ; j<c2 ;j++){
                    sum=0;
                    for (int k=0;k<c1;k++){
                   sum=sum+(array_1[i][k]*array_2[k][j]);
                    }
                    array_3[i][j]=sum;
                
                    
                }
            }
            System.out.println(" ");

            for(int i=0; i<r1 ; i++){
                for(int j=0 ; j<c2 ; j++){
                    System.out.print(array_3[i][j]+" ");
                    System.out.print(" ");
                }
                System.out.println(" ");
            }

       }
       else{
        System.out.println("enter matrix is invalid");
       }


    }
}