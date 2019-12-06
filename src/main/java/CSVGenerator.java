import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVGenerator {

    public int generate(long linesCount, int percentToFail, int fieldsCount, BufferedWriter bw) throws IOException {

            for (long i = 0; i < linesCount; i++) {
                bw.write(generateLine(fieldsCount));
                bw.newLine();
            }

        //TODO:
        return 0;
    }

    public String generateLine(int fieldCount) {

        //TODO: finish
        return "Gde ya,bespredel,pochemu,idi suda,tak sebe, chto proishodit, proizvol, bodun, sam takoi, vikusi nakusi";
    }

}
