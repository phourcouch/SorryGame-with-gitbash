package sorry;
import java.awt.*;

public class Board {
    private final static int NUM_ROWS = 16;
    private final static int NUM_COLUMNS = 16;      
//   
    //board vars 
    private static final int WALL = 0;
    private static final int PATH = 1;

    private static final int HOMERED = 2;
    private static final int SAFTEYZONERED = 3;
    private static final int STARTRED = 4;

    private static final int HOMEYELLOW = 5;
    private static final int STARTYELLOW = 6;
    private static final int SAFTEYZONEYELLOW = 7;

    private static final int HOMEGREEN = 8;
    private static final int STARTGREEN = 9;
    private static final int SAFTEYZONEGREEN = 10;

    private static final int HOMEBLUE = 11;
    private static final int STARTBLUE = 12;
    private static final int  SAFTEYZONEBLUE = 13;
    
    private static final int SLIDESTART = 14;
    private static final int SLIDEEND = 15;

    private static int board[][] = {
    {PATH,SLIDESTART,PATH,PATH,SLIDEEND,PATH,PATH,PATH,PATH,SLIDESTART,PATH,PATH,PATH,SLIDEEND,PATH,PATH},
    {PATH,WALL,SAFTEYZONEBLUE,WALL,STARTBLUE,STARTBLUE,WALL,WALL,HOMEYELLOW,HOMEYELLOW,WALL,WALL,WALL,WALL,WALL,SLIDESTART},
    {SLIDEEND,WALL,SAFTEYZONEBLUE,WALL,STARTBLUE,STARTBLUE,WALL,WALL,HOMEYELLOW,HOMEYELLOW,SAFTEYZONEYELLOW,SAFTEYZONEYELLOW,SAFTEYZONEYELLOW,SAFTEYZONEYELLOW,SAFTEYZONEYELLOW,PATH},
    {PATH,WALL,SAFTEYZONEBLUE,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,PATH},
    {PATH,WALL,SAFTEYZONEBLUE,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,STARTYELLOW,STARTYELLOW,SLIDEEND},
    {PATH,WALL,SAFTEYZONEBLUE,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,STARTYELLOW,STARTYELLOW,PATH},
    {SLIDESTART,HOMEBLUE,HOMEBLUE,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,PATH},
    {PATH,HOMEBLUE,HOMEBLUE,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,PATH},
    {PATH,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,HOMEGREEN,HOMEGREEN,PATH},
    {PATH,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,HOMEGREEN,HOMEGREEN,SLIDESTART},
    {PATH,STARTRED,STARTRED,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,SAFTEYZONEGREEN,WALL,PATH},
    {SLIDEEND,STARTRED,STARTRED,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,SAFTEYZONEGREEN,WALL,PATH},
    {PATH,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,WALL,SAFTEYZONEGREEN,WALL,PATH},
    {PATH,SAFTEYZONERED,SAFTEYZONERED,SAFTEYZONERED,SAFTEYZONERED,SAFTEYZONERED,HOMERED,HOMERED,WALL,WALL,STARTGREEN,STARTGREEN,WALL,SAFTEYZONEGREEN,WALL,SLIDEEND},
    {SLIDESTART,WALL,WALL,WALL,WALL,WALL,HOMERED,HOMERED,WALL,WALL,STARTGREEN,STARTGREEN,WALL,SAFTEYZONEGREEN,WALL,PATH},
    {PATH,PATH,SLIDEEND,PATH,PATH,PATH,SLIDESTART,PATH,PATH,PATH,PATH,SLIDEEND,PATH,PATH,SLIDESTART,PATH}};
       
    private static Image testBoard;
    private static Sorry mainclass;
    
    public static void Reset(Sorry _mainclass){
        mainclass = _mainclass;
        testBoard = Toolkit.getDefaultToolkit().getImage("./Board.png");
    }
    public static void Reset() {
         //sets red pieces  
        Piece.red[0] = new Piece(Color.red, 10, 1);
        Piece.red[1] = new Piece(Color.red, 11, 1);
        Piece.red[2] = new Piece(Color.red, 10, 2);
        Piece.red[3] = new Piece(Color.red, 11, 2);
         //sets yellow pieces 
        Piece.yellow[0] = new Piece(Color.yellow, 4, 14);
        Piece.yellow[1] = new Piece(Color.yellow, 5, 14);
        Piece.yellow[2] = new Piece(Color.yellow, 4, 13);
        Piece.yellow[3] = new Piece(Color.yellow, 5, 13);
         //sets blue pieces  
        Piece.blue[0] = new Piece(Color.blue, 1, 4);
        Piece.blue[1] = new Piece(Color.blue, 1, 5);
        Piece.blue[2] = new Piece(Color.blue, 2, 4);
        Piece.blue[3] = new Piece(Color.blue, 2, 5);
         //sets green pieces 
        Piece.green[0] = new Piece(Color.green, 14, 11);
        Piece.green[1] = new Piece(Color.green, 14, 10);
        Piece.green[2] = new Piece(Color.green, 13, 11);
        Piece.green[3] = new Piece(Color.green, 13, 10);
    // location for testing huricane code
//        Piece.red[0] = new Piece(Color.red, 13, 6);
//        Piece.red[1] = new Piece(Color.red, 14, 6);
//        Piece.red[2] = new Piece(Color.red, 13, 7);
//        Piece.red[3] = new Piece(Color.red, 14, 7);
//        Piece.yellow[0] = new Piece(Color.yellow, 0, 4);
//        Piece.yellow[1] = new Piece(Color.yellow, 0, 5);
//        Piece.yellow[2] = new Piece(Color.yellow, 4, 13);
//        Piece.yellow[3] = new Piece(Color.yellow, 5, 13);
//        Piece.blue[0] = new Piece(Color.blue, 0, 8);
//        Piece.blue[1] = new Piece(Color.blue, 1, 5);
//        Piece.blue[2] = new Piece(Color.blue, 2, 4);
//        Piece.blue[3] = new Piece(Color.blue, 0,10);
//        Piece.green[0] = new Piece(Color.green, 14, 11);
//        Piece.green[1] = new Piece(Color.green, 0, 12);
//        Piece.green[2] = new Piece(Color.green, 0, 13);
//        Piece.green[3] = new Piece(Color.green, 0, 14);
    }
    public static void Draw(Graphics2D g) {
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
       //Display the objects of the board    
       for (int zrow=0;zrow<NUM_ROWS;zrow++)
        {
            for (int zcolumn=0;zcolumn<NUM_COLUMNS;zcolumn++)
            {        
               
                if (board[zrow][zcolumn] == WALL)
                {
                    g.setColor(Color.gray);
                    g.fillRect(Window.getX(zcolumn*xdelta), Window.getY(zrow*ydelta),xdelta, ydelta);

                }
                else if (board[zrow][zcolumn] == HOMERED || board[zrow][zcolumn] == STARTRED || board[zrow][zcolumn] == SAFTEYZONERED  )
                {
                    g.setColor(Color.red);
                    g.fillRect(Window.getX(zcolumn*xdelta), Window.getY(zrow*ydelta),xdelta, ydelta);
                }
                else if (board[zrow][zcolumn] == HOMEYELLOW || board[zrow][zcolumn] == STARTYELLOW ||  board[zrow][zcolumn] == SAFTEYZONEYELLOW )
                {
                    g.setColor(Color.yellow);
                    g.fillRect(Window.getX(zcolumn*xdelta), Window.getY(zrow*ydelta),xdelta, ydelta);
                }
                else if (board[zrow][zcolumn] == HOMEGREEN || board[zrow][zcolumn] == STARTGREEN ||  board[zrow][zcolumn] == SAFTEYZONEGREEN)
                {
                    g.setColor(Color.green);
                    g.fillRect(Window.getX(zcolumn*xdelta), Window.getY(zrow*ydelta),xdelta, ydelta);
                }
                else if (board[zrow][zcolumn] == HOMEBLUE || board[zrow][zcolumn] == STARTBLUE ||  board[zrow][zcolumn] == SAFTEYZONEBLUE)
                {
                    g.setColor(Color.blue);
                    g.fillRect(Window.getX(zcolumn*xdelta), Window.getY(zrow*ydelta),xdelta, ydelta);
                }
            }
        }
        //draw grid
        
        g.setColor(Color.black);
        for (int zi = 1;zi<NUM_ROWS;zi++)
        {
            g.drawLine(Window.getX(0),Window.getY(zi*ydelta),
                    Window.getX(Window.getWidth2()),Window.getY(zi*ydelta));
        }
        
        for (int zi = 1;zi<NUM_COLUMNS;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(0),
                    Window.getX(zi*xdelta),Window.getY(Window.getHeight2()));
        }
//        g.setColor(Color.black);
//        g.setFont(new Font("Arial",Font.PLAIN,30));
//        g.drawString("SORRY",Window.getWidth2()/2,Window.getHeight2()/2+(80-ydelta/2));    
           
        g.drawImage(testBoard,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
        Cards.drawCard(g, xdelta, ydelta);
        
        //draws red pieces
        for (Piece red : Piece.red) {
            if (red != null) {
                red.draw(g, xdelta, ydelta);
            }
        }
        //draws yellow pieces
        for (Piece yellow : Piece.yellow) {
            if (yellow != null) {
                yellow.draw(g, xdelta, ydelta);
            }
        }
        //draws blue pieces
        for (Piece blue : Piece.blue) {
            if (blue != null) {
                blue.draw(g, xdelta, ydelta);
            }
        }
        //draws green pieces
        for (Piece green : Piece.green) {
            if (green != null) {
                green.draw(g, xdelta, ydelta);
            }
        }
   
        g.setFont(new Font("Bahnschrift",Font.PLAIN,25));
        if(Sorry.blueWin){
            g.setColor(Color.blue);
            g.drawString("BLUE HAS WON!", 50,60);
            g.setColor(Color.white);
            g.drawString("press [esc] to restart", 350,60);
            return;
        }
        if(Sorry.greenWin){
            g.setColor(Color.green);
            g.drawString("GREEN HAS WON!", 50,60);
            g.setColor(Color.white);
            g.drawString("press [esc] to restart", 350,60);
            return;
        }
        if(Sorry.yellowWin){
            g.setColor(Color.yellow);
            g.drawString("YELLOW HAS WON!", 50,60);
            g.setColor(Color.white);
            g.drawString("press [esc] to restart", 350,60);
            return;
        }
        if(Sorry.redWin){
            g.setColor(Color.red);
            g.drawString("RED HAS WON!", 50,60);
            g.setColor(Color.white);
            g.drawString("press [esc] to restart", 350,60);
            return;
        }
        else if (Sorry.Directions){}
        else if(!Sorry.newCard){
            g.setColor(Color.white);
            g.drawString("press space to pick card", 50,60);
        }
        else if(Player.GetCurrentPlayer().getColor()== Color.red){
            g.setColor(Color.red);
            g.drawString("Red", 50,60);
            g.setColor(Color.white);
            if(stuck())
                g.drawString("Stuck. Press [s] to continue", 300,60);
            else if(Sorry.SwitchActive && !Sorry.firstSelected)
                g.drawString("left click on own piece", 150,60);
            else if(Sorry.firstSelected)
                g.drawString("right click on opponent's piece to switch", 150,60);
            else 
                g.drawString("press [s] to skip turn", 350,60);
        }
        else if(Player.GetCurrentPlayer().getColor()== Color.green){
            g.setColor(Color.green);
            g.drawString("Green", 50,60);
            g.setColor(Color.white);
            if(stuck())
                g.drawString("Stuck. Press [s] to continue", 300,60);
            else if(Sorry.SwitchActive && !Sorry.firstSelected)
                g.drawString("left click on own piece to select", 150,60);
            else if(Sorry.firstSelected)
                g.drawString("right click on opponent's piece to switch", 150,60);
            else 
                g.drawString("press [s] to skip turn", 350,60);
        }
        else if(Player.GetCurrentPlayer().getColor()== Color.yellow){
            g.setColor(Color.yellow);
            g.drawString("Yellow ",50,60);
            g.setColor(Color.white);
            if(stuck())
                g.drawString("Stuck. Press [s] to continue", 300,60);
            else if(Sorry.SwitchActive && !Sorry.firstSelected)
                g.drawString("left click on own piece", 150,60);
            else if(Sorry.firstSelected)
                g.drawString("right click on opponent's piece to switch", 150,60);
            else 
                g.drawString("press [s] to skip turn", 350,60);
        }
        else if(Player.GetCurrentPlayer().getColor()== Color.blue){
            g.setColor(Color.blue);
            g.drawString("Blue", 50,60);
            g.setColor(Color.white);
            if(stuck())
                g.drawString("Stuck. Press [s] to continue", 300,60);
            else if(Sorry.SwitchActive && !Sorry.firstSelected)
                g.drawString("left click on own piece", 150,60);
            else if(Sorry.firstSelected)
                g.drawString("right click on opponent's piece to switch", 150,60);
            else 
                g.drawString("press [s] to skip turn", 350,60);
        }
    } 

    public static void Move(int xpixel, int ypixel){
        if (!Sorry.newCard)
            return;
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
        int column = xpixel/xdelta;
        int row = ypixel/ydelta;
        Piece movePiece = null; 
        boolean ownPiece = false; 
        int maxCol =  NUM_COLUMNS-1; //left border of board
        int maxRow =  NUM_ROWS-1; //bottom boarder of board
        checkPosition();
        checkPlayable();
        if( Player.GetCurrentPlayer().getColor() == Color.red)//finding what piece to move if player is red
                for (Piece red: Piece.red){
                    if (red.pieceColumn == column && red.pieceRow == row){
                        movePiece = red;
                        ownPiece = true;
                        if( board[row][column]== STARTRED && (Cards.getCardInfo() == 1 || Cards.getCardInfo() == 2))
                            movePiece.moveFromStart = true;
                    }
                }
        if( Player.GetCurrentPlayer().getColor() == Color.yellow)//finding what piece to move if player is red
            for (Piece yellow: Piece.yellow){
                if (yellow.pieceColumn == column && yellow.pieceRow == row){
                    movePiece = yellow;
                    ownPiece = true;
                    if( board[row][column]== STARTYELLOW && (Cards.getCardInfo() == 1 || Cards.getCardInfo() == 2))
                        movePiece.moveFromStart = true;
                }
            }
        if( Player.GetCurrentPlayer().getColor() == Color.green)//finding what piece to move if player is green
            for (Piece green: Piece.green){
                if (green.pieceColumn == column && green.pieceRow == row){
                    movePiece = green;
                    ownPiece = true;
                    if( board[row][column]== STARTGREEN && (Cards.getCardInfo() == 1 || Cards.getCardInfo() == 2))
                        movePiece.moveFromStart = true;
                }
            }
        if( Player.GetCurrentPlayer().getColor() == Color.blue)//finding what piece to move if player is blue
            for (Piece blue: Piece.blue){
                if (blue.pieceColumn == column && blue.pieceRow == row){
                    movePiece = blue;
                    ownPiece = true;
                    if( board[row][column]== STARTBLUE && (Cards.getCardInfo() == 1 || Cards.getCardInfo() == 2))
                        movePiece.moveFromStart = true;
                }
            }
        if(Cards.getCardInfo()<13){
            if(movePiece!=null){
                if( !stuck() && !movePiece.playable){
                    return;
                }
                if( Cards.getCardInfo() != 4){ // moves cards that aren't 4 or 15
                    if(movePiece.moveFromStart){// moving out of start if 1 or 2
                        if (movePiece.getColor()== Color.red){
                            movePiece.pieceRow = 11;
                            movePiece.pieceColumn = 0;
                        }
                        if (movePiece.getColor()== Color.yellow){
                            movePiece.pieceRow = 4;
                            movePiece.pieceColumn = 15;
                        }
                        if (movePiece.getColor()== Color.green){
                            movePiece.pieceRow = 15;
                            movePiece.pieceColumn = 11;
                        }
                        if (movePiece.getColor()== Color.blue){
                            movePiece.pieceRow = 0;
                            movePiece.pieceColumn = 4;
                        }
                        movePiece.moveFromStart = false;
                        movePiece.onPath = true;
                    }
                    else if (Cards.getCardInfo()> 0 && !movePiece.moveFromStart && movePiece.playable ){ // all other movement if already on path
                        for(int i=0;i < Cards.getCardInfo();i++){
                            if(Player.GetCurrentPlayer().getColor()== Color.blue && movePiece.pieceRow < maxRow && board[movePiece.pieceRow+1][movePiece.pieceColumn]== SAFTEYZONEBLUE){
                                movePiece.pieceRow++;
                                checkPosition();
                            }
                            else if ((movePiece.pieceRow+1== 6 && movePiece.pieceColumn == 2)){// move into blue home
                                movePiece.pieceRow++;
                                checkPosition();
                            }
                            else if(Player.GetCurrentPlayer().getColor()== Color.red && movePiece.pieceColumn < maxCol && board[movePiece.pieceRow][movePiece.pieceColumn+1] == SAFTEYZONERED){
                                movePiece.pieceColumn++;
                                checkPosition();
                            }
                            else if (movePiece.pieceRow== 13 && movePiece.pieceColumn+1 == 6){ // move into red home
                                movePiece.pieceColumn++;
                                checkPosition();
                            }
                            else if(Player.GetCurrentPlayer().getColor()== Color.green && movePiece.pieceRow > 0 && board[movePiece.pieceRow-1][movePiece.pieceColumn] == SAFTEYZONEGREEN){
                                movePiece.pieceRow--;
                                checkPosition();
                            }
                            else if (movePiece.pieceRow -1 == 9 && movePiece.pieceColumn == 13){ // move into green home
                                movePiece.pieceRow--;
                                checkPosition();
                            }
                            else if(Player.GetCurrentPlayer().getColor()== Color.yellow && movePiece.pieceColumn > 0 && board[movePiece.pieceRow][movePiece.pieceColumn -1] == SAFTEYZONEYELLOW){
                                movePiece.pieceColumn--;
                                checkPosition();
                            }
                            else if (movePiece.pieceRow== 2 && movePiece.pieceColumn -1 == 9) { // move into yellow home
                                movePiece.pieceColumn--;
                                checkPosition();
                            }
//                            if(Player.GetCurrentPlayer().getColor()== Color.blue && board[row+1][column]== SAFTEYZONEBLUE){
//                                movePiece.pieceRow++;
//                            }
//                            else if(Player.GetCurrentPlayer().getColor()== Color.red && board[movePiece.pieceRow][movePiece.pieceColumn+1] == SAFTEYZONERED){
//                                movePiece.pieceColumn++;
//                            }
//                            else if(Player.GetCurrentPlayer().getColor()== Color.green && board[movePiece.pieceRow-1][movePiece.pieceColumn] == SAFTEYZONEGREEN){
//                                movePiece.pieceRow--;
//                            }
//                            else if(Player.GetCurrentPlayer().getColor()== Color.yellow && board[movePiece.pieceRow][movePiece.pieceColumn -1] == SAFTEYZONEYELLOW){
//                                movePiece.pieceColumn--;
//                            }
                            else if(movePiece.getPieceRow()== maxRow && movePiece.getPieceColumn() -1 >= 0){// left
                                movePiece.pieceColumn--;
                            }
                            else if(movePiece.getPieceRow()-1 >= 0 && movePiece.getPieceColumn() == 0 ){// up
                                movePiece.pieceRow--;
                            }
                            //move right
                            else if(movePiece.getPieceRow()== 0 && movePiece.getPieceColumn() +1 <= maxCol){
                                movePiece.pieceColumn++;
                            }
                            //move down
                            else  if(movePiece.getPieceColumn() == maxCol && movePiece.getPieceRow()+1 <= maxRow){
                                movePiece.pieceRow++;
                            }
                            else {
                                //no move
                                movePiece.pieceRow +=0;
                                movePiece.pieceColumn+=0;
                            }
                        }
                    }
                    if(movePiece.home){goHome(movePiece);}
                }
                else if (Cards.getCardInfo()== 4){// movement if card is 4
                    for(int i=0;i<Cards.getCardInfo();i++){
                        if(Player.GetCurrentPlayer().getColor()== Color.blue && movePiece.safe){
                            movePiece.pieceRow--;
                            checkPosition();
                        }
                        else if(Player.GetCurrentPlayer().getColor()== Color.red && movePiece.safe){
                            movePiece.pieceColumn--;
                            checkPosition();
                        }
                        else if(Player.GetCurrentPlayer().getColor()== Color.green && movePiece.safe){
                            movePiece.pieceRow++;
                            checkPosition();
                        }
                        else if(Player.GetCurrentPlayer().getColor()== Color.yellow && movePiece.safe){
                            movePiece.pieceColumn++;
                            checkPosition();
                        }
                        //left
                        else if(movePiece.getPieceColumn()-1 >= 0 && movePiece.getPieceRow() == 0 ){
                            movePiece.pieceColumn --;
                        }
                       //move up
                        else  if(movePiece.getPieceRow()-1 >= 0 && movePiece.getPieceColumn() == maxCol ){
                            movePiece.pieceRow--;
                        }
                        //move right
                        else if(movePiece.getPieceRow()== maxRow && movePiece.getPieceColumn() +1 <= maxCol){
                            movePiece.pieceColumn++;
                        }
                        //move down
                        else  if(movePiece.getPieceColumn() == 0 && movePiece.getPieceRow()+1 <= maxRow){
                            movePiece.pieceRow++;
                        }
                        else {
                            //no move
                            movePiece.pieceRow +=0;
                            movePiece.pieceColumn+=0;
                        }
                    }
                }
                checkOverlap(movePiece);// checks after the move is made if 
                checkPosition();
                Win();
                
                // slide code
                if(board[movePiece.pieceRow][movePiece.pieceColumn] == SLIDESTART){
                    while(board[movePiece.pieceRow][movePiece.pieceColumn] != SLIDEEND){
                        if(movePiece.getPieceRow()== maxRow && movePiece.getPieceColumn() -1 >= 0){// left
                            movePiece.pieceColumn--;
                            checkOverlap(movePiece);
                        }
                        else if(movePiece.getPieceRow()-1 >= 0 && movePiece.getPieceColumn() == 0 ){// up
                            movePiece.pieceRow--;
                            checkOverlap(movePiece);
                        }
                        //move right
                        else if(movePiece.getPieceRow()== 0 && movePiece.getPieceColumn() +1 <= maxCol){
                            movePiece.pieceColumn++;
                            checkOverlap(movePiece);
                        }
                        //move down
                        else  if(movePiece.getPieceColumn() == maxCol && movePiece.getPieceRow()+1 <= maxRow){
                            movePiece.pieceRow++;
                            checkOverlap(movePiece);
                        }
                    }
                }
                //check if in home
                if(movePiece.home){
                    goHome(movePiece);
                }
            }
        }
        else if( Cards.getCardInfo()==13){
            ownPiece = false;
            TrueReset();
        }
        else if( Cards.getCardInfo()==14){
//            pathHurricane();
            ownPiece = false; 
            fullHurricane();
        }
//        else if( Cards.getCardInfo()==15){
//            if(!stuck() && !movePiece.onPath)
//                return;
//            if (ownPiece){
//                randomSwitch(row,column,movePiece);
//            }
//            else return;
//        }
        else if(Cards.getCardInfo()==16){ 
            if (ownPiece) 
                return;
            if(!stuck())
                SORRYreplace(row,column);
        }
        if (ownPiece){
            Player.SwitchTurn();
        }
        ownPiece = false;
    }
    public static void SORRYreplace(int row, int column){// picks a opponent's piece on the board and replaces it with one from your own start. Only works IF there is a piece in the start
        //checks what piece you're switching it to
        boolean playSORRY = false;
        Piece swapPiece = null; 
        for (Piece red : Piece.red) {
            if (red.pieceRow == row && red.pieceColumn == column) { 
                swapPiece = red;
                playSORRY = true;
            }
        }
        for (Piece yellow : Piece.yellow) {
            if (yellow.pieceRow == row && yellow.pieceColumn == column) { 
                swapPiece = yellow;
                playSORRY = true;
            }
        }
        for (Piece green : Piece.green) {
            if (green.pieceRow == row && green.pieceColumn == column) { 
                swapPiece = green;
                playSORRY = true;
            }
        }
        for (Piece blue : Piece.blue) {
            if (blue.pieceRow == row && blue.pieceColumn == column) { 
                swapPiece = blue;
                playSORRY = true;
            }
        }
        // returns (pick a different piece) if the one clicked on is one of your own, in start, or empty space
        if( !stuck() && (swapPiece !=null && (Player.GetCurrentPlayer().getColor() == swapPiece.getColor()
            || !swapPiece.onPath)) || !playSORRY ){
            return;
        }
        
        Piece movePiece = null;
        if(Player.GetCurrentPlayer().getColor() == Color.red){ //if player is red, find a piece in their start
            for (Piece red : Piece.red) {
                if (board[red.pieceRow][red.pieceColumn] == STARTRED) { 
                    movePiece = red;
                }
            }
            if(movePiece != null){
                movePiece.pieceRow = row;
                movePiece.pieceColumn = column;
            }
        }
        if(Player.GetCurrentPlayer().getColor() == Color.yellow){ //if player is yellow, find a piece in their start
            for (Piece yellow : Piece.yellow) {
                if (board[yellow.pieceRow][yellow.pieceColumn] == STARTYELLOW) { 
                    movePiece = yellow;
                }
            }
            if(movePiece != null){
                movePiece.pieceRow = row;
                movePiece.pieceColumn = column;
            }
        }
        if(Player.GetCurrentPlayer().getColor() == Color.green){ //if player is green, find a piece in their start
            for (Piece green : Piece.green) {
                if (board[green.pieceRow][green.pieceColumn] == STARTGREEN) { 
                    movePiece = green;
                }
            }
            if(movePiece != null){
                movePiece.pieceRow = row;
                movePiece.pieceColumn = column;
            }
        }
        if(Player.GetCurrentPlayer().getColor() == Color.blue){ //if player is blue, find a piece in their start
            for (Piece blue : Piece.blue) {
                if (board[blue.pieceRow][blue.pieceColumn] == STARTBLUE) { 
                    movePiece = blue;
                }
            }
            if(movePiece != null){
                movePiece.pieceRow = row;
                movePiece.pieceColumn = column;
            }
            
        }
        if(movePiece != null)
            checkOverlap(movePiece);
        Player.SwitchTurn();
    }
    public static void SORRY(int row, int column){
        Piece movePiece = null;
        for (int i = 0;i< Piece.red.length;i++){
            if (Piece.red[i].pieceColumn == column && Piece.red[i].pieceRow == row){
                movePiece = Piece.red[i];
                returnToStart(movePiece);
            }
        }
        for (int i = 0;i< Piece.yellow.length;i++){
            if (Piece.yellow[i].pieceColumn == column && Piece.yellow[i].pieceRow == row){
                movePiece = Piece.yellow[i];
                returnToStart(movePiece);
            }
        } 
        for (int i = 0;i< Piece.blue.length;i++){
            if (Piece.blue[i].pieceColumn == column && Piece.blue[i].pieceRow == row){
                movePiece = Piece.blue[i];
                returnToStart(movePiece);
            }
        } 
        for (int i = 0;i< Piece.green.length;i++){
            if (Piece.green[i].pieceColumn == column && Piece.green[i].pieceRow == row){
                movePiece = Piece.green[i];
                returnToStart(movePiece);
            }
        }
        Player.SwitchTurn();
    }
    public static  void pathHurricane(){// only if on the path
        if (!Sorry.newCard)
            return;
         
        int numPiece = 0;
        Piece currPiece; 
        for (Piece red: Piece.red){
            if(red.onPath){
                currPiece = red;
                newSpot(currPiece);
                System.out.println(currPiece.pieceRow+" "+currPiece.pieceColumn);
                while (spotTaken(currPiece)){
                    newSpot(currPiece);
                }
                if(!spotTaken(currPiece)){
                    Piece.newPieceRow[numPiece] = currPiece.pieceRow;
                    Piece.newPieceCol[numPiece] = currPiece.pieceColumn;
                }
                numPiece++;
            }
        }
        for (Piece yellow: Piece.yellow){
            if(yellow.onPath){
                currPiece = yellow;
                newSpot(currPiece);
                while (spotTaken(currPiece)){
                    newSpot(currPiece);
                }
                if(!spotTaken(currPiece)){
                    Piece.newPieceRow[numPiece] = currPiece.pieceRow;
                    Piece.newPieceCol[numPiece] = currPiece.pieceColumn;
                }
                numPiece++;
            }
        }
        for (Piece green: Piece.green){
            if(green.onPath){
                currPiece = green;
                newSpot(currPiece);
                while (spotTaken(currPiece)){
                    newSpot(currPiece);
                }
                if(!spotTaken(currPiece)){
                    Piece.newPieceRow[numPiece] = currPiece.pieceRow;
                    Piece.newPieceCol[numPiece] = currPiece.pieceColumn;
                }
                numPiece++;
            }
        }
        for (Piece blue: Piece.blue){
            if(blue.onPath){
                currPiece = blue;
                newSpot(currPiece);
                while (spotTaken(currPiece)){
                    newSpot(currPiece);
                }
                if(!spotTaken(currPiece)){
                    Piece.newPieceRow[numPiece] = currPiece.pieceRow;
                    Piece.newPieceCol[numPiece] = currPiece.pieceColumn;
                }
                numPiece++;
            }
        }
        
        Player.SwitchTurn();
    }
    public static  void fullHurricane(){// path and start zones
        if (!Sorry.newCard)
            return;
         
        int numPiece = 0;
        Piece currPiece; 
        
        checkPosition();
        
        for (Piece red: Piece.red){
            if(red.onPath || board[red.pieceRow][red.pieceColumn]== STARTRED ){
                currPiece = red;
                newSpot(currPiece);
                while (spotTaken(currPiece)){
                    newSpot(currPiece);
                }
                if(!spotTaken(currPiece)){
                    Piece.newPieceRow[numPiece] = currPiece.pieceRow;
                    Piece.newPieceCol[numPiece] = currPiece.pieceColumn;
                }
                numPiece++;
            }
        }
        for (Piece yellow: Piece.yellow){
            if(yellow.onPath || board[yellow.pieceRow][yellow.pieceColumn]== STARTYELLOW ){
                currPiece = yellow;
                newSpot(currPiece);
                while (spotTaken(currPiece)){
                    newSpot(currPiece);
                }
                if(!spotTaken(currPiece)){
                    Piece.newPieceRow[numPiece] = currPiece.pieceRow;
                    Piece.newPieceCol[numPiece] = currPiece.pieceColumn;
                }
                numPiece++;
            }
        }
        for (Piece green: Piece.green){
            if(green.onPath || board[green.pieceRow][green.pieceColumn]== STARTGREEN ){
                currPiece = green;
                newSpot(currPiece);
                while (spotTaken(currPiece)){
                    newSpot(currPiece);
                }
                if(!spotTaken(currPiece)){
                    Piece.newPieceRow[numPiece] = currPiece.pieceRow;
                    Piece.newPieceCol[numPiece] = currPiece.pieceColumn;
                }
                numPiece++;
            }
        }
        for (Piece blue: Piece.blue){
            if(blue.onPath || board[blue.pieceRow][blue.pieceColumn]== STARTBLUE ){
                currPiece = blue;
                newSpot(currPiece);
                while (spotTaken(currPiece)){
                    newSpot(currPiece);
                }
                if(!spotTaken(currPiece)){
                    Piece.newPieceRow[numPiece] = currPiece.pieceRow;
                    Piece.newPieceCol[numPiece] = currPiece.pieceColumn;
                }
                numPiece++;
            }
        }
        
        Player.SwitchTurn();
    }
    public static void randomSwitch(int row, int column , Piece movePiece){
        newSpot(movePiece);
        while(spotTakenNormal(movePiece.pieceRow, movePiece.pieceColumn)== false){
            newSpot(movePiece);}
        
        // find the piece that shares movepiece's location
        Piece switchPiece = null; 
        for (Piece red : Piece.red) {
            if (red.pieceRow == movePiece.pieceRow && red.pieceColumn == movePiece.pieceColumn && (red != movePiece) && red.getColor() != movePiece.getColor()) {
                switchPiece = red;
            }
        }
        for (Piece yellow : Piece.yellow) {
            if (yellow.pieceRow == movePiece.pieceRow && yellow.pieceColumn == movePiece.pieceColumn  && (yellow != movePiece)&& yellow.getColor() != movePiece.getColor()) {
                switchPiece = yellow;
            }
        }
        for (Piece green : Piece.green) {
            if (green.pieceRow == movePiece.pieceRow && green.pieceColumn == movePiece.pieceColumn  && (green != movePiece)&& green.getColor() != movePiece.getColor()) {
                switchPiece = green;
            }
        }
        for (Piece blue : Piece.blue) {
            if (blue.pieceRow == movePiece.pieceRow && blue.pieceColumn == movePiece.pieceColumn  && (blue != movePiece)&& blue.getColor() != movePiece.getColor()) {
                switchPiece = blue;
            }
        }
        if(switchPiece != null){
            switchPiece.pieceRow = row;
            switchPiece.pieceColumn = column;
        }
        else if (switchPiece != null) return;
        
    }
    public static void Switch(int x1pixel, int y1pixel, int x2pixel, int y2pixel){
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
        int column1 = x1pixel/xdelta;
        int row1 = y1pixel/ydelta;
        int column2 = x2pixel/xdelta;
        int row2 = y2pixel/ydelta;
//        System.out.println("switch reached");
        Piece piece1 = null; 
        Piece piece2 = null; 
        // find piece1
        for (Piece red : Piece.red) {
            if (red.pieceRow == row1 && red.pieceColumn == column1){
                piece1 = red;
            }
        }
        for (Piece yellow : Piece.yellow) {
            if (yellow.pieceRow == row1 && yellow.pieceColumn == column1){
                piece1 = yellow;
            }
        }
        for (Piece green : Piece.green) {
            if (green.pieceRow == row1 && green.pieceColumn == column1){
                piece1 = green;
            }
        }
        for (Piece blue : Piece.blue) {
            if (blue.pieceRow == row1 && blue.pieceColumn == column1){
                piece1 = blue;
            }
        }
        // find piece2
        for (Piece red : Piece.red) {
            if (red.pieceRow == row2 && red.pieceColumn == column2){
                piece2 = red;
            }
        }
        for (Piece yellow : Piece.yellow) {
            if (yellow.pieceRow == row2 && yellow.pieceColumn == column2){
                piece2 = yellow;
            }
        }
        for (Piece green : Piece.green) {
            if (green.pieceRow == row2 && green.pieceColumn == column2){
                piece2 = green;
            }
        }
        for (Piece blue : Piece.blue) {
            if (blue.pieceRow == row2 && blue.pieceColumn == column2){
                piece2 = blue;
            }
        }
        piece1.pieceRow = row2;
        piece1.pieceColumn = column2;
        piece2.pieceRow = row1;
        piece2.pieceColumn = column1;
                
        Player.SwitchTurn();
        Sorry.SwitchActive = false;Sorry.firstSelected = false;Sorry.secondSelected = false;
        Sorry.fpx = 0;Sorry.fpy= 0;Sorry.spx= 0;Sorry.spy= 0;
    }
    public static void TrueReset(){
//        Board.Reset();
        for (Piece red : Piece.red) {
            if (red.onPath){
                returnToStart(red);
            }
        }
        for (Piece yellow : Piece.yellow) {
            if (yellow.onPath){
                returnToStart(yellow);
            }
        }
        for (Piece green : Piece.green) {
            if (green.onPath){
                returnToStart(green);
            }
        }
        for (Piece blue : Piece.blue) {
            if (blue.onPath){
                returnToStart(blue);
            }
        }
        Player.SwitchTurn();
    }
    public static boolean spotTaken(Piece piece){// for the hurricane code to check if new spot chosen overlap with one just picked
        for(int i= 0;i < Piece.newPieceCol.length; i++){
            if (piece.pieceRow == Piece.newPieceRow[i]&& piece.pieceColumn == Piece.newPieceCol[i])
                return true;
        }
        return false;
    }
    public static boolean spotTakenNormal(int row, int col){
        for (Piece red : Piece.red) {
            if (red.pieceRow == row && red.pieceColumn == col) {
                return true;
            }
        }
        for (Piece yellow : Piece.yellow) {
            if (yellow.pieceRow == row && yellow.pieceColumn == col ) {
                return true;
            }
        }
        for (Piece green : Piece.green) {
            if (green.pieceRow == row && green.pieceColumn == col) {
                return true;
            }
        }
        for (Piece blue : Piece.blue) {
            if (blue.pieceRow == row && blue.pieceColumn == col) {
                return true;
            }
        }
        return false;
    }
    public static void newSpot(Piece piece){ // for hurricane code to pick a new spot for the piece to go
        piece.pieceRow = (int)(Math.random()*NUM_ROWS);
        piece.pieceColumn = (int)(Math.random()*NUM_COLUMNS);
        while (board[piece.pieceRow][piece.pieceColumn] != PATH && board[piece.pieceRow][piece.pieceColumn] != SLIDEEND){
            piece.pieceRow = (int)(Math.random()*NUM_ROWS);
            piece.pieceColumn = (int)(Math.random()*NUM_COLUMNS);
        }
    }
    public static void checkPosition(){ // checks that all pieces are where they say they are
        for (Piece red : Piece.red) {
            if (board[red.pieceRow][red.pieceColumn] == PATH || board[red.pieceRow][red.pieceColumn] == SLIDEEND || board[red.pieceRow][red.pieceColumn] == SLIDESTART ) {
                red.onPath = true;
            } else {red.onPath = false;}
            if(board[red.pieceRow][red.pieceColumn] == SAFTEYZONERED ){
                red.safe = true;
            } else{red.safe = false;}
            if(board[red.pieceRow][red.pieceColumn] == HOMERED ){
                red.home = true; 
            } else{red.home = false;}
        }
        for (Piece yellow : Piece.yellow) {
            if (board[yellow.pieceRow][yellow.pieceColumn] == PATH || board[yellow.pieceRow][yellow.pieceColumn] == SLIDEEND || board[yellow.pieceRow][yellow.pieceColumn] == SLIDESTART) {
                yellow.onPath = true;
            } else {yellow.onPath = false;}
            if(board[yellow.pieceRow][yellow.pieceColumn] == SAFTEYZONEYELLOW){
                yellow.safe = true;
            } else{yellow.safe = false;}
            if(board[yellow.pieceRow][yellow.pieceColumn] == HOMEYELLOW ){
                yellow.home = true; 
            } else{yellow.home = false;}
        }
        for (Piece green : Piece.green) {
            if (board[green.pieceRow][green.pieceColumn] == PATH || board[green.pieceRow][green.pieceColumn] == SLIDEEND || board[green.pieceRow][green.pieceColumn] == SLIDESTART) {
                green.onPath = true;
            } else {green.onPath = false;}
            if(board[green.pieceRow][green.pieceColumn] == SAFTEYZONEGREEN){
                green.safe = true;
            } else{green.safe = false;}
            if(board[green.pieceRow][green.pieceColumn] == HOMEGREEN ){
                green.home = true; 
            } else{green.home = false;}
        }
        for (Piece blue : Piece.blue) {
            if (board[blue.pieceRow][blue.pieceColumn] == PATH || board[blue.pieceRow][blue.pieceColumn] == SLIDEEND || board[blue.pieceRow][blue.pieceColumn] == SLIDESTART) {
                blue.onPath = true;
            } else {blue.onPath = false;}
            if(board[blue.pieceRow][blue.pieceColumn] == SAFTEYZONEBLUE){
                blue.safe = true;
            } else{blue.safe = false;}
            if(board[blue.pieceRow][blue.pieceColumn] == HOMEBLUE ){
                blue.home = true; 
            } else{blue.home = false;}
        }
    }
    public static void goHome(Piece piece){
        if(piece == Piece.red[0]){piece.pieceRow=13; piece.pieceColumn=6;}
        if(piece == Piece.red[1]){piece.pieceRow=14; piece.pieceColumn=6;}
        if(piece == Piece.red[2]){piece.pieceRow=13; piece.pieceColumn=7;}
        if(piece == Piece.red[3]){piece.pieceRow=14; piece.pieceColumn=7;}
         
        if(piece == Piece.yellow[0]){piece.pieceRow=2; piece.pieceColumn=8;}
        if(piece == Piece.yellow[1]){piece.pieceRow=2; piece.pieceColumn=9;}
        if(piece == Piece.yellow[2]){piece.pieceRow=1; piece.pieceColumn=8;}
        if(piece == Piece.yellow[3]){piece.pieceRow=1; piece.pieceColumn=9;}
          
        if(piece == Piece.blue[0]){piece.pieceRow=6; piece.pieceColumn=1;}
        if(piece == Piece.blue[1]){piece.pieceRow=6; piece.pieceColumn=2;}
        if(piece == Piece.blue[2]){piece.pieceRow=7; piece.pieceColumn=1;}
        if(piece == Piece.blue[3]){piece.pieceRow=7; piece.pieceColumn=2;}
        
        if(piece == Piece.green[0]){piece.pieceRow=9; piece.pieceColumn=14;}
        if(piece == Piece.green[1]){piece.pieceRow=9; piece.pieceColumn=13;}
        if(piece == Piece.green[2]){piece.pieceRow=8; piece.pieceColumn=14;}
        if(piece == Piece.green[3]){piece.pieceRow=8; piece.pieceColumn=13;}
        
        checkPosition();
    }
    public static void returnToStart(Piece piece){ // a lot of hard coding :/
        if(piece == Piece.red[0]){piece.pieceRow=10; piece.pieceColumn=1;}
        if(piece == Piece.red[1]){piece.pieceRow=11; piece.pieceColumn=1;}
        if(piece == Piece.red[2]){piece.pieceRow=10; piece.pieceColumn=2;}
        if(piece == Piece.red[3]){piece.pieceRow=11; piece.pieceColumn=2;}
         
        if(piece == Piece.yellow[0]){piece.pieceRow=4; piece.pieceColumn=14;}
        if(piece == Piece.yellow[1]){piece.pieceRow=5; piece.pieceColumn=14;}
        if(piece == Piece.yellow[2]){piece.pieceRow=4; piece.pieceColumn=13;}
        if(piece == Piece.yellow[3]){piece.pieceRow=5; piece.pieceColumn=13;}
          
        if(piece == Piece.blue[0]){piece.pieceRow=1; piece.pieceColumn=4;}
        if(piece == Piece.blue[1]){piece.pieceRow=1; piece.pieceColumn=5;}
        if(piece == Piece.blue[2]){piece.pieceRow=2; piece.pieceColumn=4;}
        if(piece == Piece.blue[3]){piece.pieceRow=2; piece.pieceColumn=5;}
        
        if(piece == Piece.green[0]){piece.pieceRow=14; piece.pieceColumn=11;}
        if(piece == Piece.green[1]){piece.pieceRow=14; piece.pieceColumn=10;}
        if(piece == Piece.green[2]){piece.pieceRow=13; piece.pieceColumn=11;}
        if(piece == Piece.green[3]){piece.pieceRow=13; piece.pieceColumn=10;}
        
        piece.onPath = false; 
        checkPosition();
    }
    public static void checkOverlap(Piece movePiece){
        // Sorry Overlap code. checking if the piece that just moved lands on another, if so send the old piece back to start
        for (Piece red : Piece.red) {
            if (red.pieceRow == movePiece.pieceRow && red.pieceColumn == movePiece.pieceColumn && (red != movePiece)) {
                if(board[red.pieceRow][red.pieceColumn] == PATH || board[red.pieceRow][red.pieceColumn] == SLIDEEND)
                    returnToStart(red);
            }
        }
        for (Piece yellow : Piece.yellow) {
            if (yellow.pieceRow == movePiece.pieceRow && yellow.pieceColumn == movePiece.pieceColumn && (yellow != movePiece)) {
                if(board[yellow.pieceRow][yellow.pieceColumn] == PATH  || board[yellow.pieceRow][yellow.pieceColumn] == SLIDEEND)
                    returnToStart(yellow);
            }
        }
        for (Piece green : Piece.green) {
            if (green.pieceRow == movePiece.pieceRow && green.pieceColumn == movePiece.pieceColumn && (green != movePiece)) {
                if(board[green.pieceRow][green.pieceColumn] == PATH  || board[green.pieceRow][green.pieceColumn] == SLIDEEND)
                    returnToStart(green);
            }
        }
        for (Piece blue : Piece.blue) {
            if (blue.pieceRow == movePiece.pieceRow && blue.pieceColumn == movePiece.pieceColumn && (blue != movePiece)) {
                if(board[blue.pieceRow][blue.pieceColumn] == PATH  || board[blue.pieceRow][blue.pieceColumn] == SLIDEEND)
                    returnToStart(blue);
            }
        }
    }
    public static boolean firstSelectValid(int xpixel, int ypixel){ // must be an on path, own player, and space not empty
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
        int column = xpixel/xdelta;
        int row = ypixel/ydelta;
        if(stuck())
            Player.SwitchTurn();
        
        if(Player.GetCurrentPlayer().getColor() == Color.red)
            for (Piece red : Piece.red) {
                if (red.pieceRow == row && red.pieceColumn == column && (red.onPath)){
                    return true;
                }
            }
        if(Player.GetCurrentPlayer().getColor() == Color.yellow)
            for (Piece yellow : Piece.yellow) {
                if (yellow.pieceRow == row && yellow.pieceColumn == column && (yellow.onPath)){
                    return true;
                }
            }
        if(Player.GetCurrentPlayer().getColor() == Color.green)
            for (Piece green : Piece.green) {
                if (green.pieceRow == row && green.pieceColumn == column && (green.onPath)){
                    return true;
                }
            }
        if(Player.GetCurrentPlayer().getColor() == Color.blue)
            for (Piece blue : Piece.blue) {
                if (blue.pieceRow == row && blue.pieceColumn == column && (blue.onPath)){
                    return true;
                }
            }
        return false;
    }
    public static boolean secondSelectValid(int xpixel, int ypixel){// must be on path, can't be own color, and space not empty
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
        int column = xpixel/xdelta;
        int row = ypixel/ydelta;
        
        for (Piece red : Piece.red) {
            if (red.pieceRow == row && red.pieceColumn == column && (red.onPath) && red.getColor() != Player.GetCurrentPlayer().getColor()){
                return true;
            }
        }
        for (Piece yellow : Piece.yellow) {
            if (yellow.pieceRow == row && yellow.pieceColumn == column && (yellow.onPath)&& yellow.getColor() != Player.GetCurrentPlayer().getColor() ){
                return true;
            }
        }
        for (Piece green : Piece.green) {
            if (green.pieceRow == row && green.pieceColumn == column && (green.onPath)&& green.getColor() != Player.GetCurrentPlayer().getColor()){
                return true;
            }
        }
        for (Piece blue : Piece.blue) {
            if (blue.pieceRow == row && blue.pieceColumn == column && (blue.onPath)&& blue.getColor() != Player.GetCurrentPlayer().getColor()){
                return true;
            }
        }
        return false; 
    }
    public static boolean stuck(){
        if(Player.GetCurrentPlayer().getColor() == Color.red)
            for (Piece red : Piece.red) {
                if (red.playable){
                    return false;
                }
            }
        if(Player.GetCurrentPlayer().getColor() == Color.yellow)
            for (Piece yellow : Piece.yellow) {
                if (yellow.playable){
                    return false;
                }
            }
        if(Player.GetCurrentPlayer().getColor() == Color.green)
            for (Piece green : Piece.green) {
                if (green.playable){
                    return false;
                }
            }
        if(Player.GetCurrentPlayer().getColor() == Color.blue)
            for (Piece blue : Piece.blue) {
                if (blue.playable){
                    return false;
                }
            }
        return true;
    }
    public static void checkPlayable(){// it's gonna be a long one 0-0
        checkPosition();
        if (Player.GetCurrentPlayer().getColor() == Color.red){// only tests the current player's pieces
            if (Cards.getCardInfo()<13){// if the card is just a move card
                for (Piece ptr : Piece.red) {
                    if(ptr.onPath) // if it's on the path, it's playable
                        ptr.playable = true;
                    else if( board[ptr.pieceRow][ptr.pieceColumn] == STARTRED && (Cards.getCardInfo() == 1 || Cards.getCardInfo() == 2)){ // if it's a 1 or 2 and pawn is on start, it's playable
                        ptr.playable = true;
                    }
                    else if(ptr.safe){// if the pawn is in safe zone 
                        ptr.playable = true; 
                        if(Cards.getCardInfo()!= 4 && Cards.getCardInfo() <= (6-ptr.pieceColumn) && (!spotTakenNormal(13,ptr.pieceColumn + Cards.getCardInfo()) || board [13][ptr.pieceColumn + Cards.getCardInfo()]== HOMERED) ) // playable if card # must be exact or less than and spot must be empty
                            ptr.playable = true; 
                        else if(Cards.getCardInfo()== 4)
                            ptr.playable = true;
                        else ptr.playable = false;
                    }else ptr.playable = false;// need part here if piece is on path but based on it's move, it'll be on another piece in safe
                    if(ptr.onPath && Cards.getCardInfo() != 4){// moves through the possible movements as a "ghost"
                        int row = ptr.pieceRow; int col = ptr.pieceColumn;
                        int maxCol =  NUM_COLUMNS-1; //left border of board
                        int maxRow =  NUM_ROWS-1; //bottom boarder of board
                        for(int i=0;i < Cards.getCardInfo();i++){
                            if(col < maxCol && (board[row][col+1] == SAFTEYZONERED || board[row][col +1] == HOMERED )){// will move past the forst home spot if too much
                                col++;
                                if(col>6){
                                    ptr.playable = false; 
                                }
                            }
                            else if(row== maxRow && col -1 >= 0){// left
                                col--;
                            }
                            else if(row-1 >= 0 && col == 0 ){// up
                                row--;
                            }
                            //move right
                            else if(row== 0 && col +1 <= maxCol){
                                col++;
                            }
                            //move down
                            else  if(col == maxCol && row+1 <= maxRow){
                                row++;
                            }
                            else {
                                //no move
                                row +=0;
                                col+=0;
                            }
                        }
                        if(board[row][col] == SAFTEYZONERED)
                                ptr.playable = true; 
                        if(board[row][col] == SAFTEYZONERED && spotTakenNormal(row,col))// if ends in saetey but spot is taken
                            ptr.playable = false; 
                    }
                }
            }
            if(Cards.getCardInfo()== 16){// if it's sorry, set playable if opponent is onPath, its own pieces cannot be played
                boolean pieceActive = false;
                for (Piece ptr : Piece.yellow){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                for (Piece ptr : Piece.green){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                for (Piece ptr : Piece.blue){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                if(pieceActive)
                    for (Piece ptr : Piece.red){
                        ptr.playable = board[ptr.pieceRow][ptr.pieceColumn]== STARTRED;
                    }
                else 
                    for (Piece ptr : Piece.red){
                        ptr.playable = false;
                    }
            }
            if(Cards.getCardInfo()== 15){ // if switch, set playable if piece is onPath. only playable if there are enemy pieces onPath
                boolean pieceActive = false;
                for (Piece ptr : Piece.yellow){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                for (Piece ptr : Piece.green){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                for (Piece ptr : Piece.blue){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                if(pieceActive)
                    for (Piece ptr : Piece.red){
                        ptr.playable = ptr.onPath;
                    }
                else 
                    for (Piece ptr : Piece.red){
                        ptr.playable = false;
                    }
            }
            if(Cards.getCardInfo()== 13 || Cards.getCardInfo()== 14 ){ // in hurricane and true reset all pieces on path and start are fair game
                for (Piece ptr : Piece.red){
                    ptr.playable = true;
                }
            }
            for (Piece ptr : Piece.red )// final check - if piece is in home, it's off limits
                if(ptr.home)
                    ptr.playable = false;
        }
        if(Player.GetCurrentPlayer().getColor() == Color.yellow){
            if (Cards.getCardInfo()<13){// if the card is just a move card
                for (Piece ptr : Piece.yellow) {
                    if(ptr.onPath) // if it's on the path, it's playable
                        ptr.playable = true;
                    else if( board[ptr.pieceRow][ptr.pieceColumn] == STARTYELLOW && (Cards.getCardInfo() == 1 || Cards.getCardInfo() == 2)){ // if it's a 1 or 2 and pawn is on start, it's playable
                        ptr.playable = true;
                    }
                    else if(ptr.safe){// if the pawn is in safe zone 
                        ptr.playable = true; 
                        if(Cards.getCardInfo()!= 4 && Cards.getCardInfo() <= (ptr.pieceColumn - 9) && (!spotTakenNormal(2,ptr.pieceColumn - Cards.getCardInfo()) || board[2][ptr.pieceColumn - Cards.getCardInfo()] == HOMEYELLOW))
                            ptr.playable = true; 
                        else if(Cards.getCardInfo()== 4)
                            ptr.playable = true; 
                        else ptr.playable = false;
                    } else ptr.playable = false; 
                    if(ptr.onPath && Cards.getCardInfo() != 4){// moves through the possible movements as a "ghost"
                        int row = ptr.pieceRow; int col = ptr.pieceColumn;
                        int maxCol =  NUM_COLUMNS-1; //left border of board
                        int maxRow =  NUM_ROWS-1; //bottom boarder of board
                        for(int i=0;i < Cards.getCardInfo();i++){
                            if(col > 0 && (board[row][col-1] == SAFTEYZONEYELLOW || board[row][col-1] == HOMEYELLOW)){// will move past the forst home spot if too much
                                col--;
                                if(col<9){
                                    ptr.playable = false; 
                                }
                            }
                            else if(row== maxRow && col -1 >= 0){// left
                                col--;
                            }
                            else if(row-1 >= 0 && col == 0 ){// up
                                row--;
                            }
                            //move right
                            else if(row== 0 && col +1 <= maxCol){
                                col++;
                            }
                            //move down
                            else  if(col == maxCol && row+1 <= maxRow){
                                row++;
                            }
                            else {
                                //no move
                                row +=0;
                                col+=0;
                            }
                        }
                        if(board[row][col] == SAFTEYZONEYELLOW)
                                ptr.playable = true; 
                        if(board[row][col] == SAFTEYZONEYELLOW && spotTakenNormal(row,col))
                            ptr.playable = false;
                    }
                }
            }
            if(Cards.getCardInfo()== 16){
                boolean pieceActive = false; 
                for (Piece ptr : Piece.red){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                for (Piece ptr : Piece.green){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                for (Piece ptr : Piece.blue){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                if(pieceActive)
                    for (Piece ptr : Piece.yellow){
                        ptr.playable = board[ptr.pieceRow][ptr.pieceColumn]== STARTYELLOW;
                    }
                else 
                    for (Piece ptr : Piece.yellow){
                        ptr.playable = false;
                    }
            }
            if(Cards.getCardInfo()== 15){ // if switch, set playable if piece is onPath
                for (Piece ptr : Piece.yellow){
                    ptr.playable = ptr.onPath;
                }
            }
            if(Cards.getCardInfo()== 13 || Cards.getCardInfo()== 14 ){ // in hurricane and true reset all pieces on path and start are fair game
                for (Piece ptr : Piece.yellow){
                    ptr.playable = true;
                }
            }
            for (Piece ptr : Piece.yellow )// final check - if piece is in home, it's off limits
                if(ptr.home)
                    ptr.playable = false;
        }
        if(Player.GetCurrentPlayer().getColor() == Color.green){
            if (Cards.getCardInfo()<13){// if the card is just a move card
                for (Piece ptr : Piece.green) {
                    if(ptr.onPath) // if it's on the path, it's playable
                        ptr.playable = true; 
                    else if( board[ptr.pieceRow][ptr.pieceColumn] == STARTGREEN && (Cards.getCardInfo() == 1 || Cards.getCardInfo() == 2)){ // if it's a 1 or 2 and pawn is on start, it's playable
                        ptr.playable = true;
                    }
                    else if(ptr.safe){// if the pawn is in safe zone 
                        ptr.playable = true; 
                        if(Cards.getCardInfo()!= 4 && Cards.getCardInfo() <= (ptr.pieceRow - 9) && (!spotTakenNormal(ptr.pieceRow -Cards.getCardInfo() ,13) || board[ptr.pieceRow -Cards.getCardInfo()][13] == HOMEGREEN))
                            ptr.playable = true; 
                        else if(Cards.getCardInfo()== 4)
                            ptr.playable = true; 
                        else ptr.playable = false;
                    } else ptr.playable = false;
                    if(ptr.onPath && Cards.getCardInfo() != 4){// "ghost" run
                        int row = ptr.pieceRow; int col = ptr.pieceColumn;
                        int maxCol =  NUM_COLUMNS-1; //left border of board
                        int maxRow =  NUM_ROWS-1; //bottom boarder of board
                        for(int i=0;i < Cards.getCardInfo();i++){
                            if(row>0 && (board[row - 1][col] == SAFTEYZONEGREEN || board[row - 1][col] == HOMEGREEN)){// will move past the forst home spot if too much
                                row--;
                                if (row<9){
                                    ptr.playable = false; 
                                }
                            }
                            else if(row== maxRow && col -1 >= 0){// left
                                col--;
                            }
                            else if(row-1 >= 0 && col == 0 ){// up
                                row--;
                            }
                            //move right
                            else if(row== 0 && col +1 <= maxCol){
                                col++;
                            }
                            //move down
                            else  if(col == maxCol && row+1 <= maxRow){
                                row++;
                            }
                            else {
                                //no move
                                row +=0;
                                col+=0;
                            }
                        }
                        if(board[row][col] == SAFTEYZONEGREEN)
                                ptr.playable = true; 
                        if(board[row][col] == SAFTEYZONEGREEN && spotTakenNormal(row,col))
                            ptr.playable = false; 
                    }
                }
            }
            if(Cards.getCardInfo()== 16){
                boolean pieceActive = false; 
                for (Piece ptr : Piece.red){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                for (Piece ptr : Piece.yellow){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                for (Piece ptr : Piece.blue){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                if(pieceActive)
                    for (Piece ptr : Piece.green){
                        ptr.playable = board[ptr.pieceRow][ptr.pieceColumn]== STARTGREEN;
                    }
                else 
                    for (Piece ptr : Piece.green){
                        ptr.playable = false;
                    }
            }
            if(Cards.getCardInfo()== 15){ // if switch, set playable if piece is onPath
                boolean pieceActive = false; 
                for (Piece ptr : Piece.red){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                for (Piece ptr : Piece.yellow){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                for (Piece ptr : Piece.blue){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                if(pieceActive)
                    for (Piece ptr : Piece.green){
                        ptr.playable = ptr.onPath;
                    }
                else 
                    for (Piece ptr : Piece.green){
                        ptr.playable = false;
                    }
            }
            if(Cards.getCardInfo()== 13 || Cards.getCardInfo()== 14 ){ // in hurricane and true reset all pieces on path and start are fair game
                for (Piece ptr : Piece.green){
                    ptr.playable = true;
                }
            }
            for (Piece ptr : Piece.green )// final check - if piece is in home, it's off limits
                if(ptr.home)
                    ptr.playable = false;
        }
        if(Player.GetCurrentPlayer().getColor() == Color.blue){
            if (Cards.getCardInfo()<13){// if the card is just a move card
                for (Piece ptr : Piece.blue) {
                    if(ptr.onPath) // if it's on the path, it's playable
                        ptr.playable = true; 
                    else if( board[ptr.pieceRow][ptr.pieceColumn] == STARTBLUE && (Cards.getCardInfo() == 1 || Cards.getCardInfo() == 2)){ // if it's a 1 or 2 and pawn is on start, it's playable
                        ptr.playable = true;
                    }
                    else if(ptr.safe){// if the pawn is in safe zone 
                        ptr.playable = true; 
                        if(Cards.getCardInfo()!= 4 && Cards.getCardInfo() <= (6 - ptr.pieceRow) && (!spotTakenNormal( Cards.getCardInfo() - ptr.pieceRow ,2) || board[Cards.getCardInfo() - ptr.pieceRow][2] == HOMEBLUE ))
                            ptr.playable = true; 
                        else if(Cards.getCardInfo()== 4)
                            ptr.playable = true; 
                        else ptr.playable = false;
                    }else ptr.playable = false; 
                    
                    if(ptr.onPath && Cards.getCardInfo() != 4){// ghost move
                        int row = ptr.pieceRow; int col = ptr.pieceColumn;
                        int maxCol =  NUM_COLUMNS-1; //left border of board
                        int maxRow =  NUM_ROWS-1; //bottom boarder of board
                        for(int i=0;i < Cards.getCardInfo();i++){ // needs the turninto start code
                            if(row<maxRow && (board[row + 1][col] == SAFTEYZONEBLUE || board[row + 1][col] == HOMEBLUE )){// will move past the forst home spot if too much
                                row++;
                                if(row > 6){
                                    ptr.playable = false; 
                                }
                            }
                            else if(row== maxRow && col -1 >= 0){// left
                                col--;
                            }
                            else if(row-1 >= 0 && col == 0 ){// up
                                row--;
                            }
                            //move right
                            else if(row== 0 && col +1 <= maxCol){
                                col++;
                            }
                            //move down
                            else  if(col == maxCol && row+1 <= maxRow){
                                row++;
                            }
                            else {
                                //no move
                                row +=0;
                                col+=0;
                            }
                        }
                        if(board[row][col] == SAFTEYZONEBLUE)
                                ptr.playable = true; 
                        if(board[row][col] == SAFTEYZONEBLUE && spotTakenNormal(row,col))
                            ptr.playable = false; 
                        if(board[row][col] != PATH && board[row][col] != SLIDEEND && board[row][col] != SLIDESTART && board[row][col] != SAFTEYZONEBLUE && col!= 2 && row!=6)
                            ptr.playable = false; 
                    }
                }
            }
            if(Cards.getCardInfo()== 16){
                boolean pieceActive = false; 
                for (Piece ptr : Piece.red){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                for (Piece ptr : Piece.yellow){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                for (Piece ptr : Piece.green){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                if(pieceActive)
                    for (Piece ptr : Piece.blue){
                        ptr.playable = board[ptr.pieceRow][ptr.pieceColumn]== STARTBLUE;
                    }
                else 
                    for (Piece ptr : Piece.blue){
                        ptr.playable = false;
                    }
            }
            if(Cards.getCardInfo()== 15){ // if switch, set playable if piece is onPath
                 boolean pieceActive = false; 
                for (Piece ptr : Piece.red){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                for (Piece ptr : Piece.yellow){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                for (Piece ptr : Piece.green){
                    if(ptr.onPath)
                        pieceActive = true;
                }
                if(pieceActive)
                    for (Piece ptr : Piece.blue){
                        ptr.playable = ptr.onPath;
                    }
                else 
                    for (Piece ptr : Piece.blue){
                        ptr.playable = false;
                    }
            }
            if(Cards.getCardInfo()== 13 || Cards.getCardInfo()== 14 ){ // in hurricane and true reset all pieces on path and start are fair game
                for (Piece ptr : Piece.blue){
                    ptr.playable = true;
                }
            }
            for (Piece ptr : Piece.blue )// final check - if piece is in home, it's off limits
                if(ptr.home)
                    ptr.playable = false;
        }
    }
    public static void Win(){
        Sorry.redWin = true;  
        for (Piece ptr : Piece.red) {
            if (board[ptr.pieceRow][ptr.pieceColumn] != HOMERED) {
                Sorry.redWin = false;
            }
        }
        Sorry.yellowWin = true;
        for (Piece ptr : Piece.yellow) {
            if (!ptr.home) {
                Sorry.yellowWin = false;
            }
        }
        Sorry.greenWin = true;
        for (Piece ptr : Piece.green) {
            if (!ptr.home) {
                Sorry.greenWin = false;
            }
        }
        Sorry.blueWin = true;
        for (Piece ptr : Piece.blue) {
            if (!ptr.home) {
                Sorry.blueWin = false;
            }
        }
    }
}
