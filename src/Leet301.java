import java.util.ArrayList;
import java.util.List;

public class Leet301 {
    char[][] patterns = new char[][]{
            {'(', ')'},
            {')', '('}
    };
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        if(s == null || s.length() == 0){
            res.add("");
            return res;
        }
        dfs(s, res, 0, patterns[0]);
        return res;
    }

    private void dfs(String s, List<String> res, int lastRemove, char[] pattern){
        int counter = 0, i = 0;
        while(i < s.length() && counter >= 0){
            if(s.charAt(i) == pattern[0]) counter++;
            if(s.charAt(i) == pattern[1]) counter--;
            i++;
        }
        // 删除一个右括号
        if(counter < 0){
            for(int j = lastRemove; j < i; j++){
                if(s.charAt(j) == pattern[1] && (j == lastRemove || s.charAt(j-1) != pattern[1])){
                    dfs(s.substring(0, j) + s.substring(j+1), res, j, pattern);
                }
            }
        }else{
            String reverse = new StringBuilder(s).reverse().toString();
            if(pattern[0] == '('){
                dfs(reverse, res, 0, patterns[1]);
            }else{
                res.add(reverse);
            }
        }
    }
}
