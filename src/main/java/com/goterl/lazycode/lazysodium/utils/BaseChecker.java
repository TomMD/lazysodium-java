/*
 * Copyright (c) Terl Tech Ltd • 03/05/18 10:52 • goterl.com
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at http://mozilla.org/MPL/2.0/.
 */

package com.goterl.lazycode.lazysodium.utils;

public class BaseChecker {

    public static boolean isBetween(long num, long min, long max) {
        return min <= num && num <= max;
    }

    public static boolean correctLen(long num, long len) {
        return num == len;
    }

}
