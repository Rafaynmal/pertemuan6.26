
package pertemuan6;

/**
 *
 * @author Afra Syavina
 */
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class WaktuSaatIni {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tugas 1: Menampilkan waktu saat ini
        Date sekarang = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss");
        String waktuSekarang = formatter.format(sekarang);
        System.out.println("Waktu saat ini: " + waktuSekarang);
    }
}
