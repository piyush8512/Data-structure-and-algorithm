# 📝 Insertion Sort in Java -- Dry Run Example

## 🔹 Input Array

    [13, 46, 24, 52, 20, 9]

------------------------------------------------------------------------

## 🔄 Step-by-Step Dry Run

Insertion Sort builds the **sorted portion** of the array step by step.
At each step, the current element is inserted into its correct position
among the already-sorted elements.

------------------------------------------------------------------------

### Pass 1 (i = 0)

-   Only one element `[13]` → already sorted.

-   Array remains:

        [13, 46, 24, 52, 20, 9]

------------------------------------------------------------------------

### Pass 2 (i = 1)

-   Compare `46` with `13` → no swap needed.

-   Sorted part: `[13, 46]`

-   Array:

        [13, 46, 24, 52, 20, 9]

------------------------------------------------------------------------

### Pass 3 (i = 2)

-   Compare `24` with `46` → swap.

-   Compare `24` with `13` → stop (correct position found).

-   Sorted part: `[13, 24, 46]`

-   Array:

        [13, 24, 46, 52, 20, 9]

------------------------------------------------------------------------

### Pass 4 (i = 3)

-   Compare `52` with `46` → no swap.

-   Sorted part: `[13, 24, 46, 52]`

-   Array:

        [13, 24, 46, 52, 20, 9]

------------------------------------------------------------------------

### Pass 5 (i = 4)

-   Compare `20` with `52` → swap.

-   Compare `20` with `46` → swap.

-   Compare `20` with `24` → swap.

-   Compare `20` with `13` → stop.

-   Sorted part: `[13, 20, 24, 46, 52]`

-   Array:

        [13, 20, 24, 46, 52, 9]

------------------------------------------------------------------------

### Pass 6 (i = 5)

-   Compare `9` with `52` → swap.

-   Compare `9` with `46` → swap.

-   Compare `9` with `24` → swap.

-   Compare `9` with `20` → swap.

-   Compare `9` with `13` → swap.

-   Sorted part: `[9, 13, 20, 24, 46, 52]`

-   Array:

        [9, 13, 20, 24, 46, 52]

------------------------------------------------------------------------

## ✅ Final Sorted Array

    [9, 13, 20, 24, 46, 52]

------------------------------------------------------------------------

## 📊 Complexity Analysis

### Time Complexity

-   **Best Case (Already Sorted):** O(n)
    Each element only compared once.
-   **Average Case:** O(n²)
    Elements require shifting about half the time.
-   **Worst Case (Reverse Sorted):** O(n²)
    Every element is moved to the beginning.

### Space Complexity

-   **Space:** O(1)
    Sorting is done in-place.
-   **Stability:** ✅ Stable (equal elements retain their original
    order).
