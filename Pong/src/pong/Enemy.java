package pong;

import java.awt.*;

public class Enemy {
    public double x, y;
    public int width, height;

    public Enemy(double x, double y) {
        this.x = x;
        this.y = y;
        this.height = 5;
        this.width = 40;
    }

    public void tick() {
        x += (Game.ball.x - x - 6) * 0.07;

//        if ( x+width > Game.WIDTH ) {
//            x = Game.WIDTH - width;
//            x --;
//        } else if ( x < 0 ) {
//            x = 0;
//            x++;
//        }
    }

    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect((int) x, (int) y, width, height);
    }


}
