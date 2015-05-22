package com.ci.inject;

import android.content.Context;

/**
 * Created by fshamim on 07.05.15.
 */
public interface Injectable {
    /**
     * perform the injection in the given context
     * @param context of activity, services, receivers
     */
    void performInjection(Context context);
}
