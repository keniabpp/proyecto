package com.proyecto.crudfullstack.crud_fullstack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "columns")
public class Column {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idColumn;
    private String name;
    private Integer position;

    @ManyToOne
    @JoinColumn(name = "id_board", nullable = false)
    private Board board;

    public Column() {
    }

    public Column(Long idColumn, String name, Integer position, Board board) {
        this.idColumn = idColumn;
        this.name = name;
        this.position = position;
        this.board = board;
    }

    public Long getIdColumn() {
        return idColumn;
    }

    public void setIdColumn(Long idColumn) {
        this.idColumn = idColumn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    






}
