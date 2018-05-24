package hello;

public class Greetings {
	
	public Greetings() {}
	
	public Greetings(String greeting, Integer value) {
		super();
		this.greeting = greeting;
		this.value = value;
	}

	public String greeting;
	
	public Integer value;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
