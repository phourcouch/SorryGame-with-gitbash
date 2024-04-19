package sorry;

import java.awt.*;
import java.util.ArrayList;

public class Piece {
    private Color color;
    public static Piece red[] = new Piece[4];
    public static Piece yellow[] = new Piece[4];
    public static Piece green[] = new Piece[4];
    public static Piece blue[] = new Piece[4];
    
    public static int newPieceRow[] = new int [16]; 
    public static int newPieceCol[]= new int [16];
    
    public int pieceRow;
    public int pieceColumn;
    public boolean moveFromStart;
    public boolean onPath;
    public boolean safe;
    public boolean home;
    public boolean playable; 
    
    Piece(Color _color, int _row, int _column)
    {
        color = _color;
        pieceRow = _row;
        pieceColumn = _column;
        moveFromStart = false; 
        onPath = false;
        safe = false;
        home = false; 
        playable = false; 
    }
    public Color getColor()
    {
        return (color);
    }
    public int getPieceRow(){
        return pieceRow;
    }
    public int getPieceColumn(){
        return pieceColumn;
    }
    public void draw(Graphics2D g,int xdelta,int ydelta) {
        g.setColor(color);
        g.fillOval(Window.getX(pieceColumn*xdelta), Window.getY(pieceRow*ydelta), xdelta, ydelta);  
        g.setColor(Color.black);
        g.drawOval(Window.getX(pieceColumn*xdelta), Window.getY(pieceRow*ydelta), xdelta, ydelta);
    }
    
    
}
