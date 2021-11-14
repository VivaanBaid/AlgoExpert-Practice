import java.util.*;

class Program {
    static int closest = Integer.MAX_VALUE;
    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBstHelper(tree, target, closest);
    }

    public static int findClosestValueInBstHelper(BST tree, int target, int closest){
        if(tree == null){
            return closest;
        }
        if(Math.abs(target-closest) > Math.abs(target - tree.value)){
            closest = tree.value;
        }

        if(target > tree.value){
            return findClosestValueInBstHelper(tree.right, target, closest);
        }else if(target < tree.value){
            return findClosestValueInBstHelper(tree.left,target,closest);
        }else{
            return closest;
        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}