public class Solution {
    public int[] productExceptSelf(int[] nums){
        int[] result=new int[nums.length];
        result[0]=1;
        int suffix=1;
        if(2 <= nums.length && nums.length <=Math.pow(10,5)){
            for(int i=1;i<nums.length;i++){
                if(-30 <= nums[i] && nums[i] <= 30){
                    result[i]=result[i-1]*nums[i-1];
                }
            }
            for(int j=nums.length-1;j>=0;j--){
                if(-30 <= nums[j] && nums[j] <= 30){
                    result[j]=suffix*result[j];
                    suffix=suffix*nums[j];
                }
            }
        }
        return result;
    }
}
