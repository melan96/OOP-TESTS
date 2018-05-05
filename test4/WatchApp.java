package test4;

public class WatchApp{


	public static void main(String[] args){
		

		Watch ew = new ElectronicWatch(4,51,15);
		ew.display();
		
		SmartWatch sm = new SmartWatch(5,22,35);

		sm.answerMobileCall();
		sm.stopWatchOff();
		sm.stopWatchOn();
		sm.display();
		
		

	}


}