class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxArea = 0;

        while(left < right){
            int barHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int area = barHeight * width;
            maxArea = Math.max(area, maxArea);
            if(height[left] < height[right]){
                left++;
            } else{
                right--;
            }
        }
        return maxArea;
    }
}