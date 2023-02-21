java.util.*;
class conditional_statements
{
	public static void main(String [] args)
	{
		var k=new Scanner(System.in);
		var r=k.nextInt();
		System.out.println(r);
		for(var i=0;i<10;i++)
		{
			if(i==4)
			{
				System.out.println("we reached $4 now program terminated ");
				continue;

			}
			else
			{
				System.out.println(i);
			}
		}
	}

}
