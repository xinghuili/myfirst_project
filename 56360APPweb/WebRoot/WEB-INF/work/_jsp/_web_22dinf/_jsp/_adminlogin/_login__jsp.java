/*
 * JSP generated by Resin Professional 3.1.3 (built Sun, 07 Oct 2007 06:30:19 PDT)
 */

package _jsp._web_22dinf._jsp._adminlogin;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _login__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = com.caucho.jsp.QJspFactory.allocatePageContext(this, _jsp_application, request, response, null, null, 8192, true, false);
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
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
    long lastModified = 0;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      Object oDepend = _caucho_depends.get(i);
      if (oDepend instanceof com.caucho.vfs.Depend) {
        com.caucho.vfs.Depend depend = (com.caucho.vfs.Depend) oDepend;
        if (lastModified < depend.getLastModified())
          lastModified = depend.getLastModified();
      }
    }

    return lastModified;
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
    com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.PageContextImpl(webApp, this);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("WEB-INF/jsp/adminlogin/login.jsp"), -4471917829929522486L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  static {
    _jsp_string0 = "<!DOCTYPE HTML>\r\n<html>\r\n<head>\r\n<meta charset=\"utf-8\">\r\n<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n<LINK rel=\"Bookmark\" href=\"/favicon.ico\" >\r\n<LINK rel=\"Shortcut Icon\" href=\"/favicon.ico\" />\r\n<!--[if lt IE 9]>\r\n<script type=\"text/javascript\" src=\"js/html5.js\"></script>\r\n<script type=\"text/javascript\" src=\"js/respond.min.js\"></script>\r\n<script type=\"text/javascript\" src=\"js/PIE_IE678.js\"></script>\r\n<![endif]-->\r\n<link href=\"/css/H-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<link href=\"/css/H-ui.login.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<!--[if IE 6]>\r\n<script type=\"text/javascript\" src=\"js/DD_belatedPNG_0.0.8a-min.js\" ></script>\r\n<script>DD_belatedPNG.fix('*');</script>\r\n<![endif]-->\r\n<title>\u540e\u53f0\u767b\u5f55 - \u6d4e\u5b81\u5ba2\u8fdb\u9500\u5b58\u7ba1\u7406\u7cfb\u7edf</title>\r\n<meta name=\"keywords\" content=\"\">\r\n<meta name=\"description\" content=\"\">\r\n</head>\r\n<body>\r\n<input type=\"hidden\" id=\"TenantId\" name=\"TenantId\" value=\"\" />\r\n<div class=\"header\"></div>\r\n<div class=\"loginWraper\">\r\n  <div id=\"loginform\" class=\"loginBox\">\r\n    <form action=\"/adminlogin/admin_login.do\" method=\"post\">\r\n      <div class=\"formRow user\">\r\n        <input id=\"username\" name=\"username\" type=\"text\" placeholder=\"\u8d26\u6237\" class=\"input_text input-big\">\r\n      </div>\r\n      <div class=\"formRow password\">\r\n        <input id=\"password\" name=\"password\" type=\"password\" placeholder=\"\u5bc6\u7801\" class=\"input_text input-big\">\r\n      </div>\r\n      <div class=\"formRow yzm\">\r\n        <input class=\"input_text input-big\" type=\"text\" placeholder=\"\u9a8c\u8bc1\u7801\" onBlur=\"if(this.value==''){this.value='\u9a8c\u8bc1\u7801:'}\" onClick=\"if(this.value=='\u9a8c\u8bc1\u7801:'){this.value='';}\" value=\"\u9a8c\u8bc1\u7801:\" style=\"width:150px;\">\r\n        <img src=\"images/yzm.jpg\"> <a id=\"kanbuq\" href=\"javascript:;\">\u770b\u4e0d\u6e05\uff0c\u6362\u4e00\u5f20</a> </div>\r\n      <div class=\"formRow\">\r\n        <label for=\"online\">\r\n          <input type=\"checkbox\" name=\"online\" id=\"online\" value=\"\">\r\n          \u4f7f\u6211\u4fdd\u6301\u767b\u5f55\u72b6\u6001</label>\r\n      </div>\r\n      <div class=\"formRow\">\r\n        <input name=\"\" type=\"submit\" class=\"btn radius btn-success btn-big\" value=\"&nbsp;\u767b&nbsp;&nbsp;&nbsp;&nbsp;\u5f55&nbsp;\">\r\n        <input name=\"\" type=\"reset\" class=\"btn radius btn-default btn-big\" value=\"&nbsp;\u53d6&nbsp;&nbsp;&nbsp;&nbsp;\u6d88&nbsp;\">\r\n      </div>\r\n    </form>\r\n  </div>\r\n</div>\r\n<div class=\"footer\">\u6d4e\u5b81\u5ba2\u8fdb\u9500\u5b58\u7ba1\u7406\u7cfb\u7edf</div>\r\n<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n<script type=\"text/javascript\" src=\"js/H-ui.js\"></script>\r\n\r\n</body>\r\n</html>".toCharArray();
  }
}