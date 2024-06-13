// Pilih elemen dengan id "toggle-btn" dan simpan dalam variabel 'hamburger'
const hamburger = document.querySelector("#toggle-btn");

// Tambahkan event listener untuk mendengarkan event "click" pada elemen 'hamburger'
hamburger.addEventListener("click",function(){
    // Ketika elemen 'hamburger' diklik, pilih elemen dengan id "sidebar"
    // dan toggle kelas "expand" pada elemen tersebut
    document.querySelector("#sidebar").classList.toggle("expand");
});

// Toggle password visibility
document.querySelector('.toggle-pass').addEventListener('click', function() {
    const passwordField = document.getElementById('inputPass');
    const type = passwordField.getAttribute('type') === 'password' ? 'text' : 'password';
    passwordField.setAttribute('type', type);

    // Toggle the eye icon
    this.textContent = type === 'password' ? 'visibility' : 'visibility_off';
});



