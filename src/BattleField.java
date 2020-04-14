public class BattleField {

    private int numOfFields = 10;
    private int numOfDeckInShip = 3;
    private int[] ship = new int[numOfDeckInShip];

    private int maxNumOfFirstField = numOfFields - numOfDeckInShip;

    public int[] getBattleField () {
        int randPlaceOfShip = (int) ((Math.random() * maxNumOfFirstField)+1);
        int shipsDeckZero=randPlaceOfShip;

        //проверка первой клетки. начало
        System.out.println("randPlaceOfShip = "+randPlaceOfShip);
        //проверка первой клетки. конец

        for (int i=0;  i<=numOfDeckInShip-1; i++) {
            ship[i]=shipsDeckZero;
            shipsDeckZero++;
        }
        return this.ship;
    }
}
