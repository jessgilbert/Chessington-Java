package training.chessington.model.pieces;

import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;
import training.chessington.model.Board;
import training.chessington.model.Coordinates;
import training.chessington.model.Move;
import training.chessington.model.PlayerColour;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends AbstractPiece {
    public Pawn(PlayerColour colour) {
        super(Piece.PieceType.PAWN, colour);
    }

    @Override
    public List<Move> getAllowedMoves(Coordinates from, Board board) {
        ArrayList<Move> moves = new ArrayList<Move>();

        if (colour == PlayerColour.WHITE) {
            Coordinates to = from.plus(-1, 0);
            Move move = new Move(from, to);

            moves.add(move);
        }
        else {
            Coordinates to = from.plus(+1, 0);
            Move move = new Move(from, to);

            moves.add(move);
        }

        return moves;
    }
}
