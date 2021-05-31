/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 26-05-2021
 *   Time: 20:40
 *   File: Main.java
 */

package binarysearchtree.execution;

import binarysearchtree.implementation.BinarySearchTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        Scanner scanner = new Scanner(System.in);
        binarySearchTree.insert(75);
        binarySearchTree.insert(23);
        binarySearchTree.insert(55);
        binarySearchTree.insert(50);
        binarySearchTree.insert(42);
        System.out.println("inOder--> ");
         binarySearchTree.inOrderTraversal(binarySearchTree.getRoot());
//        System.out.println();
//        binarySearchTree.delete(75);
//        binarySearchTree.inOrderTraversal(binarySearchTree.getRoot());
//        System.out.println();
//        var result = binarySearchTree.searchElement(23);
//        System.out.println(result);
        System.out.println("preOder--> ");
        binarySearchTree.preOrderTraversal(binarySearchTree.getRoot());
        System.out.println("postOder--> ");
        binarySearchTree.postOrderTraversal(binarySearchTree.getRoot());

//        System.out.println("------MENU------");
//        System.out.println("OPERATION-- OR ---ORDER");
//        System.out.println(" ---A--- for operation  ");
//        System.out.println("----B----for order");
//        char chioce =scanner.nextLine().charAt(0);
//        switch (chioce){
//            case 'A':
//                System.out.println(" which operation ====>>   1. DELETE ---- 2. INSERT---");
//                int chioceOpeartion =scanner.nextInt();
//                switch (chioceOpeartion) {
//                    case 1:
//                        System.out.println("DELETE MODE");
//                        System.out.println(" how many you want to delete ");
//                        int deleteLimit = scanner.nextInt();
//                        for (int i = 0; i < deleteLimit; i++) {
//                            System.out.println("Element which you want to delete ");
//                            int delelteElement = scanner.nextInt();
//                            if (binarySearchTree.searchElement(delelteElement)) {
//                                binarySearchTree.delete(delelteElement);
//                            } else
//
//                                System.out.println("invalid element");
//                        }
//
//                        break;
//                    case 2:
//                        System.out.println("INSERT MODE");
//                        System.out.println(" how many you want to insert ");
//                        int insertLimit = scanner.nextInt();
//                        System.out.println(" which you want insert");
//                        for (int i = 0; i < insertLimit; i++) {
//                            int insertElement = scanner.nextInt();
//                            binarySearchTree.insert(insertElement);
//                        }
//                        break;
//                }
//            case 'B' :
//                System.out.println("Which order 1. preorder ---- 2. postorder --- 3.inorder" );
//                int orderChioce =scanner.nextInt();
//                switch (orderChioce) {
//                    case '1':
//                        binarySearchTree.preOrderTraversal(binarySearchTree.getRoot());
//                        break;
//                    case '2':
//                        binarySearchTree.postOrderTraversal(binarySearchTree.getRoot());
//                        break;
//                    case '3':
//                        binarySearchTree.inOrderTraversal(binarySearchTree.getRoot());
//                }
//        }
    }
}