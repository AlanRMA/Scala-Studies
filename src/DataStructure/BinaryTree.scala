object BinaryTreeApp {

  // Data structure representing a node in the binary tree
  case class Node(value: Int, var left: Option[Node] = None, var right: Option[Node] = None)

  // Data structure representing a binary tree
  case class BinaryTree(rootNode: Node) {

    // Function to efficiently add a child node to a specific branch
    def addChild(value: Int, branch: String): Unit = {
      val newNode = Node(value)
      branch match {
        case "left" =>
          rootNode.left match {
            case Some(_) => println("Left branch already occupied!")
            case None => rootNode.left = Some(newNode)
          }
        case "right" =>
          rootNode.right match {
            case Some(_) => println("Right branch already occupied!")
            case None => rootNode.right = Some(newNode)
          }
        case _ => throw new IllegalArgumentException("Invalid branch specified. Use 'left' or 'right'.")
      }
    }

    // Recursive function to traverse and print the tree structure with indentation
    private def showTree(tree: BinaryTree, indent: String = ""): Unit = {
      println(indent + tree.rootNode.value)
      tree.rootNode.left.foreach(child => showTree(BinaryTree(child), indent + "  ")) // Recursive call for left branch
      tree.rootNode.right.foreach(child => showTree(BinaryTree(child), indent + "  ")) // Recursive call for right branch
    }

    // Public method to call the internal showTree function
    def printTree(): Unit = showTree(this) // Use 'this' to refer to current BinaryTree object
  }

  def main(args: Array[String]): Unit = {
    val myTree = BinaryTree(Node(2))
    println(s"Root node value: ${myTree.rootNode.value}") // String interpolation for clear output

    // Add child nodes using the addChild method
    myTree.addChild(3, "left")
    myTree.addChild(4, "right")
    myTree.addChild(5, "left") // Add to left branch of left child
    myTree.addChild(1, "right") // Add to right branch of left child
    try {
      myTree.addChild(2, "middle") // Handle invalid branch specification
    } catch {
      case e: IllegalArgumentException => println(e.getMessage)
    }

    println("Tree Structure:")
    myTree.printTree() // Call the public printTree method
  }
}
