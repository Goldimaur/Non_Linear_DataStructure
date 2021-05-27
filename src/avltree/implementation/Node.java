/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 26-05-2021
 *   Time: 20:39
 *   File: Node.java
 */

package avltree.implementation;

public class Node <E extends Comparable<E>> {
    private E data;
    private int height;
    private Node<E> left;
    private Node<E> right;

    public Node(E data) {
        this.data = data;
        height = 0;
        left = null;
        right = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }
}