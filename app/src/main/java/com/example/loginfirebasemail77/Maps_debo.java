package com.example.loginfirebasemail77;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.loginfirebasemail77.databinding.ActivityMapsDeboBinding;

public class Maps_debo extends FragmentActivity implements  OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener {

    private GoogleMap mMap;
    private ActivityMapsDeboBinding binding;
    private Marker infowindow,farma1,farma2,farma3,farma4,farma5,farma6,farma7,farma8,farma9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsDeboBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {



        mMap = googleMap;

        //Afegir Marcador amb les cordenades coresponents
        LatLng Nuria_Ballo_Brotons = new LatLng(42.12033656323884, 2.7635300695371314);
        infowindow = googleMap.addMarker(new MarkerOptions()
                .position(Nuria_Ballo_Brotons)
                .title("Nuria Ballo Brotons")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );

        LatLng Aguer = new LatLng(41.9742672658737, 2.787525298216548);
        farma1 = googleMap.addMarker(new MarkerOptions()
                .position(Aguer)
                .title("Farmàcia Aguer")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );

        LatLng Franch = new LatLng(41.956083750606574, 2.636915940544914);
        farma2 = googleMap.addMarker(new MarkerOptions()
                .position(Franch)
                .title("Farmàcia Franch")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );

        LatLng ortopedia = new LatLng(41.977353631047954, 2.8135081695333692);
        farma3 = googleMap.addMarker(new MarkerOptions()
                .position(ortopedia)
                .title("Ortopedia Quintana")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );

        LatLng palau = new LatLng(41.98210890507701, 2.8187949982167306);
        farma4 = googleMap.addMarker(new MarkerOptions()
                .position(palau)
                .title("Farmàcia Palau")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );


        LatLng Borrell = new LatLng(41.97661831119177, 2.8243026693810185);
        farma5 = googleMap.addMarker(new MarkerOptions()
                .position(Borrell)
                .title("Farmacia Mont Borrell")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );

        LatLng Montserrat = new LatLng(41.97110408591446, 2.8382935693808813);
        farma6 = googleMap.addMarker(new MarkerOptions()
                .position(Montserrat)
                .title("Farmacia Montserrat Guixeras")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );

        LatLng Arpa = new LatLng(41.97516076195373, 2.8028088219052867);
        farma7 = googleMap.addMarker(new MarkerOptions()
                .position(Arpa)
                .title("Farmacia Arpa Camos")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );

        LatLng Lluis = new LatLng(41.978003734136195, 2.820032998216656);
        farma8 = googleMap.addMarker(new MarkerOptions()
                .position(Lluis)
                .title("Farmacia Lluis Pla Cama")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );

        LatLng Altarriba = new LatLng(41.98337378043788, 2.8240384405456624);
        farma9 = googleMap.addMarker(new MarkerOptions()
                .position(Altarriba)
                .title("Farmacia Altarriba")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );





        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Lluis, 12 ), 5000, null);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        //
        googleMap.setOnInfoWindowClickListener(this);

    }

    @Override
    //Afegir finestra de informació
    public void onInfoWindowClick(@NonNull Marker marker) {

        if (marker.equals(infowindow)) {

            Farmacia1.newInstance(marker.getTitle(),
                    getString(R.string.Nuriainfo))
                    .show(getSupportFragmentManager(), null);
        }

        if (marker.equals(farma1)) {

            Farmacia1.newInstance(marker.getTitle(),
                    getString(R.string.aguerinfo))
                    .show(getSupportFragmentManager(), null);
        }

        if (marker.equals(farma2)) {

            Farmacia1.newInstance(marker.getTitle(),
                    getString(R.string.franchinfo))
                    .show(getSupportFragmentManager(), null);
        }

        if (marker.equals(farma3)) {

            Farmacia1.newInstance(marker.getTitle(),
                    getString(R.string.quintanainfo))
                    .show(getSupportFragmentManager(), null);
        }

        if (marker.equals(farma4)) {

            Farmacia1.newInstance(marker.getTitle(),
                    getString(R.string.palauinfo))
                    .show(getSupportFragmentManager(), null);
        }

        if (marker.equals(farma5)) {

            Farmacia1.newInstance(marker.getTitle(),
                    getString(R.string.borellinfo))
                    .show(getSupportFragmentManager(), null);
        }

        if (marker.equals(farma6)) {

            Farmacia1.newInstance(marker.getTitle(),
                    getString(R.string.guixerasinfo))
                    .show(getSupportFragmentManager(), null);
        }

        if (marker.equals(farma7)) {

            Farmacia1.newInstance(marker.getTitle(),
                    getString(R.string.camosinfo))
                    .show(getSupportFragmentManager(), null);
        }

        if (marker.equals(farma8)) {

            Farmacia1.newInstance(marker.getTitle(),
                    getString(R.string.camainfo))
                    .show(getSupportFragmentManager(), null);
        }

        if (marker.equals(farma9)) {

            Farmacia1.newInstance(marker.getTitle(),
                    getString(R.string.altainfo))
                    .show(getSupportFragmentManager(), null);
        }


    }
}