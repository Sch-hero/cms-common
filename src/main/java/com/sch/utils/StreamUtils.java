/**
 * 
 */
package com.sch.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * @宋春浩
 *
 * 2019年10月12日
 */
public class StreamUtils {

	/**
	 * 关闭所有的流
	 * @param streams
	 * @throws IOException
	 */
public static void closeStream(Closeable ... streams) throws IOException {
		
		for (int i = 0; i < streams.length; i++) {
			streams[i].close();
		}
		
	}
}
