package cat.iespaucasesnoves.swpro.streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Rafel Sastre.
 */
public class ProvesBufferedStream {

    public static void mostraLine(String ruta) throws FileNotFoundException, IOException {
        try (FileReader fr = new FileReader("C:\\lorem.txt")) {
            int caract = fr.read();
            while (caract != -1) {
                System.out.print((char) caract);
                caract = fr.read();
            }
        }
    }

    public static void escriuLine(String desti, String[] dades) throws FileNotFoundException, IOException {
        try (FileWriter out = new FileWriter(desti)) {
            out.write(desti);
        }
    }

    public static void copiaLine(String dades, String desti) throws FileNotFoundException, IOException {
        int c;
        FileReader in = new FileReader(dades);
        FileWriter out = new FileWriter(desti);
        while ((c = in.read()) != -1) {
            char d = (char) c;
            out.write(d);
        }
    }
}
