package org.example.trees;

import java.util.ArrayList;
import java.util.List;

public class TreeNode2 {

    int species;
    List<TreeNode2> children;

    public TreeNode2(int species) {
        this.species = species;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode2 child) {
        this.children.add(child);
    }
}

