const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

let n = parseInt(input[0]);
let m = parseInt(input[1]);

// code here
 if(n<m){
            console.log("less");
        }
        else if(n==m){
            console.log("equal");
        }
        else{
            console.log("greater");
        }

