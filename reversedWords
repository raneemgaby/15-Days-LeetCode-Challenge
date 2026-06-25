public class Solution {
    public String reversedWords(String s){
        StringBuilder reversed=new StringBuilder();
        if(s!=null){
            if(1 <= s.length() && s.length()<=Math.pow(10,4)){
                String[] newStr=s.trim().split("\\s+");
                for(int i=newStr.length-1;i>=0;i--){
                    reversed.append(newStr[i]);
                    if(i>0) reversed.append(" ");
                }
            }
        }
        return reversed.toString();
    }
}
