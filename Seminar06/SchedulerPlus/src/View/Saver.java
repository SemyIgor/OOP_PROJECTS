package View;

import java.util.Set;

import Model.Task;

public interface Saver {

   public void saveToFile(Set<Task> schadule);

   @Override
   boolean equals(Object obj);

   @Override
   String toString();

}