package Adaptadores

import com.example.veterinaria.DataBase.Entities.Mascotas
import com.example.veterinaria.DataBase.Entities.Roles

interface RolesAdaptadorListener {
    fun onDeleteItemClick(roles: Roles)
    fun onEditItemClick(roles: Roles)
}