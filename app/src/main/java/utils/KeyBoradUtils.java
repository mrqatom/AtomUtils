package utils;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by BILL on 2016/11/24.
 * email:tangbaozi@daotangbill.uu.me
 * 用于管理 软键盘的 状态的工具
 *
 * @author atom
 * @version 1.0
 */
public class KeyBoradUtils {

    /**
     * @param context activity
     */
    public static void hideKeyboard(Activity context) {
        InputMethodManager inputMethodManager = getInputMethodManager(context);
        if (context.getWindow().getAttributes().softInputMode !=
                WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN) {
            if (context.getCurrentFocus() != null)
                inputMethodManager.hideSoftInputFromWindow(context.getCurrentFocus()
                        .getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    /**
     * @param context activity
     */
    public static void showKeyBoard(Activity context) {
        InputMethodManager inputMethodManager = getInputMethodManager(context);
        if (inputMethodManager.isActive()) {
            inputMethodManager.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    /**
     * 获取 软键盘的管理者
     *
     * @param context activity
     * @return InputMethodManager
     */
    private static InputMethodManager getInputMethodManager(Activity context) {
        return (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
    }
}
