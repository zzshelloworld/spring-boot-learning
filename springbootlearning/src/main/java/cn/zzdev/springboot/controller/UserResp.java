package cn.zzdev.springboot.controller;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResp {
    String id;

    String code;

    String name;

    String status;

}
