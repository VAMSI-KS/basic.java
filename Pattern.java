public class Pattern {
    public static void main(String[] args) {
       
        for(int i=0;i<=5;i++){
            for(int j=i;j<=5;j++){
                for(int k=i;k<=j;k++){
                    System.out.print("*");
                }
                System.out.print(" & ");
            }
            {
                System.out.println("  ");
            }
        }
    }
}
