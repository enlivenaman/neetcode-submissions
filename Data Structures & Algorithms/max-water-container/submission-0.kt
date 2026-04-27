class Solution {
    fun maxArea(heights: IntArray): Int {
        var l = 0
        var r = heights.size - 1
        var res = 0

        while (l < r) {
            val area = minOf(heights[l], heights[r]) * (r - l)
            res = maxOf(res, area)
            if (heights[l] <= heights[r]) {
                l++
            } else {
                r--
            }
        }
        return res
    }
}
