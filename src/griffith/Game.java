package griffith;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        GamePiece[] gamePieces = new GamePiece[16];

        for(int i=0;i<9;i++){
            //8 pawns
            if(i<8)gamePieces[i] = new Pawn(new int[]{1, i});
            else {
                //2 knights
                gamePieces[8] = new Knight(new int[]{1,0});
                gamePieces[9] = new Knight(new int[]{6,0});

                //2 Rooks
                gamePieces[10] = new Rook(new int[]{0,0});
                gamePieces[11] = new Rook(new int[]{7,0});

                //2 Bishops
                gamePieces[12]=new Bishop(new int[]{2,0});
                gamePieces[13]=new Bishop(new int[]{5,0});

                //1 Queen
                gamePieces[14] = new Queen(new int[]{3,0});

                //1 King
                gamePieces[15] = new King(new int[]{4,0});

            }

        }

        for (int i = 0; i < gamePieces.length; i++) {
            System.out.println(gamePieces[i].getPieceName() +" at pos: "+i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a piece by an index");
        int index = sc.nextInt();
        boolean isValid = false;
        if (index>=0 && index<16){
            GamePiece piece = gamePieces[index];
            System.out.println("Current location: "+ Arrays.toString(piece.getLocation()));
            System.out.println("give a coordinate x");
            int x = sc.nextInt();
            System.out.println("give a coordinate y");
            int y = sc.nextInt();
            System.out.println(piece.getPieceName());

            isValid = piece.move(new int[]{x,y});

        }

        if(isValid){
            System.out.println("valid move");
        }else System.out.println("not a valid move");






    }


}
