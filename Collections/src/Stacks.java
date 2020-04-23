import java.util.LinkedList;

public class Stacks {

	public static void main(String[] args) {
	
		LinkedList<Integer> ls= new LinkedList<Integer> ();
		
		ls.push(1);
		ls.push(2);
		ls.push(3);
		ls.push(4);
		
		while(!ls.isEmpty()) {
			System.out.println(ls.pop());
		}
	}

}