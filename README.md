# Praktikum 3: Implementasi State di Jetpack Compose

## 📌 Penjelasan Implementasi State di Aplikasi
Pada praktikum ini, saya mempelajari bagaimana **state** digunakan untuk mengatur data yang dapat berubah secara dinamis dalam aplikasi berbasis **Jetpack Compose**. Dengan memanfaatkan `remember { mutableStateOf() }`, sebuah variabel bisa disimpan sebagai *state* sehingga setiap kali nilainya berubah, **UI akan otomatis diperbarui melalui mekanisme recomposition**.  
Hal ini membuat proses pengembangan UI menjadi jauh lebih sederhana, karena developer tidak perlu lagi mengatur elemen UI satu per satu secara manual.

Sebagai contoh:
- Pada `CounterApp()`, variabel `count` disimpan sebagai state. Saat tombol ditekan, nilai `count` akan bertambah atau berkurang. Compose kemudian akan melakukan *recomposition* dan menampilkan nilai terbaru pada layar.
- Pada `ColorToggleButton()`, state digunakan untuk menyimpan status warna (merah atau hijau). Saat kotak diklik, nilai state akan berubah dan otomatis mengganti warna kotak.
- Pada `InteractiveProfile()`, state `isFollowed` menentukan teks tombol *Follow/Unfollow* dan status informasi di bawahnya. Dengan memanfaatkan state, tampilan langsung berubah ketika tombol diklik tanpa perlu pemanggilan ulang UI secara manual.

Dari ketiga contoh ini terlihat bahwa **state menjadi jembatan utama antara data dan tampilan**. Ketika data berubah, tampilan ikut menyesuaikan, sehingga logika aplikasi dan UI bisa berjalan selaras.

---

## 📌 Mengapa Jetpack Compose Lebih Sederhana Dibanding XML Tradisional
Pendekatan **Jetpack Compose** berbasis **UI deklaratif**. Artinya, UI adalah representasi langsung dari kondisi *state*.
- Jika state berubah → Compose akan otomatis menyusun ulang tampilan yang relevan (*recomposition*).
- Developer cukup mendefinisikan "seperti apa tampilan jika state tertentu aktif", bukan lagi mengatur langkah-langkah perubahan UI satu per satu.

Hal ini berbeda dengan pendekatan **XML tradisional**:
- UI didefinisikan statis dalam layout XML.
- Untuk memperbarui tampilan, developer perlu mencari view berdasarkan ID (misalnya dengan `findViewById`) lalu melakukan update secara manual (misalnya `textView.setText()` atau `button.setEnabled()`).
- Pendekatan ini lebih panjang, repetitif, dan rawan error jika ada banyak elemen yang perlu diperbarui.

Dengan Compose, kode menjadi lebih **ringkas, intuitif, dan terintegrasi dengan logika bisnis aplikasi**. Setiap perubahan data akan langsung tercermin di UI tanpa perlu intervensi manual.

---

## 📌 Kesimpulan
- **State (`remember { mutableStateOf() }`)** adalah kunci utama dalam membangun aplikasi reaktif di Compose.
- Dengan state, UI akan selalu sinkron dengan data tanpa perlu pemanggilan manual.
- **Jetpack Compose** menawarkan cara kerja yang lebih modern dan sederhana dibanding XML karena menerapkan paradigma **UI deklaratif**.
- Praktikum ini menunjukkan bagaimana konsep state bisa diaplikasikan pada berbagai skenario: counter sederhana, toggle warna, hingga tombol *Follow/Unfollow* di profil.

