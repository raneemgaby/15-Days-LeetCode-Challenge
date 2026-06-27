public class Solution {
    public void moveZeros(int[] nums){
        int noneZero=0;
        if(1 <= nums.length && nums.length <= Math.pow(10,4)){
            for(int i=0; i< nums.length;i++){
                if(Math.pow(-2,31) <= nums[i] && nums[i] <= Math.pow(2,31)){
                    if(nums[i] != 0){
                        nums[noneZero]=nums[i];
                        noneZero++;
                    }
                }
            }
            while(noneZero < nums.length){
                nums[noneZero]=0;
                noneZero++;
            }
        }
    }
}
