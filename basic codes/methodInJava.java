class methodInJava{
	public static void main(String [] args)
	{
		man s=new man(1,2,3);
		System.out.println(s.sum());
		
	}
}
class man{
	int a,b,c;
	man(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("constructor called");
	}
	int sum()
	{
		return this.a+this.b+this.c;
	}
}

