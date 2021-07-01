import java.util.*;

public class Search {
    public static void searchByName(List<employee> list, String keyword){
        Scanner sc = new Scanner(System.in);
        if(keyword.equals("name")){
            System.out.println("이름을 입력하세요.");
            String name = sc.next();

            System.out.println("| 번호  |  이름  |      날짜      |    출근시간    |   퇴근시간   |  시간  |");
            for( employee p : list ){
                if( p.getName().equals(name) ){
                    System.out.println(p.toString());
                }
            }
        }
        else{
            System.out.println("키워드를 설정해주세요.");

        }
    }
}