#  Merge Sort Explained

Merge Sort is a **Divide and Conquer** algorithm.  
It divides the array into smaller subarrays, sorts them individually, and then merges them back together in sorted order.

---

## 🔹 Step-by-Step Working

 dry run this on the array:

```
[9, 4, 7, 6, 3, 1, 5]
```

### Step 1: Divide
- Split into halves until each subarray has **1 element** (a single element is always sorted).

```
[9, 4, 7, 6, 3, 1, 5]
→ [9, 4, 7, 6]  +  [3, 1, 5]
→ [9, 4] + [7, 6] + [3] + [1, 5]
→ [9] + [4] + [7] + [6] + [3] + [1] + [5]
```

---

### Step 2: Conquer (Sort + Merge)
Now merge sorted pieces step by step:

1. Merge `[9]` and `[4]` → `[4, 9]`  
2. Merge `[7]` and `[6]` → `[6, 7]`  
3. Merge `[1]` and `[5]` → `[1, 5]`  

Now we have:

```
[4, 9], [6, 7], [3], [1, 5]
```

---

### Step 3: Merge Bigger Chunks
1. Merge `[4, 9]` and `[6, 7]` → `[4, 6, 7, 9]`  
2. Merge `[3]` and `[1, 5]` → `[1, 3, 5]`  

Now we have:

```
[4, 6, 7, 9], [1, 3, 5]
```

---

### Step 4: Final Merge
Merge `[4, 6, 7, 9]` and `[1, 3, 5]` → `[1, 3, 4, 5, 6, 7, 9]`

✅ Final Sorted Array:

```
[1, 3, 4, 5, 6, 7, 9]
```

---

## 🔹 Time Complexity Analysis

- **Best Case (Already Sorted)**: `O(n log n)`  
- **Average Case**: `O(n log n)`  
- **Worst Case (Reverse Order)**: `O(n log n)`  

👉 Always `O(n log n)` because the array is always divided into halves (`log n`) and merging each half takes linear time (`O(n)`).

---

## 🔹 Space Complexity Analysis

- **Space**: `O(n)`  
Because we use a temporary array (or `ArrayList` here) to store elements while merging.

---

## Notes
- Merge Sort is **stable** (keeps order of equal elements).  
- It is **not in-place** (uses extra memory).  
- Faster than **Bubble Sort** and **Insertion Sort** for large inputs.  
- Commonly used in libraries for sorting **linked lists** or when **stability** is required.

