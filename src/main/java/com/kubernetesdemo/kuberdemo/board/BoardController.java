package com.kubernetesdemo.kuberdemo.board;

import com.kubernetesdemo.kuberdemo.board.service.BoardService;
import com.kubernetesdemo.kuberdemo.common.component.Messenger;
import com.kubernetesdemo.kuberdemo.common.component.PageRequestVo;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping(path = "/api/boards")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService service;
    @PostMapping(path = "")
    public ResponseEntity<Messenger> save(PageRequestVo vo) throws SQLException {
        service.save(null);
        return ResponseEntity.ok(new Messenger());
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Messenger> deleteById(@PathVariable long id){
        service.deleteById(0L);
        return ResponseEntity.ok(new Messenger());
    }
    @GetMapping(path = "")
    public ResponseEntity<Messenger> findAll(PageRequestVo vo) throws SQLException {
        service.findAll();
        return ResponseEntity.ok(new Messenger());
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Messenger> findById(@PathVariable Long id){
        service.findById(0L);
        return ResponseEntity.ok(new Messenger());
    }
    @GetMapping(path = "/count")
    public ResponseEntity<Messenger> count(){
        service.count();
        return ResponseEntity.ok(new Messenger());
    }
    @GetMapping(path = "/exists/{id}")
    public ResponseEntity<Messenger> existById(@PathVariable long id){
        service.existById(0L);
        return ResponseEntity.ok(new Messenger());
    }
}
