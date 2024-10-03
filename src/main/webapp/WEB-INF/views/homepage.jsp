<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Homepage</title>
    </head>
    <body>
        <h1>Endpoints</h1> <br>
        <div>
            <a href="/Students">AllStudents</a><br>
            <a href="/Courses">AllCourses</a><br>
            <a href="/Registered">AllAssociations</a><br>

            <a href="/Registered/courses/student/1">Registered/AllCourses/student/Id</a><br>
            <a href="/Registered/AllStudents/Fname/Ritu/courses">Registered/AllStudents/Fname/name/courses</a><br>
            <a href="/Registered/AllStudents/Lname/Baier/courses">Registered/AllStudents/Fname/name/courses</a><br>
            <a href="/Registered/AllStudents/Nashua/courses">Registered/AllStudents/Town/courses</a><br>

            <a href="/Registered/Course/id/8/AllStudents">Registered/Course/id/id/AllStudents</a><br>
            <a href="/Registered/Course/name/Java/AllStudents">Registered/Course/name/name/AllStudents</a><br>
            <a href="/Courses/Java/name">Courses/word/name</a><br>
            <a href="/Courses/Java/description">Courses/word/description</a>

        </div>
    </body>
</html>