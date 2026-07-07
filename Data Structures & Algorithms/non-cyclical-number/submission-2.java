class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h=new HashSet<>();
        while(!h.contains(n)){
            h.add(n);
            int s=0;
            while(n!=0){
                s=s+(n%10)*(n%10);
                n/=10;
            }
            if(s==1) return true;
            n=s;
        }
        return false;
    }
}
