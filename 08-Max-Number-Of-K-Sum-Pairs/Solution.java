import java.util.Arrays;
public class Solution {
    public int maxOperation(int[] nums,int k){
        Arrays.sort(nums);
        int i=0;
        int sum=0;
        int n=nums.length-1;
        if(1 <= n && n <= Math.pow(10,5)){
            if(1 <= k && k <=Math.pow(10,9)){
                while(i < n){
                    int currentSum=nums[i]+nums[n];
                    if(currentSum==k) {
                        sum++;
                        i++;
                        n--;
                    }else if(currentSum < k){
                        i++;
                    }else{
                        n--;
                    }
                }
            }
        }
        return sum;
    }
}
