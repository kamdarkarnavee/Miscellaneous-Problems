package miscellaneous_problems;

public class ZigzagPattern {
    public String zigzag(String s, int rows){
        int len = s.length();
        int j, space;
        String answer = "";
        if(rows == 1){
            return s;
        }else {
            for(int i=0; i<rows; i++){
                j = i;
                if(i==0 || i==rows-1){
                    while(j<len){
                        System.out.print(s.charAt(j));
                        answer = answer.concat(Character.toString(s.charAt(j)));
                        space = rows - 2;
                        if(space >= 0){
                            System.out.print(" ".repeat(space));
                            j += (rows + space);
                        }else{
                            break;
                        }
                    }
                }else{
                    while(j<len){
                        System.out.print(s.charAt(j));
                        answer = answer.concat(Character.toString(s.charAt(j)));
                        space = rows - 2 - i;
                        j += 2 * (space + 1);
                        System.out.print(" ".repeat(space));
                        if(j<len){
                            System.out.print(s.charAt(j));
                            answer = answer.concat(Character.toString(s.charAt(j)));
                        }
                        space = i - 1;
                        j += 2 * (space + 1);
                        System.out.print(" ".repeat(space));
                    }
                }
                System.out.println();
            }
            return answer;
        }
    }
}
