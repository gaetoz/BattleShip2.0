
public class BattleShipsGame {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("**** Welcome to the Battle Ships games ****");
        System.out.println();
        System.out.println("Right now, the sea is empty.");
        System.out.println();
        System.out.println("DEPLOY SHIPS");
        System.out.println();

        BattleShipsMap map1 = new BattleShipsMap(6, 6);
        map1.displayMap();

        ShipPositioning shipPositioning = new ShipPositioning();
        shipPositioning.UserPlacingShips(map1);
        shipPositioning.ComputerPlacingShips(map1);
        map1.displayMap();

        GameState gameState = new GameState();
        gameState.gameOver(map1);
    }
}



