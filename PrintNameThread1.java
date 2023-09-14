class PrintNameThread1 extends Thread {
    PrintNameThread1(String name) {
        super(name);
        // menjalankan thread dengan satu kali instantiate
        start();
    }

    public void run() {
        String name = getName();
        for (int i = 0; i < 100; i++) {
            System.out.print(name);
        }
    }
}

class TestThread {
    public static void main(String args[]) {
        PrintNameThread1 pnt1 = new PrintNameThread1("A");
        PrintNameThread1 pnt2 = new PrintNameThread1("B");
        PrintNameThread1 pnt3 = new PrintNameThread1("C");
        PrintNameThread1 pnt4 = new PrintNameThread1("D");
    }
}