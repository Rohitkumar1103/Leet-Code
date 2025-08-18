class Solution {
    public String reverseVowels(String s) {
        int low = 0;
        int high = s.length()-1;

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] arr = s.toCharArray();

        while(low <= high){
            if(!vowels.contains(arr[low])){
                low++;
            } else if(!vowels.contains(arr[high])){
                high--;
            } else{
                char temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return new String(arr);
    }
}