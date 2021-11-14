import java.util.*;

class Program7 {
    // This is an input class. Do not edit.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {

        if(preOrderTraversalValues.size() == 0){
            return null;
        }
        int currentVal = preOrderTraversalValues.get(0);
        int rightSide = preOrderTraversalValues.size();
        //finding the right side of every tree
        for(int i =1; i < preOrderTraversalValues.size(); i++){
            int value = preOrderTraversalValues.get(i);
            if(value >= currentVal){
                rightSide = i;
                //shifts to find the right side of the next value
                break;
            }
        }
        //finding the left side
        BST tree = new BST(currentVal);
        ArrayList<Integer> al2 = new ArrayList<Integer>(preOrderTraversalValues.subList(1,rightSide));
        ArrayList<Integer> al3 = new ArrayList<Integer>(preOrderTraversalValues.subList(rightSide, preOrderTraversalValues.size()));
        tree.left = reconstructBst(al2);
        tree.right = reconstructBst(al3);
        return tree;
    }

}


