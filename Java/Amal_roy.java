import java.util.Scanner;
class sort{
    void qs(String a[],int l,int u)
    {
        if(l<u) {
            int i = l;
            int j = u;
            String pivot = a[l];
            while (i < j) {
                while (i <= u && a[i].compareTo(pivot) <= 0) {
                    i++;
                }
                while (j >= l && a[j].compareTo(pivot) > 0) {
                    j--;
                }
                if (i < j) {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            String temp = a[j];
            a[j] = a[l];
            a[l] = temp;
            qs(a, l, j - 1);
            qs(a, j + 1, u);
        }

    }
}
public class Amal_roy {
    public static void main(String[] args) {
        System.out.println("enter the number of strings to be sorted");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ar[]=new String[n];
        System.out.println("enter the strings");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.next();
        }
        sort sr=new sort();
        sr.qs(ar,0,ar.length-1);
        System.out.println("sorted\n");
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]);
        }
        sc.close();

    }
}