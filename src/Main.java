import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Canvas;
import java.lang.annotation.Target;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard();
        SetGraphicSettings(chessboard);

    }

    public static void SetGraphicSettings(Chessboard chessboard) {
        Drawing drawing = new Drawing(chessboard);
        JFrame frame = new JFrame("Chess");
        Canvas canvas = new Drawing(chessboard);
        canvas.setSize(500, 500);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        canvas.setBackground(Color.gray);
        
    }
}
