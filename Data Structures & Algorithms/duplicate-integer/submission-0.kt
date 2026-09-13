class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val visited = mutableSetOf<Int>()
        nums.forEach { num -> 
            if (visited.contains(num)) return true
            visited.add(num)
        }
        return false
    }
}
