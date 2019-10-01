package homework160505;

public class Human {
	private String name;
	private boolean sex;
	private boolean enoughSleep;
	
	public Human(String name, boolean sex, boolean enoughSleep) {
		this.name = name;
		this.sex = sex;
		this.enoughSleep = enoughSleep;
	}
	public void salutation() {
		if(enoughSleep) {
			System.out.println("Привет, как поживаешь, сегдня чудесный день");
		}else {
			System.out.println("Здорово");
		}	
		
	}
	

	public static void main(String[] args) {
		Human Bob = new Human("Bob", true, false);
		Bob.salutation();
		
		Human Mary = new Human("Mary", false, true);
		Mary.salutation();
	}
}
