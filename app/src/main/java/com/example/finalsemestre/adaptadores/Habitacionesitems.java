package com.example.finalsemestre.adaptadores;

import com.example.finalsemestre.R;

import java.util.ArrayList;
import java.util.List;

public class Habitacionesitems {
    // declaro el arreglo
    private static final List<habitacionesItems> ITEMS = new ArrayList<habitacionesItems>();
    //contenido del arreglo

    static {
        addItem(new Habitacionesitems.habitacionesItems ("1","Deluxe", R.drawable.deluxe1,"1","si","TV , Calefaccion, Netflix...","169","Vistas a un patio interior, Patio, Baño privado, TV de pantalla plana.","✓ Tamaño 13 m²\n✓ 1 cama extragrande","✓ TV satelital\n✓ Entrada privada","✓ Vistas a un patio interior","","✓ WC\n✓ Ducha\n✓ Toallas\n✓ Secador de Pelo","✓ Toallas / sabanas\n✓ Papel higienico","✓ Toda la unidad en la planta baja\n✓ Camas extralargas (más de 2 metros)\n✓ Armario\n✓ Desinfectante de manos\n✓ Juegos de mesa / puzles\n✓ Barandillas de seguridad para bebés\n✓ Entrada privada\n✓ Calefacción\n✓ Ventilador\n✓ Productos de limpieza","✓ Sofá\n✓ Escritorio\n✓ Servicio de streaming (como Netflix)\n✓ TV\n✓ Canales vía satélite\n✓ Radio\n✓ TV de pantalla plana\n✓ Canales por cable\n✓ Patio\n✓ Perchero\n✓ Sofá cama",R.drawable.deluxe1,R.drawable.deluxe2,R.drawable.deluxe3,R.drawable.deluxe4,R.drawable.deluxe5,R.drawable.deluxe6));
        addItem(new Habitacionesitems.habitacionesItems("2","Doble",R.drawable.doble1,"2","si","Patio, Baño privado, TV...","169","Vistas a un patio interior, Patio, Baño privado, TV de pantalla plana.","✓ Tamaño 14 m²\n2 camas individuales\n✓ TV de pantalla plana","✓ Sofá\n✓ Acceso privado","✓ Vistas a un patio interior","","✓ WC\n✓ Bañera o ducha\n✓ Toallas\n✓ Secador de pelo","✓ Toallas / sábanas (por un suplemento)\n✓ Papel higiénico","✓ Toda la unidad en la planta baja\n✓ Camas extralargas (más de 2 metros)\n✓ Vestidor\n✓ Desinfectante de manos\n✓ Juegos de mesa / puzzles\n✓ Barandillas de seguridad para bebés\n✓ Entrada privada\n✓ Plancha para ropa\n✓ Calefacción\n✓ Ventilador\n✓ Productos de limpieza","✓ Sofá\n✓ Servicio de streaming (como Netflix)\n✓ TV\n✓ Radio\n✓ TV de pantalla plana\n✓ Zona de comedor exterior\n✓ Patio\n✓ Enchufe cerca de la cama\n✓ Perchero\n✓ Servicio de despertador",R.drawable.doble1,R.drawable.doble2,R.drawable.doble3,R.drawable.doble4,R.drawable.doble5,R.drawable.doble6));

        addItem(new Habitacionesitems.habitacionesItems("3","Triple", R.drawable.triple1,"3","si","Balcón, Baño privado, TV...","228","Balcón, Vistas a la montaña, Vistas a la ciudad, Aire acondicionado, Baño privado, TV de pantalla plana, Terraza.","✓ 16 m²\n✓ 3 camas individuales\n✓ Balcón","✓ Entrada privada\n✓ Zona de comedor.","✓ Vistas a la montaña","✓ Vistas a la ciudad","✓ WC\n✓ Bañera o ducha\n✓ Toallas\n✓ Secador de pelo","✓ Toallas / sábanas (por un suplemento)\n✓ Papel higiénico","✓ Toda la unidad en la planta baja\n✓ Armario\n✓ Desinfectante de manos\n✓ Juegos de mesa / puzles\n✓ Barandillas de seguridad para bebés\n✓ Aire acondicionado\n✓ Suelo de baldosa / mármol\n✓ Entrada privada\n✓ Equipo de planchado\n✓ Plancha para ropa\n✓ Calefacción\n✓ Ventilador\n✓ Productos de limpieza\n✓ Sofá","✓ Zona de comedor\n✓ Servicio de streaming (como Netflix)\n✓ TV\n✓ Canales vía satélite\n✓ Radio\n✓ Canales de pago\n✓ TV de pantalla plana\n✓ Canales por cable\n✓ Balcón\n✓ Terraza\n✓ Muebles de exterior\n✓ Zona de comedor exterior\n✓ Enchufe cerca de la cama\n✓ Perchero", R.drawable.triple1, R.drawable.triple2, R.drawable.triple3, R.drawable.triple4, R.drawable.triple5, R.drawable.triple6));

        addItem(new Habitacionesitems.habitacionesItems("4","Cuadruple", R.drawable.cuadruple1,"4","si","Balcón, Baño privado, TV...","299","Balcón, Vistas a la montaña, Vistas a un lugar de interés, Vistas a la ciudad, Vistas a un patio interior, Baño privado, TV de pantalla plana.","✓ Tamaño 20 m²\n✓ 4 camas individuales\n✓ TV de pantalla plana","✓ Sofá\n✓ Acceso privado","✓ Vistas a la montaña\n✓ Vistas a un lugar de interés","✓ Vistas a la ciudad\n✓ Vistas a un patio interior","✓ Baño adicional\n✓ WC\n✓ Bañera o ducha","✓ Toallas\n✓ Secador de pelo\n✓ Papel higiénico","✓ Toda la unidad en la planta baja\n✓ Armario\n✓ Desinfectante de manos\n✓ Juegos de mesa / puzzles\n✓ Barandillas de seguridad para bebés\n✓ Entrada privada\n✓ Plancha para ropa\n✓ Calefacción\n✓ Ventilador\n✓ Productos de limpieza\n✓ Sofá","✓ Zona de comedor\n✓ Servicio de streaming (como Netflix)\n✓ TV\n✓ Canales vía satélite\n✓ Radio\n✓ TV de pantalla plana\n✓ Canales por cable\n✓ Balcón\n✓ Zona de comedor exterior\n✓ Enchufe cerca de la cama\n✓ Perchero", R.drawable.cuadruple1, R.drawable.cuadruple2, R.drawable.cuadruple3, R.drawable.cuadruple4, R.drawable.cuadruple5, R.drawable.cuadruple6));

        addItem(new Habitacionesitems.habitacionesItems("5","Familiar", R.drawable.familiar2camas1,"2","si","Baño privado,TV","244","Baño privado,TV de pantalla plana","✓ 16 m²\n✓ Entrada privada","✓ sofá","✓ Vistas","","✓ Baño adicional\n✓ WC\n✓ Bañera o ducha\n✓ Toallas\n✓ Secador de pelo","✓ Aseo adicional\n✓ Toallas / sábanas (por un suplemento)\n✓ Papel higiénico","✓ Acceso a pisos superiores solo mediante escaleras\n✓ Armario\n✓ Desinfectante de manos\n✓ Juegos de mesa / puzzles\n✓ Barandillas de seguridad para bebés\n✓ Entrada privada\n✓ Plancha para ropa\n✓ Calefacción\n✓ Productos de limpieza","✓ Sofá\n✓ Servicio de streaming (como Netflix)\n✓ Vídeo\n✓ TV\n✓ Canales vía satélite\n✓ Radio\n✓ TV de pantalla plana\n✓ Perchero", R.drawable.familiar2camas1, R.drawable.familiar2camas2, R.drawable.familiar2camas3, R.drawable.familiar2camas4, R.drawable.familiar2camas5, R.drawable.familiar2camas6));

        addItem(new Habitacionesitems.habitacionesItems("6","Familiar", R.drawable.ffamiliar1,"5","si","Balcón, Baño privado, TV...","322","Balcón, Vistas al jardín, Vistas a la montaña, Vistas a un lugar de interés, Vistas a la ciudad, Vistas a un patio interior, Aire acondicionado, Baño privado, TV de pantalla plana.","✓ 20 m²\n✓ 5 camas individuales","✓ Balcón","✓ Vistas al jardín\n✓ Vistas a la montaña\n✓ Vistas a un lugar de interés","✓ Vistas a la ciudad\n✓ Vistas a un patio interior","✓ WC\n✓ Bañera o ducha\n✓ Toallas\n✓ Secador de pelo","✓ Toallas / sábanas (por un suplemento)\n✓ Papel higiénico","✓ Toda la unidad en la planta baja\n✓ Camas extralargas (más de 2 metros)\n✓ Vestidor\n✓ Armario\n✓ Desinfectante de manos\n✓ Juegos de mesa / puzzles\n✓ Barandillas de seguridad para bebés\n✓ Aire acondicionado\n✓ Suelo de baldosa / mármol\n✓ Entrada privada\n✓ Calefacción\n✓ Ventilador\n✓ Suelo de moqueta","✓ Mesa de comedor\n✓ Productos de limpieza\n✓ Sofá\n✓ Zona de comedor\n✓ Servicio de streaming (como Netflix)\n✓ Vídeo\\n✓ TV\n✓ Canales vía satélite\n✓ Radio\n✓ Canales de pago\n✓ TV de pantalla plana\n✓ Balcón\n✓ Enchufe cerca de la cama\n✓ Perchero", R.drawable.ffamiliar1, R.drawable.ffamiliar2, R.drawable.ffamiliar3, R.drawable.ffamiliar4, R.drawable.ffamiliar5, R.drawable.ffamiliar6));
    }

    //metodo que contruye el arreglo , metodo principal
    static void addItem(Habitacionesitems.habitacionesItems item){
        ITEMS.add(item);
    }
    // metodo para agregar objetos
    public static ArrayList<Habitacionesitems.habitacionesItems> ArregloLista (){
        ArrayList<Habitacionesitems.habitacionesItems> d = new ArrayList<Habitacionesitems.habitacionesItems>();
        for(Habitacionesitems.habitacionesItems obj:ITEMS){
            d.add(obj);
        }
        return d;
    }
    // metodo para traer datos
    public static Habitacionesitems.habitacionesItems getHabitacionesItems(String id){
        for(Habitacionesitems.habitacionesItems obj:ITEMS){
            if (obj.id.equals(id)){
                return obj;
            }
        }
        return ITEMS.get(1); // busqueda título
    }
    // crear arreglo
    public static class habitacionesItems {

        private String id;
        private String titulo;
        private Integer imagen;
        private String camas;
        private String banopriv;
        private String extrass;
        private String precio;

        private String descripcionhabitacion;
        private String caracteristicashabitacion1;
        private String caracteristicashabitacion2;
        private String caracteristicasvistas1;
        private String caracteristicasvistas2;
        private String caracteristicasbaño1;
        private String caracteristicasbaño2;
        private String caracteristicasequipamiento1;
        private String caracteristicasequipamiento2;

        private Integer foto1;
        private Integer foto2;
        private Integer foto3;
        private Integer foto4;
        private Integer foto5;
        private Integer foto6;

        public habitacionesItems(String id,String titulo,Integer imagen,String camas,String banopriv,String extrass,String precio,String descripcionhabitacion,String caracteristicashabitacion1,String caracteristicashabitacion2,String caracteristicasvistas1,String caracteristicasvistas2,String caracteristicasbaño1,String caracteristicasbaño2,String caracteristicasequipamiento1,String caracteristicasequipamiento2, Integer foto1, Integer foto2, Integer foto3, Integer foto4, Integer foto5, Integer foto6){
            this.id = id;
            this.titulo = titulo;
            this.imagen = imagen;
            this.camas = camas;
            this.banopriv = banopriv;
            this.extrass = extrass;
            this.precio = precio;

            this.descripcionhabitacion = descripcionhabitacion;
            this.caracteristicashabitacion1 = caracteristicashabitacion1;
            this.caracteristicashabitacion2 = caracteristicashabitacion2;
            this.caracteristicasvistas1 = caracteristicasvistas1;
            this.caracteristicasvistas2 = caracteristicasvistas2;
            this.caracteristicasbaño1 = caracteristicasbaño1;
            this.caracteristicasbaño2 = caracteristicasbaño2;
            this.caracteristicasequipamiento1 = caracteristicasequipamiento1;
            this.caracteristicasequipamiento2 = caracteristicasequipamiento2;

            this.foto1 = foto1;
            this.foto2 = foto2;
            this.foto3 = foto3;
            this.foto4 = foto4;
            this.foto5 = foto5;
            this.foto6 = foto6;
        }
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {this.titulo = titulo;}

        public Integer getImagen() { return imagen;}
        public void setImagen(Integer imagen) {
            this.imagen = imagen;
        }

        public String getCamas() { return camas; }
        public void setCamas(String camas) { this.camas = camas;}

        public String getBanopriv() {
            return banopriv;
        }
        public void setBanopriv(String banopriv) {this.banopriv = banopriv;}

        public String getExtrass() {
            return extrass;
        }
        public void setExtrass(String extrass) {this.extrass = extrass;}

        public String getPrecio() {
            return precio;
        }
        public void setPrecio(String precio) {this.precio = precio;}

        public String getDescripcionHabitacion() {
            return descripcionhabitacion;
        }
        public void setDescripcionHabitacion(String descripcionhabitacion) {this.descripcionhabitacion = descripcionhabitacion;}

        public String getCaracteristicasHabitacion1() {
            return caracteristicashabitacion1;
        }
        public void setCaracteristicasHabitacion1(String caracteristicashabitacion1) {this.caracteristicashabitacion1 = caracteristicashabitacion1;}

        public String getCaracteristicasHabitacion2() {
            return caracteristicashabitacion2;
        }
        public void setCaracteristicasHabitacion2(String caracteristicashabitacion2) {this.caracteristicashabitacion2 = caracteristicashabitacion2;}


        public String getCaracteristicasVistas1() {return caracteristicasvistas1;}
        public void setCaracteristicasVistas1(String caracteristicasvistas1) {this.caracteristicasvistas1 = caracteristicasvistas1;}

        public String getCaracteristicasVistas2() {return caracteristicasvistas2;}
        public void setCaracteristicasVistas2(String caracteristicasvistas2) {this.caracteristicasvistas2 = caracteristicasvistas2;}

        public String getCaracteristicasBaño1() {
            return caracteristicasbaño1;
        }
        public void setCaracteristicasBaño1(String caracteristicasbaño1) {this.caracteristicasbaño1 = caracteristicasbaño1;}

        public String getCaracteristicasBaño2() {
            return caracteristicasbaño2;
        }
        public void setCaracteristicasBaño2(String caracteristicasbaño2) {this.caracteristicasbaño2 = caracteristicasbaño2;}

        public String getCaracteristicasEquipamiento1() {
            return caracteristicasequipamiento1;
        }
        public void setCaracteristicasEquipamiento1(String caracteristicasequipamiento1) {this.caracteristicasequipamiento1 = caracteristicasequipamiento1;}

        public String getCaracteristicasEquipamiento2() {
            return caracteristicasequipamiento2;
        }
        public void setCaracteristicasEquipamiento2(String caracteristicasequipamiento2) {this.caracteristicasequipamiento2 = caracteristicasequipamiento2;}

        public Integer getFoto1() { return foto1;}
        public void setFoto1(Integer foto1) {this.foto1 = foto1; }

        public Integer getFoto2() { return foto2;}
        public void setFoto2(Integer foto2) {this.foto2 = foto2; }

        public Integer getFoto3() { return foto3;}
        public void setFoto3(Integer foto3) {this.foto3 = foto3; }

        public Integer getFoto4() { return foto4;}
        public void setFoto4(Integer foto4) {this.foto4 = foto4; }

        public Integer getFoto5() { return foto5;}
        public void setFoto5(Integer foto5) {this.foto5 = foto5; }

        public Integer getFoto6() { return foto6;}
        public void setFoto6(Integer foto6) {this.foto6 = foto6; }

    }
}
