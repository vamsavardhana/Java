package ChessStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vamsavardhanavijay on 8/11/17.
 */

public class Knight extends ChessPiece{
    public Knight(int x,int y,String id){
        super(x,y,id);
    }
    //Return Valid positions
    public List<Position> validNextPositions(String[][] chessboard){
    	List<Position> valids=new ArrayList<Position>();
    	Position newpos=new Position(0,0);
    	for(int i=this.pos.getRow()-2;i<=this.pos.getRow()+2;i+=1){
    		for(int j=this.pos.getCol()-2;j<=this.pos.getCol()+2;j++){
    			if(i==this.pos.getRow()||j==this.pos.getCol()||checkdiags(this.pos.getRow(),this.pos.getCol(),i,j))
    			{continue;}
    			newpos.setPosition(i, j);
            	if(newpos.isValid(i,j))
            		{
            		valids.add(newpos);
            		}
    		}
    	}
    	return valids;    	
    }
    
    public boolean checkdiags(int x,int y,int i,int j)
    {
    	int chk=x-i;
    	if(y-j==chk){
    		return true;
    	}
    	return false;
    }

}
