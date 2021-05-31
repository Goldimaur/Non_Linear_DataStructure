/*   Created by IntelliJ IDEA.
*   Author: Goldi Maurya
*   Date: 26-05-2021
*   Time: 20:38
*   File: Main.java
*/

package avltree.execution;

import avltree.implementation.AVLTree;

public class Main {
    public static void main(String[] args){
        AVLTree<Integer> avlTree = new AVLTree<>();
        avlTree.setRoot(avlTree.insert(15, avlTree.getRoot()));
        avlTree.setRoot(avlTree.insert(20, avlTree.getRoot()));
        avlTree.setRoot(avlTree.insert(11, avlTree.getRoot()));
        avlTree.setRoot(avlTree.insert(5, avlTree.getRoot()));
        avlTree.setRoot(avlTree.insert(50, avlTree.getRoot()));
        avlTree.setRoot(avlTree.insert(4, avlTree.getRoot()));
        avlTree.setRoot(avlTree.insert(13, avlTree.getRoot()));
        avlTree.setRoot(avlTree.insert(12, avlTree.getRoot()));
        System.out.println("inOrder");
        avlTree.inOrderTraversal(avlTree.getRoot());
        System.out.println("postOrder");
        avlTree.postOrderTraversal(avlTree.getRoot());
        System.out.println("preOrder");
        avlTree.preOrderTraversal(avlTree.getRoot());
    }
}