package com.vivi.vue.shop.utils;

import lombok.Getter;
import lombok.Setter;

/**
 * 返回数据
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年10月27日 下午9:59:27
 */
@Getter
@Setter
public class R<T> {
	private static final long serialVersionUID = 1L;

	private T data;

	private Meta meta;

	public R<T> setMsg(String msg) {
		this.getMeta().setMsg(msg);
		return this;
	}

	@Getter
	@Setter
	public static class Meta {
		private int status;
		private String msg;
	}

	public static R create(int status, String msg) {
		R r = new R();
		Meta meta = new Meta();
		meta.setMsg(msg);
		meta.setStatus(status);
		r.setMeta(meta);
		return r;
	}
	
	public R() {
	}

	public static R ok() {
		return create(200, "操作成功");
	}


	public static R error(int status, String msg) {
		return create(status, msg);
	}

	public R setData(T data){
		this.data = data;
		return this;
	}


}
