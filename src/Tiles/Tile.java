package Tiles;

public abstract class Tile {
    int x;
    int y;
    public boolean isHit = false;

    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract String toString();
    public void userStrikeWater() { }
    public void userStrikeOwnShip() { }
    public void userStrikeComputerShip(){ }
    public void computerStrikeWater(){ }
    public void computerStrikeUserShip() { }
    public void computerStrikeOwnShip(){ }

}

