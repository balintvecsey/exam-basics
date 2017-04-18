package Copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Bálint on 2017. 04. 18..
 */
public class ArgumentHandler {

  public void printUsage() {
    System.out.println("copy [source] [destination]");
  }

  public void noDestination() {
    System.out.println("No destination provided");
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

  public void argumentHandler(String[] args){
    if (args.length == 0) {
      printUsage();
    } else if (args.length == 1) {
      noDestination();
    } else {
      copyFile(args[0], args[1]);
    }
  }
}
