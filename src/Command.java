import java.util.ArrayList;
import java.util.Scanner;

public class Command {
    private ArrayList<Students> list = new ArrayList<Students>();

    public void introduce() {
        System.out.println("=====This is students management program=====");
        System.out.println("1.add new students massages");
        System.out.println("2.delete a student massage");
        System.out.println("3.show all students massage");
//        System.out.println("4.find student through the students'id");
        System.out.println("9.End");
        System.out.println("what do you want to do?");
//        Scanner sc = new Scanner(System.in);
    }

    public void max(int s) {

    }

    public void min() {

    }

    public void sum() {

    }

    public void add(Students s) {
        list.add(s);
    }

    public void delete() {
        System.out.println("please input the id ");
        Scanner sc = new Scanner(System.in);
        int re = sc.nextInt();
        list.remove(re - 1);
    }

    public void show() {
        for (Students i : list) {
            System.out.println("ID:" + i.getNumber() + "姓名：" + i.getName() + "\t" + "语文:"
                    + i.getChinese() + "\t" + "数学:" + i.getMath() + "\t" + "英语:" + i.getEnglish());
        }
    }

    public int find(int s) {
        System.out.println("please input a id ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNumber() == s) {
                return 1;
            }
        }
        return -1;
    }
}
