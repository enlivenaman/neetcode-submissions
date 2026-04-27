class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        var hasDuplicate: Boolean = false
        for (n in nums){
            if(!set.add(n)) return true
        }
        return hasDuplicate
    }
}
