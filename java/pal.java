public class pal {
       // Compelextiy O(N);
    
        public boolean isPalindrome(String s) {
                char [] arr = s.toCharArray();
            StringBuilder palind = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
               if(Character.isLetterOrDigit(arr[i])) {
                   palind.append(Character.toLowerCase(arr[i]));
               }
            }
            String palStr = palind.toString();
    
            for (int i = 0;i< palStr.length() / 2  ; i++) {
                if(palStr.charAt(i) != palStr.charAt(palStr.length() - i - 1)) {
                    return false;
                }
            }
            
            return true;

            
    
            
        }
    
}
