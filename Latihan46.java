/**
 * Latihan46
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Cetak Nama
 */
/**
 * Latihan46
 */
class Age {
    private int yearBirth;
    private int yearNow;
    private final String red = "\u001B[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int hitungUmur() {
        return yearNow - yearBirth;
    }

    public String tandanyaKamu(int umur) {

        if (umur >= 0 && umur <= 5) {
            System.out.println("Tandanya kamu " + red + "LAGI LUCU-LUCU NYA");
        } else if (umur > 5 && umur <= 10) {
            System.out.println("Tandanya kamu " + red + "MASIH ANAK-ANAK");
        } else if (umur > 10 && umur <= 13) {
            System.out.println("Tandanya kamu " + red + "MASIH REMADJA");
        } else if (umur > 13 && umur <= 19) {
            System.out.println("Tandanya kamu " + red + "ALAY");
        } else if (umur > 19 && umur <= 29) {
            System.out.println("Tandanya kamu " + red + "LAGI GALAU NYARI JODOH");
        } else if (umur > 29 && umur <= 35) {
            System.out.println("Tandanya kamu " + red + "LAGI SIBUK NYARI UANG");
        } else if (umur > 35 && umur <= 150) {
            System.out.println("Tandanya kamu " + red + "SUDAH TUA");
        } else if (umur < 0 || umur > 150) {
            System.out.println("Tandanya kamu " + red + "TIDAK TERDETEKSI DI KEHIDUPAN"
                    + "diKehidupan");
        }
        return red;
    }
    
}
