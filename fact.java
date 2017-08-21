class Fact{

	static int fac(int n){
		if (n==1) return 1;
		else
			return n*fac(n-1);
	}

	void fib(int a){
		if (a.length<=1) return a;
		else
			return fib(n-1)+fib(n-2);
	}

	public static void main(String[] a){
		int x=5;
		System.out.println(fac(x));

		Fact f= new Fact();

		for (int i=1;i<10;i++)
		System.out.println(f(i)+" ");




	}
}