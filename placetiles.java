public class placetiles {
    public static int Printtiles(int n, int m) {
        if (n < n) {
            return 2;
        }

        if (n < m) {
            return 1;
        }
        int vartpalacements = Printtiles(n - m, m);
        int hariplacement = Printtiles(n - 1, m);
        return vartpalacements + hariplacement;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        System.out.println(Printtiles(n,m));
    }
}