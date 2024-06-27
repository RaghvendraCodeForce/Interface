package interfaceProject;

import java.util.Arrays;

public class Class11 implements Student{

	private int id;
	private static int idgen = 501;
	private String name;
	
	private int[] marks; // 5 subject marks
	
	public Class11()
	{
		id = idgen++;
	}
	
	public Class11(String name, int[] marks)
	{
		this();
		this.name = name;
		this.marks = marks;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public double findPercentage() {
		
		int total = 0;
		
		for(int i=0;i<marks.length;i++)
		{
			total += marks[i];
		}
		
		double percentage = (total/(marks.length*100.0))*100.0;
		
		return percentage;
	}

	@Override
	public String toString() {
		return "Class11 [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", findPercentage()="
				+ findPercentage() + "]";
	}

}
