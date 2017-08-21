class Fact{

	 int fac(int n){
		if (n==1) return 1;
		else
			return n*fac(n-1);
	}

	int fib(int n){
		if (n<=1) return n;
		else
			return fib(n-1)+fib(n-2);
	}

	public static void main(String[] a){
		Fact f = new Fact();

		int x=5;
		System.out.println(f.fac(x));

		
		for (int i=1;i<10;i++)
		System.out.print(f.fib(i)+" ");
	System.out.println();



	}
}