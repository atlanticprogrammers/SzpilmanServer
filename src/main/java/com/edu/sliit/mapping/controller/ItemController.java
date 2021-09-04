package com.edu.sliit.mapping.controller;

import com.edu.sliit.mapping.model.Item;
import com.edu.sliit.mapping.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/thogakade/item")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void insertItem(@RequestBody Item item) {
        itemRepository.save(item);
    }
}
