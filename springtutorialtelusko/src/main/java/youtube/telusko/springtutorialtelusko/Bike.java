package youtube.telusko.springtutorialtelusko;


public class Bike implements Vehicle{
	
	private int speed;
	
	public Bike() {
	}
	
	public Bike(int speed) {
		super();
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

	public void ride()
	{
		System.out.println("I am riding this Bike at "+speed+"kmph.");
	}

	public void drive() {

		System.out.println("I am driving a Bike");
		
	}

}
