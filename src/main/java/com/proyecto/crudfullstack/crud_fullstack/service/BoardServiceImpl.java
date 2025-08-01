package com.proyecto.crudfullstack.crud_fullstack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.crudfullstack.crud_fullstack.entity.Board;
import com.proyecto.crudfullstack.crud_fullstack.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    
    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }


    @Override
    public void deleteById(Long id) {
        boardRepository.deleteById(id);
        
    }

    @Override
    public List<Board> findAll() {
        
        return boardRepository.findAll();
    }

    @Override
    public Board findById(Long id) {
        
        return boardRepository.findById(id).get();
    }

    @Override
    public Board save(Board board) {
        
        return boardRepository.save(board);
    }

    @Override
    public Board update(Board board) {
        
        return boardRepository.save(board);
    }

}
