class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;

        for(int k = n-1; k>=2; k--){
            int i = 0, j = k-1;

            while(i<j){
                if(nums[i] + nums[j] > nums[k]){
                    count += j - i;
                    j--;
                } else{
                    i++;
                }
            }
        }
        return count;
    }
}

// class Solution {
//     public int triangleNumber(int[] nums) {
//         Arrays.sort(nums);
//         int count = 0;
//         for(int i=0; i<nums.length-2; i++){
//             if (nums[i] == 0) continue;
//             for(int j=i+1; j<nums.length-1; j++){
//                 for(int k=j+1; k<nums.length; k++){
//                     if(nums[i] + nums[j] > nums[k]){
//                         count++;
//                     } else{
//                         break;
//                     }
//                 }
//             }
//         }
//         return count;
//     }
// }