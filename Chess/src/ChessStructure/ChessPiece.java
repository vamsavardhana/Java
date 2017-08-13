package ChessStructure;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vamsavardhanavijay on 8/11/17.
 */

public class ChessPiece {
	//String id- Contains Black/White info and type i.e. rook/bishop/king etc
	String id;
    //Set and get Position
	String ChessPieces[]={"klb","krb","klw","krw","blb","brb","blw","brw","rlb","rrb","rlw"
			,"rrw","qb","qw","kb","kw","pw","pb"};
    Position pos;
    public ChessPiece(int x, int y, String ID)
    {
        pos.setPosition(x,y);     
        this.id=ID;
    }
    
    public String[][] setPosition(int x,int y,String[][] chessboard,String id){
        pos.setPosition(x,y);
        /*Check if position is valid
        Find current position. Find all valid next positions. 
        If next position x,y is not in list of valid next positions reject
       */
        List<Position> validPositions=new ArrayList<Position>();
        
        //Delete chess piece from current position
        boolean found=false;
        for(int i=0;i<chessboard.length;i++)
        	{
        	for(int j=0;j<chessboard[0].length;j++)
        		{
        		if(chessboard[i][j]==id)
        			{
        			chessboard[i][j]="";
        			found=true;
        			break;
        			}
        		}
        	if(found==true){
    			break;
    		}
        	}
        
        //Put Chess Piece in new position
        chessboard[x][y]=id;
        return chessboard;
        
    }
    public Position getPosition(){
        return(pos.getPosition());
    }
    //possible next locations
//Black/white

}
