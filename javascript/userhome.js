<a href="#" class="back-to-top" style="display: none; position: fixed; bottom: 20px; right: 20px; background-color: #007bff; color: white; padding: 10px 15px; border-radius: 5px;">Top</a>

// Ensure the document is fully loaded before running any scripts
$(document).ready(function() {
    // Navbar toggler functionality for mobile view
    $('.navbar-toggler').on('click', function() {
        $('#navbarNav').toggleClass('show');
    });

    // Optional: Add smooth scrolling for navigation links
    $('a.nav-link').on('click', function(event) {
        if (this.hash !== "") {
            event.preventDefault();

            var hash = this.hash;

            $('html, body').animate({
                scrollTop: $(hash).offset().top
            }, 800, function(){
                window.location.hash = hash;
            });
        }
    });
});

// Optional: Back to top button functionality
$(window).scroll(function() {
    if ($(this).scrollTop() > 100) {
        $('.back-to-top').fadeIn();
    } else {
        $('.back-to-top').fadeOut();
    }
});

$('.back-to-top').click(function() {
    $('html, body').animate({scrollTop : 0}, 800);
    return false;
});
