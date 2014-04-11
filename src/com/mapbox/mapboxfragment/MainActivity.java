package com.mapbox.mapboxfragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLngBounds;
import com.mapbox.mapboxfragment.R;

public class MainActivity extends Activity {
    //private GoogleMap gmap;
    //private LatLngBounds bounds;
    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(new MapboxView(getApplicationContext(), "musiccitycenter.ha727h06"));
        setContentView(R.layout.map_fragment);

        //gmap = ((MapFragment) getFragmentManager().findFragmentById(R.id.mapFragment)).getMap();
        //gmap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(36.157158, -86.777326), 15));

        //new TileLoader().execute();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();

        MapboxFragment fragment = (MapboxFragment) getFragmentManager().findFragmentById(R.id.mapFragment);

        fragment.setMapID("musiccitycenter.vqloko6r");
    }
}
