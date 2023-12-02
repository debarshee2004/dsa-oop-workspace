# Sentinel Linear Search Algorithm:

A sentinel linear search algorithm is a variation of the standard linear search algorithm with the addition of a sentinel value. A sentinel is a special value that is used to mark the end of the data structure. In the context of linear search, a sentinel is placed at the end of the array to simplify the loop termination condition.

Let's go through the steps of a sentinel linear search algorithm:

1. **Initialization:**
   - Set up an array of elements to search through.
   - Append a sentinel value at the end of the array. The sentinel should be chosen in such a way that it is not a valid element in the array, and it is less likely to be encountered in the actual data.

    ```python
    # Example array with a sentinel
    array = [4, 2, 7, 1, 9, 5, -1]  # Sentinel value: -1
    ```

2. **Set the Sentinel:**
   - Assign the value to search for (the target) to the sentinel. This way, the loop termination condition becomes the search itself, making the code more concise.

    ```python
    target = -1
    ```

3. **Linear Search Algorithm:**
   - Start iterating through the array from the beginning until the sentinel is found.

    ```python
    i = 0
    while array[i] != target:
        i += 1
    ```

4. **Check for Match:**
   - Check if the current element is equal to the target. If yes, then the target has been found.

    ```python
    if array[i] == target:
        print(f"Target {target} found at index {i}.")
    else:
        print(f"Target {target} not found in the array.")
    ```

### Example:

Let's use the example array `array = [4, 2, 7, 1, 9, 5, -1]` with a sentinel value of `-1` and search for the target value `-1`.

1. Initialization:
   - Array: `[4, 2, 7, 1, 9, 5, -1]`
   - Sentinel: `-1`
   - Target: `-1`

2. Sentinel Linear Search Algorithm:
   - Start searching for the target value `-1`.

   ```python
   i = 0
   while array[i] != target:
       i += 1
   ```

   - The loop will terminate when the sentinel `-1` is found.

3. Check for Match:
   - Check if `array[i] == target`. In this case, it is true.

   ```python
   if array[i] == target:
       print(f"Target {target} found at index {i}.")
   ```

   - Output: `Target -1 found at index 6.`

The sentinel linear search algorithm simplifies the loop termination condition by using a sentinel value, making the code cleaner and avoiding the need for an extra check within the loop.