import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void whenThreeValues_AddedInBST_ShouldAddedinBST() {
		BinaryNode<Integer> firstBinaryNode = new BinaryNode<>(56);
		BinaryNode<Integer> secondBinaryNode = new BinaryNode<>(30);
		BinaryNode<Integer> thirdBinaryNode = new BinaryNode<>(70);
		firstBinaryNode.left = secondBinaryNode;
		firstBinaryNode.right = thirdBinaryNode;
		boolean result = firstBinaryNode.left.equals(secondBinaryNode) &&
				firstBinaryNode.right.equals(thirdBinaryNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void checkValues_AddedInBST_UsingSizeinBST() {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		binarySearchTree.add(22);
		binarySearchTree.add(40);
		binarySearchTree.add(60);
		binarySearchTree.add(95);
		binarySearchTree.add(11);
		binarySearchTree.add(65);
		binarySearchTree.add(3);
		binarySearchTree.add(16);
		binarySearchTree.add(63);
		binarySearchTree.add(67);
		int size = binarySearchTree.size();
		Assert.assertEquals(13, size);
	}
}
