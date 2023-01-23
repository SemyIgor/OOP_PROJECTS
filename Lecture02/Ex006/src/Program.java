import Applications.Notepad;
import Format.*;

public class Program {
   public static void main(String[] args) {

      Notepad notes = new Notepad();
      notes.newFile();
      notes.currentDocument().addAllText("text1");
      notes.currentDocument().addAllText("text2");
      notes.currentDocument().addAllText("text3");
      // System.out.println(notes);
      notes.SaveAs("file1", new Txt());
      notes.SaveAs("file2", new Md());
      notes.SaveAs("file3", new Doc());

   }
}