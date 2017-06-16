<%@include file="/WEB-INF/pages/header.jsp"%>
<body style="background-color:#76D7C4;">
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
       
        
        <a href="gotolanding" class="btn btn-primary">
          <span class="glyphicon glyphicon-log-out"></span> Sign out
        </a>&nbsp;
         
      </p> 
     </div>
 <div style="margin-top:60px";>
<div class="jumbotron" style="color:black";>
<p> 
  <h4> Your order has been booked.
   Shortly within a week your product will be shipped to you.
   Thank You for shopping hope we meet up again with more deals and offers.
   Thank you!!!</h4>
   </p>
   </div>
  <%@include file="/WEB-INF/pages/footer.jsp"%>