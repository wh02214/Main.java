public class Students {
    private int number;
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Students(int number,String name, int chinese, int math, int english) {
        super();
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public int getChinese() {
        return chinese;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public int getNumber() {
        return number;
    }
}
