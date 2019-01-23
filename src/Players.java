
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cathy
 */
public class Players extends Rectangle{
        
    public boolean right, left, down, up;
    private int speed = 5;
    
    public Players(int x, int y){
        setBounds(x, y, 30, 30);
    }
    
    public void tick(){ 
        if (right) {
            x += speed;
        }
        if (left) {
            x -= speed;
        }
        if (down) {
            x -= speed;
        }
        if (up) {
            x += speed;
        }
    }
    
    public void render(Graphics colour){
        colour.setColor(Color.yellow);
        colour.fillRect(x, y, width, height);
    }
}
