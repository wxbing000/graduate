/**
 * 
 */
package com.artpri.artist.util;

import java.io.File;

/**
 * 根据图片的url删除服务器上的文件
 * @author 王校兵
 * @version 1.0, 2016年4月11日
 */
public class DeleteFileUtil {
	
	/**
	 * 根据url删除服务器上的图片
	 * @param url 图片的路径  数据库
	 * @param postion 服务器上的图片的存储的路径(网站的根路径)
	 * */
	public static void delPhoto(String url, String postion){
		String[] splitPath = url.split("/");// 将当前的图片的路径通过"/"进行分割

		StringBuffer sb = new StringBuffer();
		for (int index = 3; index < splitPath.length; index++) {
			sb.append(splitPath[index]);
			if (index != splitPath.length - 1) {
				sb.append("\\");
			}
		}
		String photoRealPath = postion + sb.toString(); // 创建图片的真实位置字符串
		File photo = new File(photoRealPath);
		photo.delete();
	}

    public static void main(String[] args) {
        delPhoto("http://localhost:8080/image/2017420/aa.jpg","D:\\WorkSpace\\IDEA\\graduate\\out\\artifacts\\image_war_exploded\\");
    }

}
