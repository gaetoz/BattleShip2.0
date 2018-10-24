
public class GameState {

    public boolean gameOn(BattleShipsMap battleShipsMap) {
        if (battleShipsMap.getUserShipsLeft() == 0) {
            System.out.println("Game over... You lose...");
            return false;
        }
        if (battleShipsMap.getComputerShipsLeft() == 0) {
            System.out.println("Great job... You win...");
            return false;
        }
        else{
            return true;
        }
    }

    public void gameOver(BattleShipsMap battleShipsMap){
        PlayerAttack playerAttack = new PlayerAttack(); //
        gameOn(battleShipsMap);

        if (gameOn(battleShipsMap) == false) {
            System.exit(0);
        }
        while (gameOn(battleShipsMap) == true) {
            playerAttack.userAttack(battleShipsMap);
            playerAttack.computerAttack(battleShipsMap);
            battleShipsMap.displayMap();
            System.out.println();
            System.out.println("User ships destroyed: " + battleShipsMap.getUserShipsLeft() + " | Computer ships destroyed: " + battleShipsMap.getComputerShipsLeft());
            System.out.println("--------------------------------------------");
         }
    }


}

