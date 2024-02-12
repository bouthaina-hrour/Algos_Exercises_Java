package org.example.trees;
import java.util.ArrayList;
import java.util.List;
public class JungleBook {

    public List<TreeNode2> constructTrees(int[] predators) {
        List<TreeNode2> trees = new ArrayList<>();

        for (int i = 0; i < predators.length; i++) {
            int predator = predators[i];
            TreeNode2 speciesNode = new TreeNode2(i);

            if (predator == -1) {
                // Si l'espèce est un prédateur de niveau supérieur, elle n'a pas de prédateur direct
                trees.add(speciesNode);
            } else {
                // Si l'espèce a un prédateur direct, ajoutez-la comme enfant du prédateur
                TreeNode2 predatorNode = findOrCreateNode(trees, predator);
                predatorNode.addChild(speciesNode);
            }
        }

        return trees;
    }

    private TreeNode2 findOrCreateNode(List<TreeNode2> trees, int species) {
        for (TreeNode2 tree : trees) {
            if (tree.species == species) {
                return tree;
            }
        }

        // Si l'arbre de l'espèce n'a pas été trouvé, créez un nouvel arbre pour cette espèce
        TreeNode2 newNode = new TreeNode2(species);
        trees.add(newNode);
        return newNode;
    }

    public static int findMaxDepth(List<TreeNode2> trees) {
        int maxDepth = 0;

        for (TreeNode2 tree : trees) {
            int depth = calculateDepth(tree);
            maxDepth = Math.max(maxDepth, depth);
        }

        return maxDepth;
    }

    private static int calculateDepth(TreeNode2 node) {
        if (node == null) {
            return 0;
        }

        int maxChildDepth = 0;
        for (TreeNode2 child : node.children) {
            maxChildDepth = Math.max(maxChildDepth, calculateDepth(child));
        }

        return 1 + maxChildDepth;
    }

}
