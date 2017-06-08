package com.ffwang.util;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class FTTools {

	public static String getResponseResultData(int code,Object data,String message)
	{
		Map<String, Object> result = new HashMap<>();
		result.put("code", code);
		result.put("data", data);
		result.put("message", message);
		return  JSON.toJSONString(result);
	}
}
