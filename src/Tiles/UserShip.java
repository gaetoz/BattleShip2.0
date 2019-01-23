package Tiles;

public class UserShip extends Tile {

    public UserShip(int x, int y) {
        super(x, y);
        isHit = false;
    }

    public String toString() {
        if (isHit == false) {
            return "U";
        } else {
            return "X";
        }
    }

    public void userStrikeOwnShip() {
        if (isHit == true) {
            System.out.println("Too bad.  That position was already played...  NEXT TURN!");
        } else {
            System.out.println("We have been hit by one of our own ships!");
            isHit = true;
        }
    }

    public void computerStrikeUserShip() {
        if (isHit == true) {
            System.out.println("Too bad.  That position was already played...  NEXT TURN!");
        } else {
            System.out.println("BOOM!  We have been hit by computer!");
            isHit = true;
        }
    }
}
