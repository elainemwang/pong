package pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
    //instance variables
    
    private int speed;

    public Paddle() {
        super(10, 10);
        speed = 5;
    }
    public Paddle(int x, int y, int sp){
        super(x,y);
        speed = sp;
        
    }
    public Paddle(int x, int y){
        super(x,y);
        speed = 5;
    }
    public Paddle(int x, int y, int wid, int height, int sp){
        super(x,y);
        setWidth(wid);
        setHeight(height);
        speed = sp;
    }
    public Paddle(int x, int y, int wid, int height, Color col, int sp){
        super(x,y);
        setWidth(wid);
        setHeight(height);
        speed = sp;
        setColor(col);
    }
    

    //add the other Paddle constructors
    public void moveUpAndDraw(Graphics window) {
        window.setColor(Color.WHITE);
        window.fillRect(getX(), getY(), getWidth(), getHeight());
        setY(getY() - getSpeed());
        
        window.setColor(getColor());
        window.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    public void moveDownAndDraw(Graphics window) {
        window.setColor(Color.WHITE);
        window.fillRect(getX(), getY(), getWidth(), getHeight());
        setY(getY() + getSpeed());
        
        window.setColor(getColor());
        window.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    //add get methods
    public int getSpeed(){
        return speed;
    }
    //add a toString() method
    public String toString(){
        return "("+getX() + "," + getY() + ")" + " width - " + getWidth() + " height - " + getHeight() + " color - " + getColor() + " " + getSpeed();
    }
}
