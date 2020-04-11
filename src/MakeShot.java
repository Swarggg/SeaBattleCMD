import java.util.Scanner;

public class MakeShot {
    public String getUserShot () {
        System.out.println("Введите номер клетки: ");
        Scanner shot = new Scanner(System.in);
        return shot.nextLine();
    }
}
