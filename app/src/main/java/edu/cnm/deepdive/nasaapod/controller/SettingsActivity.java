package edu.cnm.deepdive.nasaapod.controller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;
import edu.cnm.deepdive.nasaapod.R;

public class SettingsActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
  }
  // Must implement any methods that are abstract. Alt enter when red.
  public static class SettingsFragment extends PreferenceFragmentCompat {

    // When loaded, it asks what settings resource we want to use.
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
      // Preferences can be saved, can have root for preferences and sub.
      // When we save, we use a key.
      setPreferencesFromResource(R.xml.settings, rootKey);
    }
  }

}
