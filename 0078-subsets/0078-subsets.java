
import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        // Step 1: Final answer store karna
        List<List<Integer>> ans = new ArrayList<>();

        // Step 2: Current subset store karna
        List<Integer> temp = new ArrayList<>();

        // Step 3: Recursion call
        solve(0, nums, temp, ans);

        return ans;
    }

    public void solve(int index, int[] nums,
                      List<Integer> temp,
                      List<List<Integer>> ans) {
        if (index == nums.length) {

            ans.add(new ArrayList<>(temp));

            return;
        }
        temp.add(nums[index]);

        solve(index + 1, nums, temp, ans);    
        temp.remove(temp.size() - 1);

       solve(index + 1, nums, temp, ans);
    }
}
