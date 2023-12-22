package com.keyin.bstproject;

import com.keyin.bstproject.model.BstNode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class BinarySearchTree {
    @Id
    @SequenceGenerator(name = "tree_sequence", sequenceName = "tree_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "tree_sequence")

    private long id;

    private String numbers;
    private String structure;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumbers(int num) {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public BstNode insert(Object o, int i) {
        return;
    }
}