package UserComputerActions;

import Map.BattleShipsMap;
import Tiles.ComputerShip;
import Tiles.UserShip;

import java.util.Random;
import java.util.Scanner;

public class PlayerAttack {

    public void userAttack(BattleShipsMap battleShipsMap) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("YOUR TURN");
        System.out.print("Choose a coordinate X [0-5] to strike ship: ");
        int x = input.nextInt();
        System.out.print("Choose a coordinate Y [0-5] to strike ship: ");
        int y = input.nextInt();

        if (battleShipsMap.map[x][y] instanceof UserShip) {
            battleShipsMap.map[x][y].userStrikeOwnShip();

            } else if (battleShipsMap.map[x][y] instanceof ComputerShip) {
                battleShipsMap.map[x][y].userStrikeComputerShip();

                } else {
                    battleShipsMap.map[x][y].userStrikeWater();
                }
            }

    public void computerAttack(BattleShipsMap battleShipsMap) {
        Random rand = new Random();

        System.out.println("COMPUTER'S TURN");
        int x = rand.nextInt(battleShipsMap.rows);
        int y = rand.nextInt(battleShipsMap.columns);

        if (battleShipsMap.map[x][y] instanceof UserShip) {
            battleShipsMap.map[x][y].computerStrikeUserShip();

        } else if (battleShipsMap.map[x][y] instanceof ComputerShip) {
            battleShipsMap.map[x][y].computerStrikeOwnShip();

        } else{
            battleShipsMap.map[x][y].computerStrikeWater();
        }
    }
}
