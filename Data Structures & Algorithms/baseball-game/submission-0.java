class Solution {
    public int calPoints(String[] operations) {
        int score = 0;
        int[] sols = new int[operations.length];
        
  
        int idx = 0; 

        for (int i = 0; i < operations.length; i++) {
            
            if (operations[i].equals("+")) {
                sols[idx] = sols[idx - 1] + sols[idx - 2];
                idx++; 
            } 
            else if (operations[i].equals("C")) {
              
                idx--; 
            } 
            else if (operations[i].equals("D")) {
                
                sols[idx] = sols[idx - 1] * 2;
                idx++; 
            } 
            else {
                
                sols[idx] = Integer.parseInt(operations[i]);
                idx++; 
            }
        }

      
        for (int i = 0; i < idx; i++) {
            score += sols[i];
        }
        
        return score;
    }
}