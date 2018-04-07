package demo.hxzk.com.customviewdemo.util;

import android.content.Context;

/**
 * 类：PxUtils
 * 作者： zjt
 * 日期：2018/3/5.
 */

public class PxUtils {
    /**
     * px转sp
     * @param context 上下文
     * @param pxValue px
     * @return sp
     */
    public static int px2sp(Context context, float pxValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }
}
