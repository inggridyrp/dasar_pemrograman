
public class luas_diarsir{
    public static void main(String args[]){
        double s = 100;
        float r = 50;
        double luas_diarsir, luas_persegi, luas_lingkaran;

        luas_persegi = s*s;
        luas_lingkaran = (3.14) * r * r;
        luas_diarsir = luas_persegi - luas_lingkaran;
        System.out.println(" ");
        System.out.println("Luas diarsir = "+ luas_diarsir);
        System.out.println(" ");
    }
}