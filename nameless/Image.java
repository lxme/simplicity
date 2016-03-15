/*
	This class contains information about an image.
*/

public class Image{

	private int x_location, y_location, width, height;

	public Image(int x_location, int y_location, int width, int height){
		this.x_location = x_location;
		this.y_location = y_location;
		this.width = width;
		this.height = height;
	}

	public void setX(int x_location){
		this.x_location = x_location;
	}

	public void setY(int y_location){
		this.y_location = y_location;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getX(){
		return x_location;
	}

	public int getY(){
		return y_location;
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

}