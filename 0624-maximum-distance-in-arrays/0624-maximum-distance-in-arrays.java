class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        Collections.sort(arrays,(l1,l2) -> {
            return l1.get(0) - l2.get(0);
        });
        int maxDistance = 0;
        int start = arrays.get(0).get(0);
        int end = arrays.get(0).getLast();
        for(int i = 1; i < arrays.size(); i ++) {
            List<Integer> list = arrays.get(i);
            int dist1 = list.get(list.size() - 1) - start;
            int dist2 = Math.abs(end - list.get(0));
            maxDistance = Math.max(maxDistance,Math.max(dist1,dist2));
        }
        return maxDistance;
    }
}