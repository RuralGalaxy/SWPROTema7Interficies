package cat.iespaucasesnoves.swpro.streams;

import static cat.iespaucasesnoves.swpro.streams.ProvesBufferedStream.escriuLine;
import static cat.iespaucasesnoves.swpro.streams.ProvesBufferedStream.copiaLine;
import static cat.iespaucasesnoves.swpro.streams.ProvesBufferedStream.mostraLine;
import static cat.iespaucasesnoves.swpro.streams.ProvesByteStream.copiaBytes;
import static cat.iespaucasesnoves.swpro.streams.ProvesByteStream.escriuBytes;
import static cat.iespaucasesnoves.swpro.streams.ProvesByteStream.mostraBytes;
import static cat.iespaucasesnoves.swpro.streams.ProvesCharacterStream.copiaCharacter;
import static cat.iespaucasesnoves.swpro.streams.ProvesCharacterStream.escriuCharacter;
import static cat.iespaucasesnoves.swpro.streams.ProvesCharacterStream.mostraCharacter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Rafel Sastre.
 */
public class ProvesStreams {

    public void provesByte() throws IOException {
        System.out.println("--MENU--");
        System.out.println("1. Mostra Bytes.");
        System.out.println("2. Escriu Bytes.");
        System.out.println("3. Copia Bytes.");
        System.out.println("--------");
        System.out.println("4. Mostra Character.");
        System.out.println("5. Escriu Character.");
        System.out.println("6. Copia Character.");
        System.out.println("--------");
        System.out.println("7. Mostra Line.");
        System.out.println("8. Escriu Line.");
        System.out.println("9. Copia Line.");

        Scanner entrada = new Scanner(System.in);
        int eleccio = entrada.nextInt();
        switch (eleccio) {
            case 1:
                String ruta = "C:\\lorem.txt";
                mostraBytes(ruta);
                break;
            case 2:
                escriuBytes("E:\\prova.txt", "GARROVA");
                break;
            case 3:
                copiaBytes("C:\\HimnePirates.txt", "E:\\HimnePirates-Nou.txt");
                break;
            case 4:
                String ruta2 = "C:\\lorem.txt";
                mostraCharacter(ruta2);
                break;
            case 5:
                escriuCharacter("E:\\prova.txt", "GARROVA");
                break;
            case 6:
                copiaCharacter("C:\\HimnePirates.txt", "E:\\HimnePirates-Nou.txt");
                break;
            case 7:
                String ruta3 = "C:\\lorem.txt";
                mostraLine(ruta3);
                break;
            case 8:
                String[] escriptura = {"GARROVA", "SOBRASSADA", "ENSAÏMADA"};
                escriuLine("E:\\prova.txt", escriptura);
                break;
            case 9:
                copiaLine("C:\\HimnePirates.txt", "E:\\HimnePirates-Nou.txt");
                break;
            default:
                System.out.println("Error");
                break;

        }
    }
}
