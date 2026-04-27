class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val res = IntArray(n)
        val prefArr = IntArray(n)
        val suffArr = IntArray(n)

        prefArr[0] = 1
        suffArr[n-1] = 1 
        for(i in 1 until n) {
            prefArr[i] = nums[i-1] * prefArr[i-1]
        }

        for(i in n-2 downTo 0) {
            suffArr[i] = nums[i+1] * suffArr[i+1]
        }

        for (i in 0 until n) {
            res[i] = prefArr[i]*suffArr[i]
        }

        return res
    }
}
