import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MainClassC {

	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> bl = new ArrayList<Integer>();
		for(int i = 0;i<10;i++)
		{
			al.add(i);
		}
		ListIterator<Integer> itr =  al.listIterator();
		while(itr.hasNext())
		{
			int a = (Integer)(itr.next());
			System.out.println(a);
			bl.add(itr.previous());
			itr.next();
		
		}
			
		System.out.println(bl);
		

	}
}