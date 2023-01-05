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

            gt.appendNode(dima, Relationship.husband, irina, Relationship.wife);
            gt.appendNode(irina, Relationship.parent, masha, Relationship.child);
            gt.appendNode(irina, Relationship.parent, vasya, Relationship.child);
            gt.appendNode(dima, Relationship.parent, masha, Relationship.child);
            gt.appendNode(dima, Relationship.parent, vasya, Relationship.child);
            gt.appendNode(vasya, Relationship.brother, masha, Relationship.sister);
            gt.appendNode(irina, Relationship.sister, helen, Relationship.sister);
            gt.appendNode(helen, Relationship.parent, jane, Relationship.child);
            gt.appendNode(helen, Relationship.parent, ivan, Relationship.child);
            gt.appendNode(ivan, Relationship.brother, jane, Relationship.sister);
            gt.appendNode(vasya, Relationship.cousin, jane, Relationship.cousin);
            gt.appendNode(vasya, Relationship.cousin, ivan, Relationship.cousin);
            gt.appendNode(masha, Relationship.cousin, jane, Relationship.cousin);
            gt.appendNode(masha, Relationship.cousin, ivan, Relationship.cousin);

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