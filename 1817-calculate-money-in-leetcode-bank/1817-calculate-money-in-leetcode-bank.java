class Solution {
    public int totalMoney(int n) {
        int mondayMoney = 1;
        int total = 0;
        int dayMoney = mondayMoney;

        for(int day = 1; day <= n; day++){
            total += dayMoney;
            dayMoney++;

            if(day % 7 == 0){
                mondayMoney++;
                dayMoney = mondayMoney;
            }
        }
        return total;
    }
}   