class Solution {
    public int[] replaceElements(int[] arr) {

        int max_so_far = -1;
        

        for (int i = arr.length - 1; i >= 0; i--) {

            int temp = arr[i];
            

            arr[i] = max_so_far;
            

            if (temp > max_so_far) {
                max_so_far = temp;
            }
        }
        
        return arr;
    }
}