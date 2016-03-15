/*
	This class is the main engine class. It contains all and does all! All hail the engine!
*/

public class Sprite{

	private int x_location, y_location, image_count, render_order, current_image;
	private Image[] images;
	private String filename;

	public Sprite(int x_location, int y_location, int image_count, int render_order, String filename){
		this.x_location = x_location;
		this.y_location = y_location;
		this.image_count = image_count;
		images = new Image[image_count];
		this.render_order = render_order;
		this.filename = filename;
		current_image = 0;
	}

	public int getX(){
		return x_location;
	}

	public int getY(){
		return y_location;
	}

	public int getRenderOrder(){
		return render_order;
	}

	public Image getImage(int image_number){
		return images[image_number];
	}

	public int getCurrentImage(){
		return current_image;
	}

	public String getFilename(){
		return filename;
	}

	public void getX(int x_location){
		this.x_location = x_location;
	}

	public void getY(int y_location){
		this.y_location = y_location;
	}

	public void getRenderOrder(int render_order){
		this.render_order = render_order;
	}

	public void addImage(int image_number, int x_location, int y_location, int width, int height){
		images[image_number] = new Image(x_location, y_location, width, height);
	}

	public void nextImage(){
		current_image = (current_image + 1) % images.length;
	}

	public void graw(){

	}

	public void animate(){

	}

}