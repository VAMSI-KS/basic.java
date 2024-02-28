import java.util.Scanner;

public class Arraysearch{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A[]={2,76,34,25,12,54,37,94,83};
        int key;
        System.out.println("enter a key value");
        key=s.nextInt();
        for(int i=0;i<A.length;i++){
            if(key==A[i]){
            System.out.println("the key value is :"+i);
            System.exit(0);
        }}
        System.out.println("the key value is not found");
    }
}