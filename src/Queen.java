import java.awt.*;

public class Queen extends Piece{
    public Queen(String pName, int x, int y, Color pColor) {
        super(pName, x, y, pColor);
        sprite = Sprite.Qu;
    }
}
