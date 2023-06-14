public class Main {
    public static void main(String[] args) {
        String fileName = "d:\\numbers.bin";
        String textFileName = "d:\\character.123";
//        BinaryWorker.write(filename);
//        System.out.println(BinaryWorker.read(filename));

        CharacterWorker.write(textFileName);
        System.out.println(CharacterWorker.read(textFileName));

    }
}