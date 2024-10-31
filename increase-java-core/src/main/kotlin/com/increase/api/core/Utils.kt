@file:JvmName("Utils")

package com.increase.api.core

import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections

@JvmSynthetic
internal fun <T : Any> T?.getOrThrow(name: String): T =
    this ?: throw IncreaseInvalidDataException("`${name}` is not present")

@JvmSynthetic
internal fun <T> List<T>.toImmutable(): List<T> =
    if (isEmpty()) Collections.emptyList() else Collections.unmodifiableList(toList())

@JvmSynthetic
internal fun <K, V> Map<K, V>.toImmutable(): Map<K, V> =
    if (isEmpty()) Collections.emptyMap() else Collections.unmodifiableMap(toMap())

@JvmSynthetic
internal fun <K, V> ListMultimap<K, V>.toImmutable(): ListMultimap<K, V> =
    ImmutableListMultimap.copyOf(this)

@JvmSynthetic
internal fun ListMultimap<String, String>.getRequiredHeader(header: String): String {
    val value =
        entries()
            .stream()
            .filter { entry -> entry.key.equals(header, ignoreCase = true) }
            .map { entry -> entry.value }
            .findFirst()
    if (!value.isPresent) {
        throw IncreaseInvalidDataException("Could not find $header header")
    }
    return value.get()
}

internal interface Enum
