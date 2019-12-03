import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        long count = 30;
        int failPercent = 20;
        int fieldCount = 5;

        // generate
        StringWriter data = new StringWriter();
        BufferedWriter bW = new BufferedWriter(data);

        CSVGenerator generator = new CSVGenerator();
        generator.generate(count, failPercent, fieldCount, bW);

        bW.flush();

        // process
        StringReader inputData = new StringReader(data.toString());
        // BufferedReader dataReader = new BufferedReader(inputData);

        StringWriter passed = new StringWriter();
        //BufferedWriter passedW = new BufferedWriter(passed);

        StringWriter failed = new StringWriter();
        // BufferedWriter failedW = new BufferedWriter(failed);

        try (BufferedReader dataReader = new BufferedReader(inputData)) {
            try (BufferedWriter passedW = new BufferedWriter(passed)) {
                try (BufferedWriter failedW = new BufferedWriter(failed)) {
                    CSVProcessor processor = new CSVProcessor();
                    processor.process(dataReader, passedW, failedW);
                }
            }
        }


//        passedW.flush();
//        failedW.flush();
        int i = 0;

    }
}
