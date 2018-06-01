
<%@ page contentType="image/jpeg" import="java.awt.*,java.awt.image.*,java.util.*,javax.imageio.*"   %>
<%@page import="com.sun.image.codec.jpeg.*"%>
<%
out.clear();
response.setHeader("Pragma","No-cache");
response.setHeader("Cache-Control","no-cache");
response.setDateHeader("Expires", 0);

        Random r = new Random(); 
		StringBuffer sb = new StringBuffer(); 
		char[] ch = "2345678qwertyupkhfdsazxcvbnm".toCharArray();    
        int index, len = ch.length;  
        for (int i = 0; i < 4; i++) {   
            index = r.nextInt(len);     
            sb.append(ch[index]);   
        }
		
		String checkCode=sb.toString();
		session.setMaxInactiveInterval(10*60); 
		session.setAttribute("rand",checkCode);
		
        String CONTENT_TYPE = "image/jpeg";
        BufferedImage image = new BufferedImage(90, 30, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        Font font = new Font("Bookman Old Style", Font.BOLD, 25);
        g2d.setFont(font);
        g2d.setColor(Color.white);
        g2d.fill(new Rectangle(image.getWidth(), image.getHeight()));
        g2d.setColor(Color.BLUE); 
            for (int i = 0; i < 16; i++)
            {
                int x1 = r.nextInt(90);
                int x2 = r.nextInt(90);
                int y1 = r.nextInt(30);
                int y2 = r.nextInt(30);

               g2d.drawLine( x1, y1, x2, y2);
            }




 image.setRGB(12, 23, 32);


		 for (int i = 0; i < ((int) (Math.random() * 60) + 20); ++i) {

            g2d.fill(new Rectangle((int) (Math.random() * image.getWidth()),
                    (int) (Math.random() * image.getHeight()), 1, 1));
        }
		
        g2d.setPaint(Color.black);
        g2d.drawString(checkCode, 3, 23); // (int) (Math.random() * 15) + 5
        g2d.dispose();
        try {

            ImageIO.write(image, "gif", response.getOutputStream());
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(response.getOutputStream());
            encoder.encode(image);
        } catch (Exception ex) {


        }
		
%>








