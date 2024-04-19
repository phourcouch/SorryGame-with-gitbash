package sorry;


import java.awt.Color;

public class Player {
    
    private static Player currentTurn;
    private static Player players[] = new Player[4];
    private Color color;    

    public static void Reset()
    {
        players[0] = new Player(Color.red);
        players[1] = new Player(Color.green);
        players[2] = new Player(Color.yellow);
        players[3] = new Player(Color.blue);
        currentTurn = players[(int)(Math.random()*4)];
    }
    public static Player GetCurrentPlayer()
    {
        return(currentTurn);
    }
    public static void SwitchTurn()
    {
        if (currentTurn == players[0]){
            currentTurn = players[1];
        }
        else if (currentTurn == players[1]){
            currentTurn = players[2];
        }
        else if (currentTurn == players[2]){
            currentTurn = players[3];
        }
        else if (currentTurn == players[3]){
            currentTurn = players[0];
        }
        Board.checkPosition();
        Board.checkPlayable();
        Sorry.newCard = false;
        Sorry.cardPlayed = true;// uncomment for real game
    }    
    
    Player(Color _color)
    {
        color = _color;
    }
    public Color getColor()
    {
        return (color);
    }

        
}
