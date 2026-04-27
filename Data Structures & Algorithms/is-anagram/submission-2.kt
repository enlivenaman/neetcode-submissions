class Solution {
    // Best for interviews: Array (fastest)
    // If input is only lowercase English letters
    // space O(1)
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length!=t.length) return false

        var count = IntArray(50)

        for (i in s.indices) {
            count[s[i]-'a']++
            count[t[i]-'a']--
        }
        return count.all{it == 0}
    }
}
