import java.util.*;
class factoriyalwithrwcurzan{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int fact=0,f=1;
        System.out.println("enter a number");
        int num= sc.nextInt();
       int result=fact(num);
        System.out.println(result);      
    }
    public static int fact(int x){
        if(x==0){
          return 1;
        }
        else{
            int product=1;
            for(int i=x;i>=1;i--){
                product*=i;
            }
            return product;
        }
    }
}