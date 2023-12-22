package com.keyin.bstproject.service;

import com.keyin.bstproject.BinarySearchTree;
import com.keyin.bstproject.model.BstNode;
import com.keyin.bstproject.repository.BstRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.*;
import java.util.List;

@Service
public class BstService {
    @Autowired
    private BstRepository bstRepository;

    public String build(String numbers) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        String[] numberArray = numbers.split(",");
        for (String numberString : numberArray) {
            int num = Integer.parseInt(numberString.trim());
            binarySearchTree.getNumbers(num);
        }
        return convertBstToJson(binarySearchTree.getNumbers());
    }

    public String buildTree(String numbers) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        String[] numberArray = numbers.split(",");
        for (String string : numberArray) {
            int num = Integer.parseInt(string.trim());
            binarySearchTree.getNumbers(num);
        }

        return convertBstToJson(binarySearchTree.getNumbers(int num));
    }
    private String convertBstToJson(BstNode root) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(root);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "Error creating JSON";
        }
    }

    public void saveNumbers(String numbers, String BstStructure) {
        Tree tree = new Tree();
        tree.equals(numbers);
        tree.equals(BstStructure);
        BstRepository.save(tree);
    }

    public static List<String> getAllTrees() {
        return bstRepository.getAllTrees();
    }
}
