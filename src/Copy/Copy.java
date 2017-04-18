package Copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Copy {

  String[] args;

  public Copy(String[] args) {
    this.args = args;
  }

  public static void main(String[] args) {
    Copy myCopy = new Copy(args);

    myCopy.printUsage();
    myCopy.noDestination();
    myCopy.copyFile(args[0], args[1]);
  }

  public void printUsage() {
    if (args.length == 0) {
      System.out.println("copy [source] [destination]");
    }
  }

  public void noDestination() {
    if (args.length == 1) {
      System.out.println("No destination provided");
    }
  }

  public void copyFile(String original, String copied) {
    Path pathOriginal = Paths.get(original);
    Path pathCopied = Paths.get(copied);
    try {
      List<String> lines = Files.readAllLines(pathOriginal);
      Files.write(pathCopied, lines);
    } catch (IOException e) {
      System.out.println("Error: " + e.getClass());
    }
  }
}