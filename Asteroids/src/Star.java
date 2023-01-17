import processing.core.PApplet;
public class Star
{
    protected int myX, myY;
    private PApplet applet;
    protected int size;
    public Star(PApplet applet_)
    {
        applet = applet_;
        myX = (int)(Math.random() * 500);
        myY = (int)(Math.random() * 500);
        size = 1;
    }

    public void display()
    {
        applet.fill(255);
        applet.ellipse(myX, myY, size, size);
    }


}
