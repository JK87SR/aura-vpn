package com.auravpn.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);
        layout.setBackgroundColor(Color.rgb(8, 12, 22));

        TextView title = new TextView(this);
        title.setText("AURA VPN");
        title.setTextSize(32);
        title.setTypeface(null, Typeface.BOLD);
        title.setTextColor(Color.rgb(0, 255, 150));
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("HACKER PRO • PREMIUM");
        subtitle.setTextSize(14);
        subtitle.setTextColor(Color.WHITE);
        subtitle.setGravity(Gravity.CENTER);

        TextView server = new TextView(this);
        server.setText("\n🌍 Serveur : Allemagne");
        server.setTextSize(18);
        server.setTextColor(Color.WHITE);
        server.setGravity(Gravity.CENTER);

        Button connect = new Button(this);
        connect.setText("CONNECTER");
        connect.setTextColor(Color.BLACK);
        connect.setBackgroundTintList(
            android.content.res.ColorStateList.valueOf(
                Color.rgb(0, 255, 150)
            )
        );

        connect.setOnClickListener(v ->
            Toast.makeText(
                this,
                "Tunnel VPN non configuré",
                Toast.LENGTH_LONG
            ).show()
        );

        TextView footer = new TextView(this);
        footer.setText("\nby Kenzo Inc²³ DEV");
        footer.setTextSize(14);
        footer.setTextColor(Color.GRAY);
        footer.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(subtitle);
        layout.addView(server);

        LinearLayout.LayoutParams params =
            new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            );

        params.setMargins(0, 40, 0, 20);
        layout.addView(connect, params);
        layout.addView(footer);

        setContentView(layout);
    }
}