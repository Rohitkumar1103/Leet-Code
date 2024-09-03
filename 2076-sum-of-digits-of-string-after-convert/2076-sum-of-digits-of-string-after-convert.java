class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        // Step 1: Convert the string to the corresponding integer representation
        for (char c : s.toCharArray()){
            sb.append(c - 'a' + 1);
        }
        // Step 2: Convert the resulting string to an integer
        int sum = 0;
        for( char digit : sb.toString().toCharArray()){
            sum += digit - '0';
        }
        // Step 3: Apply the transformation k times
        for(int i=1; i<k; i++){
            int tempSum = 0;
            while(sum > 0){
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
        }
        return sum;
    }
}