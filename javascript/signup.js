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
});

// Toggle password visibility
document.querySelector('.toggle-pass').addEventListener('click', function() {
    const passwordField = document.getElementById('inputPass');
    const type = passwordField.getAttribute('type') === 'password' ? 'text' : 'password';
    passwordField.setAttribute('type', type);

    // Toggle the eye icon
    this.textContent = type === 'password' ? 'visibility' : 'visibility_off';
});

