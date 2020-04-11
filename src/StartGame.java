import java.util.Scanner;

public class StartGame {
    /*
    *
    */
    public static void main(String[] args) {
        //1. создаем объект класса "поле с кораблем"
        BattleField ship = new BattleField(); //создаем поле и корабль на нем
        MakeShot userShot = new MakeShot(); //объект с методом ввода выстрела
        CheckUserShot checkUserShot = new CheckUserShot(); //объект проверяющий выстрел

        boolean shipAlive = true;

        while (shipAlive == true) {

            checkUserShot.setShip(ship.getBattleField()); //передаем координаты корабля
            checkUserShot.setUserShot(userShot.getUserShot()); //передаем координаты выстрела

            //передаем, куда выстрелил пользователь
            String resultOfShot = checkUserShot.checkingUserShot();//получаем результат

            System.out.println("Ты " + resultOfShot + ". Подбито "+checkUserShot.getDamagedDeck()+" палуб\n\n");

            if (resultOfShot=="Потопил") {
                shipAlive=false;
            }
        }

        System.out.println("Игра завершена");
    }
}
