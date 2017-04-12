/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.internal.util;

import java.util.Arrays;

/**
 * Object utility methods.
 */
public class Objects {

    /**
     * Determines whether two possibly-null objects are equal. Returns:
     * <p/>
     * <ul>
     * <li>{@code true} if {@code a} and {@code b} are both null.
     * <li>{@code true} if {@code a} and {@code b} are both non-null and they are
     * equal according to {@link Object#equals(Object)}.
     * <li>{@code false} in all other situations.
     * </ul>
     * <p/>
     * <p>This assumes that any non-null objects passed to this function conform
     * to the {@code equals()} contract.
     */
    public static boolean equal(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    /**
     * Generates a hash code for multiple values. The hash code is generated by
     * calling {@link java.util.Arrays#hashCode(Object[])}.
     * <p/>
     * <p>This is useful for implementing {@link Object#hashCode()}. For example,
     * in an object that has three properties, {@code x}, {@code y}, and
     * {@code z}, one could write:
     * <pre>
     * public int hashCode() {
     *   return Objects.hashCode(getX(), getY(), getZ());
     * }</pre>
     *
     * <b>Warning</b>: When a single object is supplied, the returned hash code
     * does not equal the hash code of that object.
     */
    public static int hashCode(Object... objects) {
        return Arrays.hashCode(objects);
    }

}
