public class factorial {
     private static int fact(int i) {
           int n=1;
          for(int j=i;j>=1;j--)
          {
               n=n*j;
          }
          return n;

     }
    public static void main(String[] args) {
     System.out.println(fact(6));
    } 
}
