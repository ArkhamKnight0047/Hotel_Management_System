<%@page import="java.sql.*"%>
<%@page import="java.util.Date"%>
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
            <h1 class="contact-heading">Select Your Room Type</h1>
            <form  action="authorize_payment" method="POST">
              <div class="input-group">
				<select name="roomType" class="field">
				  <option value=0 selected></option>
				  <option value=1>Single</option>
				  <option value=2>Double</option>
				  <option value=3>Triple</option>
				  <option value=4>Quad</option>
				  <option value=5>Queen</option>
				</select>
            <label class="input-label">Room Type</label>
              </div>
              <input type="submit" class="submit-btn" value="Submit" />
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

