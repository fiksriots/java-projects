/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.ai;

import java.util.Scanner;

/**
 *
 * @author unknown
 */
public class TugasAi {
    static String[] ind = new String[100];
    static String[] ing = new String[100];
    static String hasil;
static class Node 
{ 
    int data; 
    Node left, right; 
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 

static class BinaryTree 
{ 
    // Root of the Binary Tree 
    Node root; 
    public BinaryTree() 
    { 
        root = null; 
    } 
    /* function to print level order traversal of tree*/
    void printLevelOrder(String cari) 
    { 
        int z=1;
        int h = height(root); 
        int i; 
        for (i=1; i<=h; i++){
            printGivenLevel(root, i, cari);

    }

    } 
    /* Compute the "height" of a tree -- the number of 
    nodes along the longest path from the root node 
    down to the farthest leaf node.*/
    int height(Node root) 
    { 
        if (root == null) 
           return 0; 
        else
        { 
            /* compute  height of each subtree */
            int lheight = height(root.left); 
            int rheight = height(root.right);             
            /* use the larger one */
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    } 
    /* Print nodes at the given level */
    void printGivenLevel (Node root ,int level, String cari) 
    { 
        int n = 0;
        if (root == null)
            return;
        if (level == 1) 
            n=root.data;
            if(cari.equals(ind[n])){
            System.out.println(ind[n] + " = " + ing[n]);
            }
        else if (level > 1) 
        { 
            printGivenLevel(root.left, level-1, cari); 
            printGivenLevel(root.right, level-1, cari); 
        }
    }
} 

public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String cari;
       ind[1]="makan";
       ind[2]="minum";
       ind[3]="tidur";
       ind[4]="jalan";
       ind[5]="main";
       ing[1]="eat";
       ing[2]="drink";
       ing[3]="sleep";
       ing[4]="walk";
       ing[5]="play";
       BinaryTree tree = new BinaryTree(); 
       tree.root= new Node(1); 
       tree.root.left= new Node(2); 
       tree.root.right= new Node(3); 
       tree.root.left.left= new Node(4); 
       tree.root.left.right= new Node(5); 
      
       System.out.println("masukkan kata b.indonesia yang yang ingin di translate :");
       cari = in.next();
       tree.printLevelOrder(cari); 
    }
    
}
