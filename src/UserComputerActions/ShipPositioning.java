package UserComputerActions;

import Map.BattleShipsMap;
import Tiles.ComputerShip;
import Tiles.EmptyTile;
import Tiles.UserShip;

import java.util.Random;
import java.util.Scanner;

public class ShipPositioning {

    public void UserPlacingShips(BattleShipsMap battleShipsMap){    //throws ArrayIndexOutOfBoundsException  - thrown by JVM automatically
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            try {
                System.out.print("Enter X coordinate [0-5] for your ship " + i + ": ");
                int x = input.nextInt();
                System.out.print("Enter Y coordinate [0-5] for your ship " + i + ": ");
                int y = input.nextInt();

                //following block redundant since JVM automatically throws Runtime Exceptions
                // if (x < 0 || y < 0 || x > BattleShipsMap.ROWS || y > BattleShipsMap.COLUMNS) {
                    //throw new ArrayIndexOutOfBoundsException("Out of the Map. Retry!");
                //}
                if (battleShipsMap.map[x][y] instanceof UserShip) {
                    System.out.println("You already have a ship on this position");
                    i--;
                }
                if (battleShipsMap.map[x][y] instanceof EmptyTile) {
                    battleShipsMap.map[x][y] = new UserShip(x, y);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println("outside of the map. Please retry.");
                i--;
            }
        }
        System.out.println("User ships deployed.");
        System.out.println();
    }

    public void ComputerPlacingShips(BattleShipsMap battleShipsMap) {
        Random rand = new Random();

        for (int k = 1; k < 6; k++) {
            int x = rand.nextInt(BattleShipsMap.ROWS);  //BSM.ROWS rather than bSM.ROWS since static member
            int y = rand.nextInt(BattleShipsMap.COLUMNS);
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
