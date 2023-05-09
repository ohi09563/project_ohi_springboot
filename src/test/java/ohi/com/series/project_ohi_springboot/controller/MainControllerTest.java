package ohi.com.series.project_ohi_springboot.controller;

import ohi.com.series.project_ohi_springboot.service.BoardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;
/*https://kth990303.tistory.com/47  테스트 참고 자료*/

@SpringBootTest
public class MainControllerTest {


    @Autowired
    BoardService boardService;



    @Test
    @Transactional
    @Rollback(value = false)
    void main() {
    }

    @Test
    void home() {
    }

    @Test
    void login() {
    }

    @Test
    void signup() {
    }

    @Test
    void signup_action() {
    }

    @Test
    void score() {
    }

    @Test
    void map() {
    }

    @Test
    @Transactional
    /*https://tecoble.techcourse.co.kr/post/2021-05-25-transactional/  Transactional 설명*/
    @Rollback(value = false)
    void board() {







    }

    @Test
    void chat() {
    }

    @Test
    void chatWindow() {
    }

    @Test
    void calendal() {
    }

    @Test
    void calendal_writer() {
    }

    @Test
    void financial_ledger() {
    }
}