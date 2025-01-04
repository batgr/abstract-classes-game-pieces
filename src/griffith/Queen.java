package griffith;

public class Queen extends GamePiece{
    public Queen(int[] location){
        super("Queen",location);
    }

    @Override
    public boolean move(int[] location){
        boolean isHorizontally = location[0] !=getLocation()[0] && location[1] == getLocation()[1];
        boolean isVertically = location[1] !=getLocation()[1] && location[0] == getLocation()[0];
        boolean isDiagonally = Math.abs(location[1]-getLocation()[1])==Math.abs(location[0]-getLocation()[0]);

        return isHorizontally || isVertically ||isDiagonally && (location[1]>=0 && location[1]<8 && location[0]>=0 && location[0]<8) ;
    }
}
