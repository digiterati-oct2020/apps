<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
<head>
    <title>Spring submit</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
    <form:form action="/services/submit" method="post" modelAttribute="orderInfo">
    
    	<label>Username:</label><form:input path="username"/>
    	<label>Password:</label><form:input path="password"/>
    
    	<input type="submit" value="Submit"/>
    </form:form>
</body>
</html>