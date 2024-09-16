class Solution {
    public int findMinDifference(List<String> timePoints) {
        if(timePoints.size() > 1440) return 0;
        int minutes[] = new int[1440];

        int max_minutes = 0;

        for(int i = 0; i < timePoints.size(); i++) {
            String str = timePoints.get(i);
            int h = (str.charAt(0) - 48) * 10 + (str.charAt(1) - 48);
            int m = (str.charAt(3) - 48) * 10 + (str.charAt(4) - 48);
            int mins = h * 60 + m;

            if(mins > max_minutes) max_minutes = mins;
            if(minutes[mins] == 1) return 0;
            minutes[mins] = 1;
        }

        int result = 1450;
        int first = -1;
        int prev = -1;
        for(int i = 0; i < 1440; i++) {
            if(minutes[i] == 1) {
                if(first == -1) {
                    first = i;
                    prev = i;
                }
                else {
                    result = Math.min(result, i - prev);
                    prev = i;
                }
            }
        }
        result = Math.min(result, 1440 + first - max_minutes);
        return result;

    }
}