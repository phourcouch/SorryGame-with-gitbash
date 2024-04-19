package sorry;

import java.io.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

public class Sorry extends JFrame implements Runnable {
    boolean animateFirstTime = true;
    Image image;
    Graphics2D g;
   
    Image testStartImage;
    boolean StartGame;
    Image HowTo;
    public static boolean Directions;
    public static boolean blueWin;
    public static boolean redWin;
    public static boolean greenWin;
    public static boolean yellowWin;
    public static boolean newCard;
    public static boolean cardPlayed; // UNCOMMENT FRO REAL GAME look up cardPlayed to find it
    // variables for switch code proper
    public static boolean SwitchActive;
    public static boolean firstSelected;
    public static boolean secondSelected;
    public static int fpx;
    public static int fpy;
    public static int spx;
    public static int spy;
   
    public static void main(String[] args) {
        Sorry frame = new Sorry();
        frame.setSize(Window.WINDOW_WIDTH, Window.WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public Sorry() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                if (e.BUTTON1 == e.getButton() ) {
                    if(Directions) 
                        return;
                    if (Board.stuck()){
                        return;
                    }
                    if(blueWin || redWin|| greenWin || yellowWin )
                        return;
                    if(!SwitchActive){
                        int x = e.getX()- Window.getX(0);
                        int y = e.getY()- Window.getY(0);
                        Board.Move(x, y);
                    }
                    else if(SwitchActive && !firstSelected){
                        fpx = e.getX()- Window.getX(0);
                        fpy = e.getY()- Window.getY(0);
                        if(!Board.firstSelectValid(fpx,fpy)){
                            firstSelected = false;
                            return;
                        }
                        firstSelected = true;
                    }
                }
                if (e.BUTTON3 == e.getButton()) {
                    if(Directions) 
                        return;
                    if (Board.stuck()){
                        return;
                    }
                    if(blueWin || redWin|| greenWin || yellowWin )
                        return;
                    if(SwitchActive && firstSelected && !secondSelected){
                        spx = e.getX()- Window.getX(0);
                        spy = e.getY()- Window.getY(0);
                        if(!Board.secondSelectValid(spx,spy))
                            return;
                        secondSelected = true;
                    }
                    if(firstSelected && secondSelected){
                        Board.Switch(fpx, fpy, spx, spy);
                    }
                }
                repaint();
            }
        });
           

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {

        repaint();
      }
    });

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        repaint();
      }
    });

        addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if (e.VK_UP == e.getKeyCode()) {
                } else if (e.VK_DOWN == e.getKeyCode()) {
                } else if (e.VK_LEFT == e.getKeyCode()) {
                } else if (e.VK_RIGHT == e.getKeyCode()) {
                } else if (e.VK_ESCAPE == e.getKeyCode()) {
                    reset();
                }
                else if (e.VK_SPACE == e.getKeyCode()){
                    if(Directions) 
                        return;
                    if(blueWin || redWin|| greenWin || yellowWin )
                        return;
                    if (StartGame && cardPlayed){// uncomment for real game
//                    if (StartGame){ // comment for real game
                        cardPlayed = false;// uncomment for real game
                        newCard = true;
                        Cards.pickCard();
                        Board.checkPosition();
                        Board.checkPlayable();
                    }
                }
                else if (e.VK_S == e.getKeyCode()){
                    if(Directions) 
                        return;
                    if(!StartGame)
                        StartGame = true;
                    if(newCard)
                        Player.SwitchTurn();
                    Board.checkPosition();
                    Board.checkPlayable();
                }
                else if (e.VK_I == e.getKeyCode())
                    Directions = true;
                else if (e.VK_X == e.getKeyCode())
                    Directions = false;
                repaint();
            }
        });
        init();
        start();
    }
    Thread relaxer;
////////////////////////////////////////////////////////////////////////////
    public void init() {
        requestFocus();
    }
////////////////////////////////////////////////////////////////////////////
    public void destroy() {
    }
////////////////////////////////////////////////////////////////////////////
    public void paint(Graphics gOld) {
        if (image == null || Window.xsize != getSize().width || Window.ysize != getSize().height) {
            Window.xsize = getSize().width;
            Window.ysize = getSize().height;
            image = createImage(Window.xsize, Window.ysize);
            g = (Graphics2D) image.getGraphics();
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
        }
//fill background
       
        g.setColor(Color.black);
        g.fillRect(0, 0, Window.xsize, Window.ysize);

        int x[] = {Window.getX(0), Window.getX(Window.getWidth2()), Window.getX(Window.getWidth2()), Window.getX(0), Window.getX(0)};
        int y[] = {Window.getY(0), Window.getY(0), Window.getY(Window.getHeight2()), Window.getY(Window.getHeight2()), Window.getY(0)};
//fill border
        g.setColor(Color.white);
        g.fillPolygon(x, y, 4);
// draw border
        g.setColor(Color.black);
        g.drawPolyline(x, y, 5);

        if (animateFirstTime) {
            gOld.drawImage(image, 0, 0, null);
            return;
        }
         
        if(!StartGame)
            g.drawImage(testStartImage,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),this);
        else if (StartGame){
            Board.Draw(g);
        }
        if(Directions){
            g.drawImage(HowTo,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),this);
            g.setFont(new Font("Bahnschrift",Font.PLAIN,20));
            g.setColor(Color.white);
            g.drawString("[x] to close", 50,Window.getYNormal(0)+22);
        }
        else{
            g.setFont(new Font("Bahnschrift",Font.PLAIN,20));
            g.setColor(Color.white);
            g.drawString("[i] for instructions", 50,Window.getYNormal(0)+22);
        }
        gOld.drawImage(image, 0, 0, null);
    }

////////////////////////////////////////////////////////////////////////////
// needed for     implement runnable
    public void run() {
        while (true) {
            animate();
            repaint();
            double seconds = .1;    //time that 1 frame takes.
            int miliseconds = (int) (1000.0 * seconds);
            try {
                Thread.sleep(miliseconds);
            } catch (InterruptedException e) {
            }
        }
    }
   
/////////////////////////////////////////////////////////////////////////
    public void reset() {
        StartGame = false;
        Directions = false; 
        blueWin = false;
        redWin = false;
        greenWin = false;
        yellowWin = false;
        newCard = false;
        cardPlayed = true; // uncomment for real game

        SwitchActive = false;
        firstSelected = false;
        secondSelected = false;
        fpx = 0;fpy= 0;spx= 0;spy= 0;

        Board.Reset();
        Player.Reset();
        Cards.Reset();
        Board.Reset(this);
        Cards.Reset(this);
    }
/////////////////////////////////////////////////////////////////////////
    public void animate() {

        if (animateFirstTime) {
            animateFirstTime = false;
            if (Window.xsize != getSize().width || Window.ysize != getSize().height) {
                Window.xsize = getSize().width;
                Window.ysize = getSize().height;
            }
            testStartImage = Toolkit.getDefaultToolkit().getImage("./Sorry.png");
            HowTo = Toolkit.getDefaultToolkit().getImage("./HowTo.png");
            reset();

        }

       
    }

////////////////////////////////////////////////////////////////////////////
    public void start() {
        if (relaxer == null) {
            relaxer = new Thread(this);
            relaxer.start();
        }
    }
////////////////////////////////////////////////////////////////////////////
    public void stop() {
        if (relaxer.isAlive()) {
            relaxer.stop();
        }
        relaxer = null;
    }
//    public boolean getPlaying(){
//        return(playing);
//    }

}
