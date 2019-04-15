package pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {

    private int xPos;
    private int yPos;
    private int width;
    private int height;

    private Color color;

    public Block() {

    }

    //add other Block constructors - x , y , width, height, color
    public Block(int x, int y, int w, int h, Color c){
        setPos(x,y);
        width = w;
        height = h;
        color = c;
        
    }
    public Block(int x, int y, int w, int h){
        setPos(x,y);
        width = w;
        height = h;
    }
    
    //add the other set methods
    public void setColor(Color col) {
        color = col;
    }
    public void setY(int y){
        yPos = y;
    }
    public void setX(int x){
        xPos = x;
    }
    public void setPos(int x, int y){
        yPos = y;
        xPos = x;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    

    public void draw(Graphics window) {
        //uncomment after you write the set and get methods
        window.setColor(color);
        window.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    public void draw(Graphics window, Color col) {
        
    }

    public boolean equals(Object obj) {
        Block test = (Block)obj;
        if(this.getY()==test.getY()&&this.getX()==test.getX()&&this.getHeight()==test.getHeight()&&this.getWidth()==test.getWidth()){
            return true;
        }
        
        return false;
    }

    //add the other get methods
    public int getY(){
        return yPos;
    }
    public int getX(){
        return xPos;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public Color getColor() {
        return color;
    }
    
    //add a toString() method  - x , y , width, height, color
    public String toString(){
        return "("+getX() + "," + getY() + ")" + " width - " + getWidth() + " height - " + getHeight() + " color - " + getColor();
    }
    

    
}
