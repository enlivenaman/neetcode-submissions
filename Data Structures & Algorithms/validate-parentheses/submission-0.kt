class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val closeToOpen = hashMapOf(')' to '(',']' to '[', '}' to '{')

        for(c in s){
            if (c in closeToOpen) {
                if(stack.isNotEmpty() && stack.first == closeToOpen[c]) {
                    stack.removeFirst()
                } else {
                    return false
                }
            } else {
                stack.addFirst(c)
            }        
        }
        return stack.isEmpty()
    }
}
