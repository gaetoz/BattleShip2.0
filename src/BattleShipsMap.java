
public class BattleShipsMap {
    Tile map[][];
    int rows;
    int columns;

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
        for(int i = 0; i < map.length; i++){
            System.out.print( i + " |");

            for(int j = 0; j < map.length; j++){
                System.out.print(map[i][j]);
            }
            System.out.println("| " + i);
        }
        System.out.println("   012345");
    }

}





