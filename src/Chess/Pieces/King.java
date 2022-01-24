package Chess.Pieces;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }
    public String toString() {
        return "K";
    }
}
