import java.util.*;

class Program5 {
    public static BST minHeightBst(List<Integer> array) {
        //root found and created
        return make(array, 0, array.size()-1);
    }
    public static BST make(List<Integer> array, int start, int end){
        if(end < start) return null;
        int middle = (start+end)/2;
        int rootNumber = array.get(middle);
        BST myroot = new BST(rootNumber);
        myroot.left = make(array,0,middle-1);
        myroot.right = make(array, middle+1, end);
        return myroot;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}


