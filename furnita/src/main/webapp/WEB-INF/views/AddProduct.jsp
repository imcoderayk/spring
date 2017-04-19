<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css" >

<!-- Optional theme -->
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap-theme.min.css" >

<meta name="viewport" content="width=device-width, initial-scale=1">
<style type="text/css">
@import url(https://fonts.googleapis.com/css?family=Roboto:400,300,600,400italic);
@import url(https://fonts.googleapis.com/css?family=Roboto:400,300,600,400italic);
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-font-smoothing: antialiased;
  -moz-font-smoothing: antialiased;
  -o-font-smoothing: antialiased;
  font-smoothing: antialiased;
  text-rendering: optimizeLegibility;
}

body {
  font-family: "Roboto", Helvetica, Arial, sans-serif;
  font-weight: 100;
  font-size: 12px;
  line-height: 30px;
  color: #777;
  background: rgba(0,0,0,0.1);
}
body{
    background-image: url("resources/imgs/bg3.jpg");
    background-size: 1366px 768px;
    background-repeat: no-repeat;
}
.container {
  max-width: 400px;
  width: 100%;
  margin:auto ;
  position: relative;
}

#Product input[type="text"],
#Product input[type="text"],
#Product input[type="tel"],
#Product input[type="url"],
#Product textarea,
#Product button[type="submit"] {
  font: 400 12px/16px "Roboto", Helvetica, Arial, sans-serif;
}

#Product {
  background: #F9F9F9;
  padding: 25px;
  margin: 0px 0px;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}

#Product h3 {
  display: block;
  font-size: 30px;
  font-weight: 300;
  margin-bottom: 10px;
}

#Product h4 {
  margin: 5px 0 15px;
  display: block;
  font-size: 13px;
  font-weight: 400;
}

fieldset {
  border: medium none !important;
  margin: 0 0 10px;
  min-width: 100%;
  padding: 0;
  width: 100%;
}

#Product input[type="text"],
#Product input[type="text"],
#Product input[type="text"],
#Product input[type="text"],
#Product textarea {
  width: 100%;
  border: 1px solid #ccc;
  background: #FFF;
  margin: 0 0 5px;
  padding: 10px;
}

#Product input[type="text"]:hover,
#Product input[type="text"]:hover,
#Product input[type="text"]:hover,
#Product input[type="text"]:hover,
#Product textarea:hover {
  -webkit-transition: border-color 0.3s ease-in-out;
  -moz-transition: border-color 0.3s ease-in-out;
  transition: border-color 0.3s ease-in-out;
  border: 1px solid #aaa;
}

#Product textarea {
  height: 100px;
  max-width: 100%;
  resize: none;
}

#Product button[type="submit"] {
  cursor: pointer;
  width: 100%;
  border: none;
  background: #010101;
  color: #FFF;
  margin: 0 0 5px;
  padding: 10px;
  font-size: 15px;
}

#Product button[type="submit"]:hover {
  background: #464747;
  -webkit-transition: background 0.3s ease-in-out;
  -moz-transition: background 0.3s ease-in-out;
  transition: background-color 0.3s ease-in-out;
}

#Product button[type="submit"]:active {
  box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.5);
}

.copyright {
  text-align: center;
}

#Product input:focus,
#Product textarea:focus {
  outline: 0;
  border: 1px solid #aaa;
}

::-webkit-input-placeholder {
  color: #888;
}

:-moz-placeholder {
  color: #888;
}

::-moz-placeholder {
  color: #888;
}

:-ms-input-placeholder {
  color: #888;
}

</style>

</head>>
<body>

<div class="container">  
  <form id="Product" action="prod" method="post" enctype="multipart/form-data">
    <h3>Product Details</h3>
    <br>
    <fieldset>
      <input placeholder="Product Name" name="prodname" type="text" tabindex="1" required autofocus>
    </fieldset>
    <fieldset>
      <input placeholder="Product Category" name="prodcat" type="text" tabindex="2" required>
    </fieldset>
    <fieldset>
      <input placeholder="Product price &#x20B9;" name="price" type="text" tabindex="3" required>
    </fieldset>
    
    <fieldset>
      <textarea placeholder="Product Description....." tabindex="5" name="desc" required></textarea>
    </fieldset>
    <fieldset>
      <textarea placeholder="Condition....." tabindex="5" name="cond" required></textarea>
    </fieldset>
    <fieldset>
      <input placeholder="Status" name="status" type="text" tabindex="2" required>
    </fieldset>
    <fieldset>
      <input placeholder="Manufacturer" name="manufact" type="text" tabindex="2" required>
    </fieldset>
    <fieldset>
      <input type="file" name="prodimage" accept="image/*">
    </fieldset>
    <fieldset>
      <button name="submit" value="save" type="submit" id="Product-submit" data-submit="...Sending">Submit</button>
    </fieldset>
    
  </form>
</div>
</body>    
  </form>
</div>
</body>
</html>
