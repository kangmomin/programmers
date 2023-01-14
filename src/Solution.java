import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution30(int A, int B, int C, int D) {
        int numer = A * D + B * C;
        int denom = B * D;
        List<Integer> answer = new ArrayList<>();
        int maximun = 1;

        for (int i = 1; i <= numer; i++) {
            if (numer % i == 0 && denom % i == 0) {
                maximun = i;
            }
        }

        answer.add(numer / maximun);
        answer.add(denom / maximun);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
