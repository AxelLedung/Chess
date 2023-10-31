import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Chessboard {
    public ArrayList<Piece> PieceArray = new ArrayList<Piece>();
    public ArrayList<Tile> tileArray = new ArrayList<Tile>();
    public Chessboard() {
        InstantiatePieces();
        InstantiateTiles();
        PrintAllPieces();
        PrintAllTiles();
    }
    public void InstantiateTiles() {
        int tileCanvasX = 0;
        int tileCanvasY = 0;
        int tileId = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tileArray.add(new Tile(tileId, j, i, tileCanvasX, tileCanvasY));
                if (i % 2 == 0 && j % 2 == 0) {
                    tileArray.get(tileId).tileColor = Color.black;
                }
                else if (i % 2 != 0 && j % 2 == 0) {
                    tileArray.get(tileId).tileColor = Color.white;
                }
                else if (i % 2 != 0 && j % 2 != 0) {
                    tileArray.get(tileId).tileColor = Color.black;
                }
                else if (i % 2 == 0 && j % 2 != 0) {
                    tileArray.get(tileId).tileColor = Color.white;
                }
                tileId++;
                tileCanvasX += 50;
            }
            tileCanvasX = 0;
            tileCanvasY += 50;
        }
    }
    public void InstantiatePieces() {
        for (int i = 0; i < 8; i++) {
            PieceArray.add(new Pawn("bPawn" + i, i, 1, Color.black));
        }
        PieceArray.add(new Knight("bKnight0",1, 0, Color.black));
        PieceArray.add(new Knight("bKnight1",6, 0, Color.black));
        PieceArray.add(new Rook("bRook0",0, 0, Color.black));
        PieceArray.add(new Rook("bRook1",7, 0, Color.black));
        PieceArray.add(new Bishop("bBishop0",2, 0, Color.black));
        PieceArray.add(new Bishop("bBishop1",5, 0, Color.black));
        PieceArray.add(new King("bKing", 3, 0, Color.black));
        PieceArray.add(new Queen("bQueen", 4, 0, Color.black));
        for (int i = 0; i < 8; i++) {
            PieceArray.add(new Pawn("wPawn" + i, i, 6, Color.white));
        }
        PieceArray.add(new Knight("wKnight0", 1,7, Color.white));
        PieceArray.add(new Knight("wKnight1", 6, 7, Color.white));
        PieceArray.add(new Rook("wRook0", 0, 7, Color.white));
        PieceArray.add(new Rook("wRook1", 7, 7, Color.white));
        PieceArray.add(new Bishop("wBishop0", 2, 7, Color.white));
        PieceArray.add(new Bishop("wBishop1", 5, 7, Color.white));
        PieceArray.add(new King("wKing", 3, 7, Color.white));
        PieceArray.add(new Queen("wQueen", 4, 7, Color.white));
    }
    public void PrintAllPieces() {
        System.out.println("PIECES: ");
        for (Piece piece : PieceArray) {
            System.out.println(
                    "Name: " + piece.name + " " +
                    "xPos: " + piece.xPos + " " +
                    "yPos: " + piece.yPos + " " +
                    "Color: " + piece.pieceColor);
        }
    }
    public void PrintAllTiles() {
        System.out.println("TILES INFORMATION: ");
        for (Tile tile : tileArray) {
            System.out.println(
                    "ID: " + tile.id + " " +
                    "CanvasX: " + tile.canvasX + " " +
                    "CanvasY: " + tile.canvasY + " " +
                    "TileX: " + tile.tileX + " " +
                    "TileY: " + tile.tileY + " " +
                    "Color: " + tile.tileColor);
        }

    }
}