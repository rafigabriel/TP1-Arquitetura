import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Reader{
    public static void read(String path) {
        try {
            FileReader archive = new FileReader(path);
            BufferedReader readArchive = new BufferedReader(archive);

            String line = readArchive.readLine(); // lê a primeira linha
            // a variável "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto
            while (line != null) { //add $t0, $s2, $t0
                //FUNCAO DE FORMATAR 
                 line = readArchive.readLine(); // lê da segunda até a última linha     
            }
               
            archive.close();
       } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                      e.getMessage());
       }
    }
}