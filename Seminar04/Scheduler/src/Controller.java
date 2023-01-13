import java.util.HashSet;

public interface Controller {

   public void saveToTXTFile(HashSet<Task> schadule);

   @Override
   boolean equals(Object obj);

   @Override
   String toString();

}
