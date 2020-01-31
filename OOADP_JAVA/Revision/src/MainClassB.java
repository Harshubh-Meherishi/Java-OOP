import java.util.*;
public class MainClassB {

		public static void main(String args[])
		{
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i = 0;i<10;i++)
			{
				al.add(i);
			}
			Iterator<Integer> itr =  al.iterator();
			while(itr.hasNext())
			{
				int a = (Integer)(itr.next());
				System.out.println(" " + a + " ");
			}
		}
	
	}
