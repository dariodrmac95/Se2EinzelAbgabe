package com.example.dario.einzelphasese2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button testBtn;
    private TextView resultatTextView;
    EditText stringTestOne;

    public static boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString()); }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testBtn = (Button) findViewById(R.id.testBtn);
        stringTestOne = (EditText) findViewById(R.id.stringEingabe);
        resultatTextView = (TextView) findViewById(R.id.ausgabe);


        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String palindrome = stringTestOne.getText().toString();

                if (palindrome.length() < 5) {
                    resultatTextView.setText("Eingabe ist zu kurz!");
                    return;
                }
                if (isPalindrome(palindrome)) {
                    resultatTextView.setText("Die Eingabe ist ein Palindrome!");
                    return;
                }
                if (palindrome.contains(" ")) {
                    resultatTextView.setText("Eingabe darf keine Leerzeichen haben!");
                    return;
                }else {
                    resultatTextView.setText("Die Eingabe ist kein Palindrome!");
                    return;
                }

            }
        });
    }
}
