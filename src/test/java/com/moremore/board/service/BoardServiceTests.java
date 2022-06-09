package com.moremore.board.service;


import com.moremore.board.dto.BoardDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardServiceTests {
    @Autowired
    private BoardService boardService;

    @Test
    public void testRegister() {
        BoardDTO dto = BoardDTO.builder()
                .title("test.")
                .content("test...")
                .writerEmail("user55@aaa.com")
                .build();

        Long bno = boardService.register(dto);
        System.out.println(bno);
    }
}
