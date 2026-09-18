class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] nums1 = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            nums1[i] = nums[i] * nums[i];
        }

        for(int j = 1; j < nums.length; j++){
            int key = nums1[j]; 
            int before = j -1;

            while(before >= 0 && nums1[before] > key){
                nums1[before + 1] = nums1[before ];
                before--;
            }
            nums1[before + 1] = key;
        }

        return nums1;
    }

}