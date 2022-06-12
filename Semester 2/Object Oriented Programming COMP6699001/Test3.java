import java.util.*;

public class Test3 {
    Integer[] rank = new Integer[20];
        
        for (int i = 0; i < rank.length(); i++) {
            rank[i] = i;
        }
        
        Arrays.sort(rank, (a, b) -> (nums[b] - nums[a]));
        
        String[] result = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[rank[i]] = "Gold Medal";
            }
            else if (i == 1) {
                result[rank[i]] = "Silver Medal";
            }
            else if (i == 2) {
                result[rank[i]] = "Bronze Medal";
            }
            else {
                result[rank[i]] = (i + 1) + "";
            }
        }

        return result;
}