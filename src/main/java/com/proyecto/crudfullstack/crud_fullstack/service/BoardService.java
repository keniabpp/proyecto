package com.proyecto.crudfullstack.crud_fullstack.service;

import java.util.List;

import com.proyecto.crudfullstack.crud_fullstack.entity.Board;

public interface BoardService {
    Board save(Board board);
    List<Board> findAll();
    Board findById(Long id);
    void deleteById(Long id);
    Board update (Board board);


}
