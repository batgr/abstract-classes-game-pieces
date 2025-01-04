package griffith;

public class Knight extends GamePiece {
    public Knight(int[] location){
        super("Knight",location);
    }

    @Override
    public boolean move(int[] location){
        boolean is2StepForward = location[0]==getLocation()[0]+2;
        boolean is2StepBackward = location[0]==getLocation()[0]-2;
        boolean is2StepLeft = location[1]==getLocation()[1]+2;
        boolean is2StepRight = location[1]==getLocation()[1]-2;
        return (is2StepLeft ||is2StepRight) && ( is2StepForward||is2StepBackward) && (location[1]>=0 && location[1]<8 && location[0]>=0 && location[0]<8) ;
    }
}
