class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()
        for (str in strs) {
            val code = anagramCode(str)
            if (!map.containsKey(code)) {
                map[code] = mutableListOf()
            }
            map[code]!!.add(str)
        }
        return map.values.toList()
    }

    fun anagramCode(str: String): String {
        val arr = IntArray(26)
        for (c in str.toCharArray()) {
            arr[c - 'a']++
        }
        // fixed order, limited length. 
        return arr.joinToString(",")
    }
}
