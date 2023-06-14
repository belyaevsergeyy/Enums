import java.io.*;

public class CharacterWorker {

    public static void write(String filename) {
        Writer stream = null;

        try {
            stream = new FileWriter(filename);

            for (int i = 256; i < 356; i++) {
                stream.write(i);
            }
            stream.flush();

        }catch (IOException exception) {
            System.out.println(exception);
        }finally {
            if (stream != null){
                try {
                    stream.close();
                }catch (IOException exception) {
                    System.out.println(exception);

                }
            }

        }
    }

    public static String read(String filename) {
        Reader stream = null;
        StringBuilder builder = new StringBuilder();

        try {
            stream = new FileReader(filename);

            int number;

            while ((number = stream.read()) != -1) {
                builder.append(number).append(" ");
            }

        }catch (IOException exception) {
            System.out.println(exception);
        }finally {
            if (stream != null){
                try {
                    stream.close();
                }catch (IOException exception) {
                    System.out.println(exception);

                }
            }

        }

        return builder.toString().trim();
    }

}
