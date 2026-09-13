class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val visited = HashSet<Int>()
        nums.forEach { num -> 
            if (visited.contains(num)) return true
            visited.add(num)
        }
        return false
    }
}
