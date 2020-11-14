import java.util.Scanner;

public class Main extends Thread {
    public static void main(String[] args) {
        Command command = new Command();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);
        Scanner sc6 = new Scanner(System.in);
        for (int i = 0; ; i++) {
            command.introduce();
            int op = sc5.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("please input the student's number:");
                    int n = sc6.nextInt();
                    System.out.println("please input the student's name:");
                    String a = sc1.next();
                    System.out.println("please input the chinese scores:");
                    int c = sc2.nextInt();
                    System.out.println("please input the math scores:");
                    int m = sc3.nextInt();
                    System.out.println("please input the English scores:");
                    int e = sc4.nextInt();
                    command.add(new Students(n, a, c, m, e));
                    break;
                }
                case 2:
                    command.delete();
                    break;
                case 3:
                    command.show();
                    break;
                case 9:
                    System.exit(1);
            }
            System.out.println("wait...");
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
