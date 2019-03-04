import java.util.*;
public class Insertion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> ls = new LinkedList<String>();
		List<String> ls2 = new LinkedList<String>();
		System.out.println("How many elements you want to enter ?");
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			ls.add(s.next());
		}
		
//		Collections.sort(ls);
		
		System.out.println("Element present in a list is "+ ls);
		System.out.println("Enter the position between 1 to " + n++);
		int pos = s.nextInt()-1;
//		if(pos>0 && pos<n+1) {
		System.out.println("Enter Numeric element");
		String element = s.next();
		ls2.add(element);
		ls.addAll(pos,ls2);
		System.out.println("New List"+ ls);
//		}
//		else
//			System.out.println("Enter Valid position !!!");
		System.out.println("Enter the position to delete node");
		int delete = s.nextInt()-1;
		ls.remove(delete);
		Iterator<String> itr = ls.iterator();
		System.out.println("Element after delete ");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
		
		s.close();
	}
}
