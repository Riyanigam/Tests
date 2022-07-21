class Solution {
    public int pivotIndex(int[] nums) {
        int ls = 0;
        int rs = 0;
        int PI = 0;
        for(int i = 0; i<nums.length; i++)
        {
            PI+=nums[i];
        }
        rs = PI;
        for(int i =0; i<nums.length; i++){
            ls+=nums[i];
                     
       if(ls==rs)
       
           return i;
         rs-=nums[i];
       
          
        }      
        return -1;          
    
    }
}