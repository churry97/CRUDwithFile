public class employee {
    private int num;
    private String name;
    private String date;
    private String startTime;
    private String finishTime;
    private int totalHour;

    public employee(){
    }

    public employee(int num, String name, String date, String startTime, String finishTime, int totalHour){
        this.num = num;
        this.name =  name;
        this.date = date;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.totalHour = totalHour;
    }

    @Override
    public String toString() {
        return "   " + num + "     " + name + "     " + date + "        " + startTime + "        " + finishTime + "       " + totalHour;
    }

    public void setNum(int num) { this.num = num; }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public void setTotalHour(int totalHour) {
        this.totalHour = totalHour;
    }

    public int getNum() { return num; }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public int getTotalHour() {
        return totalHour;
    }
}