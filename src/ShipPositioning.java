import java.util.Random;
import java.util.Scanner;

public class ShipPositioning {

    public void UserPlacingShips(BattleShipsMap battleShipsMap){
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            System.out.print("Enter X coordinate [0-5] for your ship " + i + ": ");
            int x = input.nextInt();
            System.out.print("Enter Y coordinate [0-5] for your ship " + i + ": ");
            int y = input.nextInt();

            if (x < 0 || y < 0 || x > battleShipsMap.rows || y > battleShipsMap.columns) {
                System.out.println("You must play within the bounds of the map");
                i--;
                continue;
            }
            if(battleShipsMap.map[x][y] instanceof UserShip) {
                System.out.println("You already have a ship on this position");
                i--;
            } else if (battleShipsMap.map[x][y] instanceof EmptyTile) {
                battleShipsMap.map[x][y] = new UserShip(x, y);
            }
        }
        System.out.println("User ships deployed.");
        System.out.println();
    }

    public void ComputerPlacingShips(BattleShipsMap battleShipsMap) {
        Random rand = new Random();

        for (int k = 1; k < 6; k++) {
            int x = rand.nextInt(battleShipsMap.rows);
            int y = rand.nextInt(battleShipsMap.columns);
            if (battleShipsMap.map[x][y] instanceof EmptyTile){
                battleShipsMap.map[x][y] = new ComputerShip(x, y);
            } else{
                k--;
            }
        }
        System.out.println("Robot ships deployed.");
        System.out.println("----------------------------");
        System.out.println();
    }
}
