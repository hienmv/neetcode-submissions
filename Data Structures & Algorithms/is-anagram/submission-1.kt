class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val size = 'z' - 'a' + 1
        val sArr = IntArray(size)
        val tArr = IntArray(size)

        val indexArray = { c: Char -> c - 'a' }

        for (i in 0 until s.length) {
            sArr[indexArray(s[i])] += 1
            tArr[indexArray(t[i])] += 1
        }
        for (i in 0 until size) {
            if (sArr[i] != tArr[i]) return false
        }
        return true
    }
}
