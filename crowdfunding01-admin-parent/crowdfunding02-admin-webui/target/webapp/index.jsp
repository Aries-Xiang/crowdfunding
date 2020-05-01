<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <script type="text/javascript" src="jquery/jquery-2.1.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn1").click(function () {
                $.ajax({
                    "url": "send/array.html",
                    "type": "post",
                    "data": {
                        "array": [5, 8, 12]
                    },
                    "dataType": "text",
                    "success": function (response) {
                        alert(response);
                    },
                    "error": function (response) {
                        alert(response);
                    }
                });
            });
        });
    </script>
</head>
<body>
<a href="test/ssm.html">测试ssm环境</a>
<br/>
<button id="btn1">send [5, 8, 12] One</button>

</body>
</html>
