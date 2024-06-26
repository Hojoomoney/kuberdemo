package com.kubernetesdemo.kuberdemo.board.service;

import com.kubernetesdemo.kuberdemo.board.model.Board;
import com.kubernetesdemo.kuberdemo.board.model.BoardDto;
import com.kubernetesdemo.kuberdemo.common.service.CommandService;
import com.kubernetesdemo.kuberdemo.common.service.QueryService;

import java.util.Optional;

public interface BoardService extends CommandService<BoardDto>, QueryService<BoardDto> {

    default Board dtoToEntity(BoardDto dto){    //dto 를 entity로 바꾸는 것
        return Board.builder()
                .id(dto.getId())
                .boardType(dto.getBoardType())
                .boardName(dto.getBoardName())
                .build();
    }

    default BoardDto entityToDto(Board ent){ //entity 를 dto로 바꾸는 것
        return BoardDto.builder()
                .id(ent.getId())
                .boardName(ent.getBoardName())
                .boardType(ent.getBoardType())
                .build();
    }

}
