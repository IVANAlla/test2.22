<
<head>
    <title>List of Cars</title>
</head>
<body>
<header>
    <h2>ALL CARS</h2>
</header>

<div>
    <th:block th:each="msg : ${cars}">
        <h1 th:text="${msg}"></h1>
    </th:block>
</div>

</body>
</html>
</html>


