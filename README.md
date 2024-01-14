 # KELOMPOK-5
SISTER

Titik kunci yang mewakili tingkat konsistensi data:
1. Konsistensi Kuat (Strong Consistency): Pada titik ini, sistem terdistribusi menjamin bahwa setiap akses baca akan selalu melihat versi data yang sama, tidak peduli di mana akses tersebut dilakukan. Konsistensi kuat menghilangkan semua kemungkinan inkonsistensi data, tetapi seringkali mengorbankan kinerja dan skalabilitas.
2. Konsistensi Terbatas (Limited Consistency): Konsistensi terbatas mengizinkan beberapa bentuk keterlambatan atau inkonsistensi sementara dalam data antar node dalam sistem terdistribusi. Namun, batasan ini harus terdefinisi dengan jelas dan dapat diterima oleh aplikasi yang menggunakan data tersebut.
3. Konsistensi Eventual (Eventual Consistency): Ini adalah titik di mana sistem terdistribusi mengizinkan inkonsistensi data sementara antar node, tetapi pada akhirnya, semua node akan konvergen ke versi data yang sama. Konsistensi ini sering digunakan dalam sistem yang sangat terdistribusi untuk meningkatkan kinerja dan toleransi terhadap partisi jaringan.
4. Konsistensi Lemah (Weak Consistency): Pada titik ini, sistem terdistribusi hanya memberikan sedikit atau tanpa jaminan konsistensi antar node. Data dapat divergensi dan terlihat berbeda di beberapa node pada waktu yang sama. Konsistensi lemah sering digunakan dalam sistem yang sangat terdistribusi yang fokus pada kinerja maksimum.


Konsistensi Data adalah hal yang mengacu pada tingkat keseragaman atau kekonsistenan data di seluruh komponen atau node yang terdapat dalam suatu sistem yang tersebar secara geografis atau logis. Dalam sistem terdistribusi, data dapat disimpan dan diakses dari berbagai lokasi yang berbeda, dan masalah konsistensi muncul ketika dua atau lebih operasi terjadi pada data yang sama dalam waktu yang bersamaan atau hampir bersama. Oleh karena itu, konsistensi data menjadi kritikal dalam memastikan bahwa informasi yang disimpan dan diambil dari sistem tersebut adalah akurat, dapat diandalkan, dan sesuai dengan harapan. Ada beberapa model konsistensi data yang digunakan dalam sistem terdistribusi:

  a. Strong Consistency (Konsistensi Kuat): Dalam model ini, setiap operasi baca akan mengembalikan hasil yang sama seperti hasil operasi tulis yang sebelumnya. Ini berarti       setiap pembaruan data akan terlihat seketika oleh semua entitas dalam sistem, dan tidak ada inkonsistensi antara baca dan tulis.
  
  b. Eventual Consistency (Konsistensi Akhir): Model konsistensi ini mengizinkan adanya keterlambatan dalam penyebaran pembaruan data ke seluruh sistem. Dengan kata lain,        jika tidak ada pembaruan data lebih lanjut, semua node akan akhirnya mencapai keadaan konsisten setelah suatu waktu. Ini sering digunakan dalam sistem yang harus             menjaga kinerja tinggi.
  
  c. Causal Consistency (Konsistensi Sebab-Akibat): Dalam model ini, operasi-operasi yang memiliki hubungan sebab-akibat harus diterapkan secara konsisten. Jika operasi A        mempengaruhi operasi B, maka operasi A harus terlihat sebelum operasi B di semua node.
  
  d. Session Consistency (Konsistensi Sesuai Sesi): Konsistensi ini berkaitan dengan konsistensi dalam konteks sesi pengguna. Selama sesi pengguna tertentu, pengguna akan        melihat operasi mereka sendiri dalam urutan yang konsisten, tetapi tidak perlu konsisten dengan operasi pengguna lain.
  
  e. Read Your Writes (Baca Tulisan Anda): Dalam model ini, pengguna akan selalu melihat hasil tulisan mereka sendiri saat mereka membaca data. Meskipun operasi-operasi          pengguna lain mungkin belum terlihat, operasi pengguna sendiri harus terlihat.

  
Konsistensi data dalam konteks pengembangan perangkat lunak mengacu pada keadaan di mana data dijaga agar tetap benar, akurat, dan sesuai dengan aturan atau kebijakan yang telah ditetapkan. Ini adalah aspek penting dalam pengembangan aplikasi, terutama ketika ada banyak operasi yang melibatkan manipulasi data.


Konsistensi data adalah salah satu aspek penting dalam pengelolaan informasi dan database. Ini mengacu pada keadaan di mana data dalam sistem atau basis data selalu berada dalam keadaan yang benar, tepat, dan sesuai dengan aturan, standar, dan konvensi yang berlaku. Konsistensi data penting karena data yang tidak konsisten dapat mengakibatkan informasi yang salah, ketidakpercayaan pengguna, dan masalah dalam pengambilan keputusan. Berikut adalah beberapa materi yang terkait dengan konsistensi data:

1. Ketidakberubahannya (Immutability): Data harus diatur sedemikian rupa sehingga setelah data dimasukkan ke dalam sistem atau basis data, itu tidak dapat diubah secara sembarangan tanpa melalui prosedur yang terkendali. Ini meminimalkan kesalahan data yang dapat terjadi karena perubahan tidak sah.
2. Kepatuhan Aturan Bisnis: Data harus mematuhi aturan bisnis yang berlaku. Ini mencakup validitas data, batasan data, dan penggunaan aturan validasi untuk memastikan data selalu sesuai dengan standar yang ditetapkan.
3. Keseragaman Format: Data harus memiliki format yang seragam. Misalnya, format tanggal yang digunakan harus konsisten di seluruh sistem atau basis data, seperti "dd/mm/yyyy" atau "yyyy-mm-dd".
4. Keseragaman Nilai: Nilai-nilai yang digunakan dalam data harus konsisten. Sebagai contoh, jika ada kolom yang menyimpan jenis kelamin, hanya boleh ada dua nilai yang sah, yaitu "Laki-laki" dan "Perempuan". Tidak boleh ada nilai seperti "Pria" atau "Wanita".
5. Integritas Referensial: Dalam basis data yang terhubung, seperti basis data relasional, integritas referensial harus dijaga. Ini berarti bahwa semua referensi antar tabel harus valid, dan tidak boleh ada referensi ke data yang tidak ada atau data yang telah dihapus.
6. Pembaruan dan Penghapusan Data: Pembaruan dan penghapusan data harus dilakukan dengan hati-hati dan terdokumentasi. Ini untuk memastikan bahwa data yang dihapus tidak "hilang" secara tiba-tiba dan pembaruan data mematuhi aturan bisnis.
7. Audit dan Log: Perekaman aktivitas pada data, seperti log perubahan, dapat membantu memantau dan mendeteksi pelanggaran konsistensi data.
8. Pemulihan Data (Data Recovery): Mempersiapkan prosedur pemulihan data yang baik adalah bagian penting dari menjaga konsistensi data. Ini melibatkan cadangan data yang teratur dan rencana pemulihan bencana.
9. Keamanan Data: Perlindungan data dari akses yang tidak sah juga berkontribusi pada konsistensi data. Upaya keamanan termasuk penggunaan izin akses yang tepat dan penggunaan enkripsi data yang sensitif.
10. Pemantauan dan Pengawasan: Menerapkan sistem pemantauan dan pengawasan dapat membantu mendeteksi masalah konsistensi data dengan cepat sehingga tindakan perbaikan dapat diambil.
Penting untuk diketahui bahwa konsistensi data bukan hanya tanggung jawab dari sistem teknologi informasi, tetapi juga melibatkan praktik manajemen data yang baik dan kepatuhan dari orang-orang yang menggunakan dan memelihara data tersebut. Konsistensi data merupakan fondasi penting dalam mendukung keputusan yang baik dan operasi yang efisien dalam berbagai jenis organisasi.


Menjaga konsistensi data dalam sistem terdistribusi adalah tugas yang penting dan kompleks. Cara Anda menjaga konsistensi data akan sangat tergantung pada model konsistensi yang Anda gunakan, kebutuhan aplikasi, dan infrastruktur sistem. Berikut beberapa strategi yang dapat membantu Anda menjaga konsistensi data:
1.	Pilih Model Konsistensi yang Sesuai:
•	Pilihan model konsistensi yang sesuai dengan kebutuhan aplikasi adalah langkah pertama yang penting. Jika aplikasi Anda memerlukan konsistensi kuat, maka Anda harus memilih model yang mendukung konsistensi kuat. Jika kinerja adalah prioritas, Anda mungkin akan memilih model konsistensi yang lebih longgar.
2.	Replikasi Data:
•	Melakukan replikasi data adalah cara umum untuk meningkatkan ketersediaan dan toleransi terhadap kesalahan dalam sistem terdistribusi. Data dapat direplikasi ke beberapa node, dan perubahan data harus secara konsisten diterapkan di semua salinan data tersebut.
3.	Koordinasi Transaksi:
•	Dalam model konsistensi kuat atau konsistensi kausal, Anda mungkin perlu melakukan koordinasi transaksi. Ini melibatkan penggunaan protokol transaksi seperti 2PC (Two-Phase Commit) atau 3PC (Three-Phase Commit) untuk memastikan bahwa operasi baca dan tulis dilakukan secara atomik dan konsisten di seluruh node.
4.	Vektor Jam (Vector Clocks):
•	Dalam beberapa sistem terdistribusi, vektor jam digunakan untuk melacak urutan operasi dan memastikan konsistensi kausal. Setiap operasi memiliki vektor jam yang merekam informasi tentang operasi sebelumnya. Ini membantu sistem memahami hubungan sebab-akibat antara operasi.
5.	Quorum Systems:
•	Dalam sistem terdistribusi dengan model konsistensi akhir, quorum systems digunakan untuk mengatur seberapa banyak node yang harus terlibat dalam operasi baca dan tulis untuk memastikan konsistensi. Pengaturan quorum yang benar dapat membantu menjaga konsistensi data.
6.	Deteksi dan Manajemen Konflik:
•	Dalam situasi di mana konflik data terjadi, Anda perlu memiliki strategi untuk mendeteksi dan menyelesaikan konflik ini. Ini dapat mencakup penggunaan mekanisme seperti tombol timestamp atau resolusi konflik otomatis.
7.	Monitoring dan Pemantauan:
•	Penting untuk memiliki alat pemantauan yang baik untuk melacak konsistensi data dalam sistem terdistribusi. Ini memungkinkan Anda untuk mendeteksi masalah segera dan meresponsnya dengan cepat.
8.	Uji dan Simulasi:
•	Uji dan simulasi adalah langkah penting untuk memastikan bahwa sistem Anda mematuhi aturan konsistensi yang Anda tetapkan. Uji skenario yang berbeda dan kondisi yang ekstrem dapat membantu mengidentifikasi potensi masalah dengan konsistensi data.
9.	Manajemen Kesalahan:
•	Manajemen kesalahan adalah komponen penting dalam menjaga konsistensi data. Anda perlu memiliki strategi untuk mengatasi kegagalan node atau partisi jaringan yang dapat mengganggu konsistensi data.
Penting untuk diingat bahwa menjaga konsistensi data dalam sistem terdistribusi seringkali melibatkan trade-off antara konsistensi, kinerja, dan ketersediaan. Oleh karena itu, pemilihan strategi yang sesuai harus mempertimbangkan kebutuhan bisnis dan karakteristik aplikasi Anda.



