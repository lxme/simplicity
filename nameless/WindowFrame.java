import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;

public class WindowFrame extends JPanel{

	private BufferedImage image;
	private int x_location, y_location;

	public WindowFrame(BufferedImage image, int x_location, int y_location){
		this.image = image;
		this.x_location = x_location;
		this.y_location = y_location;
	}
	@Override
	public void paint(Graphics g){
		g.drawImage(image, x_location, y_location, null);
	}
}