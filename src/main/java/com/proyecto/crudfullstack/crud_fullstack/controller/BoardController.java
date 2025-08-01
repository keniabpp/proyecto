package com.proyecto.crudfullstack.crud_fullstack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.crudfullstack.crud_fullstack.entity.Board;
import com.proyecto.crudfullstack.crud_fullstack.service.BoardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/api/boards")
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }
    

    //localhost:8080/api/boards/create
    @PostMapping("/create")
    public Board save(@RequestBody Board board){
        return boardService.save(board);
    }
    

    //localhost:8080/api/boards
    @GetMapping
    public List<Board> findAll(){
        return boardService.findAll();
    }
    
    
    //localhost:8080/api/boards/2
    @GetMapping("/{id}")
    public Board findById(@PathVariable Long id){
        return boardService.findById(id);
    }

    //localhost:8080/api/boards/3
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        boardService.deleteById(id);
    }
    
    //localhost:8080/api/boards
    @PutMapping
    public Board updateBoard(@RequestBody Board board){
        Board boardDB = boardService.findById(board.getIdBoard());
        boardDB.setName(board.getName());
        boardDB.setDescription(board.getDescription());
        boardDB.setCreatedAt(board.getCreatedAt());

        return boardService.update(boardDB);
    }
    

}
