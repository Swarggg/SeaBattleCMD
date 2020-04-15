import java.util.ArrayList;

public class BattleField {

    private int numOfFields;
    private int numOfDeckInShip;
    private int[] ship;


    public BattleField (int fields, int decks) {
    this.numOfFields = fields;
    this.numOfDeckInShip = decks;
    }


    public ArrayList<Integer> getBattleField () {
        int maxNumOfFirstField = numOfFields - numOfDeckInShip;
        int shipsDeckZero=(int) ((Math.random() * (maxNumOfFirstField))+1);


        System.out.println("shipsDeckZero = "+shipsDeckZero);
        //проверка первой клетки. начало
        //System.out.println("randPlaceOfShip = "+randPlaceOfShip);
        //проверка первой клетки. конец
        // System.out.println("numOfDeckInShip = "+numOfDeckInShip);

        for (int i=0;  i<=numOfDeckInShip-1; i++) {
           ship[i]=shipsDeckZero;
            shipsDeckZero++;
            ship[i]=2;
        }



        ArrayList<Integer> shipArLi = new ArrayList<>();
        for (int x : ship){
            shipArLi.add(x);
        }
        return shipArLi;


    }
}
