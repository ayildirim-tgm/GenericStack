package uebungen;

public class Stack<T> {
	
	//Der Stack wird als Array von Objekten gespeichert
	private Object[] stack;
	//Basic Konstruktor
	public Stack() {
		 
	}
	//Konstruktor bei dem man die Größe vom Stack einstellt
	public Stack(int platz) {
		
		this.stack = new Object[platz];
		
	}
	//Gibt das zuletzt gespeicherte Element zurück aber löscht es nicht.
	//Wirft eine Exception, wenn versucht wird etwas zurückzugeben Obwohl der Stack leer ist.
	public Object peek() throws StackEmptyException {
		
		if(this.stack.length == 0 || this.stack[0] == null) {
			
			throw new StackEmptyException("Der Stack ist leer");
			
		}
		for(int i = 0; i < this.stack.length; i++) {
			
			if(this.stack[i] == null) {
				
				return this.stack[i-1];
				
			}
		}
		return this.stack[this.stack.length-1];
		
	}
	//Gibt das zuletzt gespeicherte Element zurück und löscht es.
	//Wirft eine Exception, wenn versucht wird etwas zurückzugeben Obwohl der Stack leer ist.
	public Object pop() throws StackEmptyException {
		
		if(this.stack.length == 0 || this.stack[0] == null) {
			
			throw new StackEmptyException("Dieser Stack ist leer");
			
		}
		for(int i = 0; i < this.stack.length; i++) {
			
			if(this.stack[i] == null) {
				Object perm = this.stack[i-1];
				this.stack[i-1] = null;
				return perm;
				
			}
		}
		Object perm = this.stack[this.stack.length -1];
		this.stack[this.stack.length -1] = null;
		return perm;
	}
	//Speichert ein Element auf den Stack
	//Wirft eine Exception wenn man etwas auf den Stack speichern will obwohl er voll ist
	public void push(Object drauf) throws StackFullException {
		
		//Geht den stack durch und sobald eine stelle leer ist wird das element dorthin gespeichert
		for(int i = 0; i < this.stack.length; i++) {
			
			if(this.stack[i] == null) {
				
				this.stack[i] = drauf;
				return;
			}
		}
		
		throw new StackFullException("Der Stack ist voll");
		
		
	}
	
	public String list() {
		
		String liste = "";
		for(int i = 0; i < this.stack.length; i++) {
			
			if(this.stack[i] != null) {
				
				liste += this.stack[i].toString() + "; ";
			}
		}
		return liste;
		
	}
	
}
