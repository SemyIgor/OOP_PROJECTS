public class Main {
   public static void main(String[] args) {
      Person irina = new Person("Хрусталёва Ирина Васильевна", 35, "female");
      Person dima = new Person("Хрусталёв Дмитрий Петрович", 37, "male");
      Person vasya = new Person("Хрусталёв Василий Дмитриевич", 14, "male");
      Person masha = new Person("Хрусталёва Мария Дмитриевна", 12, "female");
      Person helen = new Person("Селезнёва Елена Васильевна", 32, "female");
      Person jane = new Person("Селезнёва Евгения Сергеевна", 15, "female");
      Person ivan = new Person("Селезнёв Иван Владимирович", 13, "male");

      GeoTree gt = new GeoTree();

      gt.appendSpouse(dima, irina);
      gt.appendChild(irina, masha);
      gt.appendChild(irina, vasya);
      gt.appendChild(dima, masha);
      gt.appendChild(dima, vasya);
      gt.appendSibling(vasya, masha);
      gt.appendSisSister(irina, helen);
      gt.appendChild(helen, jane);
      gt.appendChild(helen, ivan);
      gt.appendSibling(ivan, jane);
      gt.appendCousin(vasya, jane);
      gt.appendCousin(vasya, ivan);
      gt.appendCousin(masha, jane);
      gt.appendCousin(masha, ivan);

      // View all irina's children
      System.out.println(new Reserch(gt).spend(irina,
            Relationship.parent));

      System.out.println();

      // View all male persons worth army service
      System.out.println(new Reserch(gt).reservist("male", 20, 40));

      System.out.println();

      // View all vasya's parents
      System.out.println(new Reserch(gt).parents(vasya,
            Relationship.child));
   }

}