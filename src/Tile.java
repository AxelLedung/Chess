import java.awt.*;
import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tile {
    public int id;
    public int tileX;
    public int tileY;
    public int canvasX;
    public int canvasY;
    public int width = 50;
    public int height = 50;
    public Color tileColor;

    public Tile(int identifier, int tilePosX, int tilePosY, int canvasPosX, int canvasPosY) {
        id = identifier;
        canvasX = canvasPosX;
        canvasY = canvasPosY;
        tileX = tilePosX;
        tileY = tilePosY;
    }
}
