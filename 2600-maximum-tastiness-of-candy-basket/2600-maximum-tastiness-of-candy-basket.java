class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int left = 0;
        int right = price[price.length-1] - price[0];
        int ans = 0;
        
        while(left <= right){
            int mid = left+(right-left)/2;
            if(canPick(price, k, mid)){
                ans = mid;
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        return ans;
    }
    private boolean canPick(int[] price, int k, int minDiff){
        int count = 1;
        int last = price[0];

        for(int i=1; i<price.length; i++){
            if(price[i] - last >= minDiff){
                count++;
                last = price[i];
            }
            if (count >= k) return true;
        }
        return false;
    }
}