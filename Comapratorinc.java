import java.util.Comparator;
import java.util.TreeSet;
class student
{
	int id;
	int age;
	public student(int id,int age) {
		this.id=id;
		this.age=age;
	}
	public String toString() {
		return "student [id=" + id + ", age=" + age + "]";
	}
}
	class sortbyid implements Comparator<student>
	{
		public int compare(student o1, student o2) {
			return o2.id-o1.id;
		}
	}
	class sortbyage implements Comparator<student>
	{
		public int compare(student o1, student o2) {
			return o2.id-o1.id;
		}
	}
public class Comapratorinc {
	public static void main(String[] args) {
		student s=new student(1, 23);
		student s1=new student(2, 40);
    student s2=new student(3, 20);
		sortbyid d=new sortbyid();
		TreeSet<student> a=new TreeSet<student>(d);
		a.add(s);
		a.add(s1);
    a.add(s2);
		for(student p:a)
		{
			System.out.println(p);
		}
		sortbyage q=new sortbyage();
		TreeSet<student> t=new TreeSet<student>(q);
		for(student w:a)
		{
			System.out.println(w);
		}
	}
}