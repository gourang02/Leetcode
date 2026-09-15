class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer>stack=new Stack<>();
        int n=arr.length;
        int[] ans=new int[n];
        for(int i=2*n-1;i>=0;i--){
            int ind=i%n;
            int currEle=arr[ind];
            while(!stack.isEmpty()&& stack.peek()<=currEle){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()){
                    ans[ind]=-1;
                }
                else{
                    ans[ind]=stack.peek();
                }
            }
            stack.push(currEle);
        }
        return ans;
        
    }
}