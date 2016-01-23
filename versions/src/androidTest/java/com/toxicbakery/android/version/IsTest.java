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

import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;

import com.ToxicBakery.android.version.Is.AndroidVersion;

import junit.framework.TestCase;

public class IsTest extends TestCase implements SdkVersion {
    
    @SuppressWarnings("ResourceType")
    @AndroidVersion
    static int version() {
        return VERSION.SDK_INT;
    }
    
    public void testGreaterThan() throws Exception {
        assertEquals(version() > VERSION_CODES.M, Is.greaterThan(MARSHMALLOW));
        assertEquals(version() > VERSION_CODES.LOLLIPOP_MR1, Is.greaterThan(LOLLIPOP_MR1));
        assertEquals(version() > VERSION_CODES.LOLLIPOP, Is.greaterThan(LOLLIPOP));
        assertEquals(version() > VERSION_CODES.KITKAT_WATCH, Is.greaterThan(KITKAT_WATCH));
        assertEquals(version() > VERSION_CODES.KITKAT, Is.greaterThan(KITKAT));
        assertEquals(version() > VERSION_CODES.JELLY_BEAN_MR2, Is.greaterThan(JELLY_BEAN_MR2));
        assertEquals(version() > VERSION_CODES.JELLY_BEAN_MR1, Is.greaterThan(JELLY_BEAN_MR1));
        assertEquals(version() > VERSION_CODES.JELLY_BEAN, Is.greaterThan(JELLY_BEAN));
        assertEquals(version() > VERSION_CODES.ICE_CREAM_SANDWICH_MR1, Is.greaterThan(ICE_CREAM_SANDWICH_MR1));
        assertEquals(version() > VERSION_CODES.ICE_CREAM_SANDWICH, Is.greaterThan(ICE_CREAM_SANDWICH));
        assertEquals(version() > VERSION_CODES.HONEYCOMB_MR2, Is.greaterThan(HONEYCOMB_MR2));
        assertEquals(version() > VERSION_CODES.HONEYCOMB_MR1, Is.greaterThan(HONEYCOMB_MR1));
        assertEquals(version() > VERSION_CODES.HONEYCOMB, Is.greaterThan(HONEYCOMB));
        assertEquals(version() > VERSION_CODES.GINGERBREAD_MR1, Is.greaterThan(GINGERBREAD_MR1));
        assertEquals(version() > VERSION_CODES.GINGERBREAD, Is.greaterThan(GINGERBREAD));
        assertEquals(version() > VERSION_CODES.FROYO, Is.greaterThan(FROYO));
        assertEquals(version() > VERSION_CODES.ECLAIR_MR1, Is.greaterThan(ECLAIR_MR1));
        assertEquals(version() > VERSION_CODES.ECLAIR_0_1, Is.greaterThan(ECLAIR_0_1));
        assertEquals(version() > VERSION_CODES.ECLAIR, Is.greaterThan(ECLAIR));
        assertEquals(version() > VERSION_CODES.DONUT, Is.greaterThan(DONUT));
    }
    
    public void testLessThan() throws Exception {
        assertEquals(version() < VERSION_CODES.M, Is.lessThan(MARSHMALLOW));
        assertEquals(version() < VERSION_CODES.LOLLIPOP_MR1, Is.lessThan(LOLLIPOP_MR1));
        assertEquals(version() < VERSION_CODES.LOLLIPOP, Is.lessThan(LOLLIPOP));
        assertEquals(version() < VERSION_CODES.KITKAT_WATCH, Is.lessThan(KITKAT_WATCH));
        assertEquals(version() < VERSION_CODES.KITKAT, Is.lessThan(KITKAT));
        assertEquals(version() < VERSION_CODES.JELLY_BEAN_MR2, Is.lessThan(JELLY_BEAN_MR2));
        assertEquals(version() < VERSION_CODES.JELLY_BEAN_MR1, Is.lessThan(JELLY_BEAN_MR1));
        assertEquals(version() < VERSION_CODES.JELLY_BEAN, Is.lessThan(JELLY_BEAN));
        assertEquals(version() < VERSION_CODES.ICE_CREAM_SANDWICH_MR1, Is.lessThan(ICE_CREAM_SANDWICH_MR1));
        assertEquals(version() < VERSION_CODES.ICE_CREAM_SANDWICH, Is.lessThan(ICE_CREAM_SANDWICH));
        assertEquals(version() < VERSION_CODES.HONEYCOMB_MR2, Is.lessThan(HONEYCOMB_MR2));
        assertEquals(version() < VERSION_CODES.HONEYCOMB_MR1, Is.lessThan(HONEYCOMB_MR1));
        assertEquals(version() < VERSION_CODES.HONEYCOMB, Is.lessThan(HONEYCOMB));
        assertEquals(version() < VERSION_CODES.GINGERBREAD_MR1, Is.lessThan(GINGERBREAD_MR1));
        assertEquals(version() < VERSION_CODES.GINGERBREAD, Is.lessThan(GINGERBREAD));
        assertEquals(version() < VERSION_CODES.FROYO, Is.lessThan(FROYO));
        assertEquals(version() < VERSION_CODES.ECLAIR_MR1, Is.lessThan(ECLAIR_MR1));
        assertEquals(version() < VERSION_CODES.ECLAIR_0_1, Is.lessThan(ECLAIR_0_1));
        assertEquals(version() < VERSION_CODES.ECLAIR, Is.lessThan(ECLAIR));
        assertEquals(version() < VERSION_CODES.DONUT, Is.lessThan(DONUT));
    }
    
    public void testGreatThanOrEqual() throws Exception {
        assertEquals(version() >= VERSION_CODES.M, Is.greaterThanOrEqual(MARSHMALLOW));
        assertEquals(version() >= VERSION_CODES.LOLLIPOP_MR1, Is.greaterThanOrEqual(LOLLIPOP_MR1));
        assertEquals(version() >= VERSION_CODES.LOLLIPOP, Is.greaterThanOrEqual(LOLLIPOP));
        assertEquals(version() >= VERSION_CODES.KITKAT_WATCH, Is.greaterThanOrEqual(KITKAT_WATCH));
        assertEquals(version() >= VERSION_CODES.KITKAT, Is.greaterThanOrEqual(KITKAT));
        assertEquals(version() >= VERSION_CODES.JELLY_BEAN_MR2, Is.greaterThanOrEqual(JELLY_BEAN_MR2));
        assertEquals(version() >= VERSION_CODES.JELLY_BEAN_MR1, Is.greaterThanOrEqual(JELLY_BEAN_MR1));
        assertEquals(version() >= VERSION_CODES.JELLY_BEAN, Is.greaterThanOrEqual(JELLY_BEAN));
        assertEquals(version() >= VERSION_CODES.ICE_CREAM_SANDWICH_MR1, Is.greaterThanOrEqual(ICE_CREAM_SANDWICH_MR1));
        assertEquals(version() >= VERSION_CODES.ICE_CREAM_SANDWICH, Is.greaterThanOrEqual(ICE_CREAM_SANDWICH));
        assertEquals(version() >= VERSION_CODES.HONEYCOMB_MR2, Is.greaterThanOrEqual(HONEYCOMB_MR2));
        assertEquals(version() >= VERSION_CODES.HONEYCOMB_MR1, Is.greaterThanOrEqual(HONEYCOMB_MR1));
        assertEquals(version() >= VERSION_CODES.HONEYCOMB, Is.greaterThanOrEqual(HONEYCOMB));
        assertEquals(version() >= VERSION_CODES.GINGERBREAD_MR1, Is.greaterThanOrEqual(GINGERBREAD_MR1));
        assertEquals(version() >= VERSION_CODES.GINGERBREAD, Is.greaterThanOrEqual(GINGERBREAD));
        assertEquals(version() >= VERSION_CODES.FROYO, Is.greaterThanOrEqual(FROYO));
        assertEquals(version() >= VERSION_CODES.ECLAIR_MR1, Is.greaterThanOrEqual(ECLAIR_MR1));
        assertEquals(version() >= VERSION_CODES.ECLAIR_0_1, Is.greaterThanOrEqual(ECLAIR_0_1));
        assertEquals(version() >= VERSION_CODES.ECLAIR, Is.greaterThanOrEqual(ECLAIR));
        assertEquals(version() >= VERSION_CODES.DONUT, Is.greaterThanOrEqual(DONUT));
    }
    
    public void testLessThanOrEqual() throws Exception {
        assertEquals(version() <= VERSION_CODES.M, Is.lessThanOrEqual(MARSHMALLOW));
        assertEquals(version() <= VERSION_CODES.LOLLIPOP_MR1, Is.lessThanOrEqual(LOLLIPOP_MR1));
        assertEquals(version() <= VERSION_CODES.LOLLIPOP, Is.lessThanOrEqual(LOLLIPOP));
        assertEquals(version() <= VERSION_CODES.KITKAT_WATCH, Is.lessThanOrEqual(KITKAT_WATCH));
        assertEquals(version() <= VERSION_CODES.KITKAT, Is.lessThanOrEqual(KITKAT));
        assertEquals(version() <= VERSION_CODES.JELLY_BEAN_MR2, Is.lessThanOrEqual(JELLY_BEAN_MR2));
        assertEquals(version() <= VERSION_CODES.JELLY_BEAN_MR1, Is.lessThanOrEqual(JELLY_BEAN_MR1));
        assertEquals(version() <= VERSION_CODES.JELLY_BEAN, Is.lessThanOrEqual(JELLY_BEAN));
        assertEquals(version() <= VERSION_CODES.ICE_CREAM_SANDWICH_MR1, Is.lessThanOrEqual(ICE_CREAM_SANDWICH_MR1));
        assertEquals(version() <= VERSION_CODES.ICE_CREAM_SANDWICH, Is.lessThanOrEqual(ICE_CREAM_SANDWICH));
        assertEquals(version() <= VERSION_CODES.HONEYCOMB_MR2, Is.lessThanOrEqual(HONEYCOMB_MR2));
        assertEquals(version() <= VERSION_CODES.HONEYCOMB_MR1, Is.lessThanOrEqual(HONEYCOMB_MR1));
        assertEquals(version() <= VERSION_CODES.HONEYCOMB, Is.lessThanOrEqual(HONEYCOMB));
        assertEquals(version() <= VERSION_CODES.GINGERBREAD_MR1, Is.lessThanOrEqual(GINGERBREAD_MR1));
        assertEquals(version() <= VERSION_CODES.GINGERBREAD, Is.lessThanOrEqual(GINGERBREAD));
        assertEquals(version() <= VERSION_CODES.FROYO, Is.lessThanOrEqual(FROYO));
        assertEquals(version() <= VERSION_CODES.ECLAIR_MR1, Is.lessThanOrEqual(ECLAIR_MR1));
        assertEquals(version() <= VERSION_CODES.ECLAIR_0_1, Is.lessThanOrEqual(ECLAIR_0_1));
        assertEquals(version() <= VERSION_CODES.ECLAIR, Is.lessThanOrEqual(ECLAIR));
        assertEquals(version() <= VERSION_CODES.DONUT, Is.lessThanOrEqual(DONUT));
    }
    
    @SuppressWarnings("ResourceType")
    public void testEqual() throws Exception {
        assertEquals(version() == VERSION_CODES.M, Is.equal(MARSHMALLOW));
        assertEquals(version() == VERSION_CODES.LOLLIPOP_MR1, Is.equal(LOLLIPOP_MR1));
        assertEquals(version() == VERSION_CODES.LOLLIPOP, Is.equal(LOLLIPOP));
        assertEquals(version() == VERSION_CODES.KITKAT_WATCH, Is.equal(KITKAT_WATCH));
        assertEquals(version() == VERSION_CODES.KITKAT, Is.equal(KITKAT));
        assertEquals(version() == VERSION_CODES.JELLY_BEAN_MR2, Is.equal(JELLY_BEAN_MR2));
        assertEquals(version() == VERSION_CODES.JELLY_BEAN_MR1, Is.equal(JELLY_BEAN_MR1));
        assertEquals(version() == VERSION_CODES.JELLY_BEAN, Is.equal(JELLY_BEAN));
        assertEquals(version() == VERSION_CODES.ICE_CREAM_SANDWICH_MR1, Is.equal(ICE_CREAM_SANDWICH_MR1));
        assertEquals(version() == VERSION_CODES.ICE_CREAM_SANDWICH, Is.equal(ICE_CREAM_SANDWICH));
        assertEquals(version() == VERSION_CODES.HONEYCOMB_MR2, Is.equal(HONEYCOMB_MR2));
        assertEquals(version() == VERSION_CODES.HONEYCOMB_MR1, Is.equal(HONEYCOMB_MR1));
        assertEquals(version() == VERSION_CODES.HONEYCOMB, Is.equal(HONEYCOMB));
        assertEquals(version() == VERSION_CODES.GINGERBREAD_MR1, Is.equal(GINGERBREAD_MR1));
        assertEquals(version() == VERSION_CODES.GINGERBREAD, Is.equal(GINGERBREAD));
        assertEquals(version() == VERSION_CODES.FROYO, Is.equal(FROYO));
        assertEquals(version() == VERSION_CODES.ECLAIR_MR1, Is.equal(ECLAIR_MR1));
        assertEquals(version() == VERSION_CODES.ECLAIR_0_1, Is.equal(ECLAIR_0_1));
        assertEquals(version() == VERSION_CODES.ECLAIR, Is.equal(ECLAIR));
        assertEquals(version() == VERSION_CODES.DONUT, Is.equal(DONUT));
    }
    
}