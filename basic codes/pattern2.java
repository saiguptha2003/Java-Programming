import java.util.Scanner;
class pattern2{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int  n=number;
		for(int i=1;i<=number;i++)
		{
			System.out.println((n--)*" "+i*"*");
		}



	}



}
