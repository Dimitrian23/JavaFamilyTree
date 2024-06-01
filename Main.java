import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Human grandFather1 = new Human("Игорь", Gender.MALE, LocalDate.of(1930, 1, 1),LocalDate.of(2000, 8, 5));
        Human grandMother2 = new Human("Валентина", Gender.FEMALE, LocalDate.of(1935, 5, 5), LocalDate.of(2005, 3, 4));

        Human grandFather = new Human("Михаил", Gender.MALE, LocalDate.of(1930, 1, 1),LocalDate.of(2000, 8, 5));
        Human grandMother = new Human("Мария", Gender.FEMALE, LocalDate.of(1935, 5, 5), LocalDate.of(2005, 3, 4));
        Human father = new Human("Аллександр", Gender.MALE, LocalDate.of(1960, 10, 10));
        Human mother = new Human("Екатерина", Gender.FEMALE, LocalDate.of(1965, 12, 12));
        Human child = new Human("Виктория", Gender.FEMALE, LocalDate.of(1990, 7, 7));
        

        father.setFather(grandFather);
        father.setMother(grandMother);
        mother.setFather(grandFather1);
        mother.setMother(grandMother2);
        child.setFather(father);
        child.setMother(mother);

        grandFather1.addChild(father);
        grandFather.addChild(mother);
        grandMother2.addChild(father);
        grandMother.addChild(mother);
        father.addChild(child);
        mother.addChild(child);

        familyTree.addMember(grandFather1);
        familyTree.addMember(grandMother2);

        familyTree.addMember(grandFather);
        familyTree.addMember(grandMother);
        familyTree.addMember(father);
        familyTree.addMember(mother);
        familyTree.addMember(child);

        familyTree.printFamilyTree();
    }
}
