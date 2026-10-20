package com.example.p1_tarjetapresentacion_sofia_jorgenombredelproyecto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.p1_tarjetapresentacion_sofia_jorgenombredelproyecto.ui.theme.P1_TarjetaPresentacion_Sofia_JorgeNombreDelProyectoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P1_TarjetaPresentacion_Sofia_JorgeNombreDelProyectoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TarjetaPresentacion(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun TarjetaPresentacion(modifier: Modifier = Modifier) {
    // Contenedor principal: vertical, centrado (tarjeta/pantalla)
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Bloque superior: perfil
        Perfil()

        // Bloque inferior: datos de contacto
        DatosContacto()
    }
}

@Composable
fun Perfil(modifier: Modifier = Modifier) {
    // Sección principal del perfil, centrada
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Elemento 1 (arriba): recuadro reservado para imagen/avatar
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Avatar de perfil",
            modifier = Modifier.size(100.dp)
        )

        // Elemento 2 (centro): nombre completo, tipografía grande y destacada
        Text(text = "Sofía Jorge")

        // Elemento 3 (abajo): cargo/título debajo del nombre
        Text(text = "Desarrolladora Android")
    }
}

@Composable
fun DatosContacto(modifier: Modifier = Modifier) {
    // Contenedor separado debajo del perfil: 3 filas horizontales apiladas
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Fila 1: ícono + teléfono
        FilaContacto(
            icono = Icons.Filled.Phone,
            descripcionIcono = "Ícono de teléfono",
            texto = "+00 (00) 000 000"
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Fila 2: ícono + red social
        FilaContacto(
            icono = Icons.Filled.Share,
            descripcionIcono = "Ícono de redes sociales",
            texto = "@socialmediahandle"
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Fila 3: ícono + correo electrónico
        FilaContacto(
            icono = Icons.Filled.Email,
            descripcionIcono = "Ícono de correo electrónico",
            texto = "email@domail.com"
        )
    }
}

@Composable
fun FilaContacto(
    icono: androidx.compose.ui.graphics.vector.ImageVector,
    descripcionIcono: String,
    texto: String,
    modifier: Modifier = Modifier
) {
    // Fila compuesta: ícono a la izquierda + texto a la derecha
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icono,
            contentDescription = descripcionIcono,
            modifier = Modifier.size(24.dp)
        )
        Text(text = texto)
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaPresentacionPreview() {
    P1_TarjetaPresentacion_Sofia_JorgeNombreDelProyectoTheme {
        TarjetaPresentacion()
    }
}