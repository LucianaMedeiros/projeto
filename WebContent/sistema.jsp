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
    <h2>Fomulario de Cadastro Usuario</h2>
  </div>

 <form method="post" class="form-horizontal" 
 action="ControllerUsuarioCadastro">
  <div class="form-group">
   <label  for="id">idUsuario</label>
    <input type="number" name="id" id="id" size="50" 
      required="required"   class="form-control"   /> 
 </div> 
 <div class="form-group">
   <label  for="nome">Nome</label>
    <input type="text" name="nome" id="nome" size="50" 
    pattern="[a-z A-Z]{2,50}" required="required"
    class="form-control"   /> 
 </div> 
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
    Enviar os Dados
   </button> 
 </div> 
  </form>
 <div class="alert alert-success">
 Saída: ${msg} 
  </div>
<br/>
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
 <ul class="navbar-nav">
 
  <li class="nav-item">
    <a class="nav-link" href="sistema.jsp">Cadastrar</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="logar.jsp">Logar</a>
  </li>
  
</ul>
</nav>
<br/>
  
</div>



</body>
</html>