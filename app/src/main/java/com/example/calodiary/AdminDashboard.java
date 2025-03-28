package com.example.calodiary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class AdminDashboard extends AppCompatActivity {

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        mAuth = FirebaseAuth.getInstance();

        Button manageUsersButton = findViewById(R.id.manageUsersButton);
        Button logoutButton = findViewById(R.id.logoutButton);

        manageUsersButton.setOnClickListener(v -> {
            Toast.makeText(this, "Chức năng quản lý người dùng (chưa triển khai)", Toast.LENGTH_SHORT).show();
            // Thêm logic quản lý người dùng ở đây sau
        });

        logoutButton.setOnClickListener(v -> {
            mAuth.signOut();
            Toast.makeText(this, "Đã đăng xuất", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), Login.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}