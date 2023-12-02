/**
 * The `sentinelSearch` function searches for a given key in an array and returns the index where the
 * key is found, or "Element Not found" if the key is not present.
 * @param arr - The array in which the element is to be searched.
 * @param n - The parameter "n" represents the size of the array.
 * @param key - The key parameter is the element that we are searching for in the array.
 */
function sentinelSearch(arr, n, key) {
  var last = arr[n - 1];

  // Element to be searched is
  // placed at the last index
  arr[n - 1] = key;
  var i = 0;

  while (arr[i] != key) i++;

  // Put the last element back
  arr[n - 1] = last;

  if (i < n - 1 || arr[n - 1] == key)
    document.write(key + " is present at index " + i);
  else document.write("Element Not found");
}


var arr = [10, 20, 180, 30, 60, 50, 110, 100, 70];
var n = arr.length;
var key = 180;

sentinelSearch(arr, n, key);
