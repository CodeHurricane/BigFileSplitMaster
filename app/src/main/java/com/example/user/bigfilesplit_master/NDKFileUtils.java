package com.example.user.bigfilesplit_master;

public class NDKFileUtils {
	/**
	 * 拆分
	 * @param path
	 * @param path_pattern
	 * @param count
	 */
	public native static void diff(String path,String path_pattern,int count);
	
	/**
	 * 合并
	 * @param path_pattern
	 * @param count
	 * @param merge_path
	 */
	public native static void patch(String path_pattern,int count,String merge_path);
	
	static{
		System.loadLibrary("native-lib");
	}
	
}
