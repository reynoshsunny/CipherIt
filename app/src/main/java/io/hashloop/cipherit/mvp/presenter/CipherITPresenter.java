package io.hashloop.cipherit.mvp.presenter;

public interface CipherITPresenter {

    void onCreate();
    void onDestroy();

    void onPassphraseTextChanged();
    void onOriginalTextChanged();
    void onToggleModeClick();
    void onOriginalClearClick();
    void onClearPassphraseClick();
    void onViewPassphraseClick();
    void onSavePassphraseClick();

}
