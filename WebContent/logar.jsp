<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" ></script>


</head>
<body>


 <div class="container">
  <div class="jumbotron">
    <h2>Fomulario de Login</h2>
  </div>

 <form method="post" class="form-horizontal" 
 action="ControllerUsuarioLogin">
   
 <div class="form-group">
   <label for="email">Email</label>
    <input type="email" name="email" id="email" size="50" 
    required="required" class="form-control" /> 
 </div> 
 <div class="form-group">
   <label for="senha">Senha</label>
    <input type="password" name="senha" id="senha" size="50" 
    required="required" class="form-control" /> 
 </div> 
 <div class="form-group">
   <button type="submit"  class="btn btn-danger">
  Logar
   </button> 
 </div> 
  </form>
  <div class="bg-primary text-white">
  ${msg}
  </div>
<br/>
<a href="sistema.jsp">cadastro</a>
</div>
</body>
</html>
 