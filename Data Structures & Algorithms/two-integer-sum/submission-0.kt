class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var diffMap = mutableMapOf<Int, Int>()
        for(i in nums.indices) {
            val difference = target - nums[i]
            if(diffMap.containsKey(difference)) {
                val j = diffMap[difference]!!
                return intArrayOf(minOf(i, j), maxOf(i, j))
            }
            diffMap[nums[i]] = i
        }
        return intArrayOf()
    }
}