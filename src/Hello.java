
public class Hello {

	public String greeting;
	
	public Hello(String greeting) {
		this.greeting = greeting;
	}
	
	public void display() {	
		System.out.println(greeting);
	}
	public static void main(String[] args) {
		Hello hi = new Hello("Hi there stranger!");
		hi.display();
	}

}
