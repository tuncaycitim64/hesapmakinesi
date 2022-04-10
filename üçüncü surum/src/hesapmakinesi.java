public class hesapmakinesi {
    public static double toplama(double a, double b) {
        double toplam = a + b;
        return toplam;
    }

    public static String bölme(double a, double b) {
        double bolum;
        String bolum2;
        try {
            bolum = a / b;
            bolum2 = Double.toString(bolum);
            return bolum2;
        } catch (Exception e) {
            return "Sifira bolme hatasi";
        }
    }
}
