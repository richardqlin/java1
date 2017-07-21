class binarysearch{

	static int Binarysearch (int arr[], int x){
		int first=0,  last=arr.length-1;
		while (last>=first){
			int mid=first+(last-first)/2;
			if (arr[mid]==x)
				return mid;

			if (arr[mid]>x)
				last=mid-1;
			if (arr[mid]<x)
				first=mid+1;
			//System.out.print(mid+" ");
		}

		return -1;
	}

	public static void main(String args[]){
		int arr[]={2,3,4,10,40,44};
		int n=arr.length;
		int x=10;
		int sol=Binarysearch(arr,x);

		if (sol==-1)
			System.out.println("Element not present");

		else
			System.out.println("Element found at "+sol);

	}
}