package calculate;

public class Calculate {
    public int getAngka1;
    private int angka1;
    private int angka2;

    public int getAngka1() {
        return angka1;

    }

    public int setAngka1(int angka1) {
        this.angka1 = angka1;
        return angka1;
    }

    public int getAngka2() {
        return angka2;
    }

    public int setAngka2(int angka2) {
        this.angka2 = angka2;

        return angka2;
    }

    public void  addAllNumber(){
        int hasil = angka1+angka2;
        System.out.println("Hasil Penjumlahan : " + hasil);
    }
    public void multiplyNumber(int angka1, int angka2) {
        int hasil = angka1 * angka2;
        System.out.println("Hasil Perkalian : " + hasil );
    }



}
