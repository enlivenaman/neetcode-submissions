class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val fMap = HashMap<Int,Int>()
        val fList = mutableListOf<Pair<Int,Int>>()

        for (num in nums) {
            fMap[num] = fMap.getOrDefault(num, 0) + 1
        }

        for ((num, freq) in fMap) {
            fList.add(Pair(freq, num))
        }

        fList.sortByDescending(){it.first}
        
        val iArr = IntArray(k)
        for (i in 0 until k) {
            iArr[i] = fList[i].second
        }

        return iArr
    }
}
