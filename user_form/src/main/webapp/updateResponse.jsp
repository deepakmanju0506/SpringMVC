<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored = "false" %>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
       pageEncoding="US-ASCII"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css">
    <title>update_Response</title>

    <style>
        body {
            font-family: system-ui, -apple-system;
            background-image: url('https://img.freepik.com/free-vector/gradient-green-tones-background_23-2148373960.jpg?ga=GA1.1.2005254594.1733147991&semt=ais_hybrid');
            background-size: cover;
            display: flex;
            justify-content: center;
            align-items: center;
           height: 100vh;

        }

        .response-container {
            background-color: #e9fff8;
            text-align: center;
            border-radius: 5%;
            padding: 10%;
        }

        h2 {
            color: black;

        }
        h3{
            color: #26896a;
            transition-duration: 6s;
        }
        .success-icon {
            margin: 10px 0;
            width: 50px; /* Set the desired width */
            height: 50px; /* Set the desired height */
        }

    </style>
</head>

<body>
    <div class="response-container">
        <h2>THANK YOU ${name}</h2>
        <H3><i class="bi bi-check2-circle"></i> UPDATED SUCCESSFUL<i class="bi bi-check2-circle"></i></H3>
        <img class="success-icon" src="https://cdn-icons-png.freepik.com/256/9470/9470717.png?ga=GA1.1.2005254594.1733147991&semt=sph" alt="Success Icon">

    </div>
</body>

</html>