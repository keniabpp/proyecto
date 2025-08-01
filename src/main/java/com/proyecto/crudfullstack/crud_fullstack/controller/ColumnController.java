package com.proyecto.crudfullstack.crud_fullstack.controller;



import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.crudfullstack.crud_fullstack.entity.Column;
import com.proyecto.crudfullstack.crud_fullstack.service.ColumnService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/columns")
public class ColumnController {

    private final ColumnService columnService;

    public ColumnController(ColumnService columnService) {
        this.columnService = columnService;
    }
    
    
    //localhost:8080/api/boards/create
    @GetMapping("/boards/{idBoard}")
    public List<Column>getColumnsByIdBoard(@PathVariable Long idBoard){
        return columnService.getColumnByIdBoard(idBoard);
    }
    



}
