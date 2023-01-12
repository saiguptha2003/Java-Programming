public class fabonoci {
     public static int fab(int i)
     {
          if(i<=1)
          {
               return i;
          }
          return fab(i-1)+fab(i-2);
          
     }
     public static void main(String args[]) {
          System.out.println(fab(9));
     }
}