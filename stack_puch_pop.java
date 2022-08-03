/* Implement a program for stack that performs following operations using array: PUSH, POP, PEEP, 
CHANGE & DISPLAY */
import java.util.*;

class stack_puch_pop{
   public static int i = 3;

    int stack[] = new int[i];
    int Top=-1;
  static  int value;
   static int loc;


    void push(int value){
        if(Top>=i){
            System.out.println("stack is overflow");
        }
        else{
            
            Top++;
            stack[Top]=value;
           
            for(int j=Top;j>=0;j--){
                System.out.println("stack is "+stack[j]);
            }
        }
    }
    
    int pop(){
        if(Top<0){
            System.out.println("stack is undrflow");
        }
        else{
            Top--;
           value= stack[Top+1];
           System.out.println("pop an elemnt is "+value);
            System.out.println("");
            for(int j=Top;j>=0;j--){
                System.out.println("stack is \n"+stack[j]);
            }
        }
        return(stack[Top+1]);
        
    }

    int peep(int value){
        if(Top-value+1<0){
            System.out.println("stack is underflow");
        }
        else{
            System.out.println("enter a peep number is "+stack[Top-value+1]);
        }
        return (stack[Top-value+1]);
    }

    int change(int loc, int value){

        if(Top-loc+1<0){
            System.out.println("stack is underflow");
        }
        else{
            stack[Top-loc+1]=value;

            System.out.println("change number position "+(Top-loc+1)+" and change number is "+stack[Top-loc+1]);

            for(int j=Top;j>=0;j--){
                System.out.println("stack is \n"+stack[j]);
            }
            
        }
        return(stack[Top-loc+1]);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack_puch_pop obj= new stack_puch_pop();
       // System.out.println("enter a stake size");
        Scanner sc1=new Scanner(System.in);
      //  i=sc.nextInt();
        int chouse;
        do{
            System.out.println("enter 1 for push");
            System.out.println("enter 2 for pop");
            System.out.println("enter 3 for peep");
            System.out.println("enter 4 for change");
            System.out.println("enter 0 for exit");
            chouse=sc.nextInt();
            switch (chouse) {
                case 1:
                System.out.println("enter a number for push in stcke");
            value=sc.nextInt();
                   obj.push(value);
                   break;
                case 2:
                   obj.pop();
                   
                    break;
                case 3:
                System.out.println("enter a i locasen for peep ");
                value=sc.nextInt();
                    obj.peep(value);
                    break;
                   
                case 4:
                System.out.println("enter a position for you change a number");
                    loc= sc.nextInt();
                    System.out.println("enter a number for change");
                    value = sc.nextInt();
                    obj.change(loc,value);
                    break;
                default:
                    chouse=0;
                    break;
            }
        }
        while(chouse!=0);
    }
}
