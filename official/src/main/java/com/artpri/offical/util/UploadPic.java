package com.artpri.offical.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.struts2.ServletActionContext;

/**
 * 上传图片
 * @author 4
 */
public class UploadPic {

	/**
	 * 单个图片上传
	 * @param savePath 保存路径
	 * @param filename 文件名称
	 * @param file     文件
	 * @return
	 */
	public static String uploadOnePic(String savePath, String filename, File file){
		
		String root = ServletActionContext.getServletContext()
				.getRealPath(savePath);
		FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            // 建立文件输出流
            fos = new FileOutputStream(root + "\\" + filename);
            // 建立文件上传流
            fis = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
            return root;
        } catch (Exception e) {
            System.out.println("文件上传失败");
            e.printStackTrace();
            return null;
        } finally {
            close(fos, fis);
        }
		
	}
	
	@SuppressWarnings("unchecked")
	/**
	 * 图片批量上传
	 * @file:文件域列表
	 * @fileName:上传文件的文件名
	 * @path:文件上传的目录，相对目录。 说明：文件上传所存放目录的规则：网站根目录下 files/会员ID/网站类型名称/上传文件分类名称/
	 * @返回结果：一个存放上传文件所在位置相对路径的ArrayList;一个文件旧名称的List;一个文件新名称的List;
	 */
	public static ArrayList uploadServalPic(List file, List fileName, List fileContentType, String path, String urlPath)
			throws IOException {
		// String root = ServletActionContext.getRequest().getRealPath(path);
		
		//取得图片类型
		List<String> typeList = getPicType(fileContentType);
		
		/*String root = ServletActionContext.getServletContext()
				.getRealPath(path);*/
		String root = path;
		File dir = new File(root);
		if (dir.exists() == false) {
			dir.mkdirs();
		}
		
		ArrayList list = new ArrayList();
		ArrayList<String> pathList = new ArrayList<String>();
		ArrayList<String> rnameList = new ArrayList<String>();
		ArrayList<String> onameList = new ArrayList<String>();
		
		for (int i = 0; i < file.size(); ++i) {
			InputStream is = new FileInputStream(file.get(i).toString());
			/*
			 * SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");//
			 * 格式化时间输出 String Rname = sdf.format(new Date());//
			 * 取得当前时间，Date()是java.util包里的，这作为真实名称 name = Rname + name;//
			 * 重命名文件名称,命名规则为：时间+原文件名称
			 */

			String name = fileName.get(i).toString();// 得到上传文件的原名称
			//String oname = name + "." + typeList.get(i).toString();
			System.out.println("原名称： " + name);
			onameList.add(name);
			//组成新文件名
			name = RandomUtil.getRandomFileName() + "." + typeList.get(i).toString();
			rnameList.add(name);
			System.out.println("现名称： " + name);
			File destFile = new File(root, name);

			OutputStream os = new FileOutputStream(destFile);

			byte[] buffer = new byte[400];

			int length = 0;

			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
			pathList.add(urlPath + name);
			System.out.println("path: " + urlPath + " " + "name: " + name);
			is.close();
			os.close();
		}
		list.add(pathList);
		list.add(onameList);
		list.add(rnameList);
		return list;
	}
	
	
	/**
	 * 获取图片类型
	 * @param fileContentType
	 * @return
	 */
	private static List<String> getPicType(List fileContentType){
		//处理图片类型
		List<String> typeList = new ArrayList<String>();
		for (Iterator it = fileContentType.iterator(); it.hasNext();) {
			String s = (String)it.next();
			String type = "";
			if (s.equals("image/jpeg")) {
				s = "jpg";
			}else if (s.equals("image/bmp")) {
				s = "bmp";
			}else if (s.equals("image/png")) {
				s = "png";
			}else if (s.equals("image/gif")) {
				s = "gif";
			}
			typeList.add(s);
		}
		return typeList;
	}
	
	/**
	 * 关闭输入输出流
	 * @param fos
	 * @param fis
	 */
	private static void close(FileOutputStream fos, FileInputStream fis) {
        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("FileInputStream关闭失败");
                e.printStackTrace();
            }
        }
        if (fos != null) {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("FileOutputStream关闭失败");
                e.printStackTrace();
            }
        }
    }
}
