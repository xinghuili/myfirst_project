/*
 * JSP generated by Resin Professional 3.1.3 (built Sun, 07 Oct 2007 06:30:19 PDT)
 */

package _jsp._web_22dinf._jsp._base._type;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _add_0brand__jsp extends com.caucho.jsp.JavaPage
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("WEB-INF/jsp/base/type/add_brand.jsp"), 182324571571785090L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  static {
    _jsp_string0 = "<!DOCTYPE HTML>\r\n<html>\r\n<head>\r\n<meta charset=\"utf-8\">\r\n<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n<!--[if lt IE 9]>\r\n<script type=\"text/javascript\" src=\"js/html5.js\"></script>\r\n<script type=\"text/javascript\" src=\"js/respond.min.js\"></script>\r\n<script type=\"text/javascript\" src=\"js/PIE_IE678.js\"></script>\r\n<![endif]-->\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/H-ui.css\"/>\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/H-ui.admin.css\"/>\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/font/font-awesome.min.css\"/>\r\n<!--[if IE 7]>\r\n<link href=\"font/font-awesome-ie7.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<![endif]-->\r\n<title>\u6dfb\u52a0\u54c1\u724c</title>\r\n</head>\r\n<body>\r\n<div class=\"pd-20\">\r\n  <form class=\"Huiform\" id=\"loginform\" action=\"\" method=\"post\">\r\n    <table class=\"table table-border table-bordered table-bg\">\r\n      <tbody>\r\n      \r\n       \r\n         <tr>\r\n          <th class=\"text-r\" width=\"115\">\u540d\u79f0\uff1a</th>\r\n          <td><input name=\"oldpassword\" type=\"text\" class=\"input-text\" id=\"\"style=\"width:150px\" > \r\n          </td>\r\n        </tr>\r\n        <tr>\r\n          <th class=\"text-r\"><span class=\"c-red\">*</span>\u6392\u5e8f\uff1a</th>\r\n          <td><input name=\"oldpassword\" type=\"text\" class=\"input-text\" id=\"\"style=\"width:100px\" ></td>\r\n        </tr>\r\n         <tr>\r\n          <th class=\"text-r\" width=\"115\"><span class=\"c-red\">*</span>logo\uff1a</th>\r\n          <td><input name=\"oldpassword\" type=\"text\" class=\"input-text\" id=\"\" style=\"width:200px; height:100px;\" ></td>\r\n        </tr>\r\n        \r\n        \r\n        <tr>\r\n          <th></th>\r\n          <td>\r\n            <button type=\"submit\" class=\"btn btn-success radius\" id=\"admin-role-save\" name=\"admin-role-save\"><i class=\"icon-ok\"></i> \u786e\u5b9a</button>\r\n          </td>\r\n        </tr>\r\n      </tbody>\r\n    </table>\r\n  </form>\r\n</div>\r\n<script type=\"text/javascript\" src=\"/js/jquery.min.js\"></script>\r\n<script type=\"text/javascript\" src=\"/js/Validform_v5.3.2_min.js\"></script> \r\n<script type=\"text/javascript\" src=\"/layer/layer.min.js\"></script> \r\n<script type=\"text/javascript\" src=\"/js/H-ui.js\"></script> \r\n<script type=\"text/javascript\" src=\"/js/H-ui.admin.js\"></script> \r\n<script type=\"text/javascript\">\r\n$(\".Huiform\").Validform(); \r\n</script>\r\n\r\n</body>\r\n</html>".toCharArray();
  }
}