
<!doctype html>
<%@page import="com.pojo.Project"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.ReadDaoImp"  isELIgnored="false"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
     <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Marvel HTML Bootstrap 4 Template</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/unicons.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">

    <!-- MAIN STYLE -->
    <link rel="stylesheet" href="css/tooplate-style.css">
    
<!--

Tooplate 2115 Marvel

https://www.tooplate.com/view/2115-marvel

-->
  </head>
  <body>

    <!-- MENU -->
    <nav class="navbar navbar-expand-sm navbar-light">
        <div class="container">
            <a class="navbar-brand" href="index.html"><i class='uil uil-user'></i> Marvel</a>

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
                <span class="navbar-toggler-icon"></span>
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav mx-auto">
                    <li class="nav-item">
                        <a href="#about" class="nav-link"><span data-hover="About">About</span></a>
                    </li>
                    <li class="nav-item">
                        <a href="#project" class="nav-link"><span data-hover="Projects">Projects</span></a>
                    </li>
                    <li class="nav-item">
                        <a href="#resume" class="nav-link"><span data-hover="Resume">Resume</span></a>
                    </li>
                    <li class="nav-item">
                        <a href="#contact" class="nav-link"><span data-hover="Contact">Contact</span></a>
                    </li>
                </ul>

                <ul class="navbar-nav ml-lg-auto">
                    <div class="ml-lg-4">
                      <div class="color-mode d-lg-flex justify-content-center align-items-center">
                        <i class="color-mode-icon"></i>
                        Color mode
                      </div>
                    </div>
                </ul>
            </div>
        </div>
    </nav>
<%
	String value=(String)session.getAttribute("msg");
if(value!=null)
{
%>
<h2 style="color:blue;text-align:center;"><%
	out.print(value);
%></h2>
<%
	}
session.removeAttribute("msg");
%>
    <!-- ABOUT -->
    <section class="about full-screen d-lg-flex justify-content-center align-items-center" id="about">
        <div class="container">
            <div class="row">
                
                <div class="col-lg-7 col-md-12 col-12 d-flex align-items-center">
                    <div class="about-text">
                        <small class="small-text">Welcome to <span class="mobile-block">my portfolio website!</span></small>
                        <h1 class="animated animated-text">
                            <span class="mr-2">Hey folks, I'm</span>
                                <div class="animated-info">
                                    <span class="animated-item">Marvel Sann</span>
                                    <span class="animated-item">Web Designer</span>
                                    <span class="animated-item">UI Specialist</span>
                                </div>
                        </h1>

                        <p>Building a successful product is a challenge. I am highly energetic in user experience design, interfaces and web development.</p>
                        
                        <div class="custom-btn-group mt-4">
                         
                          
                          <form action="DownloadResume" method="post">
                          <button  class="btn custom-btn custom-btn-bg custom-btn-link">Download</button>
                          </form><br>
                          
<!--                           <a href="#" class="btn mr-lg-2 custom-btn"><i class='uil uil-file-alt'></i> Download Resume</a>
 -->                          <a href="#contact" class="btn custom-btn custom-btn-bg custom-btn-link">Get a free quote</a>
                        </div>
                         
                    </div>
                </div>

                <div class="col-lg-5 col-md-12 col-12">
                    <div class="about-image svg">
                        <img src="images/undraw/undraw_software_engineer_lvl5.svg" class="img-fluid" alt="svg image">
                    </div>
                </div>

            </div>
        </div>
    </section>

    <!-- PROJECTS -->
    <section class="project py-5" id="project">
        <div class="container">
                
                <div class="row">
                  <div class="col-lg-11 text-center mx-auto col-12">

                      <div class="col-lg-8 mx-auto">
                        <h2>Things I have designed for digital media agencies</h2>
                      </div>

                      <div class="owl-carousel owl-theme">
                      <%
                      	ReadDaoImp r=new ReadDaoImp();
                        ArrayList<Project> al=r.getProjectDetails();
                         for(Project p:al)
                        {
                      %>
                        <div class="item">
                          <div class="project-info">
                            <img src="images/myproject/<%=p.getFilename() %>" class="img-fluid" alt="project image">
                          </div>
                        </div>
<%} %>
                      <div class="item">
                          <div class="project-info">
                            <img src="images/project/project-image02.png" class="img-fluid" alt="project image">
                          </div>
                        </div>

                        <div class="item">
                          <div class="project-info">
                            <img src="images/project/project-image03.png" class="img-fluid" alt="project image">
                          </div>
                        </div>

                        <div class="item">
                          <div class="project-info">
                            <img src="images/project/project-image04.png" class="img-fluid" alt="project image">
                          </div>
                        </div>

                        <div class="item">
                          <div class="project-info">
                            <img src="images/project/project-image05.png" class="img-fluid" alt="project image">
                          </div>
                        </div>-->
                      </div>

                  </div>
                </div>
        </div>
    </section>

    <!-- FEATURES -->
    <section class="resume py-5 d-lg-flex justify-content-center align-items-center" id="resume">
        <div class="container">
            <div class="row">

                <div class="col-lg-6 col-12">
                  <h2 class="mb-4">Experiences</h2>

<sql:setDataSource
  var="con"
  driver="com.mysql.cj.jdbc.Driver"
  url="jdbc:mysql://localhost:3306/myportfolio"
  user="root"
  password=""
  />
    
    <sql:query dataSource="${con}" var="rs">Select * from exp</sql:query>
    <c:forEach var="data" items="${rs.rows}">
    
                        <div class="timeline-wrapper">
                             <div class="timeline-yr">
                                  <span>${data.year}</span>
                             </div>
                             <div class="timeline-info">
                                  <h3><span>${data.title}</span><small>${data.subtitle}</small></h3>
                                  <p>${data.description}</p>
                             </div>
                        </div>
</c:forEach>

                      <div class="timeline-wrapper">
                            <div class="timeline-yr">
                                <span>2018</span>
                            </div>
                            <div class="timeline-info">
                                <h3><span>UX Designer</span><small>Digital Ace</small></h3>
                                <p>Fusce rutrum augue id orci rhoncus molestie. Nunc auctor dignissim lacus vel iaculis.</p>
                            </div>
                        </div>

                        <div class="timeline-wrapper">
                            <div class="timeline-yr">
                                <span>2016</span>
                            </div>
                            <div class="timeline-info">
                                <h3><span>UI Freelancer</h3>
                                <p>Sed fringilla vitae enim sit amet cursus. Sed cursus dictum tortor quis pharetra. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>
                            </div>
                        </div>
                        
                        <div class="timeline-wrapper">
                            <div class="timeline-yr">
                                <span>2014</span>
                            </div>
                            <div class="timeline-info">
                                <h3><span>Junior Designer<small>Crafted Co.</small></h3>
                                <p>Cras scelerisque scelerisque condimentum. Nullam at volutpat mi. Nunc auctor ipsum eget magna consequat viverra.</p>
                            </div>
                        </div>

                    </div>-->
                </div>

                <div class="col-lg-6 col-12">
                  <h2 class="mb-4 mobile-mt-2">Educations</h2>

                    <div class="timeline">
                    
                    
  <sql:setDataSource
  var="con"
  driver="com.mysql.cj.jdbc.Driver"
  url="jdbc:mysql://localhost:3306/myportfolio"
  user="root"
  password=""
  />
    
    <sql:query dataSource="${con}" var="rs">Select * from edu</sql:query>
    <c:forEach var="data" items="${rs.rows}">
    
                        <div class="timeline-wrapper">
                             <div class="timeline-yr">
                                  <span>${data.year}</span>
                             </div>
                             <div class="timeline-info">
                                  <h3><span>${data.title}</span><small>${data.subtitle}</small></h3>
                                  <p>${data.description}</p>
                             </div>
                        </div>
</c:forEach>
                      <div class="timeline-wrapper">
                            <div class="timeline-yr">
                                <span>2015</span>
                            </div>
                            <div class="timeline-info">
                                <h3><span>User Interfaces</span><small>Creative Agency</small></h3>
                                <p><a rel="nofollow" href="https://www.facebook.com/tooplate">Tooplate</a> is a great website to download HTML templates without any login or email.</p>
                            </div>
                        </div>
                        
                        <div class="timeline-wrapper">
                            <div class="timeline-yr">
                                <span>2013</span>
                            </div>
                            <div class="timeline-info">
                                <h3><span>Artwork Design</span><small>New Art School</small></h3>
                                <p>You can freely use Tooplate's templates for your business or personal sites. You cannot redistribute this template without a permission.</p>
                            </div>
                        </div>

                    </div>
                </div>
                -->
            </div>
        </div>
    </section>

    <!-- CONTACT -->
    <section class="contact py-5" id="contact">
      <div class="container">
        <div class="row">
          
          <div class="col-lg-5 mr-lg-5 col-12">
            <div class="google-map w-100">
              <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3786.5834834179755!2d73.75368901489045!3d18.36627698749904!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bc293e6861118d9%3A0xcbb4d589c7d4e90b!2sSinhagad%20Fort!5e0!3m2!1sen!2sin!4v1673412328991!5m2!1sen!2sin"  width="400" height="300" frameborder="0" style="border:0" allowfullscreen=""></iframe>
            </div>
            <div class="contact-info d-flex justify-content-between align-items-center py-4 px-lg-5">
                <div class="contact-info-item">
                  <h3 class="mb-3 text-white">Say hello</h3>
                  <p class="footer-text mb-0">010 020 0960</p>
                  <p><a href="mailto:hello@company.co">hello@company.co</a></p>
                </div>

                <ul class="social-links">
                     <li><a href="#" class="uil uil-dribbble" data-toggle="tooltip" data-placement="left" title="Dribbble"></a></li>
                     <li><a href="#" class="uil uil-instagram" data-toggle="tooltip" data-placement="left" title="Instagram"></a></li>
                     <li><a href="#" class="uil uil-youtube" data-toggle="tooltip" data-placement="left" title="Youtube"></a></li>
                </ul>
            </div>
          </div>

          <div class="col-lg-6 col-12">
            <div class="contact-form">
              <h2 class="mb-4">Interested to work together? Let's talk</h2>

              <form action="SendMessage" method="post">
                <div class="row">
                  <div class="col-lg-6 col-12">
                    <input type="text" class="form-control" name="name" placeholder="Your Name" id="name">
                  </div>

                  <div class="col-lg-6 col-12">
                    <input type="email" class="form-control" name="email" placeholder="Email" id="email">
                  </div>

                  <div class="col-12">
                    <textarea name="message" rows="6" class="form-control" id="message" placeholder="Message"></textarea>
                  </div>

                  <div class="ml-lg-auto col-lg-5 col-12">
                    <input type="submit" class="form-control submit-btn" value="Send Button">
                  </div>
                </div>
              </form>
            </div>
          </div>

        </div>
      </div>
    </section>

    <!-- FOOTER -->
     <footer class="footer py-5">
          <div class="container">
               <div class="row">

                    <div class="col-lg-12 col-12">                                
                        <p class="copyright-text text-center">Copyright &copy; 2019 Company Name . All rights reserved</p>
                        <p class="copyright-text text-center">Designed by <a rel="nofollow" href="https://www.facebook.com/tooplate">Tooplate</a></p>
                    </div>
                    
               </div>
          </div>
     </footer>

    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/Headroom.js"></script>
    <script src="js/jQuery.headroom.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/smoothscroll.js"></script>
    <script src="js/custom.js"></script>

  </body>
</html>