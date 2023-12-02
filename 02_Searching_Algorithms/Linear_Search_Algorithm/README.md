# Linear Search Algorithm:

Linear search, also known as sequential search, is a simple search algorithm that finds the position of a target value within a list. It sequentially checks each element of the list until a match is found or the entire list has been searched. Here's a step-by-step explanation of the linear search algorithm:

1. **Input:**
   - A list or array of elements.
   - The target value to be searched.

2. **Initialization:**
   - Set a variable (let's call it `target`) to the value we are searching for.
   - Initialize a variable to keep track of the current position in the list (let's call it `current_position`) to 0 (the first index).

3. **Iterate Through the List:**
   - Start a loop that iterates through each element in the list.
   - For each iteration, compare the current element with the target value.

4. **Comparison:**
   - If the current element is equal to the target value, the search is successful, and you can return the current position as the index of the target.
   - If the current element is not equal to the target value, move to the next element.

5. **Update Position:**
   - Increment the `current_position` by 1 to move to the next element in the list.

6. **Repeat:**
   - Repeat steps 4-5 until the entire list is traversed.

7. **Check for Completion:**
   - If the entire list has been searched and no match is found, return a special value (e.g., -1) to indicate that the target value is not in the list.

### Example:

Let's say we have the following list: [4, 2, 7, 1, 9, 5] and we want to search for the target value 7.

- **Initialization:**
  - `target` = 7
  - `current_position` = 0

- **Iteration 1:**
  - Compare `list[0]` (4) with `target` (7) → No match, move to the next element.
  - Increment `current_position` to 1.

- **Iteration 2:**
  - Compare `list[1]` (2) with `target` (7) → No match, move to the next element.
  - Increment `current_position` to 2.

- **Iteration 3:**
  - Compare `list[2]` (7) with `target` (7) → Match found! Return `current_position` (2).

In this example, the linear search successfully found the target value 7 at index 2 in the list. The time complexity of the linear search algorithm is O(n), where n is the size of the list.