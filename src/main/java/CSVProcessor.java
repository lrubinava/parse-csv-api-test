import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class CSVProcessor {


    public void process(BufferedReader input, BufferedWriter passed, BufferedWriter failed) throws IOException {
        String line;

        while (true) {
            line = input.readLine();

            if (line == null) {
                break;
            }

            if (this.evaluate(line)) {
                passed.write(line);
                passed.newLine();
            }
            else {
                failed.write(line);
                failed.newLine();
            }
        }
    }

    public boolean evaluate(String line) {
        return false;
    }

}


