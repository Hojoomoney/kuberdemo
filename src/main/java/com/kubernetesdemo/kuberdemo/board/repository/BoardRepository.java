package com.kubernetesdemo.kuberdemo.board.repository;


import com.kubernetesdemo.kuberdemo.board.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
