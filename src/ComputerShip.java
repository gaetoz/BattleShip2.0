public class ComputerShip extends Tile {

    public ComputerShip(){}
    public ComputerShip(int x, int y) {
        super(x, y);
        isHit = false;
    }

    public String toString(){
        if (isHit == false) {
            return "C";
        } else{
            return "!";
        }
    }

    public void userStrikeComputerShip() {
        if (isHit == true) {
            System.out.println("Too bad.  That position was already played...  NEXT TURN!");
        } else {
            System.out.println("BAM!  We hit the enemy ship!");
            isHit = true;
        }
    }

    public void computerStrikeOwnShip() {
        if (isHit == true) {
            System.out.println("Too bad.  That position was already played...  NEXT TURN!");
        } else {
            System.out.println("HAHA! Computer sunk its own ship!");
            isHit = true;
        }
    }
}
