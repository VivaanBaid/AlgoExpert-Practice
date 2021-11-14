class Program3 {
    public static boolean validateBst(BST tree) {
        // Write your code here
        return validateBstHelper(tree,Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    public static boolean validateBstHelper(BST tree, int max, int min) {
        if(tree == null){
            return true;
        }
        if(tree.right != null && !validateBstHelper(tree.right, Integer.MAX_VALUE, tree.value)){
            return false;
        }
        if(tree.left != null && !validateBstHelper(tree.left, tree.value, Integer.MIN_VALUE)){
            return false;
        }
        return true;

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