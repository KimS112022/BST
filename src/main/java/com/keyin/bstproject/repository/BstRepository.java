package com.keyin.bstproject.repository;

import com.keyin.bstproject.model.BstNode;
import com.sun.source.tree.Tree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BstRepository extends JpaRepository<BstNode, Long> {
    static void save(Tree tree) {
    }

    List<String> getAllTrees();
}
