class Solution {
	public double findMedian(int[] arr) {
		// Code here.
		Arrays.sort(arr);
		int a = 0;
		double avg = 0.0;
		for (int i = 0; i<arr.length; i++) {
			
			int n = arr.length;
			
			if (n%2 == 0) {
				a = (n + 1)/2;
				avg = (double)(arr[a - 1]+arr[a])/2;
				
			} else {
				int b = ((n + 1)/2) - 1;
				avg = arr[b];
			}
		}
		return avg;
	}
}
