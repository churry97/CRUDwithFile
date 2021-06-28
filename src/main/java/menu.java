import java.util.*;

public class menu {
    private List<employee> list;

    public menu(){
        this.list = new ArrayList<>();
    }

    public void printOption(){
        System.out.println("-------출퇴근 시간-------");
        System.out.println("1: 전체 조회");
        System.out.println("2: 생성");
        System.out.println("3: 업데이트");
        System.out.println("4: 삭제");
//        System.out.println("5: 이름 검색");
//        System.out.println("5: 오늘의 일꾼");
        System.out.println("0: 프로그램 종료");
        System.out.println("------------------------------");

    }
    public void selectOption(String input){
        switch (input) {
            case "1" -> readList();
            case "2" -> createList();
            case "3" -> updateList();
            case "4" -> deleteList();
//            case "5" -> showTopEmployee();
            case "0" -> {
                System.out.println("프로그램 종료");
                System.exit(0);
            }
            default -> System.out.println("다시 입력하세요");
        }
    }

    private boolean valid(int num) {
        if (this.list.size() <= num) {
            System.out.println("없는 번호 입니다.");
            return false;
        }
        return true;
    }

    private void readList(){
        System.out.println("| 번호  |  이름  |      날짜      |    출근시간    |   퇴근시간   |  시간  |");
        for (employee p: this.list) {
            System.out.println(p.toString());
        }
    }

    private void createList() {
        System.out.println("---------새로운 명부 작성---------");
        employee p = new employee();
        Scanner input = new Scanner(System.in);

        System.out.println("이름 입력");
        p.setName(input.next());
        System.out.println("날짜 입력");
        p.setDate(input.next());
        System.out.println("출근 시간 입력");
        p.setStartTime(input.next());
        System.out.println("퇴근 시간 입력");
        p.setFinishTime(input.next());

        p.setNum(this.list.size());
        this.list.add(p);
    }

    private void updateList(){
        System.out.println("---------명부 업데이트---------");
        System.out.println("수정 할 번호 입력");
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.next());

        if(valid(num)){
            System.out.println("이름 입력");
            this.list.get(num).setName(input.next());
            System.out.println("날짜 입력");
            this.list.get(num).setDate(input.next());
            System.out.println("출근 시간 입력");
            this.list.get(num).setStartTime(input.next());
            System.out.println("퇴근 시간 입력");
            this.list.get(num).setFinishTime(input.next());
        }
        else{
            updateList();
        }
    }

    private void deleteList(){
        System.out.println("삭제 할 번호 입력");
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.next());
        if(valid(num)) {
            this.list.remove(num);
            for(int i=0; i < list.size(); i++)
                this.list.get(i).setNum(i);
            System.out.println("삭제되었습니다.");
        }
        else {
            deleteList();
        }
    }

    private void showTopEmployee(){

    }
}
