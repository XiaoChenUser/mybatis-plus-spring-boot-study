package com.example.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "user")
public class UserDTO {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
