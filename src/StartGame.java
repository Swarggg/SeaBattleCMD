import java.util.ArrayList;

public class StartGame {
    public static void main(String[] args) {

        BattleField ship = new BattleField(10,4); //создаем поле и корабль на нем

        ArrayList<Integer> placedShip =  ship.getBattleField(); //устанавливаем корабль

        MakeShot userShot = new MakeShot(); //объект с методом ввода выстрела
        CheckUserShot checkUserShot = new CheckUserShot(); //объект проверяющий выстрел

        boolean shipAlive = true;

        while (shipAlive) {

            checkUserShot.setShip(placedShip); //передаем координаты корабля
            checkUserShot.setUserShot(userShot.getUserShot()); //передаем координаты выстрела

            //передаем, куда выстрелил пользователь
            String resultOfShot = checkUserShot.checkingUserShot();//получаем результат

            System.out.println("Ты " + resultOfShot + ". Подбито "+checkUserShot.getDamagedDeck()+" палуб\n------------------------");

            if (resultOfShot=="потопил") {
                shipAlive=false;
            }
        }
        System.out.println("Игра завершена");
    }
}
