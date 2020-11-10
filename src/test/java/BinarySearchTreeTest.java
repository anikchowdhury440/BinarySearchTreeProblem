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
}
