public class Maxofarray {
   public static void main(String[] args) {
    int A[]={89,87,43,64,13,75,24,644};
    int max;
    max=A[0];
    for(int i=0;i<A.length;i++){
        if(A[i]>max){
            max=A[i];
        }
    }
    System.out.println("maximum of the Array elements are :"+max);

   } 
}
