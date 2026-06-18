package ru.practice.smartbasket;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    public void openMainScreen(View view) {
        setContentView(R.layout.main_activity);
        showMessage(R.string.toast_main);
    }

    public void openShoppingScreen(View view) {
        setContentView(R.layout.shopping_activity);
    }

    public void openSettingsScreen(View view) {
        setContentView(R.layout.settings_activity);
    }

    public void addProduct(View view) {
        showMessage(R.string.toast_add);
    }

    public void clearProductForm(View view) {
        showMessage(R.string.toast_clear);
    }

    public void scheduleDelivery(View view) {
        showMessage(R.string.toast_delivery);
    }

    public void showFavorites(View view) {
        showMessage(R.string.toast_favorites);
    }

    public void saveSettings(View view) {
        showMessage(R.string.toast_save_settings);
    }

    public void resetSettings(View view) {
        showMessage(R.string.toast_reset_settings);
    }

    private void showMessage(int messageResId) {
        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();
    }
}
