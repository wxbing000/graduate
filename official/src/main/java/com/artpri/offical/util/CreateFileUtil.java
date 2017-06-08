package com.artpri.offical.util;

import java.io.File;
import java.io.IOException;

/**
 * 创建目录结构
 * @version 2016.02.25
 */
public class CreateFileUtil {  
    
	/**
	 * create a single file
	 * @param destFileName 路径名称
	 * @return
	 */
    public static boolean createFile(String destFileName) {  
        File file = new File(destFileName);  
        if(file.exists()) {  
            System.out.println("创建单个文件" + destFileName + "失败，目标文件已存在！");  
            return false;  
        }  
        if (destFileName.endsWith(File.separator)) {  
            System.out.println("创建单个文件" + destFileName + "失败，目标文件不能为目录！");  
            return false;  
        }  
        //判断目标文件所在的目录是否存在  
        if(!file.getParentFile().exists()) {  
            //如果目标文件所在的目录不存在，则创建父目录  
            System.out.println("目标文件所在目录不存在，准备创建它！");  
            if(!file.getParentFile().mkdirs()) {  
                System.out.println("创建目标文件所在目录失败！");  
                return false;  
            }  
        }  
        //创建目标文件  
        try {  
            if (file.createNewFile()) {  
                System.out.println("创建单个文件" + destFileName + "成功！");  
                return true;  
            } else {  
                System.out.println("创建单个文件" + destFileName + "失败！");  
                return false;  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
            System.out.println("创建单个文件" + destFileName + "失败！" + e.getMessage());  
            return false;  
        }  
    }  
     
     /**
      * create directory
      * @param destDirName 路径名称
      * @return
      */
    public static boolean createDir(String destDirName) {  
        File dir = new File(destDirName);  
        if (dir.exists()) {  
            System.out.println("创建目录" + destDirName + "失败，目标目录已经存在");
            return false;  
        }  
        if (!destDirName.endsWith(File.separator)) {  
            destDirName = destDirName + File.separator;  
        }  
        //创建目录  
        if (dir.mkdirs()) {  
            System.out.println("创建目录" + destDirName + "成功！");  
            return true;  
        } else {  
            System.out.println("创建目录" + destDirName + "失败！");  
            return false;  
        }  
    }  
     
     /**
      * create temp file
      * @param prefix
      * @param suffix
      * @param dirName
      * @return
      */
    public static String createTempFile(String prefix, String suffix, String dirName) {  
        File tempFile = null;  
        if (dirName == null) {  
            try{  
                //在默认文件夹下创建临时文件  
                tempFile = File.createTempFile(prefix, suffix);  
                //返回临时文件的路径  
                return tempFile.getCanonicalPath();  
            } catch (IOException e) {  
                e.printStackTrace();  
                System.out.println("创建临时文件失败！" + e.getMessage());  
                return null;  
            }  
        } else {  
            File dir = new File(dirName);  
            //如果临时文件所在目录不存在，首先创建  
            if (!dir.exists()) {  
                if (!CreateFileUtil.createDir(dirName)) {  
                    System.out.println("创建临时文件失败，不能创建临时文件所在的目录！");  
                    return null;  
                }  
            }  
            try {  
                //在指定目录下创建临时文件  
                tempFile = File.createTempFile(prefix, suffix, dir);  
                return tempFile.getCanonicalPath();  
            } catch (IOException e) {  
                e.printStackTrace();  
                System.out.println("创建临时文件失败！" + e.getMessage());  
                return null;  
            }  
        }  
    }  
     
    /** rename file 
     * @param path 文件目录 
     * @param oldname  原来的文件名 
     * @param newname 新文件名 
     */ 
     public static void renameFile(String path, String oldname, String newname){ 
         if(!oldname.equals(newname)){//新的文件名和以前文件名不同时,才有必要进行重命名 
             File oldfile=new File(path+"/"+oldname); 
             File newfile=new File(path+"/"+newname); 
             if(!oldfile.exists()){
                 return;//重命名文件不存在
             }
             if(newfile.exists())//若在该目录下已经有一个文件和新文件名相同，则不允许重命名 
                 System.out.println(newname+"已经存在！"); 
             else{ 
                 oldfile.renameTo(newfile); 
             } 
         }else{
             System.out.println("新文件名和旧文件名相同...");
         }
     }
     
     /**
      * file rename method 
      * @return rename
      */
     public String createFileName(){
    	 return null;
     }
    
    /**
     * 待用
     */
    public void createDirAndFile(){
    	//创建目录  
        String dirName = "E:/filetest/temp/temp0/temp1";  
        CreateFileUtil.createDir(dirName);  
        //创建文件  
        String fileName = dirName + "/temp2/tempFile.txt";  
        CreateFileUtil.createFile(fileName);
    }
}  

























/*public static void main(String[] args) {  
//创建目录  
String dirName = "E:/filetest/temp/temp0/temp1";  
CreateFileUtil.createDir(dirName);  
//创建文件  
String fileName = dirName + "/temp2/tempFile.txt";  
CreateFileUtil.createFile(fileName);  
//创建临时文件  
String prefix = "temp";  
String suffix = ".txt";  
for (int i = 0; i < 10; i++) {  
    System.out.println("创建了临时文件："  
            + CreateFileUtil.createTempFile(prefix, suffix, dirName));  
}  
//在默认目录下创建临时文件  
for (int i = 0; i < 10; i++) {  
    System.out.println("在默认目录下创建了临时文件："  
            + CreateFileUtil.createTempFile(prefix, suffix, null));  
}
}  */