class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
       int siz = arrays.size();
        int min_0 = arrays.get(0).get(0);
        int max_0 = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        // Iterate through the remaining arrays
        for (int i = 1; i < siz; i++) {
            List<Integer> arr = arrays.get(i);
            int currentMin = arr.get(0);
            int currentMax = arr.get(arr.size() - 1);

            // Calculate the possible max distances
            maxDistance = Math.max(maxDistance, Math.abs(max_0 - currentMin));
            maxDistance = Math.max(maxDistance, Math.abs(currentMax - min_0));

            // Update the min_0 and max_0 for future comparisons
            min_0 = Math.min(min_0, currentMin);
            max_0 = Math.max(max_0, currentMax);
        }

        return maxDistance;
    }
}