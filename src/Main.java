import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Command command = new Command();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        System.out.println("please in put the student's name:");
        String a = sc1.next();
        System.out.println("please input the chinese scores:");
        int c = sc2.nextInt();
        System.out.println("please input the math scores:");
        int m = sc3.nextInt();
        System.out.println("please input the English scores:");
        int e = sc3.nextInt();
        command.add(new Students(a, c, m, e));
        command.show();
    }
}
