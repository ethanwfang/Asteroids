import processing.core.PApplet;
public class Spaceship extends Floater
{
    public Spaceship(PApplet applet_)
    {
        super(applet_);
        myCenterX = 50;
        myCenterY = 300;
        myXspeed = 0;
        myYspeed = 0;
        myPointDirection = 0;
        corners = 3;
        xCorners = new int[corners];
        xCorners[0] = -8;
        xCorners[1] = 16;
        xCorners[2] = -8;
        yCorners = new int[corners];
        yCorners[0] = -8;
        yCorners[1] = 0;
        yCorners[2] = 8;
        myColor = 255;
    }

    public double getX()
    {
        return myCenterX;
    }

    public double getY()
    {
        return myCenterY;
    }

    public double getDirection()
    {
        return myPointDirection;
    }

    public void speedUp()
    {
        super.accelerate(0.3);
    }

    public void slowDown()
    {
        super.accelerate(-0.3);
    }

    public void turnRight()
    {
        super.turn(5);
    }

    public void turnLeft()
    {
        super.turn(-5);
    }

    public void hyperspace()
    {
        myXspeed = 0;
        myYspeed = 0;
        myPointDirection = (int)(Math.random() * 360);
        myCenterX = (int)(Math.random() * 500);
        myCenterY = (int)(Math.random() * 500);
    }

    public double getXspeed()
    {
        return myXspeed;
    }

    public double getYspeed()
    {
        return myYspeed;
    }



}