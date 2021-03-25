package com.cosbaseBallTest.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CMRespDto <T>{

	private int statusCode;
	private T data;
	
}
