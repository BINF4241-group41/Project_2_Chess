package chess;

public class Tower extends Piece implements ActPiece{
   
    private final String name;
    
    public Tower(Color color, Square position){
        this.color=color;
        this.position=position;
        this.name="T";
    }
    public String toString(){
		return "["+color.getColorDescription()+name+"]";
    }

    public boolean makeCopy(){
        return new Tower(this); //i've to check if it works or not
    }

    public boolean isMovePossible(Square mov){
        if (mov.getRank() != position.getRank()) return false;
        if (mov.getFile() != position.getFile()) return false;
        return true;
    } 
}
