class GFG{
	static int getonce(int arr[], int n){
		int ones=0,twos=0;

		int common_bit_mask;

		for(int i=0;i<n;i++){
			twos=twos | (ones & arr[i]);
			ones=ones ^ arr[i];

			common_bit_mask = ~(ones & twos);
			ones &= common_bit_mask;
			twos &= common_bit_mask;
		}
		return ones;
	}

	public static void main(String args[]){
		int arr[]={1,2,3,3,4,6,6,7};
		int n=arr.length;
		System.out.println("The element with single occurrence is "+getonce(arr,n));	
	}
}