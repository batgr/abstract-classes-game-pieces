package griffith;

public class Rook extends GamePiece{
    public Rook(int[] location){
        super("Rook",location);
    }

    @Override
    public boolean move(int[] location){
        boolean isHorizontally = location[0] !=getLocation()[0] && location[1] == getLocation()[1];
        boolean isVertically = location[1] !=getLocation()[1] && location[0] == getLocation()[0];
        return (isHorizontally || isVertically) && (getLocation()[1]>=0 && getLocation()[1]<8 &&  location[0]>=0 && location[0]<8);
    }
}
