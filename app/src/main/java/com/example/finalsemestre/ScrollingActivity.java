package com.example.finalsemestre;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import com.example.finalsemestre.databinding.ActivityScrollingBinding;

public class ScrollingActivity extends AppCompatActivity {
    TextView txt,txtPrecio,txtDesc,txthab1,txthab2,txtvist1,txtvist2,txtbaño1,txtbaño2,txtequih1,txtequih2;
    ImageView ft1,ft2,ft3,ft4,ft5,ft6;
    Button btnreservahabitacion;
    String aiuda;
    CollapsingToolbarLayout img;
    private ActivityScrollingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityScrollingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle("Cusco");

        ft1=findViewById(R.id.imgImagen1);
        ft2=findViewById(R.id.imgImagen2);
        ft3=findViewById(R.id.imgImagen3);
        ft4=findViewById(R.id.imgImagen4);
        ft5=findViewById(R.id.imgImagen5);
        ft6=findViewById(R.id.imgImagen6);

        img=findViewById(R.id.toolbar_layout);
        txt=findViewById(R.id.txtTituloHabitacion);
        txtPrecio=findViewById(R.id.txtPrecioReserva);
        txtDesc=findViewById(R.id.txtDescripcionHabitacion);
        txthab1=findViewById(R.id.txtCaracteristicasHabitacion1);
        txthab2=findViewById(R.id.txtCaracteristicasHabitacion2);
        txtvist1=findViewById(R.id.txtCaracteristicasVistas1);
        txtvist2=findViewById(R.id.txtCaracteristicasVistas2);
        txtbaño1=findViewById(R.id.txtCaracteristicasBaño1);
        txtbaño2=findViewById(R.id.txtCaracteristicasBaño2);
        txtequih1=findViewById(R.id.txtCaracteristicasEquipamiento1);
        txtequih2=findViewById(R.id.txtCaracteristicasEquipamiento2);


        Bundle bundle=getIntent().getExtras();
        String info=bundle.getString("holas");
        String prec=bundle.getString("holass");
        String titul=bundle.getString("titulo");
        String descrip=bundle.getString("descripcionh");
        String habitacion1=bundle.getString("carach1");
        String habitacion2=bundle.getString("carach2");
        String vista1=bundle.getString("vistas1");
        String vista2=bundle.getString("vistas2");
        String bano1=bundle.getString("baño1");
        String bano2=bundle.getString("baño2");
        String equipamiento1=bundle.getString("equih1");
        String equipamiento2=bundle.getString("equih2");
        Integer imgage=bundle.getInt("imagen");
        Integer fot1 = bundle.getInt("fotito1");
        Integer fot2 = bundle.getInt("fotito2");
        Integer fot3 = bundle.getInt("fotito3");
        Integer fot4 = bundle.getInt("fotito4");
        Integer fot5 = bundle.getInt("fotito5");
        Integer fot6 = bundle.getInt("fotito6");

        txthab1.setText(habitacion1);
        txthab2.setText(habitacion2);
        txtvist1.setText(vista1);
        txtvist2.setText(vista2);
        txtbaño1.setText(bano1);
        txtbaño2.setText(bano2);
        txtequih1.setText(equipamiento1);
        txtequih2.setText(equipamiento2);
        img.setBackgroundResource(imgage);
        txt.setText(titul);
        txtPrecio.setText(prec);
        txtDesc.setText(descrip);

        toolBarLayout.setTitle(titul);

        ft1.setImageResource(fot1);
        ft2.setImageResource(fot2);
        ft3.setImageResource(fot3);
        ft4.setImageResource(fot4);
        ft5.setImageResource(fot5);
        ft6.setImageResource(fot6);




    }



    public void reservaaaaaa(View view) {
        aiuda="https://www.booking.com/hotel/pe/hostal-amakonkay.es.html?aid=356938;label=metagha-link-LUPE-hotel-6982106_dev-desktop_los-1_bw-8_dow-Wednesday_defdate-1_room-0_gstadt-2_rateid-0_aud-6636035226_gacid-6642513102_mcid-10_ppa-0_clrid-0_ad-1_gstkid-0_checkin-20211222_lp-20801_r-14372550721049933648;sid=4133c87a5fa3115590bd0071baebcc45;all_sr_blocks=698210601_287896244_2_1_0;checkin=2021-12-22;checkout=2021-12-23;dest_id=-353770;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=0;highlighted_blocks=698210601_287896244_2_1_0;hpos=0;matching_block_id=698210601_287896244_2_1_0;no_rooms=1;req_adults=2;req_children=0;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=698210601_287896244_2_1_0__3312;srepoch=1639514332;srpvid=8134912dc1650232;type=total;ucfs=1&#hotelTmpl";
        Uri link = Uri.parse(aiuda);
        Intent i = new Intent(Intent.ACTION_VIEW,link);
        startActivity(i);

    }


    public void enviar(int i){
        Bundle bundle=getIntent().getExtras();
        Integer fot1 = bundle.getInt("fotito1");
        Integer fot2 = bundle.getInt("fotito2");
        Integer fot3 = bundle.getInt("fotito3");
        Integer fot4 = bundle.getInt("fotito4");
        Integer fot5 = bundle.getInt("fotito5");
        Integer fot6 = bundle.getInt("fotito6");

        Intent intent = new Intent(ScrollingActivity.this, MainActivity.class);
        if(i==1)
            intent.putExtra("iimg1", fot1);
        else if(i==2)
            intent.putExtra("iimg1", fot2);
        else if(i==3)
            intent.putExtra("iimg1", fot3);
        else if(i==4)
            intent.putExtra("iimg1", fot4);
        else if(i==5)
            intent.putExtra("iimg1", fot5);
        else if(i==6)
            intent.putExtra("iimg1", fot6);
        startActivity(intent);
    }

    public void img1(View view) {
        enviar(1);
    }

    public void img2(View view) {
        enviar(2);
    }

    public void img3(View view) {
        enviar(3);
    }

    public void img4(View view) {
        enviar(4);
    }

    public void img5(View view) {
        enviar(5);
    }

    public void img6(View view) {
        enviar(6);
    }


}
























