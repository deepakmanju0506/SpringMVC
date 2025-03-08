<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored = "false" %>
<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
    <property name="prefix" value="/WEB-INF/views/" />
    <property name="suffix" value=".jsp" />
</bean>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>USER_UPDATE</title>


    <style>
        body {
            font-family: system-ui, -apple-system;
            background-image: url('https://img.freepik.com/free-vector/realistic-green-leaves-background_52683-89781.jpg?t=st=1740402744~exp=1740406344~hmac=6447d884ccbbcadd29baeff88621b0704e0570d87729ce17a8328545eb880d78&w=1800');
            background-size: cover;
            background-position: center;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        form {
            padding: 20px;
            border-radius: 10px;
            width: 300px;
            text-align: center;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.3);
        }

        h2 {
            color: white;
            margin-bottom: 20px;
        }

        input[type="text"],
        input[type="submit"] {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: none;
            border-radius: 5px;
            font-size: 16px;
        }

        input[type="text"] {
            background: rgba(255, 255, 255, 0.8);
            color: #333;
            border: 1px solid #ccc;
        }

        input[type="text"]::placeholder {
            color: #555;
        }

        input[type="submit"] {
            background-color: #82e0aa;
            color: white;
            font-weight: bold;
            cursor: pointer;
            transition: all 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #1d8348;
            color: #eafaf1;
            transform: scale(1.05);
        }

    </style>
</head>

<body>
        <form action="updateData" method="post">
            <h2>UPDATE YOUR DETAILS</h2>

             <input type="hidden" value="${item.id}" name="id"/>
            <input type="text" name="firstName" placeholder="ENTER YOUR FIRST NAME" value="${item.firstName}">
            <input type="text" name="lastName" placeholder="ENTER YOUR LAST NAME" value="${item.lastName}">
            <input type="text" name="email" placeholder="ENTER YOUR EMAIL ID" value="${item.email}">
            <input type="text" name="contactNo" placeholder="ENTER YOUR CONTACT NUMBER" value="${item.contactNo}">
            <input type="submit" value="UPDATE">
        </form>
</body>

</html>