// problem link: https://leetcode.com/problems/leaf-similar-trees/description/?envType=study-plan-v2&envId=leetcode-75
object Solution {
  def leafSimilar(root1: TreeNode, root2: TreeNode): Boolean = {
    // let's use tailrec
    @tailrec
    def leafs(nodes: List[TreeNode], acc: List[Int]): List[Int] = {
      nodes.headOption match {
        case Some(head) =>
          (Option(head.left), Option(head.right)) match {
            case (None, None) =>
              leafs(nodes.tail, head.value :: acc)
            case _ =>
              leafs(List(head.left, head.right).flatMap(Option(_)) ::: nodes.tail, acc)
          }
        case None =>
          acc
      }
    }

    leafs(Option(root1).toList, List.empty[Int]) == leafs(Option(root2).toList, List.empty[Int])
  }
}