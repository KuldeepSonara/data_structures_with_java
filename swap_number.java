/*Write a program to swap two numbers using user-defines method */
import java.util.*;
class swap_number{
    public static void swap_two_mathod (int a, int b){
        int temp=0;
        temp=a;
        a=0;
        a=b;
        b=0;
        b=temp;
        System.out.println("swaping is new a"+a);
        System.out.println("swaping is new b"+b);
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a fist number");
        a=sc.nextInt();
        System.out.println("enter a scound number");
        b=sc.nextInt();

        swap_two_mathod(a,b);
    }
}