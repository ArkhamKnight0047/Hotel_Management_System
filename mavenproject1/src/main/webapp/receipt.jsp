<%-- 
    Document   : error
    Created on : Dec 29, 2021, 4:35:28 AM
    Author     : ArkhamKnight_47
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>XYZ hotel</title>
    <link rel="stylesheet" href="style.css" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css"
    />
    <link
      href="https://fonts.googleapis.com/css2?family=Baloo+Da+2:wght@400;500;600;700;800&family=Josefin+Slab:ital,wght@0,400;0,600;1,300;1,400;1,600&family=Muli:ital,wght@0,300;0,400;0,500;1,300;1,400;1,500&display=swap"
      rel="stylesheet"
    />
  </head>
  <body>
    <div class="spinner-container">
      <div class="circles">
        <div></div>
        <div></div>
        <div></div>
        <div></div>
        <div></div>
        <div></div>
        <div></div>
        <div></div>
      </div>
    </div>
    <div class="container">
      <div class="hamburger-menu">
        <div class="line line-1"></div>
        <div class="line line-2"></div>
        <div class="line line-3"></div>
        <span>Close</span>
      </div>
      <section class="contact">
        <div class="contact-wrapper">
          <div class="contact-left"></div>
          <div class="contact-right">
            <h1 class="contact-heading">Payment Done. Thank you</h1>
            <table style="font-size: 30px";>
                 <tr>
                     <td><b>Merchant:</b></td>
                     <td>XYZ Hotel Ltd.</td>
                 </tr>
                 <tr>
                     <td><b>Payer:</b></td>
                     <td>${payer.firstName} ${payer.lastName}</td>      
                 </tr>
                 <tr>
                     <td><b>Description:</b></td>
                     <td>${transaction.description}</td>
                 </tr>
                 <tr>
                     <td><b>Subtotal:</b></td>
                     <td>${transaction.amount.details.subtotal} USD</td>
                 </tr>
                 <tr>
                     <td><b>Shipping:</b></td>
                     <td>${transaction.amount.details.shipping} USD</td>
                 </tr>
                 <tr>
                     <td><b>Tax:</b></td>
                     <td>${transaction.amount.details.tax} USD</td>
                 </tr>
                 <tr>
                     <td><b>Total:</b></td>
                     <td>${transaction.amount.total} USD</td>
                 </tr>                    
             </table>
            <form action="index.html">
                <input type="submit" class="submit-btn" value="Home" />
            </form>
          </div>
        </div>
      </section>
      <section class="sidebar">
        <ul class="menu">
          <li class="menu-item">
            <a href="index.html#home" class="menu-link" data-content="Home">Home</a>
          </li>
          <li class="menu-item">
            <a href="index.html#aboutus" class="menu-link" data-content="About Us">About Us</a>
          </li>
          <li class="menu-item">
            <a href="index.html#teams" class="menu-link" data-content="Team">Team</a>
          </li>
          <li class="menu-item">
            <a href="index.html#feedback" class="menu-link" data-content="Feedback">Feedback</a>
          </li>
          <li class="menu-item">
            <a href="adminLog.jsp" class="menu-link" data-content="Admin">Admin</a>
          </li>
        </ul>
        <div class="social-media">
          <a href="#"><i class="fab fa-github"></i></a>
          <a href="#"><i class="fab fa-cc-paypal"></i></a>
          <a href="#"><i class="fab fa-cc-visa"></i></a>
        </div>
      </section>

    <script src="script.js"></script>
    <script
      src="https://code.jquery.com/jquery-3.5.1.js"
      integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
      crossorigin="anonymous"
    ></script>
    <script src="tilt.js"></script>
  </body>
</html>
