package jochaes.minipythoncompiler

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {

    private val _menuItemclicked = MutableLiveData<Boolean>()
    val menuItemClicked: LiveData<Boolean>
        get() = _menuItemclicked

    fun setMenuItemClicked(){
        _menuItemclicked.value = true
    }

    fun clearMenuItemclicked(){
        _menuItemclicked.value = false
    }


}