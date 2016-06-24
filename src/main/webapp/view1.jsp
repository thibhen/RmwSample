<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<portlet:defineObjects />

<%
String currentURL = PortalUtil.getCurrentURL(request).replaceAll("\\?.*", "")+"/";
%>


<script type="text/javascript">
document.write("<base href='<%= currentURL %>' />");
</script>
<my-app>Loading (local)...</my-app>
<script type="text/javascript" src="/html/rmw1/app.js"></script>

