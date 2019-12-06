import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        long count = 30;
        int failPercent = 20;
        int fieldCount = 10;

        //TODO: validate CSV file

        // generate
        FileWriter data = new FileWriter("customers.txt");
        BufferedWriter bW = new BufferedWriter(data);

        CSVGenerator generator = new CSVGenerator();
        generator.generate(count, failPercent, fieldCount, bW);

        bW.flush();

        // process
        FileReader inputData = new FileReader("customers.txt");
        // BufferedReader dataReader = new BufferedReader(inputData);

        FileWriter passed = new FileWriter("passed.txt");
        //BufferedWriter passedW = new BufferedWriter(passed);

        FileWriter failed = new FileWriter("failed.txt");
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
