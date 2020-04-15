import java.util.Scanner;

public class MakeShot {
    public int getUserShot () {
        System.out.println("Введите номер клетки: ");
        Scanner shot = new Scanner(System.in);
        String x = shot.nextLine();
        int y = Integer.parseInt(x);
        return y;
    }
}
