package ChessStructure;

/**
 * Allowed to get and set positions of pieces on chess board
 */

public class Position {
	private int row;
    private int col;
    public Position(int row1,int col1)
    {
        this.row=row1;
        this.col=col1;
    }
    
    //Set Position
    public void setPosition(int row1,int col1)
    {
        this.row=row1;
        this.col=col1;
    }
    
    //Return row and column
    public int getRow(){
    	return row;
    }
    
    public int getCol(){
    	return col;
    }
    
    
    public Position getPosition(){
        return(this);
    }
    
    //Check if a position is valid
    public boolean isValid(int x,int y){
    	if(x<=7&&x>=0&&y>=0&&y<=7){
    		return true;
    	}
    	else{
    		return false;
    	}
    	
    }
}
