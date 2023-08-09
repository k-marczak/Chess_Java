package main;

import pieces.Piece;

public class Check {

    Board board;

    public Check(Board board){
        this.board = board;
    }

    public boolean isKingChecked(Move move){

        Piece king = board.findKing(move.piece.isWhite);
        assert king != null;

        int kingCol = king.col;
        int kingRow = king.row;
        
        if(board.selectedPiece != null && board.selectedPiece.name.equals("King")){
            kingCol = move.newCol;
            kingRow = move.newRow;
        }

        return false;
    }


    private boolean hitByRook(int col, int row, Piece king, int kingCol, int kingRow, int colVal, int rowVal) {

        for(int i = 1; i < 8; i++){
            if(kingCol +(i * colVal) == col && kingRow + (i * rowVal) == row){
                break;
            }
            Piece piece = board.getPiece(kingCol + (i * colVal), kingRow + (i * rowVal));
            if(piece != null && piece != board.selectedPiece) {
                if(!board.sameTeam(piece, king) && (piece.name.equals("Rook") || piece.name.equals("Queen"))){
                    return true;
                }
                else{
                    break;
                }
            }
        }
        return false;
    }

    private boolean hitByBishop(int col, int row, Piece king, int kingCol, int kingRow, int colVal, int rowVal) {

        for(int i = 1; i < 8; i++){
            if(kingCol - (i * colVal) == col && kingRow - (i * rowVal) == row){
                break;
            }
            Piece piece = board.getPiece(kingCol - (i * colVal), kingRow - (i * rowVal));
            if(piece != null && piece != board.selectedPiece) {
                if(!board.sameTeam(piece, king) && (piece.name.equals("Bishop") || piece.name.equals("Queen"))){
                    return true;
                }
                else{
                    break;
                }
            }
        }
        return false;
    }


}
