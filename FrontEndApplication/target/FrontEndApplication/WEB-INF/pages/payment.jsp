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
        
        
        <a href="#" class="btn btn-primary">
          <span class="glyphicon glyphicon-log-out"></span> Sign out
        </a>&nbsp;
         <a href="totablecart" class="btn btn-primary">
          <span class="glyphicon glyphicon-shopping-cart"></span> Cart
        </a>
      </p> 
     </div>
     <div style="margin-top:40px";>
    <div>
        
     <input type="radio" name="gender" value="cashondelivery" checked><strong style="color:Black;">CASH ON DELIVERY</strong> <br>
  <input type="radio" name="gender" value="bycredit">  <strong style="color:Black;">BY CREDIT</strong><br>
  <input type="radio" name="gender" value="bydebit"> <strong style="color:Black;">BY DEBIT</strong>
    </div>
        <div style="margin-top:20px";>
 <a href="tothankyou" class="btn btn-warning" role="button"><strong style="color:Black;">Submit</strong></a>
  <a href="tousde" class="btn btn-warning" role="button"><strong style="color:Black;">Back</strong></a>
       </div>
        </div>
    
    </div>
    
   <%@include file="/WEB-INF/pages/footer.jsp"%>
                   
                    