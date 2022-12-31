import java.util.ArrayList;

public class Reserch {
    ArrayList<Node> tree;
    ArrayList<String> result = new ArrayList<>();

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }

    public ArrayList<String> reservist(String sex, int minAge, int maxAge) {
        for (Node t : tree) {
            if (t.p1.getAge() <= maxAge && t.p1.getAge() >= minAge && t.p1.getSex() == sex
                    && !result.contains(t.p1.getFullName())) {
                result.add(t.p1.getFullName());
            }
        }
        return result;
    }

    public ArrayList<String> parents(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }

}