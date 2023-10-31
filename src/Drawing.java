import java.awt.*;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Canvas;
import java.util.ArrayList;

public class Drawing extends Canvas{
    public Chessboard chessboard;
    public Drawing (Chessboard cb) {
        chessboard = cb;
    }
    public void paint(Graphics graphic) {
        PaintTiles(graphic);
        PaintPieces(graphic);
        ClearPieces(graphic);
    }
    public void PaintTiles(Graphics graphic) {
        for (int i = 0; i < chessboard.tileArray.size(); i++) {
            graphic.setColor(chessboard.tileArray.get(i).tileColor);
            graphic.fillRect(
                    chessboard.tileArray.get(i).canvasX,
                    chessboard.tileArray.get(i).canvasY,
                    chessboard.tileArray.get(i).width,
                    chessboard.tileArray.get(i).height
            );
        }
    }
    public void PaintPieces(Graphics graphic) {
        graphic.drawString(chessboard.PieceArray.get(1).name, chessboard.PieceArray.get(1).xPos, chessboard.PieceArray.get(1).yPos);
        for (int i = 0; i < chessboard.PieceArray.size(); i++) {
            for (int j = 0; j < chessboard.tileArray.size(); j++) {
                if (chessboard.PieceArray.get(i).xPos == chessboard.tileArray.get(j).tileX && chessboard.PieceArray.get(i).yPos == chessboard.tileArray.get(j).tileY) {
                    if (chessboard.tileArray.get(j).tileColor == Color.black) {
                        graphic.setColor(Color.white);
                    }
                    else {
                        graphic.setColor(Color.black);
                    }
                    graphic.drawString(chessboard.PieceArray.get(i).sprite.toString(), chessboard.tileArray.get(j).canvasX + 20, chessboard.tileArray.get(j).canvasY + 20);
                }
            }
        }
    }
    public void ClearPieces(Graphics graphic) {
        graphic.clearRect(0, 0, 500, 500);
        PaintTiles(graphic);
    }
}
