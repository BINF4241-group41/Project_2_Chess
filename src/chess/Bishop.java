package chess;

public class Bishop extends Piece implements ActPiece{

    private final String name;

    public Bishop(Color color, Square position){
        this.color=color;
        this.position=position;
        this.name="B";
    }
    public boolean makeCopy(){
        return new Bishop(this); //i've to check if it works or not
    }

    public String toString(){
		return "["+color.getColorDescription()+name+"]";
    }

    public boolean isMoveAllowed(Square mov){
        int y=position.getRank().getValue()-mov.getRank().getValue(); // |x-x1|=|y-y1|
        int x=position.getFile().getValue()-mov.getFile().getValue();
        if(x<0^y<0)x=-x;
        if (x==y)return true; //check the peices between
        return false;
    }
}