package com.xworkz.accesSpecifiers;

public class TreeBranch 
{
 
 public	Tree tree;
 public void usetree(Tree tree) 
 {
 	System.out.println(tree.giveOxygen);
 	System.out.println(tree.height);
 	System.out.println(tree.lovetree);
 	System.out.println(tree.noOfFruits);
 	System.out.println(tree.ownerName);
 	System.out.println(tree.seasonOfFruit);
 	System.out.println(tree.Shadow);
 	System.out.println(tree.takeCo2);
 	System.out.println(tree.town);
 	System.out.println(tree.yearofPlanting);
 
 	
 	tree.getName();
 	System.out.println(tree.getName());
 	tree.setName("apple");
 	System.out.println("after changing  :  " +tree.getName());
 }
}
