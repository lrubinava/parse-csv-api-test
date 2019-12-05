import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class CSVProcessor {

    public void process(BufferedReader input, BufferedWriter passed, BufferedWriter failed) throws IOException {
        String line;
        int fields = 15;

        while (true) {
            line = input.readLine();

            if (line == null) {
                break;
            }

            if (this.evaluate2(fields, line)) {
                passed.write(line);
                passed.newLine();
            }
            else {
                failed.write(line);
                failed.newLine();
            }
        }
    }

    public int evaluate1(String line) {
        String[] entries = line.split(",");

        return entries.length;
    }

    public boolean evaluate2(int fields, String line) {
        if (evaluate1(line) == fields) {
            return true;
        } else {
            return false;
        }
    }

}


