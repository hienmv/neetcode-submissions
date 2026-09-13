class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // brute force Time: O(n^2), Space O(1)
        // for (j in 0 until nums.size) {
        //     for (i in 0 until j) {
        //         if (nums[i] + nums[j] == target) {
        //             return intArrayOf(i, j)
        //         }
        //     }
        // }
        // return intArrayOf()

        // hashmap Time: O(n), Space: O(n)
        val valueMap = HashMap<Int, Int>()
        for (i in 0 until nums.size) {
            val value = nums[i]
            val pairValue = target - nums[i]
            val pairIndex = valueMap[pairValue]
            if (pairIndex != null) {
                return intArrayOf(pairIndex, i)
            } else {
                valueMap[value] = i
            } 
        }
        return intArrayOf()
    }
}
