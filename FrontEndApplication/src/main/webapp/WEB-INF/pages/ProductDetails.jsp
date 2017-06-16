<%@include file="/WEB-INF/pages/navigate.jsp"%>
<body style="background-color:#76D7C4;">
<div class="container">
<%-- <div class="row">
    <div class="col-lg-4">
                         
    <spring:url value="/resources/im/bag2.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
     </div>
     <div class="column-lg-8">
     <h1 style="color:black" font-weight:100%;><strong>SHOPPING CART</strong></h1>
     </div>
        <!-- navbar-->
       
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
                   
                </ul>
               
            </div> --%>
<div class="row">
<div class="page-header">
<div>
<h2 style="color:black" font-weight:100%;><strong>PRODUCT DETAILS</strong></h2>
</div>
</div>

</div>
   
<div class = "col-sm-4 col-md-4 ">
      <div class = "thumbnail">
        
        <spring:url value="/resources/im/${product.productId}.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
      </div>
</div>
   <div class="row"> 
          <div class="col-sm-7 col-md-7">
              <p><strong><h4 style="color:black">ID:${product.productId}</h4></strong></p> 
           <p><strong><h4 style="color:black">Name:${product.productName}</h4></strong></p> 
            <p><strong><h4 style="color:black">Price:${product.price}</h4></strong></p>
              <p>
            <a href = "addCart?Id=${product.productId}&usr=${pageContext.request.userPrincipal.name}" class = "btn btn-primary" role = "button">
               ADD TO CART
            </a> 
             <a href = "backtoHome" class = "btn btn-primary" role = "button">
               BACK
            </a> 
           
         </p>   

          </div>
    </div>
    <div>
              
        
    </div>

    </div>
   <%@include file="/WEB-INF/pages/header.jsp"%>
   
    