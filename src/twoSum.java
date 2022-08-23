class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr1[]=new int[2];
        int c=0;
        int p=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                {
                    c=i;
                    p=j;
                    break;
                }
            }
        }
        arr1[0]=c;
        arr1[1]=p;
        return arr1;


    }
}
