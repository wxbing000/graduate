package com.artpri.offical.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件输出
 * @author 4
 */
public class FileOutPut {

	/**
	 * 生成HTML
	 * @param savePath 保存路径，请以"/"结束。
	 * @param fileName 文件名称，例如"html.html"
	 * @param content  待写入内容
	 * @return String 文件保存路径
	 */
	public static String fileOutPutHtml(String savePath, String fileName, String content) {
		String filePath = savePath+fileName;  //生成的html文件保存路径。
		
		FileOutputStream fos = null;
		try {
			File dir = new File(savePath);
			if (dir.exists() == false) {
				dir.mkdirs();
			}
			fos = new FileOutputStream(filePath);
			System.out.print("HTML文件输出路径:");
			System.out.print(filePath);
			byte bytes[] = content.getBytes();
			fos.write(bytes);
			return filePath;
		} catch (IOException e) {
			System.err.println("HTML File build fail");
			e.printStackTrace();
			return null;
		}finally{
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					System.err.println("Fileoutputstream close fail");
					e.printStackTrace();
				}
			}
		}
	}
	
}
