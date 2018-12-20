package cn.zzdev.springboot.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserReq {
	
	String id;
	
	@NotBlank(message = "编码不能为空")
	String code;
	
	@NotBlank(message = "名称不能为空")
	String name;

}
