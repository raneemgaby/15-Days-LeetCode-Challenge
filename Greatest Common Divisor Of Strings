public class Solution {
    public String gcdOfStrings(String str1,String str2){
        int gcd=0;
       if(1 <= str1.length() && str2.length() <= 1000){
           if(str1.equals(str1.toUpperCase()) && str2.equals(str2.toUpperCase())){
               if(!(str1+str2).equals(str2+str1)){
                   return"";
               }else{
                   gcd=GCD(str1.length(),str2.length());
               }
           }
       }
       return str1.substring(0,gcd);
    }
    public int GCD (int a,int b){
        if(b==0){
            return a;
        }
        return GCD(b,a%b);
    }
}
