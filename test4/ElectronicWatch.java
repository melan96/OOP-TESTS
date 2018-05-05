package test4;

public class ElectronicWatch extends Watch{

	public ElectronicWatch(int hours,int minutes,int seconds){
		super(hours,minutes,seconds);
	}
	
	public void display(){
		System.out.println("Time is HH"+this.hours+" MM "+this.minutes+" SS "+this.seconds);
	}
	
	public void stopWatchOff(){
		System.out.println("stopwatch off Called");
	}

	public void stopWatchOn(){
		System.out.println("stopwatch on Called");

	}
}
