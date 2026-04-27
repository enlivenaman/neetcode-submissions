class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groupMap = mutableMapOf<String, MutableList<String>>()
        for (str in strs) {
            val sortedS = str.toCharArray().sorted().joinToString("")
            groupMap.getOrPut(sortedS) {
                mutableListOf()
            }.add(str)
        }
        return groupMap.values.toList()
    }
}
