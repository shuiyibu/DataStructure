/**
 * 
 */
package linkedlist;

/**
 * @author LJT
 *
 *         2016年3月9日 下午3:15:27
 */
public class Node
{
	private Node next = null;
	private int data;

	public Node(int data)
	{
		this.data = data;
	}

	void appendToTail(int data)
	{
		Node end = new Node(data);
		Node n = this;
		while (n.next != null)
		{
			n = n.next;
		}
		n.next = end;
	}

	Node deleteNode(Node head, int data)
	{
		Node n = head;
		if (n.data == data)
		{
			return n.next;
		}

		while (n.next != null)
		{
			if (n.next.data == data)
			{
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		
		return head;
	}

	/**
	 * @return the next
	 */
	public Node getNext()
	{
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node next)
	{
		this.next = next;
	}

	/**
	 * @return the data
	 */
	public int getData()
	{
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data)
	{
		this.data = data;
	}
	
	
}
