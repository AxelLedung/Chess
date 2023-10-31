import java.awt.*;

public abstract class Piece {
    protected String name;
    public int xPos;
    public int yPos;
    public Color pieceColor;
    protected enum Sprite { Pa, Ro, Kn, Bi, Ki, Qu }
    protected Sprite sprite;

    public Piece (String pName, int x, int y, Color pColor) {
        name = pName;
        xPos = x;
        yPos = y;
        pieceColor = pColor;
    }
    public void MovePiece(int x, int y) {
        xPos = x;
        yPos = y;

    }
}
