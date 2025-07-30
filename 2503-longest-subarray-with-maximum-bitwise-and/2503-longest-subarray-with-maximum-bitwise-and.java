class Solution {
    public int longestSubarray(int[] arr) {
        int len=1;
        int i=0;
        int max=0;
        int n=arr.length;
        while(i<n){
            int j=i+1;
            int currmax=arr[i];
            while(j<n && arr[i]==arr[j]){
                j++;
            }
          //  System.out.println(currmax);
            if(currmax>=max){
                if(currmax>max)len=j-i;
                else len=Math.max(len,j-i);
                max=currmax;
            }
            i=j;
        }
        return len;
    }
}