package griffith;

public class King extends GamePiece{
    public King(int[] location){
        super("King",location);
    }

    @Override
    public boolean move(int[] location){
        boolean isOneStepHorizontally = location[0]==getLocation()[0]+1 || location[0]==getLocation()[0]-1;
        boolean isOneStepVertically = location[1]==getLocation()[1]+1 || location[1]==getLocation()[1]-1;
        boolean isOneStepDiagonally = isOneStepHorizontally && isOneStepVertically;

        return isOneStepDiagonally||isOneStepVertically||isOneStepHorizontally && (location[1]>=0 && location[1]<8 && location[0]>=0 && location[0]<8);
    }
}
