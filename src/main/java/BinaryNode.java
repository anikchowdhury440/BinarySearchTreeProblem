
public class BinaryNode<K extends Comparable<K>> {
	private K key;
	private BinaryNode<K> left;
	private BinaryNode<K> right;
	
	public BinaryNode(K key) {
		this.setKey(key);
		this.setLeft(null);
		this.setRight(null);
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public BinaryNode<K> getLeft() {
		return left;
	}

	public void setLeft(BinaryNode<K> left) {
		this.left = left;
	}

	public BinaryNode<K> getRight() {
		return right;
	}

	public void setRight(BinaryNode<K> right) {
		this.right = right;
	}
}
