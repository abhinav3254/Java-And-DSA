package Java.oops.inheritance;

public class AbsOne {
    public static void main(String[] args) {
        MangoTree mangoTree = new MangoTree();
        mangoTree.color();
        mangoTree.hasFruits();
        mangoTree.hasLeaves();
        Tree.reportedBy();

    }
}

abstract class Tree {
    public Tree () {
        System.out.println("This is Parent Class");
    }
    public static void reportedBy() {
        System.out.println("Reported By Abhinav Kumar Jha");
    }

    public abstract void hasLeaves();

    public abstract void color();

    public abstract void hasFruits();
}

class MangoTree extends Tree {
    @Override
    public void hasLeaves() {
        System.out.println("Mango Tree has Leaves");
    }
    @Override
    public void color() {
        System.out.println("Color of Leaves is Green");
    }
    @Override
    public void hasFruits() {
        System.out.println("Yes it has Mango named Fruits");
    }
}

