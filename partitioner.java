package partition;

public class partitioner {

	public static LinkedListNode partitionOnX(LinkedListNode n, int x){
		LinkedListNode head = n;
		LinkedListNode tail = n;



		tail.next = null;
		return head;
	}

	public static void main(String[] args) {
		LinkedListNode n = new LinkedListNode(1);
		System.out.println(n.getData());
	}

}