package com.leo.base.net;


/**
 * 
 * @author Chen Lei
 * @version 1.1.5
 *
 */
public enum LReqEncode {

	/**
	 * 使用UTF-8编码请求网络连接
	 */
	UTF8("UTF-8"),

	/**
	 * 使用GBK编码请求网络连接
	 */
	GBK("GBK");

	private String mEncoding;

	private LReqEncode(String encoding) {
		this.mEncoding = encoding;
	}

	public String getEncode() {
		return this.mEncoding;
	}
}
