// Origin: https://zetcode.com/javagames/movingsprites/

// SpaceShip and Missile have some methods in common.
// We can just as well have them inherit those methods

// The protected modifier specifies that the member can only be accessed within its own package
// The private   modifier specifies that the member can only be accessed within its own class.

package Game;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Sprite {

    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean active;
    protected Image image;

    public Sprite(int x, int y) {

        this.x = x;
        this.y = y;
        active = true;
    }

    protected void loadImage(String imageName) {

        ImageIcon ii = new ImageIcon(imageName);
        image = ii.getImage();
    }
    
    protected void getImageDimensions() {

        width = image.getWidth(null);
        height = image.getHeight(null);
    }    

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}

