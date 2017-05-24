package com.fyfeng.fy_common;

import android.content.Context;
import android.graphics.Point;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by yuzw on 2017/5/24.
 */

public class Utils {
    public static Point getScreenSize(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Point outSize = new Point();
        windowManager.getDefaultDisplay().getSize(outSize);
        return outSize;
    }
}
