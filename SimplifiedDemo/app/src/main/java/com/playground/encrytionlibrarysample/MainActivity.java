package com.playground.encrytionlibrarysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.thz.keystorehelper.KeyStoreManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testLibrary();
    }

    void testLibrary()
    {
        String TAG="LibraryTest";

        KeyStoreManager keyStoreManager=KeyStoreManager.getInstance(this);

        String randomPhrase="finally its working";

        Log.d(TAG, "testLibrary: phrase - "+randomPhrase);

        String encrypt=keyStoreManager.encryptData(randomPhrase,"newUser2");

        Log.d(TAG, "testLibrary: encrypted data - "+encrypt);

        String decrypt=keyStoreManager.decryptData(encrypt,"newUser2");

        Log.d(TAG, "testLibrary: decrypted using same alias - "+decrypt);




    }
}
