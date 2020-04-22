
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

	public static void main(String[] args) {
	
		List<Integer> ls= new LinkedList<Integer> ();
		
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		
		for(int i=0;!ls.isEmpty();) {
			System.out.println(ls.get(i));
			ls.remove(ls.get(i));
		}
	}

}
