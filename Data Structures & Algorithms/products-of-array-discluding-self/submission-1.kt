class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val res = IntArray(n) { 1 }

        // Prefix pass
        var prefix = 1
        for (i in 0 until n) {
            res[i] = prefix
            prefix *= nums[i]
        }

        // Postfix pass
        var postfix = 1
        for (i in n - 1 downTo 0) {
            res[i] *= postfix
            postfix *= nums[i]
        }

        return res
    }
}
