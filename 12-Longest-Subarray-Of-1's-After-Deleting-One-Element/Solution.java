public class Solution {
    public int longestSubarray(int[] nums){
      int count=0;
      int maxCount=0;
      int i=0;int j=0;
      if( 1<=nums.length && nums.length<=Math.pow(10,5)){
          for(i=0;i<nums.length;i++){
              if(nums[i]==0 ||nums[i]==1){
                  if(nums[i]==0){count++;}
                  while(count>1){
                      if(nums[j]==0){count--;}
                      j++;
                  }
                  maxCount= Math.max(maxCount,i-j);
              }
          }
      }
      return maxCount;
    }
}
