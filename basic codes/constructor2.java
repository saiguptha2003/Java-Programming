
class constructor2
{
	public static void main(String args[])
	{
		studentdetail s=new studentdetail();
		studentdetail g=new studentdetail("pandurangasai",43,"AP21110010091");
		g.show();
	}
}
class studentdetail
{
	String name;
	int number;
	String rollnumber;
	studentdetail()
	{
		System.out.println("default constructor is called.......");
			System.out.println("name :"+this.name+"\nnumber :"+this.number+"\nrollnumber :"+this.rollnumber);	
	}
	studentdetail(String a,int b,String c)
	{
		this.name=a;
		this.number=b;
		this.rollnumber=c;
		System.out.println("customized constructor...");
	}
	void show()
	{
		System.out.println("name :"+this.name+"\nnumber :"+this.number+"\nrollnumber :"+this.rollnumber);
	}
}
