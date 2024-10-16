package com.pam.apparcitecture

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.pam.apparcitecture.databinding.ActivityMainBinding
import com.pam.apparcitecture.ItemViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // Mengambil instance ViewModel
    private val itemViewModel: ItemViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengamati data dari ViewModel dan menampilkannya ke UI
        itemViewModel.items.observe(this, Observer { items ->
            binding.textViewItems.text = items.joinToString("\n") { it.name }
        })
    }
}
