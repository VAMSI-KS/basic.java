import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        
        int rev=0,r;
        while(n>10){
            r=n%10;
            n=n/10;
            rev=rev*10+r;
           
        }
        System.out.println("the reverse  number is "+rev);
    }
}
