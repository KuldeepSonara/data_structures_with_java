/* read n numbers in  an array than read 2 different numbers replays withs senand nubers in an array and print an index and final array*/
import java.util.*;
class arrrayreplace{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for array");
        int x=sc.nextInt();
        int arr[]= new int[x];
        for (int i=0;i<x;i++){
            System.out.println("enter the arry"+ i +"=");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the first number ");
        int c = sc.nextInt();
        System.out.println("enter a second number");
        int b= sc.nextInt();
        for (int i=0;i<x;i++){

            if(arr[i]==c){
                arr[i]=b;
                System.out.println("change a number is in array "+i);
            }
        }
        for (int i=0;i<x;i++){
            System.out.println("enter the arry"+ i +"=" + arr[i]);
        }
    }
}