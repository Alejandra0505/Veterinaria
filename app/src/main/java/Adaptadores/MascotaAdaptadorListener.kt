package Adaptadores

import com.example.veterinaria.DataBase.Entities.Mascotas
import com.example.veterinaria.DataBase.Entities.Razas
import com.example.veterinaria.mascotas

interface MascotaAdaptadorListener {
    fun onDeleteItemClick(mascotas: mascotas)
    fun onEditItemClick(mascotas: mascotas)
}