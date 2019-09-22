package RomanToInteger;
import java.util.HashMap;

public class RomanToInteger {
    static HashMap<Character, Integer> map;
    static{
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        int len = s.length();
        int temp1, temp2, j, i = 0, sum = 0;
        while(i<len){
            j = i + 1;
            temp1 = map.get(s.charAt(i));
            temp2 = (j < len) ? map.get(s.charAt(j)) : 0;
            if(temp1 >= temp2){
                sum += temp1;
                i++;
            }else{
                sum += (temp2 - temp1);
                i += 2;
            }
        }
        return sum;
    }
}
