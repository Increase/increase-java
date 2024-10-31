@file:JvmName("Utils")

package com.increase.api.core

import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimaps
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections

@JvmSynthetic
internal fun <T : Any> T?.getOrThrow(name: String): T =
    this ?: throw IncreaseInvalidDataException("`${name}` is not present")

@JvmSynthetic
internal fun <T> List<T>.toUnmodifiable(): List<T> {
    if (isEmpty()) {
        return Collections.emptyList()
    }

    return Collections.unmodifiableList(this)
}

@JvmSynthetic
internal fun <K, V> Map<K, V>.toUnmodifiable(): Map<K, V> {
    if (isEmpty()) {
        return Collections.emptyMap()
    }

    return Collections.unmodifiableMap(this)
}

@JvmSynthetic
internal fun <K, V> ListMultimap<K, V>.toUnmodifiable(): ListMultimap<K, V> {
    if (isEmpty()) {
        return ImmutableListMultimap.of()
    }

    return Multimaps.unmodifiableListMultimap(this)
}

internal interface Enum
