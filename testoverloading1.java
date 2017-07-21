class Adder{
	static int add(int a, int b){return a+b;}
	static double add(double a, double b){return a+b;}

}

class testoverloading1 {
	public static void main(String[] args){
		System.out.println(Adder.add(11,22));
		System.out.println(Adder.add(11.3,22.3));
	}
}