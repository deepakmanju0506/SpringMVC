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
    <title>USER_DETAILS</title>


    <style>
        body {
            font-family: system-ui, -apple-system;
            background-image: url('https://img.freepik.com/free-vector/realistic-green-leaves-background_52683-89781.jpg?t=st=1740402744~exp=1740406344~hmac=6447d884ccbbcadd29baeff88621b0704e0570d87729ce17a8328545eb880d78&w=1800');
            background-size: cover;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        h2{
            color : white;
        }

        input[type="text"],
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            background-color: #82e0aa;
            color: white;
            border: none;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #1d8348 ;
            color: #eafaf1 ;
            padding: 10PX;
        }
    </style>
</head>

<body>

    <form action="userPage" method="post">

            <h2>ENTER YOUR DETAILS</h2>
            <input type="text" name="firstName" placeholder="ENTER YOUR FIRST NAME">
            <input type="text" name="lastName" placeholder="ENTER YOUR LAST NAME">
            <input type="text" name="email" placeholder="ENTER YOUR EMAIL ID">
            <input type="text" name="contactNo" placeholder="ENTER YOUR CONTACT NUMBER">
            <input type="submit" value="CONFIRM">
            <h2><a href= "getAll">View All Users</a></h2>
    </form>
</body>

</html>