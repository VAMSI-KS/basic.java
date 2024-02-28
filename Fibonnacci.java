import java.util.Scanner;

public class Fibonnacci {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter a number");
    int n=s.nextInt();
    int a=0,b=1,c;
   
    for(int i=0;i<n-2;i++){
        c=a+b;
        a=b;
        b=c;
        System.out.println(c+",");
    }

   } 
}
