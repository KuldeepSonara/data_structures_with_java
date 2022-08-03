/* Create array of object of class Student_Detail with attributes Enrollment_no, Name, Sem, CPI for 5 
students, scan their information and print it. (Home Work) */

import java.util.*;

class students_Detail{
   int Enrollment_no=0;
   String Name="";
   int sem=0;
   double CPI=0;
   int stuent_number;
   
   String detailScnnner(){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("enter a how many studnet are : ");
             stuent_number=sc1.nextInt();
            String students[] = new String[stuent_number];

             Scanner sc = new Scanner(System.in);
             
               for(int i=1;i<=stuent_number;i++){
                  System.out.println("enter a stuent "+(i)+" detail");
                  System.out.println(" ");
                  System.out.println("enter a stuent "+(i)+" name");
                     Name = sc.nextLine();
                     System.out.println("enter a stuent "+(i)+" Enrollment_no");
                     Enrollment_no = sc.nextInt();
                     System.out.println("enter a stuent "+(i)+" semaster");
                     sem = sc.nextInt();
                     System.out.println("enter a stuent "+(i)+" CPI");
                     CPI = sc.nextDouble();
                  
                  
                  students[i]="\nstudnet name is \n"+Name+" "+"\nstudnet enrollment no is \n"+Enrollment_no+" "+"\nstuent semester \n"+sem+" "+"\nstudnet cpi is \n"+CPI;
                  
               }
               return students[stuent_number];
   }

   String detailprint() {
      for(int i=1;i<=stuent_number;i++){
         students_Detail kd = new students_Detail(); 
         System.out.println(stuent_number+" studnet detail are there");

         System.out.println("");
         kd.detailScnnner();
         System.out.println(students);
         
      }
      return "";
   }
    
}

class arryofobject_home_work{
   public static void main(String[] args) {
      students_Detail sc = new students_Detail();
      sc.detailScnnner();
      sc.detailprint();

      
   }
}