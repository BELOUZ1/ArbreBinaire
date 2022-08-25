package com.arbre.binaire;

public class Node {

    private int value;			/* valeur de noeud i */
    private Node leftChild; 	/* noeud (i + 1 ) enfant gauche */
    private Node rightChild; 	/* noeud (i + 1 ) enfant droite */

    public Node(int value) throws IllegalArgumentException
    {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;

        if(value == Integer.MAX_VALUE || value == Integer.MIN_VALUE){
            throw new IllegalArgumentException("La valeur " + value + " n'est pas autorisée"); /* La valeur MAX et MIN n'est pas autorisée */
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

}
