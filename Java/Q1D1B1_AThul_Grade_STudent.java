import java.util.Scanner;

/*Implement a Java program to create a class called as Person with data members
name and age. A class called Student is inherited from the Person class.
Student class has fields branch and Semester. Result class is inherited from the
Student class. It should be used to print the grade of 6 subjects as per the
following,
90-100 – Grade A, 70-89 – Grade B, 60-79 – Grade C, less than 59 – Grade D.
Result class should have a method called display which should show all the
details of the Student class.*/
class Person{
    String name;
    int age;    
}
class Student extends Person{
    String branch,Semester;
}
class Result extends Student{
    int Marks[]=new int[6];
    String Grade[] = new String[6];
    Result(String name,int aga,String branch,String Semester){
        this.name=name;
        this.age=aga;
        this.branch=branch;
        this.Semester=Semester;
    }
    void addMarks(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of 6 subjects");
        for (int i = 0; i < Marks.length; i++) {
            System.out.print("Enter Mark of Subject "+(i+1)+": ");
            Marks[i]=sc.nextInt();
        }
        sc.close();
    }
    void addGrade(){
        for (int i = 0; i < Grade.length; i++) {
            int m=Marks[i];
            if(90 <= m &&m <= 100 )
                Grade[i]="A";
            else if(70 <= m &&m <= 89 )
                Grade[i]="B";
            else if(60 <= m &&m <= 59 )
                Grade[i]="C";
            else
                Grade[i]="D";

        }
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Brach: "+branch);
        System.out.println("Semester: "+Semester);
        for (int i = 0; i < Grade.length; i++)
        System.out.println("Grade obtained in Subject "+(i+1)+"is : "+Grade[i]);
    }
}
class Q1D1B1_AThul_Grade_STudent{
    public static void main(String[] args) {
        Result r = new Result("Joshua", 19, "CSE", "Third");
        r.addMarks();
        r.addGrade();
        r.display();
    }
}