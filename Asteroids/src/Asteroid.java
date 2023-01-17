import processing.core.PApplet;
import java.util.ArrayList;
import java.util.List;

public class Asteroid extends Floater
{
    private int rotSpeed;
    private float xDist;
    private float yDist;
    int b = (int)(Math.random() * 500);
    public Asteroid(PApplet applet_)
    {
        super(applet_);
        corners = 7;
        xCorners = new int[corners];
        yCorners = new int[corners];
        xCorners[0] = -11;
        yCorners[0] = -8;
        xCorners[1] = 7;
        yCorners[1] = -8;
        xCorners[2] = 13;
        yCorners[2] = 0;
        xCorners[3] = -6;
        yCorners[3] = 10;
        xCorners[4] = -11;
        yCorners[4] = 10;
        xCorners[5] = -5;
        yCorners[5] = -4;
        xCorners[5] = -7;
        yCorners[5] = 3;
        myPointDirection = Math.random() * 360;
        rotSpeed = (((int)(Math.random() * 11)) - 5);
        xDist = 0;
        yDist = 0;
        myXspeed = (Math.random() * 4) - 2;
        myYspeed = (Math.random() * 4) - 2;
        myCenterX = Math.random() * 500;
        myCenterY = Math.random() * 500;
        myColor = 255;
    }

    @Override
    public void move()
    {
        turn(rotSpeed);
        super.move();
    }


    public double getX()
    {
        return myCenterX;
    }

    public double getY()
    {
        return myCenterY;
    }





}
