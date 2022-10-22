<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<h2><spring:message code="codegroup.header.modify" /></h2>

<form:form modelAttribute="codeGroup" action="modify">
    <table>
        <tr>
            <td><spring:message code="codegroup.groupCode" /></td>
            <td><form:input path="groupCode" readonly="true"/></td>
            <td></td>
        </tr>
        <tr>
            <td><spring:message code="codegroup.groupName" /></td>
            <td><form:input path="groupName" /></td>
            <td></td>
        </tr>
    </table>
</form:form>

<div>
    <button type="submit" id="btnModify"><spring:message code="action.modify" /></button>
    <button type="submit" id="btnList"><spring:message code="action.list" /></button>
</div>

<script src="/js/jQuery-2.1.4.min.js"></script>
<script>
    $(document).ready(function() {

        var formObj = $("#codeGroup");

        $("#btnModify").on("click", function() {
            formObj.submit();
        });

        $("#btnList").on("click", function() {
            self.location = "list";
        });

    });
</script>
