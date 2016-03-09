/**
 * 
 */
package linkedlist.examples;

import java.awt.List;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

import linkedlist.Node;

/**
 * @author LJT
 *
 *         2016年3月9日 下午3:31:54
 */
public class DeleteDups
{
	public static <E> LinkedList<E> deleteDups(LinkedList<E> n)
	{
		Set<E> set = new HashSet<>();

		ListIterator<E> iter = n.listIterator();

		while (iter.hasNext())
		{
			E element = (E) iter.next();

			if (set.contains(element))
			{
				n.remove();
			}
		}

		return n;
	}

	public static void main(String[] args)
	{
		LinkedList<String> words = new LinkedList<String>();
		words.add("Hello");
		words.add("World");
		words.add("Hello");
		words.add("Java");
		System.out.println(words);
		System.out.println("-------------");
		
		System.out.println(DeleteDups.deleteDups(words));
	}

}
