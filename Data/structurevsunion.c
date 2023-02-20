#include<stdio.h>  
#include <string.h>    
struct employee      
{   int id;      
    char name[50];      
    float salary;      
}e1,e2;  //declaring e1 and e2 variables for structure    
union Job {
   float salary;
   int workerNo;
} j;

int main( )    
{    
   {//Structure
        //store first employee information    
        e1.id=101;    
        strcpy(e1.name, "Sonoo Jaiswal");//copying string into char array    
        e1.salary=56000;    

        //store second employee information    
        e2.id=102;    
        strcpy(e2.name, "James Bond");    
        e2.salary=126000;    

        //printing first employee information    
        printf( "employee 1 id : %d\n", e1.id);    
        printf( "employee 1 name : %s\n", e1.name);    
        printf( "employee 1 salary : %f\n", e1.salary);    

        //printing second employee information    
        printf( "employee 2 id : %d\n", e2.id);    
        printf( "employee 2 name : %s\n", e2.name);    
        printf( "employee 2 salary : %f\n", e2.salary);  
    }
   {
    //Union
            j.salary = 12.3;

        // when j.workerNo is assigned a value,
        // j.salary will no longer hold 12.3
        j.workerNo = 100;

        printf("Salary = %.1f\n", j.salary);
        printf("Number of workers = %d", j.workerNo);
   }  
   return 0;    
}    