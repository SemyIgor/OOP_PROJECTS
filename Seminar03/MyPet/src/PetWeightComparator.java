import java.util.Comparator;

public class PetWeightComparator implements Comparator<Pet> {

   @Override
   public int compare(Pet pet1, Pet pet2) {
      return Integer.compare(pet1.getWeight(), pet2.getWeight());
   }

}
