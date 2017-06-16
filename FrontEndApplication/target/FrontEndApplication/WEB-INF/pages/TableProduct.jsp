

<%@include file="/WEB-INF/pages/navigate.jsp"%>
<%-- <body style="background-color:#76D7C4;">
<div class="container">
<div class="row">
    <div class="col-lg-4">
                         
    <spring:url value="/resources/im/bag2.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
     </div>
     <div class="column-lg-8">
     <h1 style="color:black" font-weight:100%;><strong>SHOPPING CART</strong></h1>
     </div>
     <a href="addtocart" class="btn btn-primary">
          <span class="glyphicon glyphicon-home"></span> Home
        </a>&nbsp;
        <a href="#" class="btn btn-primary">
          <span class="glyphicon glyphicon-search"></span> Search 
        </a>&nbsp;
        <a href="#" class="btn btn-primary">
          <span class="glyphicon glyphicon-log-in"></span> Sign in
        </a>&nbsp;
        <a href="#" class="btn btn-primary">
          <span class="glyphicon glyphicon-log-out"></span> Sign up
        </a>&nbsp;
        <a href="#" class="btn btn-primary">
          <span class="glyphicon glyphicon-log-out"></span> Sign out
        </a>&nbsp;
         <a href="totablecart" class="btn btn-primary">
          <span class="glyphicon glyphicon-shopping-cart"></span> Cart
        </a>
      </p> 
     </div> --%>
  <div class="row">
<div class="page-header">
<div>
<h2 style="color:black" font-weight:100%;><strong>PRODUCT DETAILS TABLE</strong></h2>
</div>
</div>
</div>
  <table class="table table-bordered">
    <thead>
      <tr>
        <th><h3 style=color:black;><strong>USER ID</strong></h3></th> 
          <th><h3 style=color:black;><strong>DISCREPTION</strong></h3></th> 
        <th><h3 style=color:black;><strong>PRODUCT PRICE</strong></h3></th>
        <th><h3 style=color:black;><strong>PRODUCT NAME</strong></h3></th>
        <th></th>
      </tr>
    </thead>
    <tbody>
    
    <c:forEach var="pro" items="${pList}" varStatus="status">
    
      <tr>
          <td><h4 style=color:black;>${pro.productId}</h4></td>
          <td><h4 style=color:black;>${pro.productName}</h4></td>
        <td><h4 style=color:black;>${pro.price}</h4></td>
        <td><h4 style=color:black;>${pro.category}</h4></td>
          
          <td>
            <p>
            
            
            <a href = "edit.do?Id=${pro.productId}" class = "btn btn-primary" role = "button">
               EDIT
            </a> 
            
            <a href = "del.do?Id=${pro.productId}" class = "btn btn-primary" role = "button">
               DELETE
            </a>
         </p>  
          </td>
      </tr>
      </c:forEach>
        </tbody>
  </table>
</div>
<%@include file="/WEB-INF/pages/header.jsp"%>
