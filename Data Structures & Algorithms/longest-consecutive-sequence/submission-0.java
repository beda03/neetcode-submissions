class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int sol = 1;
        int currentMax = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                currentMax++;
            } else if (nums[i + 1] != nums[i]) {
                currentMax = 1;
            }
            sol = Math.max(sol, currentMax);
        }
        return sol;
    }
}