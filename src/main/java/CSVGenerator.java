import java.io.BufferedWriter;
import java.io.IOException;

public class CSVGenerator {

    public int generate(long count, int failPercent, int fieldsCount, BufferedWriter output) throws IOException {

        for (long i = 0; i < count; i++) {
            output.write(generateLine(fieldsCount));
            output.newLine();
        }

        //TODO:
        return 0;
    }

    public String generateLine(int fieldCount) {

        //TODO: finish
        return "Gde ya,bespredel,pochemu";
    }

}
