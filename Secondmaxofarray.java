public class Secondmaxofarray {
    public static void main(String[] args) {
       int A[]={34,65,42,84,95,64,37,287};
        int max1,max2;
        max1=max2=A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
            }
        else if(A[i]>max2){
            max2=A[i];
        }}
        System.out.println("the second largest element of the array is:"+max2);
    }
}
