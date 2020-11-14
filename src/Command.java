import java.util.ArrayList;
import java.util.Scanner;

public class Command {
    private ArrayList<Students> list = new ArrayList<Students>();
//    Students students = new Students("a", 60, 70, 80);

    public void max() {

    }

    public void min() {

    }

    public void sum() {

    }

    public void add(Students s) {
        list.add(s);
    }

    public void delete() {

    }

    public void show() {
        for (Students i : list) {
            System.out.println("姓名：" + i.getName() + "\t" + "语文:"
                    + i.getChinese() + "\t" + "数学:" + i.getMath() + "\t" + "英语:" + i.getEnglish());
        }
    }
}
