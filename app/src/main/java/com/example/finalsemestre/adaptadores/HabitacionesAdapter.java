package com.example.finalsemestre.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.finalsemestre.R;

import java.util.ArrayList;

public class HabitacionesAdapter extends BaseAdapter implements Filterable {
    // declarando variables para usarlo
    Context context; //almacenar card view
    ArrayList<Habitacionesitems.habitacionesItems> mdatos; //(llamar datos) el array que se creo en la otra calse , se usa con nombre mdatos
    LayoutInflater inflater; //es un fragmente remplzable dentro del activity de manera dinamica
    HabitacionesAdapter.CustomerFilter filtro; //filtra
    ArrayList<Habitacionesitems.habitacionesItems> filtroList; // (filtar datos)

    //constructor para llamar datos
    public HabitacionesAdapter(Context context,ArrayList<Habitacionesitems.habitacionesItems> datos){
        this.context = context;
        this.mdatos = datos;
        this.filtroList = datos;
    }
    //metodos creados del FILTERABLE x defecto en Android
    @Override
    public int getCount() { // CONTEO , que nos dara la dimension del arreglo
        return mdatos.size();//recuperando la cantidad de elmentos del arreglo
    }
    @Override
    public Object getItem(int posicion) {//poscion del elemnto dentro del arrgelo , en funcion al objeto
        return mdatos.get(posicion);// llmar a la posicion del elemento
    }
    @Override
    public long getItemId(int posicion) { // posicion y busqueda
        return mdatos.indexOf(getItem(posicion)); // se guardara la posicion , buscara la poscion del elmento
    }
    @Override
    // metodo que obtener la imagen y texto y lo reemplaza , dentro del card view
    public View getView(int posicion , View view, ViewGroup parent) {
        TextView txtTtitulo,txtCama,txtBaño,txtExtra,txtprecio;
        ImageView imgdestino;

        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE); // inflador dentro del layout

        if (view == null){
            view = inflater.inflate(R.layout.cardview,parent,false);
        }
        txtTtitulo = view.findViewById(R.id.txtTitulo);
        txtCama=view.findViewById(R.id.lblCamas);
        txtBaño=view.findViewById(R.id.lblBanoSiNo);
        txtExtra=view.findViewById(R.id.lblExtras);
        txtprecio=view.findViewById(R.id.lblPrecioPEN);
        imgdestino = view.findViewById(R.id.imgDestino);


        //asignar y capturar
        txtTtitulo.setText(mdatos.get(posicion).getTitulo());
        txtCama.setText(mdatos.get(posicion).getCamas());
        txtBaño.setText(mdatos.get(posicion).getBanopriv());
        txtExtra.setText(mdatos.get(posicion).getExtrass());
        txtprecio.setText(mdatos.get(posicion).getPrecio());
        imgdestino.setImageResource(mdatos.get(posicion).getImagen());
        return view;
    }
    @Override
    public Filter getFilter() {
        if(filtro ==  null){
            filtro = new CustomerFilter(); //filtro del cliente
        }
        return filtro;
    }
    private class CustomerFilter extends  Filter {
        @Override
        protected Filter.FilterResults performFiltering(CharSequence constraint) {

            Filter.FilterResults resulst = new Filter.FilterResults();
            if(constraint != null && constraint.length()>0){
                //pasamos a mayusculas
                constraint = constraint.toString().toUpperCase();

                ArrayList<Habitacionesitems.habitacionesItems> filtro = new ArrayList<Habitacionesitems.habitacionesItems>();

                for(Integer i = 0; i<filtroList.size(); i++){
                    if(filtroList.get(i).getTitulo().toUpperCase().contains(constraint)){
                        Habitacionesitems.habitacionesItems
                                c= new Habitacionesitems.habitacionesItems(
                                filtroList.get(i).getId(),
                                filtroList.get(i).getTitulo(),
                                filtroList.get(i).getImagen(),
                                filtroList.get(i).getCamas(),
                                filtroList.get(i).getBanopriv(),
                                filtroList.get(i).getExtrass(),
                                filtroList.get(i).getPrecio(),
                                filtroList.get(i).getDescripcionHabitacion(),
                                filtroList.get(i).getCaracteristicasHabitacion1(),
                                filtroList.get(i).getCaracteristicasHabitacion2(),
                                filtroList.get(i).getCaracteristicasVistas1(),
                                filtroList.get(i).getCaracteristicasVistas2(),
                                filtroList.get(i).getCaracteristicasBaño1(),
                                filtroList.get(i).getCaracteristicasBaño2(),
                                filtroList.get(i).getCaracteristicasEquipamiento1(),
                                filtroList.get(i).getCaracteristicasEquipamiento2(),
                                filtroList.get(i).getFoto1(),
                                filtroList.get(i).getFoto2(),
                                filtroList.get(i).getFoto3(),
                                filtroList.get(i).getFoto4(),
                                filtroList.get(i).getFoto5(),
                                filtroList.get(i).getFoto6());


                        filtro.add(c);
                    }
                }
                resulst.count= filtro.size();
                resulst.values = filtro;
            }else{
                resulst.count= filtroList.size();
                resulst.values = filtroList;
            }

            return resulst;
        }

        @Override
        protected void publishResults(CharSequence constraint, Filter.FilterResults results) {
            mdatos = (ArrayList<Habitacionesitems.habitacionesItems>) results.values;
            notifyDataSetChanged();

        }
    }
}
