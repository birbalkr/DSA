/**
 * @param {number} a
 * @param {number} b
 * @returns {void}
 */

class Solution {
    // Function to calculate the utility of two numbers.
    swap(a, b) {
        // code here
        a=a+b;
        b=a-b;
        a=a-b;
        console.log(a,b);
        
    }
}