class Solution {
    // Approach 1: Two HashMaps
    // ⏱ Complexity Time: O(n) Space: O(n)
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length!=t.length) return false

        var sMap = mutableMapOf<Char, Int>()
        var tMap = mutableMapOf<Char, Int>()

        for (i in s.indices){
            sMap[s[i]] = sMap.getOrDefault(s[i], 0) + 1
            tMap[t[i]] = tMap.getOrDefault(t[i], 0) + 1
        }
        return sMap == tMap
    }
}
