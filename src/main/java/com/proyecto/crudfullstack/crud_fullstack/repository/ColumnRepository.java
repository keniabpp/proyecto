package com.proyecto.crudfullstack.crud_fullstack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.crudfullstack.crud_fullstack.entity.Board;
import com.proyecto.crudfullstack.crud_fullstack.entity.Column;

@Repository
public interface ColumnRepository extends JpaRepository<Column, Long> {
    List<Column>findByBoardOrderByPositionAsc(Board board);
    

}
