/*
 * Copyright 2016 Toxic Bakery
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ToxicBakery.android.version;

import android.os.Build;
import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Is implements SdkVersion {

    public static boolean greaterThan(@AndroidVersion int version) {
        return Build.VERSION.SDK_INT > version;
    }
    
    public static boolean lessThan(@AndroidVersion int version) {
        return Build.VERSION.SDK_INT < version;
    }
    
    public static boolean greaterThanOrEqual(@AndroidVersion int version) {
        return Build.VERSION.SDK_INT >= version;
    }
    
    public static boolean lessThanOrEqual(@AndroidVersion int version) {
        return Build.VERSION.SDK_INT <= version;
    }
    
    @SuppressWarnings("ResourceType")
    public static boolean equal(@AndroidVersion int version) {
        return Build.VERSION.SDK_INT == version;
    }

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({
            MARSHMALLOW,
            LOLLIPOP_MR1,
            LOLLIPOP,
            KITKAT_WATCH,
            KITKAT,
            JELLY_BEAN_MR2,
            JELLY_BEAN_MR1,
            JELLY_BEAN,
            ICE_CREAM_SANDWICH_MR1,
            ICE_CREAM_SANDWICH,
            HONEYCOMB_MR2,
            HONEYCOMB_MR1,
            HONEYCOMB,
            GINGERBREAD_MR1,
            GINGERBREAD,
            FROYO,
            ECLAIR_MR1,
            ECLAIR_0_1,
            ECLAIR,
            DONUT,
    })
    public @interface AndroidVersion {
    }
    
}
