package ChessStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vamsavardhanavijay on 8/11/17.
 */

public class Rook extends ChessPiece{
    public Rook(int x,int y,String id){
        super(x,y,id);
    }
    public List<Position> validNextPositions(String[][] chessboard){
    	List<Position> valids=new ArrayList<Position>();
    	Position newpos=new Position(0,0);
    	//rook from left to right
    	for(int i=0;i<=8;i++){
    		if(i==pos.getRow())
    			{
    				continue;
    			}
    			newpos.setPosition(i,pos.getCol());
            	if(newpos.isValid(i,pos.getCol()))
            		{
            		valids.add(newpos);
            		}
            }
    	//rook from top to bottom
    	for(int i=0;i<=8;i++){
    		if(i==pos.getCol())
    			{
    				continue;
    			}
    			newpos.setPosition(pos.getRow(),i);
            	if(newpos.isValid(pos.getRow(),i))
            		{
            		valids.add(newpos);
            		}
            }
    	
    	
    	return valids;    	
    }

}
