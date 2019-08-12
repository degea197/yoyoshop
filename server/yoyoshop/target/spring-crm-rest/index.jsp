<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
    <body>

        <h3>YoyoShop</h3>

        <hr>
        <br>
        <a href="api/users">get all user</a>
         <hr>
         <br>
        <a href="api/sanpham">get all product</a>
        <hr>
         <br>
        <a href="api/thuonghieu">get all thuong hieu</a>
        <hr>
         <br>
        <a href="files/image">download image</a>
        
        <hr>
         <br>
		      <img src="<c:url value="/resources/images/download.jpg" />"/>

    </body>
</html>