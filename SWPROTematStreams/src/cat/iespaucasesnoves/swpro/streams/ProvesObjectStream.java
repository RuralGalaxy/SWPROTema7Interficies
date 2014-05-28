package cat.iespaucasesnoves.swpro.streams;

import cat.iespaucasesnoves.swpro.streams.auxiliar.Dades;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import static java.io.FileDescriptor.out;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import static java.lang.System.in;

/**
 *
 * @author Rafel Sastre.
 */
public class ProvesObjectStream implements Serializable {

    public static void escriuObjecte(String desti, Serializable obj) throws FileNotFoundException, IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(desti)))) {
            out.writeObject(obj);
        }
    }
    
        public static void llegeixObjecte(String origen, Serializable obj) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(origen)))) {
            System.out.println(obj = (Dades)in.readObject());
        }
    }
}
