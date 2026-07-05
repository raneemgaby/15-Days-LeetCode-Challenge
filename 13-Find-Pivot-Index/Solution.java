public class Solution {
    public int pivotIndex(int[] nums){
        int n=nums.length;
        int[] leftSums=new int[n];
        int[] rightSums=new int[n];
        leftSums[0]=0;
        for(int i=1;i<n;i++){
            leftSums[i]=leftSums[i-1]+nums[i-1];
        }
        rightSums[n-1]=0;
        for(int j=n-2; j>=0 ; j--){
            rightSums[j]=rightSums[j+1]+nums[j+1];
        }
        for(int i=0;i<n;i++){
            if(leftSums[i]==rightSums[i]){
                return i;
            }
        }
        return -1;
    }
}
