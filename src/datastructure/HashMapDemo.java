/**
 * 
 */
package datastructure;

import java.util.HashMap;
import java.util.Map;

import model.Student;

/**
 * @author langdylan
 *
 *         Mar 6, 2016 3:18:11 PM
 */
public class HashMapDemo
{
	public Map<Integer, Student> buildMap(Student[] students)
	{

		Map<Integer, Student> map = new HashMap<Integer, Student>();
		for (Student student : students)
		{
			map.put(student.getId(), student);
		}

		return map;

	}
	

}
