// class Solution {
//     public int differenceOfSums(int n, int m) {
//         int sumOfDiv = 0;
//         int sumOfNotDiv = 0;

//         for(int i=1; i<=n; i++){
//             if(i % m == 0){
//                 sumOfDiv += i;
//             } else{
//                 sumOfNotDiv +=i;
//             }
//         }
//         return sumOfNotDiv - sumOfDiv;
//     }
// }

class Solution {
    public int differenceOfSums(int n, int m) {
        int totalSum = n * (n + 1) / 2;
        int count = n / m;
        int sumOfDiv = m * count * (count + 1) / 2;

        return totalSum - 2 * sumOfDiv;
    }
}
