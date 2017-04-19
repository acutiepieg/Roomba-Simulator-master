package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(500,500);
		sleep(2750);
		driveDirect(-500,500);
		sleep(550);
		driveDirect(0,0);
		driveDirect(1000,1000);
		sleep(3500);
		driveDirect(500,0);
		sleep(700);
		driveDirect(500,500);
	}

	public void loop() {
	
	}
}
