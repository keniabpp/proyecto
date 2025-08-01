package com.proyecto.crudfullstack.crud_fullstack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.crudfullstack.crud_fullstack.entity.Board;
import com.proyecto.crudfullstack.crud_fullstack.entity.Column;
import com.proyecto.crudfullstack.crud_fullstack.exception.ResourceNotFoundException;
import com.proyecto.crudfullstack.crud_fullstack.repository.BoardRepository;
import com.proyecto.crudfullstack.crud_fullstack.repository.ColumnRepository;


@Service
public class ColumnServiceImpl implements ColumnService{

    private final ColumnRepository columnRepository;
    private final BoardRepository boardRepository;


    

    public ColumnServiceImpl(ColumnRepository columnRepository, BoardRepository boardRepository) {
        this.columnRepository = columnRepository;
        this.boardRepository = boardRepository;
    }




    @Override
    public List<Column> getColumnByIdBoard(Long idBoard) {
        Board board = boardRepository.findById(idBoard).orElseThrow(
            () ->{ 
                throw new ResourceNotFoundException("No se encontró el board con id: " + idBoard);
        }
        );
        return columnRepository.findByBoardOrderByPositionAsc(board);
    }

}
