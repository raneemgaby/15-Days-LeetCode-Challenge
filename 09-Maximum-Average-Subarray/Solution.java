public class Solution {
    public double findMaxAverage(int[] nums,int k){
        int n=nums.length;
        double sum=0.0;
        double max=-1.0;
        for(int i=0; i<k ;i++){
            sum+=nums[i];
        }
        max=sum;
        for(int i=k; k<n ;i++){
            sum=sum-nums[i-k]+nums[i];
            if(sum > max){ max=sum; }
        }
        return max/k;
    }
}
