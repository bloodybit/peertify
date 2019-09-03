package net.peertify.core

import net.peertify.toHex

class ByteArrayKey(val byteArray: ByteArray) {

    override fun equals(other: Any?): Boolean {
        if(other == null) return false
        if (super.equals(other)) return true
        return (other as? ByteArrayKey)?.byteArray?.contentEquals(byteArray)?: false
    }

    override fun hashCode(): Int {
        return byteArray.contentHashCode()
    }

    override fun toString(): String {
        return byteArray.toHex()
    }

}

// return [ByteArrayKey] for given ByteArray object
fun ByteArray.byteArrayKeyOf() = ByteArrayKey(this)
