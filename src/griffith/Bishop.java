package griffith;

public class Bishop extends GamePiece {
    public Bishop(int[] location){
        super("Bishop",location);
    }

    @Override
    public boolean move(int[] location){

        int numberOfVerticallyMoves = Math.abs(location[1]-getLocation()[1]);
        //boolean isAllowed = location[1] != getLocation()[1]   && (location[0] == getLocation()[0] + numberOfVerticallyMoves || location[0] == getLocation()[0] - numberOfVerticallyMoves);
        boolean isDiagonally = Math.abs(location[1]-getLocation()[1])==Math.abs(location[0]-getLocation()[0]);
        return isDiagonally &&  (location[1]>=0 && location[1]<8 && location[0]>=0 && location[0]<8) ;
    }
}
