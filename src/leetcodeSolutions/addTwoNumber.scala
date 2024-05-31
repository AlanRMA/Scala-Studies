// problem link: https://leetcode.com/problems/add-two-numbers/description/
object Solution {
    def convertToList(value: ListNode): List[Int] = {
        if (value != null)
        value.x :: convertToList(value.next)
        else
        List.empty[Int]
    }

    def convertToListNode(value: List[Int]): ListNode = {
        value match {
        case Nil => null
        case x :: xs => new ListNode(x, convertToListNode(xs))
        }
    }

    def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
        val numList1 = BigInt(convertToList(l1).reverse.mkString)
        val numList2 = BigInt(convertToList(l2).reverse.mkString)
        val linkMap = (numList1 + numList2).toString.toList.reverse
        convertToListNode(linkMap.map(_.toString.toInt))
    }
}