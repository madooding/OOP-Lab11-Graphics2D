import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lab11Main{
	
	public static void main(String[] args) {
//		GraphicOne f = new GraphicOne();
		GraphicTwo f = new GraphicTwo();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.getContentPane().add(new JPanel());
		f.getContentPane().setBackground(Color.BLACK);
		f.setVisible(true);
	}
}
