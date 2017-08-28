import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot r = new Robot();
	for(int i = 0;i< 150;i++) {		
	r.penDown();
	r.setSpeed(10);
	r.move(1);		
	r.setAngle(30);		
	
	}		
	
	for(int a = 0; a < 150; a++) 
	{
		r.setAngle(140);
		r.move(1);
		r.setAngle(30);
	}
	r.setAngle(260);
	r.move(100);
	}
}
