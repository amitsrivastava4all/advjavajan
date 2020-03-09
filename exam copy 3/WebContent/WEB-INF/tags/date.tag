<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag import="com.brainmentors.exam.utils.DateUtil"%>
<%@ attribute name="country" type="java.lang.String" required="true" %>
<%@ attribute name="lang" type="java.lang.String" required="true" %>
<h3>Today Date is <%=DateUtil.getFormattedDate(country,lang)%></h3>