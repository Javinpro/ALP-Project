document.getElementById('load-more').addEventListener('click', function(e) {
    e.preventDefault();
    
    // Create a new AJAX request
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'load_more_images.php', true);
    xhr.onload = function() {
        if (this.status === 200) {
            // Parse the response JSON
            var images = JSON.parse(this.responseText);

            // Get the gallery grid element
            var galleryGrid = document.getElementById('gallery-grid');

            // Loop through the images and append them to the gallery grid
            images.forEach(function(image) {
                var galleryItem = document.createElement('div');
                galleryItem.classList.add('gallery-item');
                galleryItem.innerHTML = '<img src="' + image.image_url + '" alt="Gallery Image">';
                galleryGrid.appendChild(galleryItem);
            });
        }
    };
    xhr.send();
});
