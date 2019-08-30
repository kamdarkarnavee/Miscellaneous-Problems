package miscellaneous_problems.StringToInteger;

public class StringToInteger {
    public int myAtoi(String s) {
        s = s.trim();
        String sign = "";
        String accepted_chars = "+-0123456789";

        if(s.isEmpty() || !accepted_chars.contains(String.valueOf(s.charAt(0)))){
            return 0;
        }else{
            if(s.charAt(0) == '+' || s.charAt(0) == '-'){
                sign = String.valueOf(s.charAt(0));
                int len = s.length();
                s = s.substring(1, len);
                accepted_chars = "0123456789";
                if(s.isEmpty() || !accepted_chars.contains(String.valueOf(s.charAt(0)))) {
                    return 0;
                }
            }
            s = s.split("[^0-9]")[0];

            try{
                return Integer.parseInt(sign+s);
            }catch(NumberFormatException e){
                if(sign.equals("-")){
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
            }
        }
    }
}
