package test4;

public abstract class Watch{

	protected int hours;
	protected int minutes;	
	protected int seconds;

	public abstract void display();

	public Watch(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}


}
