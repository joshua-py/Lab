import java.util.Scanner;
public class Palindrome_Freq{
    static void Frequency(String str,char ch){
            int frequency = 0;

            for(int i = 0; i < str.length(); i++) {
                if(ch == str.charAt(i)) {
                    ++frequency;
                }
            }
            System.out.println("Frequency of " + ch + " = " + frequency);
        }
        static void Palindrome(String str) {

            String reverseStr = "";

            int strLength = str.length();

            for (int i = (strLength - 1); i >=0; --i) {
                reverseStr = reverseStr + str.charAt(i);
            }

            if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                System.out.println(str + " is a Palindrome String.");
            }
            else {
                System.out.println(str + " is not a Palindrome String.");
            }
        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean flag = false;
            while(flag==false){
                System.out.print("  1: Check if Palindrome or not\n  2: Find frequency of a character\n  3: Exit\n   Enter your choice: ");
                int choice=sc.nextInt();
                String str;
                char ch;
                switch(choice){
                    case 1: System.out.print("Enter your String:  ");
                            str=sc.next();
                            Palindrome(str);
                            break;
                    case 2: System.out.print("Enter your String: ");
                            str=sc.next();
                            System.out.print("Enter character: ");
                            ch=sc.next().charAt(0);
                            Frequency(str,ch);
                            break;
                    case 3: flag=true;
                            break;
                    default: System.out.println("Enter 1 or 2");
                            break;

                }
        }
        
        sc.close();
    }
}