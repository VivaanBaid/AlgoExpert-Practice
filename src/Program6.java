import java.util.*;

class Program6 {
    // This is an input class. Do not edit.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    ArrayList<Integer> list = new ArrayList<>();
    public int findKthLargestValueInBst(BST tree, int k) {
        // Write your code here.
        Traverse(tree,k);
        return list.get(list.size()-1);
    }
    public void Traverse(BST tree, int k){
        if(tree == null){
            return;
        }
        Traverse(tree.right, k);
        if(list.size() != k){
            list.add(tree.value);
        }else{
            return;
        }
        Traverse(tree.left, k);



    }
}