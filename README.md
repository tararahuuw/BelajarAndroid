# BelajarAndroid
1. Gradle:Module
   buildFeatures {
      viewBinding = true
   }
2. MainActivity.kt
   - private late init var binding : ActivityMainBinding
   - binding = ActivityMainBinding.inflate(layoutInflater)
   - setContentView(binding.root)
