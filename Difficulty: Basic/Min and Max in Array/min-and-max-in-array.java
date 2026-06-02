class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max=arr[0];
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]) max=arr[i];
            else if (min>arr[i]) min=arr[i];
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);

        return result;
    }
}
