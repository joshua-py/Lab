import java.io.*;
import java.util.Scanner;
class Fahmi
{
public static void main(String ar[]) throws IOException{
FileInputStream fr=new FileInputStream("Java/input.txt");
Scanner sc = new Scanner(fr);
int n = sc.nextInt();
System.out.println(n);
int rem, temp, sum = 0;
temp = n;
while(temp != 0){
rem = temp%10;
sum = sum*10 + rem;
temp /= 10;
}
sc.close();
FileWriter fw= new FileWriter("out.txt");
if(sum == n)
fw.write("palindrome");
else
fw.write("not palindrome");
fw.close();
}
}