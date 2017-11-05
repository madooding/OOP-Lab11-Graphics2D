import java.awt.*;
import javax.swing.JFrame;

public class GraphicOne extends JFrame {
    private int size = 7;
    private int offset = 10;
	public void paint(Graphics g){
		for(int i = 0; i <= this.size; i++){
            g.setColor(Color.BLUE);
		    g.fillRect(50, 50*(i+1), 50*(this.size-i), 50);
		    g.setColor(Color.RED);
		    g.fillRect((1+this.size-i)*50+this.offset, 50*(i+1)+this.offset, 50*i, 50);
        }
	}
}
