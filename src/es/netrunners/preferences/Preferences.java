package es.netrunners.preferences;


import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;

public class Preferences extends PreferenceActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.preferences);
        addPreferencesFromResource(R.xml.preferences);
        Preference setting = findPreference("account");
        setting.setIntent(new Intent (getApplicationContext(), SecondActivity.class));
	}
}