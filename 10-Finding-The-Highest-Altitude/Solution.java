public class Solution {
    public int largestAltitude(int[] gain){
       int i=0;
       int max=0;
       int sum=0;
       if(1 <= gain.length && gain.length <= 100){
           if(-100 <= gain[i] && gain[i] <= 100){
               while(i < gain.length){
                   sum+=gain[i];
                   if(sum > max){ max=sum;}
                   i++;
               }
           }
       }
       return max;
    }
}
