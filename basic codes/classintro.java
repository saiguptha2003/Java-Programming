class intro{
	int a,b,c,d;
	intro(int a, int b,int c,int d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	int sum=0;
	int add()
	{
		return this.a+this.b+this.c+this.d;
	}
};
class classintro{
	public static void main(String [] args)
	{
		intro s=new intro(1,2,3,4);
		System.out.println(s.add());
		
	}
}
