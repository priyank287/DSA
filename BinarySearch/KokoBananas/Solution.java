package BinarySearch.KokoBananas;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int x:piles){
            high = Math.max(high, x);
        }
        int minSpeed = high ;

        while (low <= high){
            int mid = low + (high - low)/2;
            int timeTaken = 0;
            for(int x:piles){
                timeTaken += Math.ceil((double) x / mid);
            }
            if(timeTaken <=h){
                minSpeed = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return minSpeed;
    }
}
