public class Leet1004 {
    public int longestOnes1(int[] A, int K) {
        int i = 0, j;
        for (j = 0; j < A.length; ++j) {
            if (A[j] == 0) K--;
            if(K < 0){
                if(A[i] == 0) K--;
                i++;
            }
        }
        return j - i;
    }
public int longestOnes(int[] A, int K) {
    int zeroCount=0;
    int start=0,res=0;
    for(int end=0;end<A.length;end++){
        if(A[end] == 0) zeroCount++;
        if(zeroCount > K){
            if(A[start] == 0) zeroCount--;
            start++;
        }
        res=Math.max(res,end-start+1);
    }
    return res;
}
}
