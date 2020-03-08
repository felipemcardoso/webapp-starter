<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
JSP
<c:forEach var="view" items="${views}">
    <c:set var="content">
        <jsp:include page="${view}" />
    </c:set>

    <c:out value="${content}"/>
</c:forEach>
