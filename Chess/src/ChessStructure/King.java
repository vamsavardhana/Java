package ChessStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vamsavardhanavijay on 8/11/17.
 */

public class King extends ChessPiece{
    //Set and get Position
    Position pos;
    public King(int x, int y, String id)
    {
    super(x,y,id);
    }
    //Valid Next Positions
    public List<Position> validNextPositions(String[][] chessboard){
    	List<Position> valids=new ArrayList<Position>();
    	Position newpos=new Position(0,0);
    	for(int i=pos.getRow()-1;i<=pos.getRow()+1;i++){
    		for(int j=pos.getCol()-1;j<=pos.getCol()+1;j++){
    			newpos.setPosition(i, j);
            	if(newpos.isValid(i,j))
            		{
            		valids.add(newpos);
            		}
    		}
    	}
    	return valids;    	
    }
}
