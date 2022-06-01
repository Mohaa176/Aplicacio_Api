package com.example.loginfirebasemail77;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class homierdos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homierdos);
        Element adsElement = new Element();

        // Llegeix el missatge de la base de dades
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription("Aquesta aplicació ha estat creada per Mohamed i Samuel ,és ideal per trobar les farmàcies de guardia que estiguin disponible a la provincia de Girona. La informació que ofereix aquesta aplicació sempre està en temps real, per tal de poder estar segur de la informació actualitzada.")
                .setImage(R.drawable.int2)
                .addItem(new Element().setTitle("Versió de FarMap: 8.0.3"))
                .addGroup("Contacta amb nosaltres")
                .addEmail("melamrani.dam@institutcampalans.net")
                .addWebsite("https://educacio.gencat.cat/ca/inici/")
                .addYoutube("UCeLIOobhKFdQB5oZxeIMrSw")
                .addPlayStore("cat.gencat.mobi.lamevasalut")
                .addGitHub("Samuu7?tab=repositories")
                .addItem(getCopyRightsElement())
                .create();

        setContentView(aboutPage);
    }


    Element getCopyRightsElement() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.copy_right), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.about_icon_email);
        copyRightsElement.setAutoApplyIconTint(true);
        copyRightsElement.setIconTint(mehdi.sakout.aboutpage.R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.CENTER);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(homierdos.this, copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }
}