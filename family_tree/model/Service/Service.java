package family_tree.model.Service;

import family_tree.model.human.Human;
import family_tree.model.tree.FamilyTree;

import java.util.List;

public class Service {
    private FamilyTree<Human> familyTree;

    public Service(FamilyTree<Human> familyTree) {
        this.familyTree = familyTree;
    }

    public Human findMember(String name) {
        return familyTree.findMember(name);
    }

    public List<Human> findChildren(Human parent) {
        return parent.getChildren();
    }

    public Human findParent(Human child) {
        return child.getParent();
    }

    public List<Human> findSiblings(Human child) {
        return child.getSiblings();
    }
}
