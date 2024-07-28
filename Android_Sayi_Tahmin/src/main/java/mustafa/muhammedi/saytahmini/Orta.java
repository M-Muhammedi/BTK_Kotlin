package mustafa.muhammedi.saytahmini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

import java.util.Random;

public class Orta extends AppCompatActivity {
    DrawerLayout drawerLayout;
    MaterialToolbar materialToolbar;
    FrameLayout frameLayout;
    NavigationView navigationView;
    private TextView textViewKalanHak;
    private TextView textViewYardim;
    private EditText editTextGirdi;
    private Button btn_tahmin;
    private int rasgeleSayi;
    private int sayac = 7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_orta);
        tamamla();
        rasgeleorta();

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                Orta.this, drawerLayout, materialToolbar, R.string.drawer_close, R.string.drawer_open);
        drawerLayout.addDrawerListener(toggle);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.home) {
                    Intent i = new Intent(Orta.this,MainActivity.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(Orta.this,R.string.anasayfa, Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (menuItem.getItemId() == R.id.kolay) {
                    Intent i = new Intent(Orta.this,Kolay.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(Orta.this,R.string.kolay, Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (menuItem.getItemId() == R.id.orta) {
                    recreate();
                    Toast.makeText(Orta.this,R.string.orta, Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (menuItem.getItemId() == R.id.zor) {
                    Intent i = new Intent(Orta.this,Zor.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(Orta.this,R.string.zor, Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (menuItem.getItemId() == R.id.menu_uygulama) {
                    Intent i = new Intent(Orta.this,Ugulamah.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(Orta.this,R.string.uygulama_hakinda, Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (menuItem.getItemId() == R.id.menu_cikis) {
                    Toast.makeText(Orta.this,R.string.cikis, Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);

                    AlertDialog.Builder uyareipenceresi = new AlertDialog.Builder(Orta.this);

                    uyareipenceresi.setTitle(R.string.cikis);
                    uyareipenceresi.setMessage(R.string.cikismi);

                    uyareipenceresi.setPositiveButton(R.string.evet, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finishAffinity();
                            System.exit(0);
                        }
                    });
                    uyareipenceresi.setNegativeButton(R.string.hayir, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    uyareipenceresi.show();
                }
                return false;
            }
        });

    }
    public void rasgeleorta(){
        Random r = new Random();
        rasgeleSayi = r.nextInt(101);
        Log.e("Rasgele Sayı",String.valueOf(rasgeleSayi));

        btn_tahmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editTextGirdi.getText().toString().isEmpty()) {
                    // editTextGirdi boş ise Toast mesajı göster
                    Toast.makeText(Orta.this,R.string.birsayigir, Toast.LENGTH_SHORT).show();
                    return; // Metodu burada sonlandır
                }

                sayac = sayac -1;

                int tahmin = Integer.parseInt(editTextGirdi.getText().toString());

                if (sayac !=0){
                    if (tahmin == rasgeleSayi){
                        Intent i = new Intent(Orta.this,Sonuc.class);
                        i.putExtra("sonuc",true);
                        String rasgele1 = String.valueOf(rasgeleSayi);
                        i.putExtra("verigonder",rasgele1);
                        startActivity(i);
                        finish();
                    }
                    if (tahmin > rasgeleSayi){
                        textViewYardim.setText(R.string.azalt);
                    }
                    if (tahmin < rasgeleSayi){
                        textViewYardim.setText(R.string.artir);
                    }
                    textViewKalanHak.setText(String.valueOf(sayac).toString());

                }
                else {

                    Intent i = new Intent(Orta.this, Sonuc.class);
                    i.putExtra("sonuc",false);
                    String rasgele1 = String.valueOf(rasgeleSayi);
                    i.putExtra("verigonder",rasgele1);
                    startActivity(i);
                    finish();
                }
                editTextGirdi.setText("");


            }
        });
    }
    public void tamamla() {
        drawerLayout = findViewById(R.id.draweLayout);
        materialToolbar = findViewById(R.id.materialToolbar);
        frameLayout = findViewById(R.id.frameLayout);
        navigationView = findViewById(R.id.navigationView);
        textViewKalanHak=findViewById(R.id.textViewKalanHak);
        textViewYardim=findViewById(R.id.textViewYardim);
        editTextGirdi=findViewById(R.id.editTextGirdi);
        btn_tahmin = findViewById(R.id.btn_tahmin);


    }
}