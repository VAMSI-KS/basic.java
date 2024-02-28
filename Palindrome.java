import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
       int m=n;
        int rev=0,r;
        while(n>0){
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }if(rev==m)
        System.out.println("given number is a palindrome");
        else
        System.out.println("given number is not a palindrome");
    }
}
