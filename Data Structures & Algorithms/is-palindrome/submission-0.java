class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l=0,h=s.length()-1;
        while(l<h){
            char lc=s.charAt(l);
            char hc=s.charAt(h);
            if(Character.isLetterOrDigit(lc) && Character.isLetterOrDigit(hc)){
                if(lc!=hc){
                    return false;
                }
                l++;h--;
            }
            else if(!(Character.isLetterOrDigit(lc))){
                l++;
            }
            else if (!(Character.isLetterOrDigit(hc))){
                h--;
            }
        }
        return true;
    }
}
