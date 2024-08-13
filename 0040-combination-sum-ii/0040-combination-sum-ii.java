class Solution {
    public void solve(int[] candidates, int target, int idx, List<Integer> temp, List<List<Integer>> res, int sum){
        if(idx > candidates.length || sum> target){
            return;
        }
        if(sum == target){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int j = idx; j<candidates.length; j++){
            if(j>idx && candidates[j] == candidates[j-1]){
                continue;
            }
            temp.add(candidates[j]);
            solve(candidates, target, j+1, temp, res, sum+candidates[j]);
            temp.remove(temp.size()-1);
        }
        return;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, target, 0, new ArrayList<>(), res, 0);
        return res;
    }
}