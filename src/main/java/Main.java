import java.util.*;

public class Main {
    public static void main(String[] args)  {
        ArrayList<employee> list;
        MenuOption menuOption = new MenuOption();
        Crud crud = new Crud();
        FileioService fileioService = new FileioService();
        Search search = new Search();
        list = fileioService.readFile();

        System.out.println("CRUD 프로그램 시작");

        while (true) {
            menuOption.printOption();
            Scanner input = new Scanner(System.in);
            String num = input.next();
            switch (num) {
                case "1" -> crud.readList(list);
                case "2" -> list.add(crud.createList(list));
                case "3" -> crud.updateList(list);
                case "4" -> crud.deleteList(list);
                case "5" -> fileioService.saveFile(list);
                case "6" -> search.searchByName(list, "name");
                case "0" -> {
                    System.out.println("프로그램 종료");
                    System.exit(0);
                }
                default -> System.out.println("다시 입력하세요");
            }
        }
    }
}