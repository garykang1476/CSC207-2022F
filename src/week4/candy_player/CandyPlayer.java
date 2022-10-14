package week4.candy_player;

import java.util.Random;

public class CandyPlayer {

  private static int totalCandy = (new Random()).nextInt(100);

  private static int turn;
  private static int numOfPlayers;

  private int myCandy;
  private int id;

  public CandyPlayer(int numCandy) {
    this.myCandy = numCandy;
    id = numOfPlayers ++;
  }

  public int getMyCandy(){
    return myCandy;
  }

  public boolean play(int numCandy){

    if(turn != id){
      return false;
    }
    else{
      turn ++;
      if (turn == numOfPlayers){
        turn = 0;
      }
    }

    if(numCandy > myCandy){
      return false;
    }
    else {
      totalCandy = totalCandy + numCandy;
      myCandy = myCandy - totalCandy;

      if(totalCandy > numCandy * 2){
        totalCandy = totalCandy - numCandy * 2;
        myCandy = myCandy + numCandy * 2;
      }
      return true;
    }
  }

  public static int getTurn() {
    return turn;
  }

  public static void setTurn(int turn) {
    CandyPlayer.turn = turn;
  }

  public static int getNumOfPlayers() {
    return numOfPlayers;
  }

  public static void setNumOfPlayers(int numOfPlayers) {
    CandyPlayer.numOfPlayers = numOfPlayers;
  }


}