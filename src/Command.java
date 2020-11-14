import java.util.ArrayList;
import java.util.Scanner;

public class Command {
    private ArrayList<Students> list = new ArrayList<Students>();

    public void introduce() {
        System.out.println("=====This is students management program=====");
        System.out.println("1.add new students massages");
        System.out.println("2.delete a student massage");
        System.out.println("3.show all students massage");
        System.out.println("9.End");
        System.out.println("what do you want to do?");
        Scanner sc = new Scanner(System.in);
    }

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
        Scanner sc = new Scanner(System.in);
        int re = sc.nextInt();
        list.remove(re-1);
    }

    public void show() {
        for (Students i : list) {
            System.out.println("姓名：" + i.getName() + "\t" + "语文:"
                    + i.getChinese() + "\t" + "数学:" + i.getMath() + "\t" + "英语:" + i.getEnglish());
        }
    }
}
