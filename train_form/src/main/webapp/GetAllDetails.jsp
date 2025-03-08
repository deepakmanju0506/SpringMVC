<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <title>Get All Details</title>
    <style>
    body {
        font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
        background-color: #e1f9ff;
        text-align: center;
        margin: 20px;
        padding: 0;
    }

    h2 {
        color: #18d3ff;
    }

    table {
        width: 80%;
        margin: 20px auto;
        border-collapse: collapse;
        background-color: #fff;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
    }

    th, td {
        padding: 12px;
        text-align: left;
        border-bottom: 2px solid #ddd;
    }

    th {
        background-color: #18d3ff;
        color: white;
    }

    tr:hover {
        background-color: #c7f4ff;
    }

    td {
        color: #555;
    }
    </style>
</head>
<body>
    <h2>Journey Details</h2>
    <table border="1">
        <thead>
            <tr>
                <th>S.NO</th>
                <th>Source</th>
                <th>Destination</th>
                <th>No of members</th>
                <th>Edit</th>

            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="item">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.source}</td>
                    <td>${item.destination}</td>
                    <td>${item.noOfMembers}</td>
                    <td>
                        <a href="remove?id=${item.id}"><i class="bi bi-trash3"></i></a> &nbsp;
                        <a href="editData?id=${item.id}"><i class="bi bi-pencil-square"></i></a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>