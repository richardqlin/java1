class rotatearray2{
	void leftrotate(int arr[], int d, int n){
		int i;
		for (i=0;i<d;i++)
			leftrotateone(arr,n);
	}

	void leftrotateone(int arr , int n){
		int i, temp;
		temp=arr[0];
		for (i=0;i<n-1;i++)
			arr[i]=arr[i+1];
		arr[i]=temp;
	}

	void printarray(int arr[], int n){
		int i;
		for (i=0; i<n;i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String args[]){
		rotatearray2 rotate = new rotatearray2();
		int arr[]={1,2,3,4,5,6,7,8};
		rotate.leftrotate(arr,3,8);
		rotate.printarray(arr,8);
	}
}