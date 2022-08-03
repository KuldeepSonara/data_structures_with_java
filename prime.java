import java.util.*;
class prime{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int num= sc.nextInt();
        int flag=0;
        for(int i=2;i-1<num;i++){
            if(num%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}