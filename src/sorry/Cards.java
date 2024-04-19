package sorry;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.*;

public class Cards {
    private enum Card {ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,ELEVEN,TWELVE,SORRY,SWITCH,TRUE_RESET,HURRICANE};
    
    private static Card action;
    private static boolean hurricaneUsed;
    private static boolean ResestUsed;
    private static boolean SwitchUsed;
    private static Sorry mainclass;
    private static Image cardBack;
    private static Image one;
    private static Image two;
    private static Image three;
    private static Image four;
    private static Image five;
    private static Image six;
    private static Image seven;
    private static Image eight;
    private static Image nine;
    private static Image ten;
    private static Image eleven;
    private static Image twelve;
    private static Image sorry;
    private static Image Switch;
    private static Image Reset;
    private static Image Hurricane;
    
    private static int cardsDrawn = 0;
    private static final int decksize = 53;
    
    Cards(){

    }
    public static void pickCard(){// different odds of picking a certain card
        int i = (int)(Math.random()*12);
        if(i<=2){action = Card.ONE;}
        else if( i>=3 && i<=8){ 
            int x = (int)(Math.random()*12); // equal odds of 2-12 and sorry
            if(x==0){action = Card.TWO;}
            else if(x==1){action = Card.THREE;}
            else if(x==2){action = Card.FOUR;}
            else if(x==3){action = Card.FIVE;}
            else if(x==4){action = Card.SIX;}
            else if(x==5){action = Card.SEVEN;}
            else if(x==6){action = Card.EIGHT;}
            else if(x==7){action = Card.NINE;}
            else if(x==8){action = Card.TEN;}
            else if(x==9){action = Card.ELEVEN;}
            else if(x==10){action = Card.TWELVE;}
            else if (x==11){action = Card.SORRY;}
        }
        else if (i==9){
            if(!SwitchUsed){
                action = Card.SWITCH;
                SwitchUsed = true;
            }
            else
                pickCard();
        }
        else if (i==10){
            if(!ResestUsed){
                action = Card.TRUE_RESET;
                ResestUsed = true;
            }
            else
                pickCard();
        }
        else if (i==11){
            if(!hurricaneUsed){
                action = Card.HURRICANE;
                hurricaneUsed = true;
            }
            else
                pickCard();
        }
        cardsDrawn++;
//        if (cardsDrawn % decksize ==(decksize - 1)){// "reshuffles" specials into the deck
//            hurricaneUsed = false;
//            ResestUsed = false;
//            SwitchUsed = false;
//        }
//        if (cardsDrawn % 20 == 19)
//            action = Card.ONE;
        if( action == Card.SWITCH ){Sorry.SwitchActive = true;}
        else{
            Sorry.SwitchActive = false;Sorry.firstSelected = false;Sorry.secondSelected = false;
            Sorry.fpx = 0;Sorry.fpy= 0;Sorry.spx= 0;Sorry.spy= 0;
        }
//        if(action == Card.SORRY)System.out.println("SORRY");
    }
    public static void equalpickCard(){
            int i = (int)(Math.random()*16);
            switch (i){
                case 0:                       
                action = Card.SORRY;
                break;
                case 1:                       
                action = Card.ONE;
                break;
                case 2:                       
                action = Card.TWO;
                break;
                case 3:                       
                action = Card.THREE;
                break;
                case 4:                       
                action = Card.FOUR;
                break;
                case 5:                       
                action = Card.FIVE;
                break;
                case 6:                       
                action = Card.SIX;
                break;
                case 7:                       
                action = Card.SEVEN;
                break;
                case 8:                       
                action = Card.EIGHT;
                break;
                case 9:                       
                action = Card.NINE;
                break;
                case 10:                       
                action = Card.TEN;
                break;
                case 11:                       
                action = Card.ELEVEN;
                break;
                case 12:                       
                action = Card.TWELVE;
                break;
                case 13:                       
                action = Card.SWITCH;
                break;
                case 14:
                if(!hurricaneUsed){
                    action = Card.HURRICANE;
                    hurricaneUsed = true;
                }
                else
                    pickCard();
                break;
                case 15:                       
                action = Card.TRUE_RESET;
                break;
            }
        } // equal chance at picking 

    public static void Reset()
    {
        action = null;
        hurricaneUsed = false;
        ResestUsed = false;
        SwitchUsed = false;
    }
    public static void Reset(Sorry _mainclass){
        mainclass = _mainclass;
        cardBack = Toolkit.getDefaultToolkit().getImage("./card.back.png");
        one= Toolkit.getDefaultToolkit().getImage("./card.one.png");
        two= Toolkit.getDefaultToolkit().getImage("./card.two.png");
        three= Toolkit.getDefaultToolkit().getImage("./card.three.png");
        four= Toolkit.getDefaultToolkit().getImage("./card.four.png");
        five= Toolkit.getDefaultToolkit().getImage("./card.five.png");
        six= Toolkit.getDefaultToolkit().getImage("./card.six.png");
        seven= Toolkit.getDefaultToolkit().getImage("./card.seven.png");
        eight= Toolkit.getDefaultToolkit().getImage("./card.eight.png");
        nine= Toolkit.getDefaultToolkit().getImage("./card.nine.png");
        ten= Toolkit.getDefaultToolkit().getImage("./card.ten.png");
        eleven= Toolkit.getDefaultToolkit().getImage("./card.eleven.png");
        twelve= Toolkit.getDefaultToolkit().getImage("./card.twelve.png");
        sorry= Toolkit.getDefaultToolkit().getImage("./card.sorry.png");
        Switch= Toolkit.getDefaultToolkit().getImage("./card.switch.png");
        Reset= Toolkit.getDefaultToolkit().getImage("./card.reset.png");
        Hurricane= Toolkit.getDefaultToolkit().getImage("./card.hurricane.png");
    }
    public static void drawCard(Graphics2D g,int xdelta,int ydelta) {
     // draws card box
        g.drawImage(cardBack,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
      // draws number of card & action 
        if(Sorry.newCard){
            if( action == Card.ONE){
                g.drawImage(one,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
            else if( action == Card.TWO){
                g.drawImage(two,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
            else if( action == Card.THREE){
                g.drawImage(three,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
            else if( action == Card.FOUR){
                g.drawImage(four,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
          }
            else if( action == Card.FIVE){
                g.drawImage(five,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
            else if( action == Card.SIX){
                g.drawImage(six,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
            else if( action == Card.SEVEN){
                g.drawImage(seven,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
            else if( action == Card.EIGHT){
                g.drawImage(eight,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
            else if( action == Card.NINE){
                g.drawImage(nine,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
            else if( action == Card.TEN){
                g.drawImage(ten,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
            else if( action == Card.ELEVEN){
                g.drawImage(eleven,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
            else if( action == Card.TWELVE){
                g.drawImage(twelve,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
            else if( action == Card.SORRY){
                g.drawImage(sorry,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
            else if( action == Card.TRUE_RESET){
                g.drawImage(Reset,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
            else if( action == Card.SWITCH){
                g.drawImage(Switch,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
            else if( action == Card.HURRICANE){
                g.drawImage(Hurricane,Window.getX(0),Window.getY(0),Window.getWidth2(),Window.getHeight2(),mainclass);
            }
        }
    }
    public static Card getCard(){
        return action;
    }
    public static int getCardInfo(){
        int num =0;
        if( action == Card.ONE)
            num = 1;
        else if( action == Card.TWO)
            num = 2;
        else if( action == Card.THREE)
            num = 3;
        else if( action == Card.FOUR)
            num = 4;
        else if( action == Card.FIVE)
            num = 5;
        else if( action == Card.SIX)
            num = 6;
        else if( action == Card.SEVEN)
            num = 7;
        else if( action == Card.EIGHT)
            num = 8;
        else if( action == Card.NINE)
            num = 9;
        else if( action == Card.TEN)
            num = 10;
        else if( action == Card.ELEVEN)
            num = 11;
        else if( action == Card.TWELVE)
            num = 12;
        else if (action == Card.TRUE_RESET)
            num = 13;
        else if (action == Card.HURRICANE)
            num = 14;
        else if (action == Card.SWITCH)
            num = 15;
        else if ( action == Card.SORRY)
            num = 16;
        return(num);
    }
   
}
