
import java.util.*;

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        int[] res = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            setA.add(A[i]);
            setB.add(B[i]);

            int count = 0;

            for (int num : setA) {
                if (setB.contains(num)) {
                    count++;
                }
            }

            res[i] = count;
        }

        return res;
    }
}
