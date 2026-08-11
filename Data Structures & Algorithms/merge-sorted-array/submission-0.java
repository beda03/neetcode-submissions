class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        int i = m - 1;       
        int j = n - 1;      
        int k = m + n - 1;   
        
       
        while (j >= 0) {
            

            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]; // Büyük olanı en sona koy
                i--;                 // nums1'in işaretçisini bir sola kaydır
            } 
            // Aksi halde (nums2'nin elemanı daha büyükse veya nums1 bitmişse)
            else {
                nums1[k] = nums2[j]; // nums2'dekini en sona koy
                j--;                 // nums2'nin işaretçisini bir sola kaydır
            }
            
            k--; // Hedef boşluğu her seferinde bir sola kaydır
        }
    }
}