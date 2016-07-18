package com.example.test_force_offline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

    private EditText mAccountEdit, mPasswordEdit;
    private Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        mAccountEdit = (EditText) findViewById(R.id.account);
        mPasswordEdit = (EditText) findViewById(R.id.password);
        mLogin = (Button) findViewById(R.id.login);
        mLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String account = mAccountEdit.getText().toString();
                String password = mPasswordEdit.getText().toString();
                if (account.equals("admin") && password.equals("123456")) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this,
                            "account or password is invalid",
                            Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });
    }
}
