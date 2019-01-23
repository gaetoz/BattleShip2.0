package Map;

import Tiles.ComputerShip;
import Tiles.EmptyTile;
import Tiles.Tile;
import Tiles.UserShip;

public class BattleShipsMap {
    //set ROWS, COLUMNS to static final (6)
    public Tile map[][];
    public static final int ROWS = 6;
    public static final int COLUMNS = 6;

    public BattleShipsMap() {
        //removed parameters x and y
        //this.ROWS = x;
        //this.COLUMNS = y;
        this.map = new Tile[ROWS][COLUMNS];


       /*
       for(Tile[] inner : map){
            for(map[i][j] : inner){
                map[i][j] = new EmptyTile(i, j);
            }
        }*/

        for (int i = 0; i < map.length; i++) {
            //added [i] to map.length, good practice esp. in asymmetric multiD Array
            for (int j = 0; j < map[i].length; j++) {
                // Tiles.EmptyTile can be overriden by Tiles.UserShip or Tiles.ComputerShip
                map[i][j] = new EmptyTile(i, j);
            }
        }
    }

    public void displayMap(){
        System.out.println("   012345");
        for(int i = 0; i < map.length; i++){
            System.out.print( i + " |");
            for(int j = 0; j < map.length; j++){
                System.out.print(map[i][j]);
            }
            System.out.println("| " + i);
        }
        System.out.println("   012345");
    }

    public int getUserShipsLeft() {
        int userShipsLeft = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] instanceof UserShip && map[i][j].isHit == false) {
                    userShipsLeft++;
                }
            }
        }
        return userShipsLeft;
    }

    public int getComputerShipsLeft() {
        int computerShipsLeft = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] instanceof ComputerShip && map[i][j].isHit == false) {
                    computerShipsLeft++;
                }
            }
        }
        return computerShipsLeft;
    }

}





