<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World!</h2>
Today is: <%= new java.util.Date().toString() %>
<c:out value="Hello world! - From JSTL"/>
</body>
</html>
