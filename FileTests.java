import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class FileTests {
  @Test 
  public void testFileThingy() {
    File test = new File("some-files/");
    List<File> result = new ArrayList<>();
    try {
      assertEquals(FileExample.getFiles(test), result);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}