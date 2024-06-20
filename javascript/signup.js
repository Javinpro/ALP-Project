document.getElementById('signupForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const firstName = document.getElementById('inputFirstName').value;
    const lastName = document.getElementById('inputLastName').value;
    const username = document.getElementById('inputUsername').value;
    const email = document.getElementById('inputEmail').value;
    const password = document.getElementById('inputPass').value;

    const data = {
        firstName: firstName,
        lastName: lastName,
        username: username,
        email: email,
        password: password
    };

    // Simpan data ke Local Storage
    localStorage.setItem('signupData', JSON.stringify(data));

    // Log untuk debugging
    console.log('Data berhasil disimpan ke Local Storage:', data);

    // Tampilkan pesan sukses atau alihkan pengguna ke halaman lain
    alert('Sign up successful! Data saved to Local Storage.');

    // Reset form setelah data disimpan
    document.getElementById('signupForm').reset();

    // Fetch untuk mengirim data ke server
    fetch('http://localhost:8081/api/users', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
    })
    .then(response => response.json())
    .then(data => {
        console.log('Success:', data);
        alert('Sign Up successful');
    })
    .catch((error) => {
        console.error('Error:', error);
        alert('Sign Up failed');
    });
});

// Toggle password visibility
document.querySelector('.toggle-pass').addEventListener('click', function() {
    const passwordField = document.getElementById('inputPass');
    const type = passwordField.getAttribute('type') === 'password' ? 'text' : 'password';
    passwordField.setAttribute('type', type);

    // Toggle the eye icon
    this.textContent = type === 'password' ? 'visibility' : 'visibility_off';
});
    