class StaticBlock

{
	public static void main(String args[])

	{
		System.out.println("You are using Windons operating system. ");
	}

	static {
		String os=System.getenv("OS");
		System.out.println(os);
		if (os.equals("Windows_NT")!=true)
		{
		System.out.println("Static block window");
		}
	}

}
