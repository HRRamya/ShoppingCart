<%@include file="/WEB-INF/pages/navigate.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<body style="background-color:#76D7C4;">
<div class="container">
 <div class="row">
<div class="page-header">

<div>
<h2 style="color:black;" font-weight:100%;><strong>USERS FORM</strong></h2>
</div>
</div>
</div>

<form:form modelAttribute="usr"  cssClass="form-horizontal" action="saveUser" method="POST">
  <div class="form-group">
    <label class="control-label col-sm-2" for="userId"><h4 style="color:Black;" ><strong>USER ID:</strong></h4></label>
    <div class="col-sm-4">
      <form:input class="form-control" path="userId"  value="${usr.userId}"/>
    </div>
  </div>
    <div class="form-group">
    <label class="control-label col-sm-2" for="password"><h4 style="color:Black;" ><strong>PASSWORD:</strong></h4></label>
    <div class="col-sm-4">
      <form:input class="form-control" path="password" value="${usr.password }"/>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="role"><h4 style="color:black;"><strong>ROLE:</strong></h4></label>
    <div class="col-sm-4"> 
      <form:input class="form-control" path="role"  value="${usr.role}" />
    </div>
  </div>
  
   <div class="form-group">
    <label class="control-label col-sm-2" for="username"><h4 style="color:black;"><strong>USERNAME:</strong></h4></label>
    <div class="col-sm-4"> 
      <form:input class="form-control" path="username"  value="${usr.username }"/>
    </div>
  </div> 
    <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-4">
      <button type="submit" class="btn btn-warning" data-toggle="modal" data-target=".bs-example-modal-lg"><strong style="color:Black;">SUBMIT</strong></button>
        <a href="toustable" class="btn btn-warning" role="button"><strong style="color:Black;">Back</strong></a>
    </div>
  </div>
    
    
  
    
</form:form>

<!-- <select>
  <option value="volvo">USERS ROLE</option>
  <option value="saab">USER</option>
  <option value="opel">ADMIN</option>
  <option value="audi">SUPPLIER</option>
</select> -->


