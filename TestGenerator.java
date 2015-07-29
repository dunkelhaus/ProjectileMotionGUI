package ProjectileMotion;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class TestGenerator
{
	JFrame appFrame = new JFrame("Projectile Motion Question Generator");
	JMenuBar appMenuBar;
	String[] strClassInfo = null;
	JTextField[] fields = null;
	
	public void displayApp()throws IOException 
	{
		//set the application icon
		BufferedImage image = null;
		try
    	{
        	image = ImageIO.read(appFrame.getClass().getResource("/projectile_diagram.gif"));
	    }catch (IOException e)
	    {
	    	e.printStackTrace();
	    }
		JButton bMC = new JButton("Multiple Choice");
	    bMC.setToolTipText("2 questions at a time");
	    
	    bMC.addActionListener(new ActionListener()
		   {
		   public void actionPerformed(ActionEvent e)
		   {
			   JFrame MCFrame = new JFrame("Multiple Choice Questions");
			   JPanel panelLabel = new JPanel();
			   panelLabel.setBounds(800, 800, 500, 500);
			   JLabel question = new JLabel();
			   question.setText(QuestionRandomizer.soccerball());
			   question.setFont(new Font("Serif", Font.PLAIN, 16));
			   JLabel question2 = new JLabel();
			   question2.setText(QuestionRandomizer.cannon());
			   question2.setFont(new Font("Serif", Font.PLAIN, 16));
			   
			   panelLabel.add(question);
			   panelLabel.add(question2);
			   MCFrame.add(panelLabel);
			   MCFrame.setSize(500, 500);
			   MCFrame.setVisible(true);
			   
		   }
	   });
	    
	    JButton bFR = new JButton("Free Response");
	    bFR.setToolTipText("4 questions at a time");
	    
	    bFR.addActionListener(new ActionListener()
		   {
		   public void actionPerformed(ActionEvent e)
		   {
			   JFrame FRFrame = new JFrame("Free Response Questions");
			   JPanel panelLabel = new JPanel();
			   panelLabel.setBounds(800, 800, 500, 500);
			   JLabel question = new JLabel();
			   question.setText(QuestionRandomizer.rocket());
			   question.setFont(new Font("Serif", Font.PLAIN, 16));
			   JLabel question2 = new JLabel();
			   question2.setText(QuestionRandomizer.poolball());
			   question2.setFont(new Font("Serif", Font.PLAIN, 16));
			   JLabel question3 = new JLabel();
			   question3.setText(QuestionRandomizer.football());
			   question3.setFont(new Font("Serif", Font.PLAIN, 16));
			   JLabel question4 = new JLabel();
			   question4.setText(QuestionRandomizer.longJumper());
			   question4.setFont(new Font("Serif", Font.PLAIN, 16));
			   
			   panelLabel.add(question);
			   panelLabel.add(question2);
			   panelLabel.add(question3);
			   panelLabel.add(question4);
			   FRFrame.add(panelLabel);
			   FRFrame.setSize(500, 700);
			   FRFrame.setVisible(true);
		   }
	   });
	    JPanel panelButton = new JPanel();
	    JLabel label = new JLabel();
	    label.setText("<html>The buttons alongside generate multiple choice and free response<br>"
	    		+ "questions respectively. Two multiple choice questions and four<br>"
	    		+ "free response questions at a time.<br>"
	    		+ "More coming soon.</html>");
	    label.setFont(new Font("Style", Font.ITALIC, 14));
	    
	    JLabel lab = new JLabel();
	    lab.setText("Projectile Motion Questions");
	    lab.setFont(new Font("Style", Font.TRUETYPE_FONT, 50));
	    BufferedImage img = null;
		try
    	{
        	img = ImageIO.read(appFrame.getClass().getResource("/cone_altglass_21.gif"));
	    }catch (IOException e)
	    {
	    	e.printStackTrace();
	    }
		JLabel picLabel = new JLabel(new ImageIcon(img));
		
	    bMC.setBounds(60, 200, 220, 30);
	    bFR.setBounds(60, 100, 220, 30);
	    panelButton.setBounds(800, 800, 200, 100);
	    panelButton.add(lab);
	    panelButton.add(label);
	    panelButton.add(bMC);
	    panelButton.add(bFR);
	    panelButton.add(picLabel);
	    appFrame.add(panelButton);
	    appFrame.setIconImage(image);
	    appFrame.setSize(700, 700);
	    appFrame.setVisible(true);
	    appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
