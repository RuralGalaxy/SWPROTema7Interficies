package cat.iespaucasesnoves.swpro.streams.auxiliar;

import static cat.iespaucasesnoves.swpro.streams.ProvesObjectStream.escriuObjecte;
import static cat.iespaucasesnoves.swpro.streams.ProvesObjectStream.llegeixObjecte;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Rafel Sastre
 */
public class ProvesFitxers {

    public static void provesObjecteSimple() throws IOException, FileNotFoundException, ClassNotFoundException {
        Dades objecte = new Dades();
        escriuObjecte("E:\\prova.txt", objecte);       
        llegeixObjecte("E:\\prova.txt", objecte);
    }
}
