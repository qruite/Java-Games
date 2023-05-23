package at.gru;
import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.tests.AnimationTest;

import java.awt.*;

public class Rectangle extends BasicGame {
    private int x;
    private int y;

    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.x++;
        this.y++;

        if (this.x>800-100){
            this.x = 0;
        }

        if (this.y>600-100){
            this.y = 0;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y,100,100);
    }

    public static void main (String[] args){
        try{
            AppGameContainer container = new AppGameContainer(new Rectangle("Rectangle"));
            container.setDisplayMode(800,600,false);
            container.start();
        }catch (SlickException e){
            e.printStackTrace();
        }
    }
}
