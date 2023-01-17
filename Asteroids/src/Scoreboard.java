import processing.core.PApplet;
import processing.core.PFont;

public class Scoreboard extends Floater
{
    private boolean show;
    private int size;
    private boolean homeScreen;
    private boolean pauseYes;
    private int score = 0;

    public Scoreboard(PApplet applet_)
    {
        super(applet_);
    }

    public void addScore()
    {
        score++;
    }

    public void pause()
    {

    }
}
