import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicTwo extends JFrame{
	private Random rand = new Random();
	private Font font = new Font ("Courier New", 1 , 18);
	public void paint(Graphics g){
		super.paint(g);
		int xRatio = (int)((getWidth()/500.0) * 50);
		int yRatio = (int)((getHeight()/500.0) * 50);
		g.setFont (font);
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if((i + j) % 2 == 1){
					g.setColor(new Color(180+rand.nextInt(75), 180+rand.nextInt(75), 180+rand.nextInt(75)));
					g.fillRect((j+1)*xRatio, (i+1)*yRatio, xRatio, yRatio);
				}
				g.setColor(Color.BLACK);
				g.drawString ("" + (i * 8 + j + 1), ((i * 8 + j + 1) > 9 ? xRatio/2-10 : xRatio/2-4) + xRatio+(j*xRatio), (yRatio/2+5) + (i+1)*yRatio);
			}
		}
		g.drawRect(xRatio, yRatio, (8*xRatio), (8*yRatio));
	}
}
