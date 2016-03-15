import java.util.*;
import java.io.IOException;
import java.lang.Thread;
/*
	This class is the main engine class. It contains all and does all! All hail the engine!
*/

public class Engine{

	private ArrayList<Sprite> sprites = new ArrayList<Sprite>();
	private boolean log_to_console;
	private Window window;
	private int refresh_rate;

	public Engine(String window_name, int x_location, int y_location, int width, int height){
		// Create game window
		window = new Window(window_name, x_location, y_location, width, height);
		refresh_rate = 30;
	}

	public void addSprite(int x_location, int y_location, int image_count, int render_order, int id, String filename, int image_x, int image_y, int width, int height){
		sprites.add( new Sprite(x_location, y_location, image_count, render_order, filename) );
		sprites.get(id).addImage(0, image_x, image_y, width, height);
	}

	public void addImageToSprite(int id, int image_count, int image_x, int image_y, int width, int height){
		sprites.get(id).addImage(image_count, image_x, image_y, width, height);
	}

	public void animateSprite(int sprite_id){
		window.animateSprite(sprites.get(sprite_id));
		sprites.get(sprite_id).nextImage();
	}

	public static void main(String[] args){
		Thread t = new Thread();
		t.start();
		Engine e1 = new Engine("Engine Tester", 10, 10, 800, 800);
		e1.addSprite(50, 100, 2, 0, 0, "C:/Users/Josh/Documents/GitHub/simplicity/nameless/test_image1.png", 0, 0, 20, 20);
		e1.addImageToSprite(0, 1, 20, 0, 20, 20);
		e1.animateSprite(0);
		try{
			t.sleep(1000);
		} catch (InterruptedException e){
			System.out.println(e);
		}
		e1.animateSprite(0);
	}

}