package com.example.tablas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Tabla tabla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       tabla= new Tabla((TableLayout)findViewById(R.id.layoutTabla), this);
        tabla.agregarCabecera(R.array.cabecera_tabla);
      /*  for(int i = 0; i < 15; i++)
        {
            ArrayList<String> elementos = new ArrayList<String>();
            elementos.add(Integer.toString(i));
            elementos.add("Casilla [" + i + ", 0]");
            elementos.add("Casilla [" + i + ", 1]");
            elementos.add("Casilla [" + i + ", 2]");
            tabla.agregarFilaTabla(elementos);
        } */
      usuariosPredeterminados();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings)
        {
            agregarUsuario();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void agregarUsuario(){
        LayoutInflater inflater = LayoutInflater.from(this);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        View view = inflater.inflate(R.layout.user_form,null);
        final EditText etNombre = view.findViewById(R.id.etNombre);
        final EditText etMail = view.findViewById(R.id.etMail);
        final EditText etPhone = view.findViewById(R.id.etPhone);
        alert.setTitle("Agregar Usuario");
        alert.setMessage("Ingrese los datos del usuario");
        alert.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ArrayList <String> elementos = new ArrayList<>();
                elementos.add(Integer.toString(tabla.getFilas()));
                elementos.add(etNombre.getText().toString().trim());
                elementos.add(etMail.getText().toString().trim());
                elementos.add(etPhone.getText().toString().trim());
                tabla.agregarFilaTabla(elementos);
            }
        });
        alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //Close alert
            }
        });

        alert.setView(view);
        alert.show();
    }
    private void usuariosPredeterminados(){
        ArrayList<String> user1 = new ArrayList<String>();
        user1.add(Integer.toString(tabla.getFilas()));
        user1.add("dclue0");
        user1.add("jkabsch0@fema.gov");
        user1.add("8379972815 ");
        tabla.agregarFilaTabla(user1);
        ArrayList<String> user2 = new ArrayList<String>();
        user2.add(Integer.toString(tabla.getFilas()));
        user2.add("smacsorley1");
        user2.add("gzeale1@europa.eu");
        user2.add("7299297667");
        tabla.agregarFilaTabla(user2);
        ArrayList<String> user3 = new ArrayList<String>();
        user3.add(Integer.toString(tabla.getFilas()));
        user3.add("pbuckney2");
        user3.add("gabercrombie2@hatena.ne.jp");
        user3.add("1336221751 ");
        tabla.agregarFilaTabla(user3);
        ArrayList<String> user4 = new ArrayList<String>();
        user4.add(Integer.toString(tabla.getFilas()));
        user4.add("tbenson3");
        user4.add("mkittoe3@cbslocal.com");
        user4.add("7026687907");
        tabla.agregarFilaTabla(user4);
        ArrayList<String> user5 = new ArrayList<String>();
        user5.add(Integer.toString(tabla.getFilas()));
        user5.add("hfranchyonok4");
        user5.add("fdibbert4@ning.com");
        user5.add("5739069539");
        tabla.agregarFilaTabla(user5);
        ArrayList<String> user6 = new ArrayList<String>();
        user6.add(Integer.toString(tabla.getFilas()));
        user6.add("pludlow");
        user6.add("jpalmby5@biglobe.ne.jp");
        user6.add("9295140958");
        tabla.agregarFilaTabla(user6);
        ArrayList<String> user7 = new ArrayList<String>();
        user7.add(Integer.toString(tabla.getFilas()));
        user7.add("pbuckney2");
        user7.add("gabercrombie2@hatena.ne.jp");
        user7.add("1336221751 ");
        tabla.agregarFilaTabla(user7);
        ArrayList<String> user8 = new ArrayList<String>();
        user8.add(Integer.toString(tabla.getFilas()));
        user8.add("rfanthome6");
        user8.add("kstreeton6@utexas.edu");
        user8.add("7268595450");
        tabla.agregarFilaTabla(user8);
        ArrayList<String> user9 = new ArrayList<String>();
        user9.add(Integer.toString(tabla.getFilas()));
        user9.add("chigford7");
        user9.add("fromi7@europa.eu");
        user9.add("4249595511");
        tabla.agregarFilaTabla(user9);
        ArrayList<String> user10 = new ArrayList<String>();
        user10.add(Integer.toString(tabla.getFilas()));
        user10.add("bcollick8");
        user10.add("wbromige8@ebay.com");
        user10.add("2548616441");
        tabla.agregarFilaTabla(user10);
        ArrayList<String> user11 = new ArrayList<String>();
        user11.add(Integer.toString(tabla.getFilas()));
        user11.add("dmcgurk9");
        user11.add("nwoodlands9@cbc.ca");
        user11.add("1874002785");
        tabla.agregarFilaTabla(user11);
        ArrayList<String> user12 = new ArrayList<String>();
        user12.add(Integer.toString(tabla.getFilas()));
        user12.add("fwalkletta");
        user12.add("ocrosera@php.net");
        user12.add("4889165792");
        tabla.agregarFilaTabla(user12);
        ArrayList<String> user13 = new ArrayList<String>();
        user13.add(Integer.toString(tabla.getFilas()));
        user13.add("kheineb");
        user13.add("mpresdeeb@slate.com");
        user13.add("2209343696");
        tabla.agregarFilaTabla(user13);
        ArrayList<String> user14 = new ArrayList<String>();
        user14.add(Integer.toString(tabla.getFilas()));
        user14.add("fcocherc");
        user14.add("kgaffneyc@sun.com");
        user14.add("8587682316");
        tabla.agregarFilaTabla(user14);
        ArrayList<String> user15 = new ArrayList<String>();
        user15.add(Integer.toString(tabla.getFilas()));
        user15.add("apietersend");
        user15.add("hkidd@narod.ru");
        user15.add("9595637646");
        tabla.agregarFilaTabla(user15);

    }
}
