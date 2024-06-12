// Pilih elemen dengan id "toggle-btn" dan simpan dalam variabel 'hamburger'
const hamburger = document.querySelector("#toggle-btn");

// Tambahkan event listener untuk mendengarkan event "click" pada elemen 'hamburger'
hamburger.addEventListener("click",function(){
    // Ketika elemen 'hamburger' diklik, pilih elemen dengan id "sidebar"
    // dan toggle kelas "expand" pada elemen tersebut
    document.querySelector("#sidebar").classList.toggle("expand");
});

