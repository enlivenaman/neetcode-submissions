class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size - 1

        while (l < r) {
            val m = (l + r) / 2
            if (nums[m] > nums[r]) {
                l = m + 1
            } else {
                r = m
            }
        }

        val pivot = l

        fun binarySearch(left: Int, right: Int): Int {
            var left = left
            var right = right
            while (left <= right) {
                val mid = (left + right) / 2
                when {
                    nums[mid] == target -> return mid
                    nums[mid] < target -> left = mid + 1
                    else -> right = mid - 1
                }
            }
            return -1
        }

        var result = binarySearch(0, pivot - 1)
        if (result != -1) {
            return result
        }

        return binarySearch(pivot, nums.size - 1)
    }
}