package com.sohu.cache.util;


import com.sohu.cache.entity.AppDesc;


/**
 * Created by larrykong on 16-6-27.
 */

public class TokenUtils {
	
    /**
     * 生成app token
     * @param appDesc
     * @return token错误返回
     */

	public static String newToken(AppDesc appDesc) {
		if (appDesc != null) {
			try {
				return Md5Utils.GetMD5Code(appDesc.toString());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return "";
	}
}
