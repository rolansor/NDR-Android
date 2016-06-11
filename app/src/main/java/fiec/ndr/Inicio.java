package fiec.ndr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void nuevoFormulario(View view) {
        Intent intent = new Intent(this, Nuevo_Formulario.class);
        startActivity(intent);
    }
    public void salirSistema(View view) {
        System.exit(0);
    }
}
