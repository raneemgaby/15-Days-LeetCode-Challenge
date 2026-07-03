public class Solution {
    public int maxVowels(String s,int k){
    int currentVowels=0;
    int maxVowels=0;
    if( 1<=s.length() && s.length()<=Math.pow(10,5)){
        if(s.toLowerCase().equals(s)){
            if( 1<=k && k<=s.length()) {
                for (int i = 0; i < k; i++){
                    char ch=s.charAt(i);
                    if(ch=='a'|| ch=='e'|| ch=='i' ||ch=='o'||ch=='u'){
                        currentVowels++;
                    }
                }
                maxVowels=currentVowels;
                for(int i=k; i<s.length();i++){
                    char nextChar=s.charAt(i);
                    if(nextChar=='a'|| nextChar=='e'||nextChar=='i'||nextChar=='o'||nextChar=='u'){currentVowels++;}
                    char leftChar=s.charAt(i-k);
                    if(leftChar=='a'|| leftChar=='e'||leftChar=='i'|| leftChar=='o'||leftChar=='u'){currentVowels--;}
                    if(currentVowels > maxVowels){maxVowels=currentVowels;}
                    if(maxVowels==k){return maxVowels;}
                    
                }
            }
        }
    }
    return maxVowels;
    }
}
