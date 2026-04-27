class Solution {

    fun encode(strs: List<String>): String {
        if (strs.isEmpty()) return "-1#"

        val sizes = mutableListOf<String>()
        for(str in strs) {
            sizes.add(str.length.toString())
        }
        return sizes.joinToString(",")+'#'+strs.joinToString("")
    }

    fun decode(str: String): List<String> {
        if(str == "-1#") return emptyList()

        val delimiterIndex = str.indexOf('#')
        val sizesStr = str.substring(0, delimiterIndex)
        val content = str.substring(delimiterIndex + 1)
        
        val sizes = sizesStr.split(",")

        val res = mutableListOf<String>()
        var i = 0
        for (sz in sizes) {
            if (sz.isEmpty()) continue
            val length = sz.toInt()
            res.add(content.substring(i, i + length))
            i += length
        }
        return res
    }
}