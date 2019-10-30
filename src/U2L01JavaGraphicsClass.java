import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class U2L01JavaGraphicsClass extends JPanel {
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Canvas");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//allows you to close the window

	    U2L01JavaGraphicsClass panel = new U2L01JavaGraphicsClass();
	    
	    frame.add(panel);//allows you to draw

	    frame.setSize(500, 500); // changes size of window
	    frame.setVisible(true); // makes the lines visible

	}
	
	public void paintComponent(Graphics g){
		//Color niceSky = new Color(130, 169, 232);
		
		//g.drawLine(0,0,50,50);  //draws the line  
		//g.setColor(niceSky); // changes the color of the 
		//g.drawLine(50,0,50,75);
		//g.setFont (new Font("Arial", Font.BOLD, 32));//name of font, fond boldness, size of font
		//g.drawString("Yay", 50,100);// makes words, x, y of 
		
		//Makes ombre background
		int yOfLine = 0;
		
		for (int i = 0; i<250; i++) {
			int changeOfBlue = 255 - i;
			Color hi = new Color(171, 255, changeOfBlue);
			g.setColor(hi);
			//g.drawLine(0,yOfLine, 500,yOfLine);
			g.fillRect(0,  yOfLine, 500, 3);
			yOfLine += 3;
			//changeOfBlue ++;	
		}
		
		Color beam = new Color (255, 255, 255); // make beam
		g.setColor(beam);
		int x []= {250,200,300};
		int y []= {190, 450, 450};
		g.fillPolygon(x,y,3);
		
		
		
		Color spaceship = new Color(214, 214, 214);//makes body of spaceship
		g.setColor(spaceship);
		g.fillOval(100, 150, 300, 100);
		
		Color topspaceship = new Color (100, 200, 100); // make beam
		g.setColor(topspaceship);
		g.fillOval(150, 130, 200, 75);
		
		g.setColor(spaceship);
		g.fillOval(230,145,40,40);
		
	}

}
