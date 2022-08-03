/*user give a array and print a ARRAY */

import java.util.*;

class scann_and_print_array{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of array lanth");
        int a = sc.nextInt();
         int array[] = new int[a];

         for (int i=0; i<a; i++)
         {
            System.out.println("enter the array"+ i +"=");
            array[i] = sc.nextInt();
            
         }
         for (int i=0;i<a;i++){
            System.out.println("enter the array"+ i +"=" + array[i]);
        }
    }

}