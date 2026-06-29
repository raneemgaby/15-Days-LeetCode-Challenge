public class Solution {
    public int maxArea(int[] height){
        int maxWater=0;
        int n=height.length;
        int right=n-1;
        int i=0;
        while(i < right){
            int width=right-i;
            int currentHeight=Math.min(height[i],height[right]);
            int currentWater=width*currentHeight;
            maxWater=Math.max(maxWater,currentWater);
            if(height[i] < height[right]){
                i++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}
 
