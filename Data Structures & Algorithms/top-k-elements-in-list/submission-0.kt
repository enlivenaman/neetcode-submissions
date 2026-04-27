class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val freqMap = mutableMapOf<Int, Int>()

    for (num in nums) {
        freqMap[num] = freqMap.getOrDefault(num, 0) + 1
    }

    val minHeap = java.util.PriorityQueue<Pair<Int, Int>>(compareBy { it.second })

    for ((num, freq) in freqMap) {
        minHeap.offer(Pair(num, freq))
        if (minHeap.size > k) {
            minHeap.poll()
        }
    }

    return minHeap.map { it.first }.toIntArray()
}
}
