package griffith;

public class Pawn extends GamePiece{
    public Pawn(int[] location){
        super("Pawn",location);
    }

    @Override
    public boolean move(int[] location){

        return location[1] == getLocation()[1] + 1 && location[0]== getLocation()[0] && (location[1]<8 && location[1]>=0);
    }
}
