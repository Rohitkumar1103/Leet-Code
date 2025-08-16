// class Solution {
//     public int maximum69Number (int num) {
//         String s = String.valueOf(num);
//         int[] arr = new int[s.length()];

//         for(int i=0; i<s.length(); i++){
//             arr[i] = s.charAt(i) - '0';
//         }

//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == 6){
//                 arr[i] = 9;
//                 break;
//             }
//         }

//         int val=0;
//         for(int i=0; i<arr.length; i++){
//             val = val*10+arr[i];
//         }
//         return val;
//     }
// }



// MORE OPTIMIZED
class Solution {
    public int maximum69Number(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break;
            }
        }
        
        return Integer.parseInt(new String(digits));
    }
}
