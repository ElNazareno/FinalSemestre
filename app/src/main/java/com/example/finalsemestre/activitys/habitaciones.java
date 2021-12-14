package com.example.finalsemestre.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.finalsemestre.MainActivity;
import com.example.finalsemestre.R;
import com.example.finalsemestre.ScrollingActivity;
import com.example.finalsemestre.adaptadores.HabitacionesAdapter;
import com.example.finalsemestre.adaptadores.Habitacionesitems;

import java.util.ArrayList;

public class habitaciones extends AppCompatActivity {
    HabitacionesAdapter adapter;
    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habitaciones);
        lista = findViewById(R.id.listDestinosBuscar);

        adapter = new HabitacionesAdapter (this, getDatos());

        lista.setAdapter(adapter);


        // HabitacionesAdaptadores
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // La posición donde se hace clic en el elemento de lista se obtiene de la
                // la posición de parámetro de la vista de lista de Android

                Habitacionesitems.habitacionesItems item = (Habitacionesitems.habitacionesItems) parent.getItemAtPosition(position);
                Intent intent = new Intent(getApplicationContext(), ScrollingActivity.class);
                intent.putExtra("holas", item.getId());
                intent.putExtra("holass", item.getPrecio());
                intent.putExtra("titulo", item.getTitulo());
                intent.putExtra("imagen", item.getImagen());
                intent.putExtra("descripcionh", item.getDescripcionHabitacion());
                intent.putExtra("carach1", item.getCaracteristicasHabitacion1());
                intent.putExtra("carach2", item.getCaracteristicasHabitacion2());
                intent.putExtra("vistas1", item.getCaracteristicasVistas1());
                intent.putExtra("vistas2", item.getCaracteristicasVistas2());
                intent.putExtra("baño1", item.getCaracteristicasBaño1());
                intent.putExtra("baño2", item.getCaracteristicasBaño2());
                intent.putExtra("equih1", item.getCaracteristicasEquipamiento1());
                intent.putExtra("equih2", item.getCaracteristicasEquipamiento2());
                intent.putExtra("fotito1", item.getFoto1());
                intent.putExtra("fotito2", item.getFoto2());
                intent.putExtra("fotito3", item.getFoto3());
                intent.putExtra("fotito4", item.getFoto4());
                intent.putExtra("fotito5", item.getFoto5());
                intent.putExtra("fotito6", item.getFoto6());
                startActivity(intent);

            }
        });

        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "click Largo " + i, Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
    private ArrayList<Habitacionesitems.habitacionesItems> getDatos() {
        return Habitacionesitems.ArregloLista();
    }

    // evento se repite n veces , se usa varias vecxes
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_buscar, menu);
        MenuItem item = menu.findItem(R.id.menu_search);
        SearchView searchView = (SearchView) item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);

                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}