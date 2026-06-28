public class Solution {
    public boolean isSubsequence(String s,String t){
        int sIndex=0;
        if( (0<= s.length() && s.length()<= 100) && (0 <= t.length() && t.length() <=Math.pow(10,4))){
            if(s.equals(s.toLowerCase()) && t.equals(t.toLowerCase())){
                if(s.length() == 0) return true;
                for(int i=0;i<t.length();i++){
                    if(t.charAt(i) == s.charAt(sIndex)){sIndex++;}
                    if(sIndex == s.length()){return true;}
                }
            }
        }
        return sIndex== s.length();
    }
}
