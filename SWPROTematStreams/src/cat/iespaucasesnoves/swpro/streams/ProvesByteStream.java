package cat.iespaucasesnoves.swpro.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Rafel Sastre.
 */
public abstract class ProvesByteStream {

    public static void mostraBytes(String ruta) throws FileNotFoundException, IOException {
        int c;
        FileInputStream in = new FileInputStream(ruta);
        while ((c = in.read()) != -1) {
            char d = (char) c;
            System.out.print(d);
        }

    }

    public static void escriuBytes(String desti, String dades) throws FileNotFoundException, IOException {

        try (FileOutputStream out = new FileOutputStream(desti)) {
            byte[] b = dades.getBytes();
            out.write(b);

        }
    }

    public static void copiaBytes(String dades, String desti) throws FileNotFoundException, IOException {
        int c;
        FileInputStream in = new FileInputStream(dades);
        FileOutputStream out = new FileOutputStream(desti);
        while ((c = in.read()) != -1) {
            char d = (char) c;
            out.write(d);
        }
    }

    public static void main(String[] args) throws IOException {
        ProvesStreams b = new ProvesStreams();
        b.provesByte();
    }
}
