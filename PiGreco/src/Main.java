public class Main {
    public static void main(String[] args) {
        double pi = 0;
        double dis = 1;
        boolean segno = false;
        int num = 100000000;
        while (num > 0) {
            if (!segno) {
                pi += 1 / dis;
                segno = true;
            }
            else {
                pi -= 1 / dis;
                segno = false;
            }
            dis += 2;
            num--;
        }
        pi *= 4;
        System.out.println("Il pi greco è: " + pi);
    }
}