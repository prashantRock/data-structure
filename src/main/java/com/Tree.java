package com;

/**
 * Created by prashant on 9/10/17.
 */

 class Tree {

    public int data;
    public Tree left;
    public Tree right;

    public Tree(){}

    public Tree(int data){
        this.data = data;
    }

}

 class TestTree {

    //to find max depth of a tree
    int currentDepth, depth;
    public int depth(Tree n) {
        if (n != null) {
            currentDepth++;

            // record total depth if current depth is greater than total depth
            if (currentDepth > depth) {
                depth = currentDepth;
            }

            // recursively traverse entire tree
            depth(n.left);
            depth(n.right);

            // decrement as we traverse up the binary tree
            currentDepth--;
        }
        return depth;
    }
}
