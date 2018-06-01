package com.kuheng.controller.upload;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.alibaba.fastjson.JSONObject;
import com.kuheng.controller.base.BaseController;
import com.kuheng.utils.TimeManager;

@Controller
@RequestMapping("/base/upload")
@SuppressWarnings("all")
public class UploadController extends BaseController {
	/*
     *采用spring提供的上传文件的方法
     */
    @RequestMapping("/uploadimg")
    @ResponseBody
    public String  uploadimg(HttpServletRequest request) throws IllegalStateException, IOException
    {		
    	String path_web ="";//"/"+request.getContextPath(); // request.getScheme()+"://"+ request.getServerName()+"/"+request.getContextPath();  	
	    String path_real=request.getSession().getServletContext().getRealPath("/");;
//	    String path_real3=request.getScheme()+"://"+ request.getServerName()+"/"+request.getContextPath(); 
	    String msg="";
	    JSONObject obj =new JSONObject();
		boolean issuccess = true;
		Boolean isave = true;
		String targetDirectory = "";
		String fileUploadErrorMessage="";
         long  startTime=System.currentTimeMillis();
         //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
                request.getSession().getServletContext());
        //检查form中是否有enctype="multipart/form-data"
        if(multipartResolver.isMultipart(request))
        {
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
           //获取multiRequest 中所有的文件名
            Iterator iter=multiRequest.getFileNames();
           String urlname="";
			String urlname_temp = path_web+ "/upload/"
			+ TimeManager.getInstance().getYear() + "/"
			+ TimeManager.getInstance().getMonth() + "/"
			+ TimeManager.getInstance().getSun() + "/";		
			path_real = path_real+ "/upload/"
			+ TimeManager.getInstance().getYear() + "/"
			+ TimeManager.getInstance().getMonth() + "/"
			+ TimeManager.getInstance().getSun() + "/";
			File f1 = new File(path_real);
			if (!f1.exists()) {
				f1.mkdirs();
			}	
			
	
             
            while(iter.hasNext())
            {
            	//一次遍历所有文件
                MultipartFile file=multiRequest.getFile(iter.next().toString());
                if(file!=null)
                {
                	String fileContentType=file.getContentType();
        			if ("image/gif".equals(fileContentType)
        					|| "image/pjpeg".equals(fileContentType)
        					|| "image/jpeg".equals(fileContentType)
        					|| "image/x-png".equals(fileContentType)
        					|| "image/png".equals(fileContentType)	
        					|| "application/octet-stream".equals(fileContentType)
        					) {
        			} else {
        				fileUploadErrorMessage = "请选择正确上传文件"+fileContentType;
        				//issuccess = false;
        			}
        			String targetFileName = generateFileName(file.getOriginalFilename());
        			String targetFileName1 = generateFileName(file.getOriginalFilename());
        			String str[] = targetFileName.split("\\.");
    				String name = str[0];    				
    				String extName = str[1];           	                 
                    String path=path_real+""+targetFileName;
                    urlname=urlname+urlname_temp+targetFileName+","+urlname_temp+targetFileName1+" ";
                    //上传
                    file.transferTo(new File(path));
                    System.out.println("path--------------"+path);
//                    createIcon(path,path_real,targetFileName,600);
                    createIcon(path,path_real,targetFileName1,60);                    
                }           
            }
			if (fileUploadErrorMessage != null && fileUploadErrorMessage.length() > 0) {
				obj.put("error", 1);
			}else{
				obj.put("error", 0);
				obj.put("url", urlname);
			}     
        }
        long  endTime=System.currentTimeMillis();
        System.out.println("方法三的运行时间："+String.valueOf(endTime-startTime)+"ms");
        System.out.println(msg);      
    return obj.toJSONString(); 
    }
    

	/**
	 * 文件的名字重命名 2010-9-25
	 * 
	 * @param createDate
	 * @return
	 */
	private String generateFileName(String fileName) {
		String name = UUID.randomUUID().toString();
		int position = fileName.lastIndexOf(".");
		String extension = fileName.substring(position);
		return name + extension;
	}
	
	
	
	public static void createIcon(String path,String path_real,String targetFileName,int size) {
        String newpath=path_real+targetFileName;
		try {
            File fiBig = new File(path); // 大图文件
            File foSmall = new File(newpath); // 将要转换出的小图文件

            AffineTransform transform = new AffineTransform();
            //读取图片
            BufferedImage bis = ImageIO.read(fiBig);
            //获得图片原来的高宽
            int w = bis.getWidth();
            int h = bis.getHeight();
            double scale = (double) w / h;
//等比例缩放　
            int nowWidth = size;
            int nowHeight = (nowWidth * h) / w;
            double sx = (double) nowWidth / w;
            double sy = (double) nowHeight / h;

            transform.setToScale(sx, sy);

            AffineTransformOp ato = new AffineTransformOp(transform, null);
            BufferedImage bid = new BufferedImage(nowWidth, nowHeight,
                    BufferedImage.TYPE_3BYTE_BGR);
            ato.filter(bis, bid);            
            ImageIO.write(bid, "png", foSmall);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
   
}
