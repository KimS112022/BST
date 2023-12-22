package com.keyin.bstproject.controller;

import com.keyin.bstproject.service.BstService;
import com.sun.source.tree.Tree;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class BstController {

    @Autowired
    private BstService bstService;

    @GetMapping("/enter-numbers")
    public String displayNumbers() {
        return "enter-numbers";
    }

    @PostMapping("/process-numbers")
    public ResponseEntity<String> processNumbers(@RequestBody List<Integer> numbers) {
        String treeStructure = BstService.build(numbers);
        bstService.save(numbers);
        return ResponseEntity.ok(treeStructure);
    }

    @GetMapping("/previous-trees")
    public ResponseEntity<List<String>> getPreviousTrees() {
        List<String> getAllTrees = BstService.getAllTrees();
        return ResponseEntity.ok(getPreviousTrees().getBody());
    }
}
