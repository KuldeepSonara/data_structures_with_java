/* Create class Employee_Detail with attributes Employee_id, Name, Designation, and Salary. Write a 
program to read the detail from user and print it.  */
import java.util.*;
class Employee_Detail{
    long int Employee_id;
    String Name;
    String Designation;
    double Salary;

    void get_detail(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a employee name ");
        Name=sc.nextLine();
        System.out.println("enter a employee  designation ");
        Designation=sc.nextLine();
        System.out.println("enter a employee Employee_id ");
        Employee_id=sc.nextLongInt();
        System.out.println("enter a employee Salary ");
        Salary=sc.nextDouble();
    }

    void print_detail(){
        System.out.println("__________employee detale__________");
        System.out.println("employee name is " +  Name );
        System.out.println("Designation name is " +  Designation );
        System.out.println("Employee_id name is " +  Employee_id );
        System.out.println("Salary name is " +  Salary );
    }
}

class employee{
    public static void main(String[] args) {
        Employee_Detail b1 = new Employee_Detail();
        b1.get_detail();
        b1.print_detail();
    }
}