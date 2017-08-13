package ChessStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vamsavardhanavijay on 8/11/17.
 */

public class Bishop extends ChessPiece{
    public Bishop(int x,int y, String id)
    {
    super(x,y,id);
    }
    //Valid future positions
    public List<Position> validNextPositions(String[][] chessboard){
    	List<Position> valids=new ArrayList<Position>();
    	Position newpos=new Position(0,0);
    	//diag from left to right
    	for(int i=pos.getRow()+1,j=pos.getRow()-1,k=pos.getCol()+1,l=pos.getCol()-1;i<=8&&j>=0&&k<=8&&l>=0;
    			i++,j--,k++,l--){
    			newpos.setPosition(i,k);
            	if(newpos.isValid(i,k))
            		{
            		valids.add(newpos);
            		}
            	newpos.setPosition(j,l);
            	if(newpos.isValid(j,l))
            		{
            		valids.add(newpos);
            		}
    	}
    	//diag from right to left
    	for(int i=pos.getRow()-1,j=pos.getRow()+1,k=pos.getCol()-1,l=pos.getCol()+1;i>=0&&j<=8&&k>=0&&l<=8;
    			i--,j++,k--,l++){
    			newpos.setPosition(i,k);
            	if(newpos.isValid(i,k))
            		{
            		valids.add(newpos);
            		}
            	newpos.setPosition(j,l);
            	if(newpos.isValid(j,l))
            		{
            		valids.add(newpos);
            		}
    	}
    	
    	return valids;    	
    }



}
