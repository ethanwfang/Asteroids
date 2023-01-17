import processing.core.PApplet;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import processing.core.PFont;

public class AsteroidsGame extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("AsteroidsGame");
    }

    private Spaceship s;
    private Star[] x;
    private List<Asteroid> a;
    List<Bullet> b;
    private Scoreboard sb;
    private boolean startStatus = false;
    private int score;

    public void settings()
    {
        size(500,500);
        a = new ArrayList<>();
        x = new Star[200];
        b = new ArrayList<Bullet>();

    }

    public void setup() // setting up variables
    {
        s = new Spaceship(this);
        for (int i = 0; i < x.length; i++)
        {
            x[i] = new Star(this);
        }
        for (int i = 0; i < 30; i++)
        {
            a.add(i, new Asteroid(this));
        }
        b = new ArrayList<Bullet>();
    }



    public void draw()
    {
        background(0);
        textSize(40);
        textAlign(CENTER);
        text("ASTEROIDS",250,60);
        fill(256);



        if(startStatus) // starting the actual game
        {
            background(0);
            s.show();
            s.move();
            textSize(10);
            text("score: " + score, 10, 250);

            for (int i = 0; i < x.length; i++)
            {
                x[i].display();
            }

            for (int i = 0; i < a.size(); i++)
            {
                a.get(i).show();
                a.get(i).move();
            /*
            if (dist((float)a.get(i).getX(),(float)a.get(i).getY(),(float)s.getX(),(float)s.getY()) <= 20)
            {
                a.remove(i);
                i--;
            }

             */
            }



            for(int i = 0; i < b.size(); i++) //removes bullets when it goes out of the screen
            {
                if(b.get(i).getX() >= width || b.get(i).getX() == 0)
                {
                    b.remove(i);
                    i--;
                }
                else if(b.get(i).getY() >= height || b.get(i).getY() == 0)
                {
                    b.remove(i);
                    i--;
                }
            }

            for(int i = 0; i < b.size(); i++) // bullet hitting asteroid
            {
                b.get(i).show();
                b.get(i).move();
                for(int q = 0; q < a.size(); q++)
                {
                    if(dist((float)a.get(q).getX(), (float)a.get(q).getY(), (float)b.get(i).getX(), (float)b.get(i).getY()) <= 20)
                    {
                        a.remove(q);
                        b.remove(i);
                        score++;
                        i--;
                        q--;
                        break;
                    }
                }
            }
        }





        if (keyPressed) // movement
        {
            if (keyCode == RIGHT)
            {
                s.turnRight();
            }
            if (keyCode == LEFT)
            {
                s.turnLeft();
            }

            if (keyCode == UP)
            {
                s.speedUp();
            }

            if (keyCode == DOWN)
            {
                s.slowDown();
            }

        }

    }

    public void keyPressed() //hyperspace, could probably be used as a pause button as well
    {
        if (this.keyPressed)
        {
            if (key == 'h')
            {
                s.hyperspace();
            }
            if (key == ' ')
            {
                b.add(new Bullet(this, s));
            }
            if (key == 'r')
            {
                for (int i = 0; i < 30; i++)
                {
                    a.add(i, new Asteroid(this));
                }
            }
            if (key == 'e')
            {
                startStatus = true;
            }

        }
    }


}
