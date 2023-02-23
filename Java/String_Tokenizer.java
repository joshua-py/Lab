import java.util.Scanner;
import java.util.StringTokenizer;

public class String_Tokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter some numbers: ");
        str=sc.next();
        StringTokenizer st = new  StringTokenizer(str,":");
        int sum=0;
        while(st.hasMoreTokens()){
            int num=Integer.parseInt(st.nextToken());
            sum+=num;
        }
        System.out.println(sum);
        sc.close();
         
    }
}
