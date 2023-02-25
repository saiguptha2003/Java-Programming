import java.util.Scanner;
class pattern1{
	public static void main(String [] args)
	{
		 Scanner s=new Scanner(System.in);
		 int number=s.nextInt();
		 for(int i=1;i<=number;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("* ");

			 }
			 System.out.println();
		 }

	}

}
