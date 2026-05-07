/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    let a=[];
    let j=0;
    for (let i of arr){
        a.push(fn(i,j++));
    }
    return a;
};