package com.edu.sliit.mapping.repository;

import com.edu.sliit.mapping.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,String> {

}
