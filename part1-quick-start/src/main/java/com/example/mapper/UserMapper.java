package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dto.UserDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserDTO> {
}
