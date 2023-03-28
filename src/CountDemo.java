public class CountDemo {
    public static void main(String[] args) {
        System.out.println("Arg: " + args[0]);
        count(1000);
        HomeWork homeWork = new HomeWork(103);
        System.out.println("Task: " + cal(100));
        homeWork.doHomeWork("Bdfdfd");
        System.out.println("Count completed!!");
    }

    public static int cal(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }

    public static void count(int to) {
        for (int i = 0; i < to; i++) {
            System.out.println("!!!!!!");
            System.out.println("Current number: " + i);
        }
    }
}
