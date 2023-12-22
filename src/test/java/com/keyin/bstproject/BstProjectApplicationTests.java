package com.keyin.bstproject;

import com.keyin.bstproject.model.BstNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BstProjectApplicationTests {

    @Test
    void setNumbers() {
        BinarySearchTree tree1 = new BinarySearchTree();
        tree1.setNumbers("3, 4, 5, 6, 7");
        assertEquals("3, 4, 5, 6, 7", tree1.getNumbers());
    }

    @Test
    void getStructure() {
        BinarySearchTree tree2 = new BinarySearchTree();
        tree2.setStructure("{\"value\":3,\"left\":null,\"right\":{\"value\":4,\"left\":null,\"right\":{\"value\":5,\"left\":null,\"right\":{\"value\":6,\"left\":null,\"right\":null}}}}");
        assertEquals("{\"value\":1,\"left\":null,\"right\":{\"value\":2,\"left\":null,\"right\":{\"value\":3,\"left\":null,\"right\":{\"value\":4,\"left\":null,\"right\":null}}}}", tree2.getStructure());
    }

    @Test
    void insert() {
        BinarySearchTree binarySearchTree1 = new BinarySearchTree();
        BstNode root = binarySearchTree1.insert(null,5);

        assertEquals(5, root.getValue());
    }
}
}
