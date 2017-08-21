class MaxNumbers {
 
    public void printMaxNumbers(int n, int[] nums){

       
        
        for (int i =0; i<n;i++){
            int max=-1 ;
            int index=0;
            int j;
            for ( j=0;j<nums.length;j++)
                if (nums[j]>max){
                    
                    max=nums[j];
                    
                    index=j;
                }
            System.out.print(max+" ");
                nums[index]=-1;
            
        }
    }
     
    public static void main(String a[]){
        int num[] = {15,134,178,22,345,13,99,237};
        MaxNumbers mn = new MaxNumbers();
        mn.printMaxNumbers(5, num);
    }
}
