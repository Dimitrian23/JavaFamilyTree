import java.util.ArrayList;
import java.util.List;
public class FamilyTree {
    private List<Human> familyMembers;

    public FamilyTree() {
        this.familyMembers = new ArrayList<>();
    }

    public void addMember(Human human) {
        familyMembers.add(human);
    }

    public Human findMember(String name) {
        for (Human human : familyMembers) {
            if (human.getName().equals(name)) {
                return human;
            }
        }
        return null;
    }

    public void printFamilyTree() {
        for (Human human : familyMembers) {
            System.out.println(human);
        }
    }
}