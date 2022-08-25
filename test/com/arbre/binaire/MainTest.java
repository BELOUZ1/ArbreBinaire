package com.arbre.binaire;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MainTest {


    private static final int MAX_VALUE = 19;

    private static ArbreBinaire arbreBinaire;

    @BeforeAll
    public static void init() {
        arbreBinaire = new ArbreBinaire();
    }


    @Test
    void testGetMax() {
        Node root = setData(MAX_VALUE);
        int max = arbreBinaire.findMax(root);
        assertEquals(MAX_VALUE, max, "max should be " + MAX_VALUE);
    }

    @Test
    public void testException() {

        int value = Integer.MAX_VALUE;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> setData(value));

        String expectedMessage = "La valeur " + value + " n'est pas autorisée";

        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testNodeNull() {
        int max = arbreBinaire.findMax(null);
        assertEquals(Integer.MIN_VALUE, max, "max should be " + MAX_VALUE);
    }

    @Test
    public void testSetNodeValue() {
        Node root = new Node(5);
        root.setValue(MAX_VALUE);
        assertEquals(MAX_VALUE, root.getValue(), "max should be " + MAX_VALUE);
    }

    private Node setData(int maxValue) {

        Node root = new Node(5);															/* root */
        root.setLeftChild(new Node(-12));													/* root/left */
        root.getLeftChild().setRightChild(new Node(maxValue));								/* root/left/right*/
        root.getLeftChild().setLeftChild(new Node(3));										/* root/left/left*/
        root.setRightChild(new Node(11));													/* root/right */
        root.getRightChild().setRightChild(new Node(7));									/* root/right/right*/
        root.getRightChild().setLeftChild(new Node(-8));									/* root/right/left*/
        root.getRightChild().getRightChild().setRightChild(new Node(3));					/* root/right/right/right*/
        root.getRightChild().getRightChild().setLeftChild(new Node(11));					/* root/right/right/left*/
        root.getRightChild().getRightChild().getRightChild().setLeftChild(new Node(-2));	/* root/right/right/right/left*/

        return root;

    }


}
