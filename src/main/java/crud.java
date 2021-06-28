import java.util.*;

public class crud {
    public static void main(String[] args) {
        menu q = new menu();
        System.out.println("CRUD 프로그램 시작");

        while (true) {
            q.printOption();
            Scanner input = new Scanner(System.in);
            String num = input.next();
            q.selectOption(num);
        }
    }
}