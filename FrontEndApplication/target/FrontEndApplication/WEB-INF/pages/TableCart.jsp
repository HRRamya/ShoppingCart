
<%@include file="/WEB-INF/pages/navigate.jsp"%>

<body style="background-color:#76D7C4;">
<div class="container">

  <div class="row">
<div class="page-header">
<div>
<h2 style="color:black" font-weight:100%;><strong>CART DETAILS TABLE</strong></h2>
</div>
</div>
</div>
  <table class="table table-bordered style=color:black;">
    <thead>
      <tr>
              <th><h3 style=color:black;><strong>CartId</strong></h3></th>
      
        <th><h3 style=color:black;><strong>USER ID</strong></h3></th> 
          <th><h3 style=color:black;><strong>PRODUCT ID</strong></h3></th> 
        <th><h3 style=color:black;><strong>PRODUCT NAME</strong></h3></th>
        <th><h3 style=color:black;><strong>PRODUCT PRICE</strong></h3></th>
        <th></th>
      </tr>
    </thead>
    <tbody>
    
     <c:forEach var="cart" items="${cList}" varStatus="status">
      <tr>
          <td><h4 style=color:black;>${cart.cartId}</h4></td>
          <td><h4 style=color:black;>${cart.username}</h4></td>
        <td><h4 style=color:black;>${cart.productId}</h4></td>
        <td><h4 style=color:black;>${cart.productname}</h4></td>
          <td><h4 style=color:black;>${cart.productprice}</h4></td>
          <td>
            <p>
            <a href = "toformadduserdetail" class = "btn btn-primary" role = "button">
               CHECK OUT
            </a> 
            
            <a href = "" class = "btn btn-primary" role = "button">
               CANCEL
            </a>
         </p>  
          </td>
      </tr>
      
      </c:forEach>
    </tbody>
  </table>
</div>


<%@include file="/WEB-INF/pages/header.jsp"%>