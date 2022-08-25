package com.arbre.binaire;

public class ArbreBinaire {


    /**
     *
     * @param node
     * @return la valeur max
     */
    public int findMax(Node node)
    {
        if (node == null)
            return Integer.MIN_VALUE;

        int result = node.getValue();						/* valeur i */
        int resultLeft = findMax(node.getLeftChild());	/* valeur i + 1 gauche */
        int resultRight = findMax(node.getRightChild());/* valeur i + 2 droite */

        /* si la valeur i + 1 gauche superieure à la valeur i > la valeur i devient la  valeur i + 1 gauche*/
        if (resultLeft > result)
            result = resultLeft;
        /* si la valeur i + 1 droite superieure à la valeur i > la valeur i devient la  valeur i + 1 droite*/
        if (resultRight > result)
            result = resultRight;

        return result;
    }

}
