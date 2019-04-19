package pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;

public class Ball extends Block// implements Collidable
{

    private int xSpeed;
    private int ySpeed;

    public Ball() {
        super(200, 200);
        xSpeed = 3;
        ySpeed = 1;
    }
    
    public Ball(int xp, int yp){
        super(xp, yp);
        xSpeed = 3;
        ySpeed = 1;
    }
    
    public Ball(int xp, int yp, int wid, int hei){
        super(xp, yp);
        setWidth(wid);
        setHeight(hei);
        xSpeed = 3;
        ySpeed = 1;
    }
    
    public Ball(int xp, int yp, int wid, int hei, Color col){
        super(xp, yp);
        setWidth(wid);
        setHeight(hei);
        setColor(col);
        xSpeed = 3;
        ySpeed = 1;
    }
    
    public Ball(int xp, int yp, int wid, int hei, Color col, int xs, int ys){
        super(xp, yp);
        setWidth(wid);
        setHeight(hei);
        setColor(col);
        xSpeed = xs;
        ySpeed = ys;
    }
    
    //colliding stuff
    boolean didCollideLeft(Object obj){
        Block bl = (Block) obj;
        if(this.getY()>=bl.getY()&&this.getY()<=bl.getHeight()||this.getY()+this.getHeight()<=bl.getY()+bl.getHeight()&&this.getY()+this.getHeight()>=bl.getY()){
            if(this.getX() + this.getWidth() == bl.getX() + Math.abs(this.xSpeed)){
                return true;
            }
        }
        return false;  
       
    }
    boolean didCollideRight(Object obj){
        Block bl = (Block) obj;
        if(this.getY()>=bl.getY()&&this.getY()<=bl.getHeight()||this.getY()+this.getHeight()<=bl.getY()+bl.getHeight()&&this.getY()+this.getHeight()>=bl.getY()){
            if(this.getX() == bl.getX() + bl.getWidth()+ Math.abs(this.xSpeed)){
                return true;
            }
        }
        return false;  
       
    }
    boolean didCollideBottom(Object obj){
        Block bl = (Block) obj;
        if(this.getX()>=bl.getX()&&this.getX()<=bl.getWidth()||this.getX()+this.getWidth()<=bl.getX()+bl.getWidth()&&this.getX()+this.getWidth()>=bl.getX()){
            
            if(this.getY() == bl.getY() + bl.getHeight()+ Math.abs(this.ySpeed)){
                return true;
            }
            
        }
        return false;  
       
    }
    boolean didCollideTop(Object obj){
        Block bl = (Block) obj;
        if(this.getX()>=bl.getX()&&this.getX()<=bl.getWidth()||this.getX()+this.getWidth()<=bl.getX()+bl.getWidth()&&this.getX()+this.getWidth()>=bl.getX()){
            
            if(this.getY() + this.getHeight() == bl.getY() + Math.abs(this.ySpeed)){
                return true;
            }
            
        }
        return false;  
       
    }
    
    
    
    //add the other Ball constructors
    //add the set methods
    public void moveAndDraw(Graphics window) {
        //draw a white ball at old ball location
        window.setColor(Color.WHITE);
        window.fillRect(getX(), getY(), getWidth(), getHeight());
        setX(getX() + getxSpeed());
        //setY
        setY(getY() + getySpeed());

        //draw the ball at its new location
        window.setColor(getColor());
        window.fillRect(getX(), getY(), getWidth(), getHeight());
        
    }

    public boolean equals(Object obj) {
        Ball test = (Ball) obj;
        if(this.getX() == test.getX() && this.getY() == test.getY() && this.getxSpeed() == test.getxSpeed() && this.getySpeed() == test.getySpeed() && this.getHeight() == test.getHeight() && this.getWidth() == test.getWidth()){
            return true;
        }
        return false;
    }

    //add the get methods
    //add a toString() method

    /**
     * @return the xSpeed
     */
    public int getxSpeed() {
        return xSpeed;
    }

    /**
     * @param xSpeed the xSpeed to set
     */
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * @return the ySpeed
     */
    public int getySpeed() {
        return ySpeed;
    }

    /**
     * @param ySpeed the ySpeed to set
     */
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    
    public String toString(){
        return super.toString() + " " + getxSpeed() + " " + getySpeed();
    }
}
