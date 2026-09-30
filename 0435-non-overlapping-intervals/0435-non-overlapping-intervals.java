class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
    Arrays.sort(nums,(a,b)->a[1]-b[1]);
    int count=0;
    int end=nums[0][1];
    for(int i=1;i<nums.length;i++){
        if(nums[i][0]>=end){
            end=nums[i][1];
        }
        else{
            count++;
        }
    }
        return count;
    }
}