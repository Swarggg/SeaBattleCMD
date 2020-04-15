import java.util.ArrayList;

public class CheckUserShot {
    private int userShot;
    //private int[] settedShip;
    private ArrayList<Integer> settedShipAr;
    private int damagedDeck = 0;

    String result;

    public void setUserShot (int userShot) {
        this.userShot = userShot;
    }

    public void setShip (ArrayList<Integer> settedShip) {
        this.settedShipAr = settedShip;
    }

    public String checkingUserShot(){


        //int shot = Integer.parseInt(userShot);
        String result = "промазал";

        int index = settedShipAr.indexOf(userShot);
        if (index >= 0) {
            settedShipAr.remove(index);
            damagedDeck++;
            result = "попал";
        }

        if (settedShipAr.isEmpty())
        {
            result= "потопил";
        }
        /*
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
            */
         return result;
     }

     public int getDamagedDeck() {

        return damagedDeck;
     }


}
