# Website Pulauwesi
Pulauwesi merupakan sebuah platform berbasis website yang berisi beragam macam destinasi tempat wisata berupa pulau - pulau kecil sekitar pulau Sulawesi yang belum dikenal oleh banyak orang, 
seperti turis lokal maupun turis internasional. Sehingga dengan website ini, kami berharap agar dapat membantu mempopulerkan beragam macam keindahan alam yang tersembunyi kepada dunia.

![License](https://img.shields.io/badge/license-MIT-brightgreen)
![GitHub issues](https://img.shields.io/github/issues/Javinpro/ALP-Project)
![GitHub stars](https://img.shields.io/github/stars/Javinpro/ALP-Project)

## Fitur Pulauwesi
### Fitur User Points dan Rewards
- User akan mendapatkan poin dari setiap foto yang berhasil diunggah di halaman gallery
- User dapat menukarkan poin yang telah dikumpulkan dengan rewards yang tersedia

### Fitur Gallery 
- User dapat mengunggah hasil foto jelajahnya di halaman ini
- Tiap foto yang telah user unggah, akan disetujui terlebih dahulu oleh admin sebelum ditampilkan di halaman gallery

### Fitur Notifications
- Setelah foto tersebut disetujui, user akan mendapatkan notifikasi terkait disetujuinya foto tersebut dan poin yang didapat

### Fitur User Profile
- Di page ini, user dapat mengedit beberapa data profilnya, seperti bio, foto profil, nomor telpon, tanggal lahir, dan alamat

### Fitur Island Information (Browse Page)
- Menyediakan detail terkait deskripsi, gambar, hingga lokasi map dari tiap - tiap pulau
- Menyediakan informasi terkait layanan transportasi yang dapat digunakan

### Fitur User Review dan Rating
- User dapat memberikan ulasan dan rating terkait pulau - pulau yang telah user kunjungi

### Fitur Admin Controls (Hanya untuk admin)
- Admin dapat mengelola foto yang diunggah oleh user, menyetujui atau menolak foto, dan mengelola poin user
- Admin juga dapat menambahkan beberapa informasi pulau berupa card di halaman browse, guna untuk memperkenalkan pulau - pulau kecil lainnya kepada user

## Tech 
Website ini dibangun dengan menggunakan : 
- [Laragon](https://laragon.org/download/) - sebuah aplikasi pengelolaan server lokal (local server) yang berfokus pada MySQL untuk platform Windows.
- [Mysql] - merupakan sistem manajemen basis data relasional (RDBMS) yang populer digunakan untuk menyimpan dan mengelola data dalam berbagai aplikasi maupun web.
- [Visual Studio Code](https://code.visualstudio.com/) - teks editor yang mendukung banyak bahasa pemrograman dan bahasa markup. Dengan adanya beragam extensions sehingga dapat
  mempermudah untuk
  membangun sebuah project.
- [Brave Browser](https://brave.com/) - web browser yang dapat membantu dalam membuat sebuah halaman website.
- [HTML] - Hypertext Markup Language, yaitu bahasa markup standar untuk membuat dan menyusun halaman website.
- [CSS] - Cascading Style Sheets yang berguna untuk mengontrol setiap aspek tampilan pada halaman web, sehingga memberikan pengalaman pengguna (UX) yang lebih baik
- [Javascript] - komponen kunci dalam pengembangan web, perannya dapat membuat web menjadi lebih responsif, interaktif, dan dinamis sehingga dapat menyempurnakan pengalaman pengguna (UX)
  secara keseluruhan.
- [Spring Boot Java] - membantu developer dalam membangun aplikasi Java yang skalabel dan efisien dengan menyediakan banyak fitur bawaan dan meminimalkan kofigurasi manual, sehingga
    mempercepat siklus developing dan mengurangi kompleksitas.
- [Bootstrap] - framework yang cukup populer digunakan untuk membangun antarmuka pengguna (UI) pada website.
  
## Requirement
- Laragon Full 6.0 
- Bootstrap 5 or later
- Spring Boot 3.3.0 or later

## Structure


## Installation
## Installing Laragon 
## Step 1
- Kunjungi situs resmi [laragon](https://laragon.org/download/)
- Klik tombol Download
- Pilih versi Laragon yang anda butuhkan, namun pada umumnya, versi 'Full' yang disarankan karena mencakup semua fitur dan paket
- Klik tombol Download untuk memulai pengunduhan file installer Laragon

## Step 2
- Jalankan installer dengan membuka file installer yang telah diunduh
- Tentukan direktori tempat untuk menginstal Laragon, lokasi default biasanya di 'C:\Laragon'
- Ikuti pentunjuk yang diberikan, biasanya hanya perlu mengklik 'Next' beberapa kali dan menyetujui perjanjian lisensi
- Setelah semua langkah penginstalan selesai, klik 'Finish'

## Step 3
- Jalankan Laragon melalui shortcut di Desktop atau bisa juga dari menu Start
- Untuk memulai layanan, klik tombol 'Start All'

## Step 4
- Buka browser web dan akses 'http://localhost' untuk memastikan server web berjalan dengan baik
- Akses 'http://localhost/phpmyadmin' untuk memastikan MySQL berjalan, database dapat dikelola di phpMyAdmin

## Installing Bootstrap
## Step 1
- Kunjungi situs resmi [Bootstrap](https://getbootstrap.com/docs/5.3/getting-started/download/) atau versi lainnya
- Klik tombol download, akan disuguhkan opsi :
- Compiled CSS and JS: File CSS dan JavaScript Bootstrap yang telah dikompilasi dan siap digunakan
- Source Files: File sumber SASS dan JavaScript yang dapat dikustomisasi sesuai kebutuhan Anda
- Bootstrap via CDN: Opsi ini memungkinkan Anda untuk menggunakan Bootstrap langsung dari Content Delivery Network (CDN) tanpa perlu mengunduh file apapun

- Klik tombol Download pada opsi yang anda pilih untuk memulai instalasi

## Step 2
- Download via CDN : salin tautan berikut ke dalam '<head>' HTML anda :
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
- Pastikan untuk menyesuaikan link CDN dengan versi Bootstrap yang anda pilih 

- Jika anda mengunduh file Bootstrap, ekstrak file tersebut ke dalam direktori proyek anda
- Link CSS dan JavaScript Bootstrap di dokumen HTML anda seperti ini:
<link rel="stylesheet" href="path/to/bootstrap/css/bootstrap.min.css">
<script src="path/to/bootstrap/js/bootstrap.min.js"></script>
- Gantilah path/to/bootstrap dengan jalur yang sesuai ke file Bootstrap di direktori proyek anda

## Installing Spring Boot
## Syarat
Sebelum memulai, pastikan anda telah menginstal : 
- Java Development Kit (JDK): Anda memerlukan JDK 8 atau yang lebih baru
- Maven: Alat manajemen proyek dan build automation
- Visual Studio Code (VS Code): IDE yang akan Anda gunakan

## Step 1
- Kunjungi situs web [Oracle](https://www.oracle.com/java/technologies/downloads/#java11) untuk menginstal JDK
- Jalankan file instalasi dan ikuti instruksi untuk menyelesaikan instalasi
- Setelah instalasi selesai, tambahkan JAVA_HOME ke variabel environment sistem anda.

## Step 2
- Kunjungi situs [Maven](https://maven.apache.org/download.cgi) untuk menginstal Maven, dan unduk versi terbaru
- Ekstrak arsip yang diunduh ke direktori yang anda pilih
- Tambahkan MAVEN_HOME ke variabel environment sistem Anda dan tambahkan MAVEN_HOME\bin ke variabel PATH

## Step 3
- Kunjungi situs [Visual Studio Code](https://code.visualstudio.com/) untuk menginstal Visual Studio Code, dan unduk versi terbaru
- Jalankan file instalasi dan ikuti instruksi untuk menyelesaikan instalasi

## Step 4
- Buka Spring Initializr di browser anda
- Konfigurasi proyek anda dengan mengisi informasi seperti Project, Language, Spring Boot version, Project Metadata, dan Dependencies
- Klik tombol Generate untuk mengunduh proyek Spring Boot yang telah dikonfigurasi
- Ekstrak proyek yang diunduh ke direktori pilihan anda
- Buka VS Code dan pilih File > Open Folder untuk membuka direktori proyek Spring Boot anda

## Step 5
- Buka VS Code jika belum terbuka
- Klik ikon Extensions di bilah sisi kiri atau tekan 'Ctrl+Shift+X'
- Cari Spring Boot Extension Pack dan klik Install

## Step 6
- Buka terminal baru dengan memilih Terminal > New Terminal
- Pertama-tama navigasi ke direktori proyek
- Jalankan perintah berikut untuk menjalankan aplikasi Spring Boot:
./mvnw spring-boot:run

## Credit 
> - Javin E. C. (Project Leader, Front-end Developer, Database Designer)
> - Muhammad Habbibie Zikrillah (UI/UX Designer)
> - A. Alfian Tenggara Putra (Front-end Developer)
> - Excel Marcello Parinussa (Back-end Developer) 

