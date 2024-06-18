package chess;

import boardgame.Position;

public class ChessPosition {
<<<<<<< HEAD

	private char column;
	private int row;

=======
	
	private char column;
	private int row;
	
>>>>>>> 7a36d1575f103f53e2a83b42acf437512d733c6d
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException(" Error instanting ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
<<<<<<< HEAD

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

=======
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
>>>>>>> 7a36d1575f103f53e2a83b42acf437512d733c6d
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	@Override
	public String toString(){
		return "" + column + row;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 7a36d1575f103f53e2a83b42acf437512d733c6d
