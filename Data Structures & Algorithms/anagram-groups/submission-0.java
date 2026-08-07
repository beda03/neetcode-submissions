class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String kelime : strs) {
          
            char[] harfler = kelime.toCharArray();
            Arrays.sort(harfler);
            
           
            String imza = new String(harfler);

           
            if (!map.containsKey(imza)) {
                map.put(imza, new ArrayList<>());
            }

          
            map.get(imza).add(kelime);
        }

       
        return new ArrayList<>(map.values());

    

    }
}
