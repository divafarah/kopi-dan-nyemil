Kopi dan Nyemil
Kopi dan Nyemil merupakan aplikasi pemesanan makanan dan minuman berbasis Android yang dibuat menggunakan Kotlin. Aplikasi ini dirancang dengan tampilan yang sederhana, menarik, dan mudah digunakan untuk membantu pengguna melihat menu serta melakukan pemesanan.

Tampilan Aplikasi
Aplikasi Kopi dan Nyemil memiliki tema warna pastel yang memadukan strawberry pink, matcha green, dan cream sehingga memberikan kesan nyaman dan menarik.

Fitur Aplikasi
Berikut fitur yang tersedia dalam aplikasi Kopi dan Nyemil:
1. plash / Welcome
   Halaman pembuka aplikasi yang menampilkan logo, nama aplikasi, tagline, dan tombol Start Now.
<img width="312" height="692" alt="splash" src="https://github.com/user-attachments/assets/c0f53309-c679-4708-9eee-fef330fba4e8" />

2.sign Up 
   Halaman pilihan bagi pengguna untuk melakukan registrasi atau login.
<img width="318" height="701" alt="halaman sign up" src="https://github.com/user-attachments/assets/68992b5a-4b15-48f3-a81f-6f7aa1f850f8" />

3. Login
   Halaman untuk masuk menggunakan username dan password.
<img width="308" height="681" alt="halama log in" src="https://github.com/user-attachments/assets/e41a84dc-6295-484a-929f-6eed58d16257" />

4. Register  
   Halaman pendaftaran akun dengan mengisi nama lengkap, username, dan password.
<img width="310" height="690" alt="halaman register" src="https://github.com/user-attachments/assets/e8864a91-7126-4fce-911d-a482e497c52b" />

5. Home
   Halaman utama yang menampilkan daftar makanan dan minuman yang tersedia.
<img width="309" height="697" alt="home" src="https://github.com/user-attachments/assets/247a805a-6f64-4f9a-aa52-077a53f1995f" />
<img width="313" height="696" alt="home (2)" src="https://github.com/user-attachments/assets/4af5a815-4d7f-4e57-9b3a-713fab1f43b5" />

6. Profile 
   Halaman untuk melihat dan mengubah informasi nama pengguna.
<img width="309" height="693" alt="profile" src="https://github.com/user-attachments/assets/14959756-5d26-4844-9773-47a9e207e046" />

7. Alamat Pengiriman  
   Halaman untuk mengisi nama penerima, alamat lengkap, dan detail atau patokan pengiriman.
<img width="314" height="695" alt="halaman pengirim" src="https://github.com/user-attachments/assets/1fab84bf-497d-47c8-905d-deeb1358e17e" />

8. Pilih Menu  
   Halaman untuk memilih makanan atau minuman yang ingin dipesan melalui tombol PESAN pada setiap menu.
<img width="310" height="687" alt="pilihmenu" src="https://github.com/user-attachments/assets/55513930-8fef-4cfe-a57e-f4edd98d2789" />
<img width="311" height="691" alt="pilih menu" src="https://github.com/user-attachments/assets/611101d3-8c81-4ab1-8fe9-1b3d12457441" />

9. Konfirmasi Pesanan 
   Halaman yang menampilkan ringkasan pesanan, harga, nama penerima, dan alamat pengiriman.
<img width="310" height="696" alt="konfirmasi pesanan" src="https://github.com/user-attachments/assets/fe932796-2546-40c6-aac4-5b36fd9e50f0" />

Daftar Menu
Aplikasi menyediakan 9 pilihan makanan dan minuman:
| No. | Nama Menu | Harga |
| 1 | Kopi Susu Gula Aren | Rp22.000 |
| 2 | Donat Cokelat | Rp12.000 |
| 3 | Sourdough Loaf | Rp35.000 |
| 4 | Cappuccino | Rp25.000 |
| 5 | Matcha Latte | Rp27.000 |
| 6 | French Fries | Rp15.000 |
| 7 | Mojito | Rp18.000 |
| 8 | Pisang Goreng | Rp15.000 |
| 9 | Teh Manis | Rp8.000 |

Alur Penggunaan Aplikasi
1. Pengguna membuka aplikasi melalui halaman Splash / Welcome.
2. Pengguna memilih Register untuk membuat akun atau Login untuk masuk.
3. Setelah berhasil masuk, pengguna diarahkan ke halaman Home.
4. Pengguna dapat melihat daftar makanan dan minuman.
5. Pengguna memilih menu ORDER untuk mengisi alamat pengiriman.
6. Setelah alamat diisi, pengguna menekan tombol LIHAT MENU.
7. Pengguna memilih makanan atau minuman melalui tombol PESAN.
8. Aplikasi menampilkan halaman Konfirmasi Pesanan.

Teknologi yang Digunakan
- Android Studio – IDE untuk pengembangan aplikasi Android.
- Kotlin – Bahasa pemrograman utama.
- XML – Untuk membuat desain dan layout antarmuka aplikasi.
- SharedPreferences – Untuk menyimpan data pengguna dan alamat secara lokal.
- Git & GitHub – Untuk pengelolaan dan penyimpanan source code.

Cara Menjalankan Aplikasi
1. Clone repository ini:
   git clone https://github.com/divafarah/kopi-dan-nyemil.git
2. Buka Android Studio.
3. Pilih Open, kemudian pilih folder project `kopi-dan-nyemil`.
4. Tunggu proses Gradle Sync sampai selesai.
5. Hubungkan perangkat Android atau jalankan Android Emulator.
6. Klik tombol **Run** untuk menjalankan aplikasi.

Panduan Penggunaan Aplikasi
Berikut langkah-langkah menggunakan aplikasi Kopi dan Nyemil:
1. Splash / Welcome
   Buka aplikasi, kemudian tekan tombol START NOW untuk masuk ke halaman berikutnya.
2. Sign Up
   Pada halaman Sign Up, pilih REGISTER jika belum memiliki akun atau LOGIN jika sudah memiliki akun.
3. Register
   Jika memilih Register, isi nama lengkap, username, dan password. Setelah itu tekan tombol REGISTER untuk membuat akun.
4. Login
   Masukkan username dan password yang sudah didaftarkan, kemudian tekan tombol LOGIN untuk masuk ke aplikasi.
5. Home
   Setelah berhasil login, pengguna akan masuk ke halaman Home. Pada halaman ini tersedia 9 pilihan makanan dan minuman yang dapat dilihat.
6. Order
   Tekan tombol ORDER pada navigasi bawah untuk mulai melakukan pemesanan.
7. Alamat Pengiriman
   Isi nama penerima, alamat lengkap, serta patokan atau detail alamat. Setelah semua terisi, tekan tombol LIHAT MENU.
8. Pilih Menu
   Pengguna akan diarahkan ke halaman Pilih Menu. Pilih makanan atau minuman yang diinginkan dengan menekan tombol PESAN pada kartu menu.
9. Konfirmasi Pesanan
   Setelah memilih menu, aplikasi akan menampilkan halaman Konfirmasi Pesanan yang berisi nama produk, total harga, nama penerima, dan alamat pengiriman.
10. Selesai
    Periksa informasi pesanan, kemudian tekan tombol OK untuk kembali ke halaman Home.
11. Profile
    Pengguna dapat membuka halaman PROFILE melalui navigasi bawah untuk melihat dan mengubah nama profil. Tekan tombol SAVE setelah melakukan perubahan.

