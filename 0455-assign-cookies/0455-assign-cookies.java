class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int cookies=0;
        int child=0;
        while(cookies<s.length && child<g.length){
            if(s[cookies]>=g[child]){
                child++;
            }
            cookies++;
            
        }
        return child;
        
    }
}