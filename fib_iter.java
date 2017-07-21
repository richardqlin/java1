class fib_iter {

	static void fibbonaci(int n){
		int a=0;
		int b=1;
		int temp;
		for (int i=0;i<n;i++){
			System.out.print(a+" ");
			temp=a;
			a=b;
			b=temp+b;

		}
	}

	public static void main(String args[]){
		fibbonaci(10);
	}
}