package com.moremore.board.service;

import com.moremore.board.dto.BoardDTO;
import com.moremore.board.entity.Board;
import com.moremore.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class BoardServiceImpl implements BoardService{

    private final BoardRepository repository;

    @Override
    public Long register(BoardDTO dto){
        log.info(dto);

        Board board = dtoToEntity(dto);

        repository.save(board);

        return  board.getBno();
    }
}
