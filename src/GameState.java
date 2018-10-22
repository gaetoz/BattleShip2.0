public class GameState {

    public boolean gameOn(PlayerAttack playerAttack) {
        if (playerAttack.numberOfUserShipsHit == 5) {
            System.out.println("Game over... You lose...");
            return false;
        }
        if (playerAttack.numberOfComputerShipsHit == 5) {
            System.out.println("Great job... You win...");
            return false;
        } else{
            return true;
        }
    }
    public void gameOver(BattleShipsMap battleShipsMap){
        PlayerAttack playerAttack = new PlayerAttack();
        gameOn(playerAttack);
        if (gameOn(playerAttack) == false) {
            System.exit(0);
        }
        while (gameOn(playerAttack) == true) {
            battleShipsMap.displayMap();
            playerAttack.userAttack(battleShipsMap);
            playerAttack.computerAttack(battleShipsMap);
            System.out.println();
            System.out.println("User ships destroyed: " + playerAttack.numberOfUserShipsHit + " | Computer ships destroyed: " + playerAttack.numberOfComputerShipsHit);
            System.out.println("--------------------------------------------");
         }
    }
}
