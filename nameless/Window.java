/*
	This class is what handles the rendering of images on screen
*/

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class Window extends JFrame{

	private String window_name;

	public Window(String window_name, int x_location, int y_location, int width, int height){
		this.window_name = window_name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(window_name);
		setSize(width, height);
		setLocation(x_location, y_location);
		setVisible(true);
	}

	public void animateSprite(Sprite sprite){
		try{
			BufferedImage big_image = ImageIO.read(new File(sprite.getFilename()));
			BufferedImage image = big_image.getSubimage(sprite.getImage(sprite.getCurrentImage()).getX(),
														sprite.getImage(sprite.getCurrentImage()).getY(),
														sprite.getImage(sprite.getCurrentImage()).getWidth(),
														sprite.getImage(sprite.getCurrentImage()).getHeight());
			add(new WindowFrame(image, sprite.getX(), sprite.getY()));
			revalidate();
		}catch(IOException e){
			System.out.println("Exception thrown: " + e);
		}
	}

}