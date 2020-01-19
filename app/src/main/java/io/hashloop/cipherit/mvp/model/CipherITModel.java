package io.hashloop.cipherit.mvp.model;

import android.support.annotation.Nullable;

import io.hashloop.cipherit.mvp.view.CipherITView;

public interface CipherITModel {

    interface Callback {
        void onResult(String processedText);
        void onError();
    }

    void onDestroy(@CipherITView.Mode int lastMode,
                   @Nullable String lastPassphrase,
                   boolean isLastPassphraseSaved,
                   boolean isLastPassphraseVisible,
                   @Nullable String lastOriginalText);

    @CipherITView.Mode int getLastMode();
    @Nullable
    String getLastPassphrase();
    boolean isLastPassphraseSaved();
    boolean isLastPassphraseVisible();
    @Nullable
    String getLastOriginalText();

    void encrypt(String passphrase, String plainText, Callback callback);
    void decrypt(String passphrase, String encryptedText, Callback callback);

}
