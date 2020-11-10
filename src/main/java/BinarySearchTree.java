
public class BinarySearchTree<K extends Comparable<K>>{
	private BinaryNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursively(root, key); 
	}
	
	private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
		if(current == null) {
			return new BinaryNode<K>(key);
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0) {
			return current;
		}
		else if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		}
		else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}
	
	public int size() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(BinaryNode<K> current) {
		if(current == null) {
			return 0;
		}
		else {
			return 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
		}
	}
	
	public boolean search(K key) {
		if(searchRecursively(root, key) != null) {
			return true;
		}
		return false;
	}
	
	public BinaryNode<K> searchRecursively(BinaryNode<K> current, K key) {
		if(current == null) {
			return null;
		}
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0) {
			return current;
		}
		else if (compareResult < 0) {
			return searchRecursively(current.left, key);
		} 
		else {
			return searchRecursively(current.right, key);
		}
	}
	
}
