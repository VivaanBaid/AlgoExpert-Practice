import java.util.*;

class Program2 {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if(value < this.value){
                if(this.left == null){
                    BST tree = new BST(value);
                    this.left = tree;
                }else{
                    this.insert(value);
                }
            }else{
                if(this.right == null){
                    BST tree = new BST(value);
                    this.right = tree;
                }else{
                    this.insert(value);
                }
            }
            return this;
        }

        public boolean contains(int value) {
            if(value < this.value){
                if(this.left == null){
                    return false;
                }else{
                    //check left side
                    return this.left.contains(value);
                }
            }else if(value > this.value){
                if(this.right == null){
                    return false;
                }else{
                    //check left side
                    return this.right.contains(value);
                }
            }else{
                return true;
            }
        }

        public BST remove(int value) {

            return this;
        }
    }
    
}

