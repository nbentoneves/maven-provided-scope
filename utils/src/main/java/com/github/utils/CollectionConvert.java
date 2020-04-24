package com.github.utils;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class CollectionConvert {

    private CollectionConvert() {
    }

    public static Map<Integer, String> convert(List<String> list) {
        return Maps.uniqueIndex(list, new Function<String, Integer>() {

            private final AtomicInteger index = new AtomicInteger(0);

            public Integer apply(@Nullable String value) {
                return index.getAndIncrement();
            }
        });
    }

}
