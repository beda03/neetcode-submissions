class Solution {
    public int[] getConcatenation(int[] nums) {

        
        int n = nums.length;
        int [] new_arr = new int [ n* 2];

        for(int i = 0; i< nums.length;i++){
            new_arr[i] = nums[i];
            new_arr[i + n] = nums[i];

        }
        return new_arr;
    }
}