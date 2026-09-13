class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<List<Int>, MutableList<String>>()
        for (str in strs) {
            val count = MutableList(26) { 0 }
            for (c in str) {
                count[c - 'a']++
            }
            map.getOrPut(count) { mutableListOf() }.add(str)
        }
        return map.values.toList()
    }

    // O(m*n) m: max length of str, n: number of str 
    // fun groupAnagrams(strs: Array<String>): List<List<String>> {
    //     val map = HashMap<String, MutableList<String>>()
    //     for (str in strs) {
    //         val code = anagramCode(str)
    //         if (!map.containsKey(code)) {
    //             map[code] = mutableListOf()
    //         }
    //         map[code]!!.add(str)
    //     }
    //     return map.values.toList()
    // }
    // fun anagramCode(str: String): String {
    //     val arr = IntArray(26)
    //     for (c in str.toCharArray()) {
    //         arr[c - 'a']++
    //     }
    //     // fixed order, limited length. 
    //     /*
    //     IntArray cannot be used as a HashMap Key: In Kotlin/Java, two arrays with the exact same elements (e.g., [1, 0, 1] and [1, 0, 1]) are considered unequal because their hash codes are based on memory references, not their contents. To fix this, convert the IntArray to a String or a List<Int> before using it as a key.
    //     */
    //     return arr.joinToString(",")
    // }
}
