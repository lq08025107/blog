<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello BootStrap!</title>
<link href="<%=request.getContextPath()%>/WEB-INF/dist/css/bootstrap.min.css" rel="stylesheet">  
  
<script src="<%=request.getContextPath()%>/WEB-INF/js/jquery-3.1.0.min.js"></script>  
  
<script src="<%=request.getContextPath()%>/WEB-INF/dist/js/bootstrap.min.js"></script>  
</head>
<body>
	${allBlog}


</body>
</html>