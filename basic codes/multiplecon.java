class multiplecon{
	String name;
	int age;
	String rolenumber;
	multiplecon()
	{

		System.out.println("default constructor.....");

	}
	multiplecon(String a,int age,String role)
	{
		this.name=a;
		this.age=age;
		this.rolenumber=role;
		System.out.println("parameterized constructor......"+"\nname :"+name+"\nroll :"+rolenumber+"\nage :"+age);

	}
	public static void main(String [] args){
		multiplecon s=new multiplecon();
		multiplecon d=new multiplecon("pandurangasai",43,"AP21110010091");
	}

}
