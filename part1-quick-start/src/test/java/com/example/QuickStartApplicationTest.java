package com.example;

import com.example.dto.UserDTO;
import com.example.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class QuickStartApplicationTest {
    @Autowired
    private UserMapper userMapper;


    @Test
    public void contextTest(){}

    @Test
    void quickStartTest(){
        List<UserDTO> userDTOList = userMapper.selectList(null);
        userDTOList.forEach(System.out::println);
    }
}
