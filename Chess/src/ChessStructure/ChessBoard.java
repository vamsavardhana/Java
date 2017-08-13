package ChessStructure;

/**
 * Created by vamsavardhanavijay on 8/11/17.
 */


public class ChessBoard {
//Chess board has 64 squares: from bottom to top 1 to 8 and from left to right a to h
//Each square to house
    
    
	String chessboard[][]={
			{"rlb","klb","blb","kb","qb","brb","krb","rrb"},
			{"pb","pb","pb","pb","pb","pb","pb","pb"},
			{"","","","","","","",""},
			{"","","","","","","",""},
			{"","","","","","","",""},
			{"","","","","","","",""},
			{"","","","","","","",""},
			{"pw","pw","pw","pw","pw","pw","pw","pw"},
			{"rrw","krw","brw","kw","qw","blw","klw","rrb"}
    	};
    

//chess board can be checkmated or not- get
    public boolean checkmate=false;
    public boolean BlackonCheck=false;
    public boolean WhiteonCheck=false;
    public Status status=Status.WHITE;

//Black Pieces
    private ChessPiece rlb,rrb,klb,krb,blb,brb,kb,qb;private ChessPiece[] blk;

//White Pieces
    private ChessPiece rlw,rrw,klw,krw,blw,brw,kw,qw;private ChessPiece[] wht;
//chess board can be initialized or not- set/get
    ChessBoard(){
        //array of black and white pawns with initazlization
        blk=new Pawn[8];
        wht=new Pawn[8];
        int blki=1,rti=6;
        for(int i=0;i<8;i++)
        {
            blk[i]=new Pawn(1,i,"pb");
            wht[i]=new Pawn(6,i,"pw");
        }
        //rlb-->Rook Left Black     rwb-->Rook Right Black      rlw-->Rook Left White   rrw-->Rook Right White
        rlb= new Rook(0,0,"rlb");
        rrb=new Rook(0,7,"rrb");
        rlw=new Rook(7,0,"rlw");
        rrw=new Rook(7,7,"rrw");
        klb=new Knight(0,1,"klb");
        krb=new Knight(0,6,"krb");
        klw=new Knight(7,1,"klw");
        krw=new Knight(7,6,"krw");
        blb=new Bishop(0,2,"blb");
        brb=new Bishop(0,5,"brb");
        blw=new Bishop(7,2,"blw");
        brw=new Bishop(7,5,"brw");
        kb=new King(0,3,"kb");
        kw=new King(7,3,"kw");
        qb=new Queen(0,4,"qb");
        qw=new Queen(7,4,"qw");
    }
//team white/black
//whites move/blacks move-getand set





}




