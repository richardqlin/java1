public class Stack {
	private int maxSize;
	private long[] stackArr;
	private int top;

	public Stack(int s){
		maxSize=s;
		stackArr=new long[maxSize];
		top=-1;
	}

	public void push(long j){
		stackArr[++top]=j;
	}
	
	public long pop(){
		return stackArr[top--];
	}

	public long peak(){
		return stackArr[top];
	}
	public boolean isEmpty(){
		return (top==-1);
	}
	public boolean isFull(){
		return (top==maxSize-1);
	}

	public static void main(String args){
		Stack thestack = new Stack(10);

		thestack.push(10);
		thestack.push(20);
		thestack.push(30);
		thestack.push(40);
		thestack.push(50);
		thestack.push(60);
		thestack.push(70);
		thestack.push(80);
		
		while (!thestack.isEmpty()){
			long value =thestack.pop();
			System.out.print(value+" ");
		}
		System.out.println("");
	}

}