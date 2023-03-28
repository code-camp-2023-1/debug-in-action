public class MultiThreadDemo {
    public static void main(String[] args) {
        // 需求1 ：t2全部打印完，然后t1再打印
        // 需求2 ：t2打印至i = 50，然后t1再打印到结束，然后t2再打印
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        };

        Thread t1 = new Thread(task, "t1");
        Thread t2 = new Thread(task, "t2");
        t1.start();
        t2.start();
    }
}
