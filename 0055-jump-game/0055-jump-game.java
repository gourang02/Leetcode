class Solution {
    public boolean canJump(int[] nums) {
        int maxvalue=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>maxvalue){
                return false;
            }
            maxvalue=Math.max(maxvalue,i+nums[i]);
            if(maxvalue>=n-1){
                return true;
            }
        }
        return true;
    }

        
    }
