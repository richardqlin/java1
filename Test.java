class Test {
	static double sqrtroot(double x){
		if (x==0.0 || x==1.0)
			return x;
	double start=1.0, end=x,ans=0.0;

	while (start <=end){
		double mid=(start +end)/2;
		if (mid*mid==x)
			return mid;
		if (mid*mid<x) {
			start=mid+1.0;
			ans=mid;
		}
		else
			end=mid-1.0;
	}
	return ans;
	}

public static void main(String args[]){

	double x=11.0;
	System.out.print(sqrtroot(x));
}

}