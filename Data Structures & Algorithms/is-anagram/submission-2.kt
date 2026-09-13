class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val size = 'z' - 'a' + 1
        val expected0Array = IntArray(size)
        val indexArray = { c: Char -> c - 'a' }

        for (i in 0 until s.length) {
            expected0Array[indexArray(s[i])] += 1
            expected0Array[indexArray(t[i])] -= 1
        }
        for (i in 0 until size) {
            if (expected0Array[i] != 0) return false
        }
        return true
    }
}
