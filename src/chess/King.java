package chess;


public class King extends Piece {

    private final String name;
    private static final int MAX_MOV = 1;

    public King(Color color, Square position) {
        this.color = color;
        this.position = (position != null ? position.makeCopy() : null);
        this.name = "K";
    }

    public King makeCopy() {
        return new King(this.color, this.position);
    }

    public String toString() {
        return "[" + color.getColorDescription() + name + "]";
    }

    public boolean isMoveAllowed(GameBoard gameBoard, Rank rank, File file) {

        if (Math.abs(rank.getValue() - position.getRank().getValue()) > MAX_MOV) return false;
        if (Math.abs(file.getValue() - position.getFile().getValue()) > MAX_MOV) return false;

        if (this.position.getRank() == rank && this.position.getFile() == file) {
            return false; // origin == destination
        }

        return true;
    }
}