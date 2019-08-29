package miscellaneous_problems.LongestNonRepeatingSubstring;

public class LongestNonRepeatingSubstring {
    public int lengthOfLongestSubstring(String s) {
        int count, maxCount = 0;
        int i, j = 0;
        String newString = "";
        String temp;
        while(j < s.length()){
            temp = Character.toString(s.charAt(j));
            if(newString.contains(temp)){
                i = newString.indexOf(temp) + 1;
                newString = newString.substring(i);
            }
            newString = newString.concat(temp);
            count = newString.length();
            j++;
            if(maxCount < count){
                maxCount = count;
            }
        }
        return maxCount;
    }
}
