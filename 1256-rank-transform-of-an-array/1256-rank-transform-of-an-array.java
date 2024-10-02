class Solution {
    public int[] arrayRankTransform(int[] arr) { // tc -> nlogn + 2n //sc -> n + n = 2n
        int[] dup = arr.clone(); 
        Arrays.sort(dup); // nlogn
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0; i<dup.length;i++){ // n
            map.putIfAbsent(dup[i],map.size()+1);
        }
        for(int i = 0;i<arr.length;i++){ // n
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}