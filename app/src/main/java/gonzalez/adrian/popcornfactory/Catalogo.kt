package gonzalez.adrian.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class Catalogo : AppCompatActivity() {

    var adapter: PeliculaAdapter?= null
    var peliculas = ArrayList<Pelicula>()
    val grindview: GridView = findViewById(R.id.grindview)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)

        cargarPeliculas()

        adapter = PelicuaAdapter(peliculas, this)
        grindview.adapter = adapter
    }

    fun cargarPeliculas(){
        

    }
}