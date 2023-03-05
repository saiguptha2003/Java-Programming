class prac1 {
     public static void main(String[] args) {
          int n = 258;
          int sum=0;
          while (n != 0) {
                System.out.print(n);
               int d = n % 10;
                n = n / 10;
                sum+=d;
          }         
     }
}