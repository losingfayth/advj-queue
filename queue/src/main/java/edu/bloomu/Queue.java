package edu.bloomu;

/**
 * Implmenents a Queue data structure following in a first in, first out policy.
 * 
 * @author fayth quinn
 */

public class Queue<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private int size;

	public Queue()
	{
		head = null;
		tail = null;
		size = 0;
	}

	/**
	 * Adds the provided object to the end of the Queue
	 * 
	 * @param obj Object to be added
	 */
	void queue(T obj)
	{
		if (size == 0)
		{
			head = new Node<T>(obj, null);
			tail = head;
		}
		else
		{
			tail.setLink(new Node<T>(obj, null));
			tail = tail.getLink();
		}

		size++;
	}

	/**
	 * Removes the first item in the Queue and returns its data
	 * 
	 * @return Data of the removed object in the Queue
	 */
	T deQueue()
	{
		if (size == 0) return null;

		T out = head.getData();
		head = head.getLink();
		size--;

		return out;
	}

	/**
	 * @return The size of the Queue
	 */
	int size()
	{
		return size;
	}

	/**
	 * Returns the data of the first item in the Queue without removing it
	 * 
	 * @return The data of the first item in the Queue
	 */
	T peek()
	{
		if (size == 0) return null;

		return head.getData();
	}

	/**
	 * Searches the Queue for an item
	 * 
	 * @param obj The item to be searched for
	 * @return True if the item is in the Queue, False Otherwise
	 */
	boolean contains(T obj)
	{
		for (Node<T> n = head; n != null; n = n.getLink())
		{
			if (n.getData().equals(obj)) return true;
		}

		return false;
	}

	/**
	 * @return True if the Queue is empty, False otherwise
	 */
	boolean empty()
	{
		return size == 0;
	}

	/**
	 * Clears the Queue of all objects
	 */
	void clear()
	{
		while (deQueue() != null);
	}

}
