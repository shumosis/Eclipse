package com.xworkz.accesSpecifiers.boot;

import com.xworkz.accesSpecifiers.Tree;
import com.xworkz.accesSpecifiers.TreeBranch;

public class TreeRunner {

	public static void main(String[] args) {
		
		
		Tree tree = new Tree(null, null, null, 0, 0, 0, false, false, false, false);
		
		TreeBranch treebranch = new TreeBranch();
		
		tree.getName();
		
		treebranch.usetree(tree);

	}

}
