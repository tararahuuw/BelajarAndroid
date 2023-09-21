# LifeCycleActivity
	// onCreate(savedInstanceState: Bundle?): Metode ini dipanggil saat Activity baru pertama kali dibuat.
	// Inisialisasi sumber daya yang diperlukan biasanya dilakukan di sini.
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}
 
 	// onStart(): Dipanggil saat Activity mulai terlihat oleh pengguna.
	// Pada titik ini, Activity masih tidak dapat berinteraksi dengan pengguna.
	override fun onStart() {
		super.onStart()
		// Kode untuk menyiapkan tampilan atau sumber daya
	}
	
	// onResume(): Dipanggil saat Activity menjadi interaktif dan siap menerima input pengguna.
	override fun onResume() {
		super.onResume()
		// Kode untuk memulai perintah yang membutuhkan input pengguna
	}
	
	// onPause(): Dipanggil saat Activity kehilangan fokus, tetapi masih terlihat oleh pengguna.
	// Ini adalah tempat yang baik untuk menghentikan operasi yang memakan waktu.
	override fun onPause() {
		super.onPause()
		// Kode untuk menghentikan perintah atau membebaskan sumber daya
	}
	
	// onStop(): Dipanggil saat Activity tidak lagi terlihat oleh pengguna.
	// Ini adalah tempat yang baik untuk menghentikan sumber daya yang berjalan di latar belakang.
	override fun onStop() {
		super.onStop()
		// Kode untuk menghentikan operasi latar belakang
	}
	
	// onDestroy(): Dipanggil saat Activity dihancurkan atau ditutup.
	// Anda dapat melakukan pembersihan terakhir di sini.
	override fun onDestroy() {
		super.onDestroy()
		// Kode untuk membersihkan sumber daya atau objek yang tidak lagi diperlukan
	}
