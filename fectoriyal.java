/* read any number and find fectoriyal of given nubmer use into in group */
import java.util.*;
class fectoriyal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact=0,f=1;
        System.out.println("enter a number");
        int num= sc.nextInt();
            for(int j=1 ; num>=j ;j++){
                f=f*j;
                fact=fact+f;
            }
        System.out.println(fact);
    }
}