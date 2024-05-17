class Chess{

     String player1="Vishwanathan anand";
     String player2="Magnus Carlsen";
     int matchNo= 12;

     void match(){
         System.out.println("match NO. =" + matchNo);
         System.out.println("The winner is " + player1);
     }

}

class ChessChampionship{
    public static void main(String[] args){
        Chess obj= new Chess();
        obj.match();
    }

}