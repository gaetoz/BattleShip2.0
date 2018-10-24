

public class BattleShipsMap {
    Tile map[][];
    int rows;
    int columns;
    int userShipsLeft;
    int computerShipsLeft;

    public BattleShipsMap(){}
    public BattleShipsMap(int x, int y) {
        this.rows = x;
        this.columns = y;
        this.map = new Tile[x][y];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                // EmptyTile can be overriden by UserShip or ComputerShip
                map[i][j] = new EmptyTile(i, j);
            }
        }
    }

    void displayMap(){
        System.out.println("   012345");
        userShipsLeft = 0;
        computerShipsLeft = 0;
        for(int i = 0; i < map.length; i++){
            System.out.print( i + " |");

            for(int j = 0; j < map.length; j++){
                System.out.print(map[i][j]);
                if (map[i][j] instanceof UserShip && map[i][j].isHit == false) {
                    userShipsLeft++;
                }
                if (map[i][j] instanceof ComputerShip && map[i][j].isHit == false) {
                    computerShipsLeft++;
                }
            }
            System.out.println("| " + i);
        }
        System.out.println("   012345");
    }

    public int getUserShipsLeft(){
        return userShipsLeft;
    }

    public int getComputerShipsLeft(){
        return computerShipsLeft;
    }


}





