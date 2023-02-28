class static_fun{
int ds;
	void display()
	{
		
		System.out.println("ds value  "+ds);
	}
	static void show(String s)
	{
		System.out.println("welcome  "+s);

	}
	static_fun()
	{
		System.out.println("hi bro how are you");

	}

public static void main(String [] args)
{
    static_fun s=new static_fun();
      show("pandurangasai");
      s.display();
}
}

