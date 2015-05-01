package partition;

public class LinkedListNode {

	private LinkedListNode next;
	private int data;

	public LinkedListNode(int val){
		data = val;
		next = null;
	}

	public int getData(){
		return data;
	}
	
}