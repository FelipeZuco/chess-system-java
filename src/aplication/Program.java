package aplication;

import Chess.ChessMatch;
import boardgame.Board;

public class Program {

	public static void main(String[] args) {

Board board = new Board (8,8);

ChessMatch chessMatch = new ChessMatch();
UI.printBoard(chessMatch.getPieces());
	}

}
