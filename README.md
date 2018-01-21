# simplified-demo
Demo app using Encryption Helper Library


Base snippet:


```
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
    ```
