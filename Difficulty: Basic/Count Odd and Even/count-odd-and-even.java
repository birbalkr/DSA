class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }
        return new int [] {odd, even};
    }
}