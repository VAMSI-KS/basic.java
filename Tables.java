import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        for(int i=1;i<=16;i++){
            System.out.println(n+" X "+i+" ="+n*i);
        }

        
    }
}
