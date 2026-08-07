class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] sol = new int[2];

        int idx1 = 0;
        int idx2 = 0;

        for(int i = 0; i< nums.length; i++){

           int remaining = target - nums[i];
           
           for(int j = i+1; j < nums.length ; j++){
            if (remaining == nums[j]){
                idx1 = i;
                idx2= j;
            }
            
           }
           

        }

        sol[0] = idx1;
        sol[1] = idx2;
        return sol ;
    }
}
