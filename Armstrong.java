import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        int m=n;
        double sum=0;
        int r;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+Math.pow(sum, r);
        }
        if(sum==m)
        System.out.println("Its a Armstrong number");
        else
        System.out.println("Its not a Armstrong number");

    }
}
