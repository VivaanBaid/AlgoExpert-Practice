package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int findClosestValueInBst(BST tree, int target) {
        if(tree == null){
            return 0;
        }
        findClosestValueInBst(tree.left, target);
        findClosestValueInBst(tree.right, target);

        int difference = Math.abs(tree.value - target);





        return -1;
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
