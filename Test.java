package uebungen;

public class Test {
	
	public static void main(String[] args) throws StackFullException, StackEmptyException {
		
		Stack<Integer> zahl = new Stack(8);
		Stack<String> text = new Stack(1);
		zahl.push(8);
		System.out.println(zahl.peek());
		text.push("Angelo du hs");
		text.push("Angelo noch immer ein hs");

	}
}
