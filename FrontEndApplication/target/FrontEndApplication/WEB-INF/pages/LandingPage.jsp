
<%@include file="/WEB-INF/pages/navigate.jsp"%>

<%-- <body style="background-color:#DFF6F1;">
<div class="container">
    <div class="row">
    <div class="col-lg-4">
                         
    <spring:url value="/resources/im/bag2.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
     </div>
     <div class="column-lg-8">
    <h1 style="color:black" font-weight:100%;><strong>SHOPPING CART</strong></h1>
     </div>
        <!-- navbar-->
        <nav>
        <div style="margin-top:40px";>
        <a href="listig" class="btn btn-primary">
          <span class="glyphicon glyphicon-home"></span> Home
        </a>&nbsp;
        <a href="#" class="btn btn-primary">
          <span class="glyphicon glyphicon-search"></span> Back 
        </a>&nbsp;
        <a href="logins" class="btn btn-primary">
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
        </a>&nbsp;
      </p> 
                   
                </ul>
               
            </div>
       </nav>
<!--- nav ends--> --%>
 <div class="column-lg-8">
    <h4 style="color:black" font-weight:100%;><strong><I>The Easiest Way to buy Product Online....</I></strong></h4>
    <h4 style="color:black" font-weight:100%;><strong><I>Keep 100% Of Your Sales..</I></strong></h4>
     
     </div>

 <div style="margin-top:40px";>
<!-- carousel--> 
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
        <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            
            <spring:url value="/resources/im/s2.jpg" var="img1" /><img height="150vh" max-width="90%" src="${img1}"/>
        </div>

        <div class="item">
           
             <spring:url value="/resources/im/s3.jpg" var="img2" /><img height="150vh" max-width="90%" src="${img2}"/>
            
        </div>

        <div class="item">
           
             <spring:url value="/resources/im/card.jpg" var="img3" /><img height="150vh" max-width="90%" src="${img3}"/>
        </div>

        <div class="item">
            
             <spring:url value="/resources/im/buy.jpg" var="img4" /><img height="150vh" max-width="90%" src="${img4}"/>
        </div>
  </div>

  <!-- Left and right controls -->
 <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<!--grid-->
<div>
<div class = "row" style="margin-top:50px;">
   
  <%--  <div class = "col-sm-4 col-md-4 ">
      <div class = "thumbnail">
       
          <spring:url value="/resources/im/cos.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
         
      </div>
      
      <div class = "caption">
         <h4><strong>COSMETICS</strong></h4>
        
         
         <p>
            <a href = "#" class = "btn btn-primary" role = "button">
            
               BUY NOW
            </a> 
            
            <a href = "#" class = "btn btn-primary" role = "button">
               CANCEL
            </a>
         </p>
         
      </div>
   </div> --%>
   
   <!-- Strt foeach method -->
    <%-- <h1>${msg}</h1>
    <c:forEach var="pro" items="${pList}" varStatus="status">
    
      <tr>
          <td><h4 style=color:black;>${pro.productId}</h4></td>
          <td><h4 style=color:black;>${pro.productName}</h4></td>
        <td><h4 style=color:black;>${pro.price}</h4></td>
        <td><h4 style=color:black;>${pro.category}</h4></td>
          
          <td>
            <p>
            <a href = "#" class = "btn btn-primary" role = "button">
               EDIT
            </a> 
            
            <a href = "#" class = "btn btn-primary" role = "button">
               DELETE
            </a>
         </p>  
          </td>
      </tr>
      </c:forEach>
        </tbody>
  </table> --%>
   
   
   
  <c:forEach var="product" items="${pList}" varStatus="status">
   <div class = "col-sm-4 col-md-4 ">
      <div class = "thumbnail">
       
          <spring:url value="/resources/im/${product.productId}.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
      </div>
      
      <div class = "caption">
         <h4><strong>${product.productName}</strong></h4>

   
         <p>
            <a href ="prodETAIL?Id=${product.productId}"  class = "btn btn-primary" role = "button">
               VIEW DETAILS
            </a> 
           
         </p>
         
      </div>
   </div>
   </c:forEach>
      <!-- Ends foeach method -->
   
  <%--  <div class = "col-sm-4 col-md-4 ">
      <div class = "thumbnail">
        
          <spring:url value="/resources/im/sarees.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
      </div>
      
      <div class = "caption">
         <h4><strong>SAREES</strong></h4>
        
         
         <p>
            <a href = "#" class = "btn btn-primary" role = "button">
               BUY NOW
            </a> 
            
            <a href = "#" class = "btn btn-primary" role =" button">
               CANCEL
            </a>
         </p>
         
      </div>
   </div>
    
    
    <div>
   <div class = "col-sm-4 col-md-4 ">
      <div class = "thumbnail">
        
          <spring:url value="/resources/im/watch.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
      </div>
      
      <div class = "caption">
         <h4><strong>WATCHES</strong></h4>
         
         <p>
            <a href = "#" class = "btn btn-primary" role = "button">
               BUY NOW
            </a> 
            
            <a href = "#" class = "btn btn-primary" role =" button">
               CANCEL
            </a>
         </p>
         
      </div>
   </div>
       <div class = "col-sm-4 col-md-4 ">
      <div class = "thumbnail">
        
          <spring:url value="/resources/im/laptop.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
      </div>
      
      <div class = "caption">
         <h4><strong>LAPTOPS</strong></h4>
        
         
         <p>
            <a href = "#" class = "btn btn-primary" role="button">
               BUY NOW
            </a> 
            
            <a href = "#" class = "btn btn-primary" role ="button">
               CANCEL
            </a>
         </p>
         
      </div>
   </div>
   
   <div class = "col-sm-4 col-md-4 ">
      <div class = "thumbnail">
        
          <spring:url value="/resources/im/vanity.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
      </div>
   <div class = "caption">
         <h4><strong>WANITY</strong></h4>
        
         
         <p>
            <a href = "#" class = "btn btn-primary" role="button">
               BUY NOW
            </a> 
            
            <a href = "#" class = "btn btn-primary" role ="button">
               CANCEL
            </a>
         </p>
         
      </div>
   </div> --%>
   </div>
</div>
     
    </div>
 <!--ends-->
    </div>
   </div>
<%@include file="/WEB-INF/pages/footer.jsp"%>
