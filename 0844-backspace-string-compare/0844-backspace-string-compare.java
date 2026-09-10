class Solution {
    public boolean backspaceCompare(String s, String t) {
        return helper(s).equals(helper(t));
    }
    public String helper(String hello){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<hello.length();i++){
            char ch=hello.charAt(i);
            if(ch=='#'){
                if(sb.length()>0)
                sb.deleteCharAt(sb.length()-1);

            }
            else{
                sb.append(ch);
            }
           
        }
         return sb.toString();
    }
        
        

}
    