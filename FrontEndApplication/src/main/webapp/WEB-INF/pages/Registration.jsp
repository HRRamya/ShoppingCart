<%@include file="/WEB-INF/pages/header.jsp"%>
<%@include file="/WEB-INF/pages/navigate.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<body>
 <div class="container">
      <h1>Here You Go....</h1>
     
      
      <form:form modelAttribute="reg"  cssClass="form-horizontal" action="Register"   method="POST">
<!--        <div class="form-group"> -->
<!--     <label class="control-label col-sm-2" for="userId"><h4 style="color:Black;" ><strong>UserID:</strong></h4></label> -->
<!--     <div class="col-md-4"> -->
<%--           <form:input type="text" class="form-control" path="userId"  value="${reg.userId}"/> --%>
          
          
<!--           </div> -->
<!--   </div> -->
   <div class="form-group">
    <label class="control-label col-sm-2" for="username"><h4 style="color:Black;" ><strong>UserName:</strong></h4></label>
    <div class="col-md-4">
          <form:input type="text" class="form-control" path="username"  value="${reg.username}"/>
          
          </div>
  </div>
   <div class="form-group">
    <label class="control-label col-sm-2" for="password"><h4 style="color:Black;" ><strong>Password:</strong></h4></label>
    <div class="col-md-4">
          <form:input class="form-control" path="password"  value="${reg.password}"/>
          
          </div>
</div>
         <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-4">
      <button type="submit" class="btn btn-warning" data-toggle="modal" data-target=".bs-example-modal-lg"><strong style="color:Black;">SUBMIT</strong></button>
        <a href="#" class="btn btn-warning" role="button"><strong style="color:Black;">Back</strong></a>
    </div>
  </div>
   </form:form>
    </div>

 
</body>
</html>