
# Selection Sort — Dry Run

**Initial Array:**


| Pass    | Pos 0 | Pos 1 | Pos 2 | Pos 3 | Pos 4 | Pos 5 |
|---------|-------|-------|-------|-------|-------|-------|
| Pass 1  | **9** | 46    | 24    | 52    | 20    | 13    |
| Pass 2  | 9     | **13**| 24    | 52    | 20    | 46    |
| Pass 3  | 9     | 13    | **20**| 52    | 24    | 46    |
| Pass 4  | 9     | 13    | 20    | **24**| 52    | 46    |
| Pass 5  | 9     | 13    | 20    | 24    | **46**| 52    |

**Explanation of Each Pass:**
1. **Pass 1:** Find smallest element (`9`), swap with first position.
2. **Pass 2:** Find smallest in remaining (`13`), swap with second position.
3. **Pass 3:** Find smallest in remaining (`20`), swap with third position.
4. **Pass 4:** Find smallest in remaining (`24`), swap with fourth position.
5. **Pass 5:** Find smallest in remaining (`46`), swap with fifth position — array sorted.

**Final Sorted Array:**
