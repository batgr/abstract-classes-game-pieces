package griffith;

abstract public class GamePiece {
    private String pieceName;
    private int[] location;

    public GamePiece(String pieceName,int[] location){
        this.pieceName=pieceName;
        this.location=location;
    }

    abstract public boolean move(int[] location);

    public void setPieceName(String pieceName){
        this.pieceName=pieceName;
    }
    public void setLocation(int[] location){
        if (move(location)) this.location=location;
    }

    public String getPieceName() {
        return pieceName;
    }

    public int[] getLocation() {
        return location;
    }
}
