import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crud {
    private List<employee> list;

    public boolean valid(int num) {
        if (this.list.size() <= num) {
            System.out.println("없는 번호 입니다.");
            return false;
        }
        return true;
    }

    public void readList(ArrayList<employee>list){
        System.out.println("| 번호  |  이름  |      날짜      |    출근시간    |   퇴근시간   |  시간  |");
        for (employee p: list) {
            System.out.println(p.toString());
        }
    }

    public employee createList(ArrayList<employee>list) {
        int num;
        num = list.size();
        String name;
        String date;
        String startTime;
        String finishTime;
        int totalHours = 0;

        System.out.println("---------새로운 명부 작성---------");

        Scanner input = new Scanner(System.in);

        System.out.println("이름 입력");
        name = input.next();

        System.out.println("날짜 입력");
        date = input.next();

        System.out.println("출근 시간 입력");
        startTime = input.next();

        System.out.println("퇴근 시간 입력");
        finishTime = input.next();

        employee p = new employee(num, name, date, startTime, finishTime, totalHours);
        return p;
    }

    public void updateList(ArrayList<employee>list){
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
            updateList(list);
        }
    }

    public void deleteList(ArrayList<employee>list){
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
            deleteList(list);
        }
    }

//    public void showTopEmployee(){
//
//    }

//    public void searchEmployee(){
//
//    }
}
