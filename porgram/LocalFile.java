import java.io.*;

class LocalFile {
  public static void parseFile() {
    BufferedReader reader = null;
    try {
        File file = new File("mahasiwa.txt");
        reader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  }
}