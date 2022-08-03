    /*Implement a program to convert in-fix notation to post-fix notation using stack. */
import java.util.*;

class infix_to_postfix{
        char[] stack;
        int size;
        int top=-1;

        infix_to_postfix(int size){
            this.size=size;
            stack= new char[this.size];
        }

       void push(char vlaue){
        if(top>=size){
            System.out.println("stack is full");
        }
        else {
            top++;
            stack[top]=vlaue;
        }

       }
       char pop(){
        if(top<=-1){
            System.out.println("sstack is underflow");
            return '0';
        }
        else{
            return stack[top--];
        }
       }

       char peek(){
        return stack[top];
       }
       boolean isEmpty(){
        if(top<=-1){
            return true;
        }
        else{
            return false;
        }
       }
       static int pre(char op){
        switch(op){
            case '+':
                 return 1;
                
            case '-':
                return 1;
          
            case '*':
                return 2;
            case '/':
                return 2;
          
            case '^':
                return 3;
            case '%':
                 return 2;
            default :
                return 0;
        }
       }
    public static void main(String[] args) {
     Scanner sc1 = new Scanner(System.in);
     System.out.println("enter a oprasen ");
     String in_infix=sc1.nextLine();
    int size = in_infix.length();
   infix_to_postfix stk= new infix_to_postfix(size);
     char scan;
     String postfix="";
        for(int i=0 ; i<size ; i++){
            scan=in_infix.charAt(i);

            if(scan>='a' && scan<='z'){
                postfix+=scan;
            }
            else if(scan>='A' && scan<='Z'){
                postfix+=scan;
                }
            else if (scan>='0' && scan<='9'){
                postfix+=scan;
            }
            else if(scan=='('){
                stk.push(scan);
            }
            else if(scan==')'){
                while(!stk.isEmpty() && stk.peek()!='('){
                    postfix+=stk.pop();
                }
                stk.pop();
            }
            else{
                while(!stk.isEmpty() && stk.peek()!='(' && (pre(scan)<=pre(stk.peek()))){
                    postfix+=stk.pop();
                }
                stk.push(scan);
            }
            
            
        }
        while(!stk.isEmpty()){
            if(stk.peek()=='('){
                break;
            }
            else{
                postfix+=stk.pop();
            }
        }
        System.out.println(postfix);

    }
}

        
