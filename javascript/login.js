// Toggle password visibility
document.querySelector('.toggle-pass').addEventListener('click', function() {
    const passwordField = document.getElementById('inputPass');
    const type = passwordField.getAttribute('type') === 'password' ? 'text' : 'password';
    passwordField.setAttribute('type', type);

    // Toggle the eye icon
    this.textContent = type === 'password' ? 'visibility' : 'visibility_off';
});
