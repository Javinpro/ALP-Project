document.getElementById('uploadForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent default form submission
    
    var input = document.getElementById('imageUpload');
    var files = input.files;

    // Loop through each selected file
    for (var i = 0; i < files.length; i++) {
        var file = files[i];

        // Check if the file is a JPG
        if (file.type === 'image/jpeg') {
            var reader = new FileReader();

            reader.onload = function(e) {
                var imageGallery = document.getElementById('imageGallery');
                var imageElement = document.createElement('img');
                imageElement.src = e.target.result;
                imageElement.classList.add('img-thumbnail');
                imageGallery.appendChild(imageElement);
            };

            reader.readAsDataURL(file);
        } else {
            alert('Please select JPG images only.');
        }
    }

    // Reset file input after processing
    this.reset();
});
