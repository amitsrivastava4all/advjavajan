<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="str" type="java.lang.String" required="true" %>
<%
String titleCase = String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1).toLowerCase();

%>
<%=titleCase%>