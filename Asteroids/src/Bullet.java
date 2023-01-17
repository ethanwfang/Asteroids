import processing.core.PApplet;

public class Bullet extends Floater
{
    public Bullet(PApplet applet_, Spaceship s)
    {
        super(applet_);
        myCenterX = s.getX();
        myCenterY = s.getY();
        myPointDirection = s.getDirection();
        myXspeed = s.getXspeed();
        myYspeed = s.getYspeed();
        accelerate(6);
        myColor = 50;
    }

    public void show()
    {
        super.show();
        applet.fill(255);
        applet.ellipse((float)myCenterX, (float)myCenterY, 4, 4);

        /*applet.ellipse((float)myCenterX, (float)myCenterY, 30,30 );
        applet.fill(myColor);
        applet.stroke(myColor);
        applet.translate((float)myCenterX, (float)myCenterY);

         */
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
