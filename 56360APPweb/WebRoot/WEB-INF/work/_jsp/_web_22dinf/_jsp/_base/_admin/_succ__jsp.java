/*
 * JSP generated by Resin Professional 3.1.3 (built Sun, 07 Oct 2007 06:30:19 PDT)
 */

package _jsp._web_22dinf._jsp._base._admin;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.sql.*;

public class _succ__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = com.caucho.jsp.QJspFactory.allocatePageContext(this, _jsp_application, request, response, "/WEB-INF/jsp/base/admin/", session, 8192, true, false);
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      _caucho_expr_0.print(out, _jsp_env, false);
      out.write(_jsp_string1, 0, _jsp_string1.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      com.caucho.jsp.QJspFactory.freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.server.util.CauchoSystem.getVersionId() != -5493130486421572921L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.vfs.Dependency depend;
      depend = (com.caucho.vfs.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void init(ServletConfig config)
    throws ServletException
  {
    com.caucho.server.webapp.WebApp webApp
      = (com.caucho.server.webapp.WebApp) config.getServletContext();
    super.init(config);
    com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
    manager.addTaglibFunctions(_jsp_functionMap, "c", "http://java.sun.com/jsp/jstl/core");
    com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.PageContextImpl(webApp, this);
    _caucho_expr_0 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${message}");
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("WEB-INF/jsp/base/admin/succ.jsp"), -7003854292570119045L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }
  private static com.caucho.el.Expr _caucho_expr_0;

  private final static char []_jsp_string1;
  private final static char []_jsp_string0;
  static {
    _jsp_string1 = "\uff01</center>\r\n\r\n	 </div> \r\n\r\n</body>\r\n</html>".toCharArray();
    _jsp_string0 = "\r\n\r\n<!DOCTYPE HTML>\r\n<html>\r\n<head>\r\n<meta charset=\"utf-8\">\r\n<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n<!--[if lt IE 9]>\r\n<script type=\"text/javascript\" src=\"js/html5.js\"></script>\r\n<script type=\"text/javascript\" src=\"js/respond.min.js\"></script>\r\n<script type=\"text/javascript\" src=\"js/PIE_IE678.js\"></script>\r\n<![endif]-->\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/H-ui.css\"/>\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/H-ui.admin.css\"/>\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/font/font-awesome.min.css\"/>\r\n<!--[if IE 7]>\r\n<link href=\"font/font-awesome-ie7.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<![endif]-->\r\n<title></title>\r\n\r\n<script >\r\n\r\nvar t=2;\r\nfunction timedCount() {\r\n    t=t-1;\r\n	if(t>0){\r\n		\r\n		setTimeout(\"timedCount();\",1000);\r\n	}\r\n	if(t<=0){\r\n		\r\n		parent.layer.closeAll();\r\n  	}	\r\n}\r\n\r\n\r\n</script>\r\n</head>\r\n\r\n<body onLoad=\"timedCount()\">\r\n\r\n<div class=\"main\">\r\n     <center style=\"font-size:30px ;margin-top:50px; color:#FF0000\">".toCharArray();
  }
}
