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
    <title>Train_Booking</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <style>
        body {
            font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
            background-image: url('https://img.freepik.com/free-photo/speed-train-transport-background_1409-5471.jpg?ga=GA1.1.2005254594.1733147991&semt=ais_hybrid');
            background-size: cover;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        header {
            background-color: transparent;
            color: white;
            padding: 15px;
            text-align: center;
            height: 100vh;
            box-shadow: 0px 5px 10px rgba(0, 0, 0, 0.6);
        }
        h1{
            color: #5fb6ff;

        }
        nav ul {
            list-style-type: none;
            padding: 0;
        }

        nav ul li {
            display: inline;
            margin: 0 10px;
        }

        nav ul li a {
            color: white;
            text-decoration: none;
        }

        h2 {
            text-align: center;
            margin-bottom: 30px;
            color: #fff;
        }

        form {
            max-width: 600px;
            margin: auto;
            padding: 20px;
            border: 1px solid transparent;
            border-radius: 10px;
            background-color: transparent;
            box-shadow: 0px 5px 9px rgba(0, 0, 0, 0.4);
        }

        .form-group {
            position: relative;
        }

        .form-group i {
            position: absolute;
            right: 10px;
            top: 10px;
        }

        ::placeholder {
            color: #effbb8;
            font-size: 10px;
            opacity: 1;
        }

        :-ms-input-placeholder {
            color: #effbb8;
            font-size: 10px;
            opacity: 1;
        }

        ::-ms-input-placeholder {
            color: #effbb8;
            font-size: 10px;
            font-style: italic;
            opacity: 1;
        }

        input[type="submit"] {
            background-color: #f2fdbd;
            color: #000;
            border: none;
            padding: 12px;
            width: 100%;
            border-radius: 7px;
            font-size: 18px;
            cursor: pointer;
            transition: background 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #edff91;
        }
    </style>
</head>

<body>
    <header>
        <h1>Welcome to Online Ticket Booking</h1>
        <nav>
             <h2><a href= "getDetails">View Journey History</a></h2>
        </nav>
    </header>

    <div class="container">
        <form action="bookTicket" method="post">
            <h2>ENTER THE DETAILS</h2>
            <div class="form-group">
                <input type="text" name="source" class="form-control" placeholder="SELECT YOUR SOURCE" required>
                <i class="fas fa-map-marker-alt"></i>
            </div>
            <div class="form-group">
                <input type="text" name="destination" class="form-control" placeholder="SELECT YOUR DESTINATION"
                    required>
                <i class="fas fa-map-marked-alt"></i>
            </div>
            <div class="form-group">
                <input type="number" name="noOfMembers" class="form-control" placeholder="NUMBER OF MEMBERS" required>
                <i class="fas fa-users"></i>
            </div>
            <input type="submit" value="BOOK">
        </form>
    </div>
</body>

</html>
