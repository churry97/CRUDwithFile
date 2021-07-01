import java.io.*;
import java.util.*;

public class FileioService {

    public ArrayList<employee> readFile() {
        ArrayList<employee> list = new ArrayList<>();
        try {
            File file = new File("data.txt");
            FileReader filereader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(filereader);

            String line = "";

            while ((line = bufReader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, "/");

                int num = Integer.parseInt(st.nextToken().trim());
                String name = st.nextToken().trim();
                String date = st.nextToken().trim();
                String startTime = st.nextToken().trim();
                String finishTime = st.nextToken().trim();
                int totalHour = Integer.parseInt(st.nextToken().trim());

                list.add(new employee(num, name, date, startTime, finishTime, totalHour));
            }
            bufReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException e) {
            System.out.println(e);
        }
        return list;
    }

    public void saveFile(ArrayList<employee> list){
        try{
            File file = new File("data.txt");
            FileWriter fw = new FileWriter(file, false);
            for(employee p:list){ fw.write(p.getNum() + "/" + p.getName() + " / " + p.getDate() + " / " + p.getStartTime() + " / " + p.getFinishTime() + " / " + p.getFinishTime() + " / " + p.getTotalHour() + "\n"); }
            fw.flush();
            fw.close();
            System.out.println("파일을 저장하였습니다.");
        }catch(FileNotFoundException e){
            System.out.println("파일이 존재하지 않습니다.");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
