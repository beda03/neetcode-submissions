

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        
        List<Integer>[] buckets = new List[nums.length + 1];
        
        for (int key : map.keySet()) {
            int frekans = map.get(key);
            
           
            if (buckets[frekans] == null) {
                buckets[frekans] = new ArrayList<>();
            }
           
            buckets[frekans].add(key);
        }

     
        int[] sonuc = new int[k];
        int index = 0;
        
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
             
                for (int num : buckets[i]) {
                    sonuc[index++] = num;
                    
                   
                    if (index == k) {
                        return sonuc;
                    }
                }
            }
        }
        
        return sonuc;
    }
}