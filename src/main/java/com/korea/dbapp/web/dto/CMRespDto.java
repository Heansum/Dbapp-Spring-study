package com.korea.dbapp.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
// Object의 행위가 없는 Object를 bean이라고 하며
// Class 자료형이라고 한다
public class CMRespDto<T> {
	private int code;
	private String msg;
	private T data;
}
