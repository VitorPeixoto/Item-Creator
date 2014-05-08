package itemcreator;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Peixoto
 */
public class Tile implements Serializable {
    private ImageIcon tileImage;
    
    private int widht,
                height;
    
    private Property tileProperty;

    public Tile(ImageIcon tileImage, int widht, int height, Property tileProperty) {
        this.tileImage = tileImage;
        this.widht = widht;
        this.height = height;
        this.tileProperty = tileProperty;
    }                

    private enum Property {
        WALKABLE_TILE(),
        WALLED_TILE(),
        UPPER_TILE();
        
        private Property() {
            
        }        
    }

}
