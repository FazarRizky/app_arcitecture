package com.pam.apparcitecture


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ItemViewModel : ViewModel() {

    private val _items = MutableLiveData<List<Item>>()
    val items: LiveData<List<Item>> get() = _items

    init {
        val itemList = listOf(
            Item("Fazar"),
            Item("hasan"),
            Item("Jajang"),
            Item("Budi")
        )

        _items.value = itemList
    }
}