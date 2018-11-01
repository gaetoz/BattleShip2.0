package Tiles;

public class EmptyTile extends Tile {
    public EmptyTile(int x, int y) {
        super(x, y);
    }

    public String toString(){
        if(isHit == false) {
            return " ";
        } else{
            return "-";
        }
    }

    public void userStrikeWater() {
        if (isHit == true){
            System.out.println("Too bad.  That position was already played...  NEXT TURN!");
        } else{
            System.out.println("SPLASH! ... You missed target!");
            isHit = true;
        }
    }

    public void computerStrikeWater(){
        if (isHit == true){
            System.out.println("Too bad.  That position was already played...  NEXT TURN!");
        } else{
            System.out.println("Computer missed target!");
            isHit = true;
        }
    }
}
