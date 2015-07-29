package ProjectileMotion;

public class QuestionRandomizer
{
	public static void getQuestions()
	{
		
	}
	public static String soccerball()
	{
		int y = (int)(200.0*Math.random())+1;
		int x = (int)(200.0*Math.random())+1;
		double answer = x/Math.sqrt((y/4.9));
		String str = "<html>>>>A soccer ball is kicked horizontally off a "+y+"-meter <br>"
				+ "high hill and lands a distance of "+x+" meters from the edge of<br>"
				+ "the hill. Determine the initial horizontal velocity of the soccer<br>"
				+ "ball.<br>"
				+ "A: "+(answer+1)+" m/s<br>"
				+ "B: "+(answer-1)+" m/s<br>"
				+ "C: "+(answer+5.3)+" m/s<br>"
				+ "D: "+(answer)+" m/s<br>"
				+ "Answer: D<br>"
				+ "-----------------------------------------------------------------------</html>";
		return str;
	}
	public static String poolball()
	{
		int vx = (int)(10.0*Math.random())+1;
		int y = (int)(5.0*Math.random())+1;
		double time = Math.sqrt((y/4.9));
		double x = (double)vx*time;
		String str = "<html>>>>A pool ball leaves a "+y+"-meter high table with an initial <br>"
				+ "horizontal velocity of "+vx+" m/s. Predict the time required for the<br>"
				+ "pool ball to fall to the ground and the horizontal distance between the<br>"
				+ "table's edge and the ball's landing location.<br>"
				+ ">>Answers: Time = "+time+" seconds. <br>"
				+ ">>Horizontal Distance = "+x+" m<br>"
				+ "-----------------------------------------------------------------------</html>";
		return str;
	}
	public static String football()
	{
		int v = (int)(200.0*Math.random())+1;
		int angle = (int)((90.0*Math.random())+1);
		double radAngle = angle*(Math.PI/180);
		double time = (2*(v*Math.sin(radAngle)))/9.81;
		double x = (v*Math.cos(radAngle))*time;
		double y = ((v*Math.sin(radAngle))*(time/2)) - (4.9*(time/2)*(time/2));
		String str = "<html>>>>A football is kicked with an initial velocity of "+v+" m/s at an<br>"
				+ "angle of "+angle+"-degrees with the horizontal. Determine the time of flight,<br>"
				+ "the horizontal displacement, and the peak height of the football.<br>"
				+ ">>Answers: Time = "+time+" seconds<br>"
				+ ">>X-Displacement = "+x+" m<br>"
				+ ">>Peak Height = "+y+" m<br>"
				+ "-----------------------------------------------------------------------</html>";
		return str;
	}
	public static String longJumper()
	{
		int v = (int)(30.0*Math.random())+1;
		int angle = (int)((70.0*Math.random())+1);
		double radAngle = angle*(Math.PI/180);
		double time = (2*(v*Math.sin(radAngle)))/9.81;
		double x = (v*Math.cos(radAngle))*time;
		double y = ((v*Math.sin(radAngle))*(time/2)) - (4.9*(time/2)*(time/2));
		String str = "<html>>>>A long jumper leaves the ground with an initial velocity of<br>"
				+v+" m/s at an angle of "+angle+"-degrees above the horizontal. Determine the<br>"
				+ "time of flight, the horizontal distance, and the peak height of the<br>"
				+ "long-jumper.<br>"
				+ ">>Answers: Time = "+time+" seconds<br>"
				+ ">>X-Displacement = "+x+" m<br>"
				+ ">>Peak Height = "+y+" m<br>"
				+ "-----------------------------------------------------------------------</html>";
		return str;
	}
	public static String cannon()
	{
		int x = (int)(200.0*Math.random())+1;
		int angle = (int)((90.0*Math.random())+1);
		double radAngle = angle*(Math.PI/180);
		double answer = Math.sqrt((9.81*x)/(2*Math.cos(radAngle)*Math.sin(radAngle)));
		String str = "<html>>>>A cannon is shot at an angle "+angle+" degrees and<br>"
				+ "and lands horizontally "+x+" meters away. Find Initial Velocity.<br>"
				+ "A: "+(answer+1)+" m/s<br>"
				+ "B: "+(answer-1)+" m/s<br>"
				+ "C: "+(answer)+" m/s<br>"
				+ "D: "+(answer+5.3)+" m/s<br>"
				+ "Answer: C<br>"
				+ "-----------------------------------------------------------------------</html>";
		return str;
	}
	public static String rocket()
	{
		int v = (int)(200.0*Math.random())+1;
		int angle = (int)((90.0*Math.random())+1);
		double radAngle = angle*(Math.PI/180);
		double range = (2*v*v*Math.sin(radAngle)*Math.cos(radAngle))/9.8;
		double time = (v*Math.sin(radAngle))/9.8;
		String str = "<html>>>>A rocket is fired at an angle "+angle+" degrees and<br>"
				+ "and initial velocity "+v+" m/s. Find the place where it lands and<br>"
				+ "the time taken.<br>"
				+ ">>Answers: Distance = "+range+" meters.<br>"
				+ ">>Time = "+time+" seconds.<br>"
				+ "-----------------------------------------------------------------------</html>";
		return str;
	}
}
