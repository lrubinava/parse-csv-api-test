import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class CSVProcessor {

    public void process(BufferedReader input, BufferedWriter passed, BufferedWriter failed) throws IOException {
        String line;
        int fields = 10;

        while (true) {
            line = input.readLine();

            if (line == null) {
                break;
            }

            // check if current line is valid
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

    // read line
    // TODO: return an array later for entry type analysis
    public int evaluate1(String line) {
        String[] entries = line.split(",");

        return entries.length;
    }

    // validate line
    // TODO: 1) check for entries with quotes and coma inside
    // TODO: 2) check if the fields have correct type (name, date, age, address, etc.)

    public boolean evaluate2(int fields, String line) {
        if (evaluate1(line) == fields) {
            return true;
        } else {
            return false;
        }
    }
}


