public class CheckUserShot {
    private String userShot;
    private int[] settedShip;
    private int damagedDeck = 0;

    String result;

    public void setUserShot (String userShot) {
        this.userShot = userShot;
    }

    public void setShip (int[] settedShip) {
        this.settedShip = settedShip;
    }

     public String checkingUserShot(){

        int shot = Integer.parseInt(userShot);
        String result = "промазал";


        for (int cell : settedShip){
            if (shot==cell){
                result = "попал";
                damagedDeck++;
                break;
            }
        }

        if (settedShip.length==damagedDeck){
            result = "Потопил";
        }

         return result;
     }

     public int getDamagedDeck() {
        return damagedDeck;
     }


}
