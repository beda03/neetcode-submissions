class Solution {
    public boolean isValid(String s) {
        // Hızlı kontrol: Tek sayı uzunluktaysa asla geçerli olamaz
        if (s.length() % 2 != 0) return false;


        char[] stack = new char[s.length()];
        

        int idx = 0; 

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);


            if (ch == '(' || ch == '{' || ch == '[') {
                stack[idx] = ch;
                idx++; 
            } 

            else {

                if (idx == 0) return false;
                

                char sonAcilan = stack[idx - 1];
                

                if ((ch == ')' && sonAcilan == '(') || 
                    (ch == '}' && sonAcilan == '{') || 
                    (ch == ']' && sonAcilan == '[')) {
                    idx--;
                } 

                else {
                    return false;
                }
            }
        }


        return idx == 0;
    }
}