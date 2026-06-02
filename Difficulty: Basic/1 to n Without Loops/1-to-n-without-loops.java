class Solution {
    public void printTillN(int n) {
        // code here
      if(0==n){
          return ;
      }
       printTillN(n - 1);
       System.out.print(n+" ");
    }
}