package com.termux.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private View chatSidebar;
    private Button sendButton;
    private EditText chatInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        chatSidebar = findViewById(R.id.chat_sidebar);
        sendButton = findViewById(R.id.send_button);
        chatInput = findViewById(R.id.chat_input);

        // דוגמה: פותח את הצ'אט בלחיצה כפולה (להחליף לאירוע רלוונטי)
        chatSidebar.setVisibility(View.VISIBLE);

        sendButton.setOnClickListener(v -> {
            String msg = chatInput.getText().toString();
            // TODO: שלח את ההודעה לבוט
            chatInput.setText("");
        });
    }
}